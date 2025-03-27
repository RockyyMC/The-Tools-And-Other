
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rocky.tools.init;

import net.rocky.tools.TheToolsAndOtherMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class TheToolsAndOtherModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, TheToolsAndOtherMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> EXPLOSION = REGISTRY.register("explosion", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("the_tools_and_other", "explosion")));
	public static final DeferredHolder<SoundEvent, SoundEvent> EXPLOSIVE = REGISTRY.register("explosive", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("the_tools_and_other", "explosive")));
}
