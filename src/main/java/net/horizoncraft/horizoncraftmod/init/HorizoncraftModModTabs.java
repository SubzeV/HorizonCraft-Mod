
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.horizoncraft.horizoncraftmod.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class HorizoncraftModModTabs {
	public static CreativeModeTab TAB_BENCHES;

	public static void load() {
		TAB_BENCHES = FabricItemGroupBuilder.create(new ResourceLocation("horizoncraft_mod", "benches")).icon(() -> new ItemStack(Blocks.OAK_STAIRS))
				.build();
	}
}
