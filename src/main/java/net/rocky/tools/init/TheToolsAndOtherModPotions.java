
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rocky.tools.init;

import net.rocky.tools.TheToolsAndOtherMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

public class TheToolsAndOtherModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, TheToolsAndOtherMod.MODID);
	public static final DeferredHolder<Potion, Potion> WEARKNES = REGISTRY.register("wearknes", () -> new Potion("wearknes", new MobEffectInstance(TheToolsAndOtherModMobEffects.WARKDES, 5900, 6, false, false)));
	public static final DeferredHolder<Potion, Potion> DAMAGE_P = REGISTRY.register("damage_p", () -> new Potion("damage_p", new MobEffectInstance(TheToolsAndOtherModMobEffects.DAMAGE, 3600, 0, false, false)));
	public static final DeferredHolder<Potion, Potion> VISIONSS = REGISTRY.register("visionss", () -> new Potion("visionss", new MobEffectInstance(TheToolsAndOtherModMobEffects.VISIONS, 7600, 6, false, false)));
	public static final DeferredHolder<Potion, Potion> FLYESS = REGISTRY.register("flyess", () -> new Potion("flyess", new MobEffectInstance(TheToolsAndOtherModMobEffects.FLYES, 2000, 0, false, false)));
}
