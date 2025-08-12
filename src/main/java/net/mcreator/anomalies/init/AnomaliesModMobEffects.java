/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomalies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.anomalies.potion.DarkenedEffectMobEffect;
import net.mcreator.anomalies.AnomaliesMod;

public class AnomaliesModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AnomaliesMod.MODID);
	public static final RegistryObject<MobEffect> DARKENED_EFFECT = REGISTRY.register("darkened_effect", () -> new DarkenedEffectMobEffect());
}