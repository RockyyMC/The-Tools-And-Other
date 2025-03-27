
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rocky.tools.init;

import net.rocky.tools.client.particle.TrustanicParticleParticle;
import net.rocky.tools.client.particle.MagneParticleParticle;
import net.rocky.tools.client.particle.BernyParticleParticle;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheToolsAndOtherModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(TheToolsAndOtherModParticleTypes.BERNY_PARTICLE.get(), BernyParticleParticle::provider);
		event.registerSpriteSet(TheToolsAndOtherModParticleTypes.MAGNE_PARTICLE.get(), MagneParticleParticle::provider);
		event.registerSpriteSet(TheToolsAndOtherModParticleTypes.TRUSTANIC_PARTICLE.get(), TrustanicParticleParticle::provider);
	}
}
