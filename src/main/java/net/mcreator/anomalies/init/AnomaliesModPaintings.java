/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomalies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.anomalies.AnomaliesMod;

public class AnomaliesModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, AnomaliesMod.MODID);
	public static final RegistryObject<PaintingVariant> GENTLEMAN_PAINTING = REGISTRY.register("gentleman_painting", () -> new PaintingVariant(32, 32));
}