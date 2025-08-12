/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomalies.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class AnomaliesModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == AnomaliesModItems.COAL_COKE.get())
			event.setBurnTime(2400);
		else if (itemstack.getItem() == AnomaliesModBlocks.COAL_COKE_BLOCK.get().asItem())
			event.setBurnTime(24000);
		else if (itemstack.getItem() == AnomaliesModBlocks.DARKENED_WOODEN_LOG.get().asItem())
			event.setBurnTime(500);
		else if (itemstack.getItem() == AnomaliesModBlocks.DARKENED_WOODEN_WOOD.get().asItem())
			event.setBurnTime(700);
		else if (itemstack.getItem() == AnomaliesModBlocks.DARKENED_WOODEN_PLANKS.get().asItem())
			event.setBurnTime(500);
		else if (itemstack.getItem() == AnomaliesModBlocks.DARKENED_WOODEN_STAIRS.get().asItem())
			event.setBurnTime(500);
		else if (itemstack.getItem() == AnomaliesModBlocks.DARKENED_WOODEN_SLAB.get().asItem())
			event.setBurnTime(225);
		else if (itemstack.getItem() == AnomaliesModBlocks.DARKENED_WOODEN_FENCE.get().asItem())
			event.setBurnTime(500);
		else if (itemstack.getItem() == AnomaliesModBlocks.DARKENED_WOODEN_FENCE_GATE.get().asItem())
			event.setBurnTime(500);
		else if (itemstack.getItem() == AnomaliesModBlocks.DARKENED_WOODEN_PRESSURE_PLATE.get().asItem())
			event.setBurnTime(500);
		else if (itemstack.getItem() == AnomaliesModBlocks.DARKENED_WOODEN_BUTTON.get().asItem())
			event.setBurnTime(150);
	}
}