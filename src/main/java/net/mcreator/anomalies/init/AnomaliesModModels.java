/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomalies.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.anomalies.client.model.Modeltorvine_chestplate;
import net.mcreator.anomalies.client.model.Modelthe_consumed;
import net.mcreator.anomalies.client.model.Modelpeacock_tail;
import net.mcreator.anomalies.client.model.ModelTorvite_Helmet;
import net.mcreator.anomalies.client.model.ModelTorvine_Leggings;
import net.mcreator.anomalies.client.model.ModelTorvine_Boots;
import net.mcreator.anomalies.client.model.ModelResiduous_Loner;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AnomaliesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelTorvine_Leggings.LAYER_LOCATION, ModelTorvine_Leggings::createBodyLayer);
		event.registerLayerDefinition(Modelthe_consumed.LAYER_LOCATION, Modelthe_consumed::createBodyLayer);
		event.registerLayerDefinition(ModelResiduous_Loner.LAYER_LOCATION, ModelResiduous_Loner::createBodyLayer);
		event.registerLayerDefinition(ModelTorvine_Boots.LAYER_LOCATION, ModelTorvine_Boots::createBodyLayer);
		event.registerLayerDefinition(ModelTorvite_Helmet.LAYER_LOCATION, ModelTorvite_Helmet::createBodyLayer);
		event.registerLayerDefinition(Modelpeacock_tail.LAYER_LOCATION, Modelpeacock_tail::createBodyLayer);
		event.registerLayerDefinition(Modeltorvine_chestplate.LAYER_LOCATION, Modeltorvine_chestplate::createBodyLayer);
	}
}