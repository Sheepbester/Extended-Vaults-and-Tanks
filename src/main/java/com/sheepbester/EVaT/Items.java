package com.sheepbester.EVaT;

import com.tterrag.registrate.util.entry.ItemEntry;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static com.simibubi.create.Create.REGISTRATE;

public final class Items {
	public static final ItemEntry<Item>
	SHEEPFACE = taggedIngredient("sheepface",)

	@SafeVarargs
	private static ItemEntry<Item> taggedIngredient(String name, TagKey<Item>... tags) {
		return REGISTRATE.item(name, Item::new)
				.tag(tags)
				.register();
	}
}

	public static void initialize() {}
