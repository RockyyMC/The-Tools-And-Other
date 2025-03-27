
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rocky.tools.init;

import net.rocky.tools.TheToolsAndOtherMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class TheToolsAndOtherModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, TheToolsAndOtherMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> BERNY_PARTICLE = REGISTRY.register("berny_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> MAGNE_PARTICLE = REGISTRY.register("magne_particle", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> TRUSTANIC_PARTICLE = REGISTRY.register("trustanic_particle", () -> new SimpleParticleType(false));
}
