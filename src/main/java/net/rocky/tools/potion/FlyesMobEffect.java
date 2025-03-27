
package net.rocky.tools.potion;

import net.rocky.tools.procedures.FlysProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.server.level.ServerLevel;

public class FlyesMobEffect extends MobEffect {
	public FlyesMobEffect() {
		super(MobEffectCategory.NEUTRAL, -14094353);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(ServerLevel level, LivingEntity entity, int amplifier) {
		FlysProcedure.execute(entity);
		return super.applyEffectTick(level, entity, amplifier);
	}
}
