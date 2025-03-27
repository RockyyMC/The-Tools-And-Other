
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rocky.tools.init;

import net.rocky.tools.client.model.Modelrockys;
import net.rocky.tools.client.model.Modelmetist;
import net.rocky.tools.client.model.Modelmatistv2;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TheToolsAndOtherModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelrockys.LAYER_LOCATION, Modelrockys::createBodyLayer);
		event.registerLayerDefinition(Modelmatistv2.LAYER_LOCATION, Modelmatistv2::createBodyLayer);
		event.registerLayerDefinition(Modelmetist.LAYER_LOCATION, Modelmetist::createBodyLayer);
	}
}
