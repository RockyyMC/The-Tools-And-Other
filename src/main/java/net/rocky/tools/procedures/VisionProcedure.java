package net.rocky.tools.procedures;

import net.rocky.tools.init.TheToolsAndOtherModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class VisionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(TheToolsAndOtherModMobEffects.VISIONS, 60, 3));
		}
	}
}
