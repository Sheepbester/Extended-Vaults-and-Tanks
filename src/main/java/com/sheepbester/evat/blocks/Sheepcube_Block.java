package com.sheepbester.evat.blocks;

import com.sheepbester.evat.ExtendedVaultsAndTanks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class Sheepcube_Block {

	public static Block register(Block block, String name, boolean shouldRegisterItem) {

		Identifier id = new Identifier(ExtendedVaultsAndTanks.ID, name);

		if (shouldRegisterItem) {
			BlockItem blockItem = new BlockItem(block, new Item.Settings());
			Registry.register(Registries.ITEM, id, blockItem);
		}

		return Registry.register(Registries.BLOCK, id, block);
	}

	public static final Block SHEEPCUBE = register(
			new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.WOOL)),
			"sheepcube",
			true
	);

	public static void initialize() {}
}
