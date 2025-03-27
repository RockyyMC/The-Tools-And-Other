
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rocky.tools.init;

import net.rocky.tools.entity.RockysEntity;
import net.rocky.tools.entity.MatistEntity;
import net.rocky.tools.entity.DuckEntity;
import net.rocky.tools.entity.AireEntity;
import net.rocky.tools.TheToolsAndOtherMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class TheToolsAndOtherModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, TheToolsAndOtherMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<DuckEntity>> DUCK = register("duck",
			EntityType.Builder.<DuckEntity>of(DuckEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<MatistEntity>> MATIST = register("matist",
			EntityType.Builder.<MatistEntity>of(MatistEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<RockysEntity>> ROCKYS = register("rockys",
			EntityType.Builder.<RockysEntity>of(RockysEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AireEntity>> AIRE = register("aire",
			EntityType.Builder.<AireEntity>of(AireEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(TheToolsAndOtherMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		DuckEntity.init(event);
		MatistEntity.init(event);
		RockysEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(DUCK.get(), DuckEntity.createAttributes().build());
		event.put(MATIST.get(), MatistEntity.createAttributes().build());
		event.put(ROCKYS.get(), RockysEntity.createAttributes().build());
	}
}
