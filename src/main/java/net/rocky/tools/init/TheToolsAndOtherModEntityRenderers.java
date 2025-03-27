
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rocky.tools.init;

import net.rocky.tools.client.renderer.RockysRenderer;
import net.rocky.tools.client.renderer.MatistRenderer;
import net.rocky.tools.client.renderer.DuckRenderer;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheToolsAndOtherModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheToolsAndOtherModEntities.DUCK.get(), DuckRenderer::new);
		event.registerEntityRenderer(TheToolsAndOtherModEntities.MATIST.get(), MatistRenderer::new);
		event.registerEntityRenderer(TheToolsAndOtherModEntities.ROCKYS.get(), RockysRenderer::new);
		event.registerEntityRenderer(TheToolsAndOtherModEntities.AIRE.get(), ThrownItemRenderer::new);
	}
}
