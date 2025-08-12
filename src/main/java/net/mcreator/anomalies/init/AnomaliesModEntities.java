/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomalies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.anomalies.entity.TheConsumedEntity;
import net.mcreator.anomalies.entity.ResiduousLonerEntity;
import net.mcreator.anomalies.AnomaliesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AnomaliesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AnomaliesMod.MODID);
	public static final RegistryObject<EntityType<TheConsumedEntity>> THE_CONSUMED = register("the_consumed", EntityType.Builder.<TheConsumedEntity>of(TheConsumedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TheConsumedEntity::new).fireImmune().sized(0.6f, 2.4f));
	public static final RegistryObject<EntityType<ResiduousLonerEntity>> RESIDUOUS_LONER = register("residuous_loner", EntityType.Builder.<ResiduousLonerEntity>of(ResiduousLonerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ResiduousLonerEntity::new).fireImmune().sized(1.1f, 1.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheConsumedEntity.init();
			ResiduousLonerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(THE_CONSUMED.get(), TheConsumedEntity.createAttributes().build());
		event.put(RESIDUOUS_LONER.get(), ResiduousLonerEntity.createAttributes().build());
	}
}