
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.horizoncraft.horizoncraftmod.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.horizoncraft.horizoncraftmod.block.OakBenchBlock;
import net.horizoncraft.horizoncraftmod.HorizoncraftModMod;

public class HorizoncraftModModBlocks {
	public static Block OAK_BENCH;

	public static void load() {
		OAK_BENCH = Registry.register(Registry.BLOCK, new ResourceLocation(HorizoncraftModMod.MODID, "oak_bench"), new OakBenchBlock());
	}

	public static void clientLoad() {
		OakBenchBlock.clientInit();
	}
}
