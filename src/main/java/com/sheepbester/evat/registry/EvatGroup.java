package com.sheepbester.evat.registry;

import com.sheepbester.evat.ExtendedVaultsAndTanks;
import com.sheepbester.evat.blocks.Sheepcube_Block;
import com.sheepbester.evat.items.Sheepface_Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class EvatGroup {

	public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY =
			RegistryKey.of(Registries.ITEM_GROUP.getKey(),
					new Identifier(ExtendedVaultsAndTanks.ID, "item_group"));

	public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(Sheepface_Item.SHEEPFACE))
			.displayName(Text.translatable("group.evat"))
			.build();

	public static void initialize() {

		Registry.register(Registries.ITEM_GROUP, CUSTOM_ITEM_GROUP_KEY, CUSTOM_ITEM_GROUP);

		ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup -> {
			itemGroup.add(Sheepface_Item.SHEEPFACE);
			itemGroup.add(Sheepcube_Block.SHEEPCUBE);
		});
	}
}
