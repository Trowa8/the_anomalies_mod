/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomalies.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.anomalies.client.renderer.TheConsumedRenderer;
import net.mcreator.anomalies.client.renderer.ResiduousLonerRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AnomaliesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AnomaliesModEntities.THE_CONSUMED.get(), TheConsumedRenderer::new);
		event.registerEntityRenderer(AnomaliesModEntities.RESIDUOUS_LONER.get(), ResiduousLonerRenderer::new);
	}
}