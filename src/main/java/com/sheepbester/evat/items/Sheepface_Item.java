package com.sheepbester.evat.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Sheepface_Item {

	private Sheepface_Item() {}

	public static final Item SHEEPFACE = register("sheepface", new Item(new FabricItemSettings()));

	public static <T extends Item> T register(String path, T item) {
		return Registry.register(Registries.ITEM, new Identifier("evat", path), item);
	}

	public static void initialize() {}
}
