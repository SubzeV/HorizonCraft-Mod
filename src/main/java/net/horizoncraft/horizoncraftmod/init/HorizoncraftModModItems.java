
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.horizoncraft.horizoncraftmod.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.horizoncraft.horizoncraftmod.HorizoncraftModMod;

public class HorizoncraftModModItems {
	public static Item OAK_BENCH;

	public static void load() {
		OAK_BENCH = Registry.register(Registry.ITEM, new ResourceLocation(HorizoncraftModMod.MODID, "oak_bench"),
				new BlockItem(HorizoncraftModModBlocks.OAK_BENCH, new Item.Properties().tab(HorizoncraftModModTabs.TAB_BENCHES)));
	}
}
