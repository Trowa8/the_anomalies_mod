package net.mcreator.anomalies.potion;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DarkenedEffectMobEffect extends MobEffect {
	public DarkenedEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10066330);
		this.addAttributeModifier(ForgeMod.ENTITY_GRAVITY.get(), "2aa00b49-c732-37ff-84de-dcbfb6002661", -1, AttributeModifier.Operation.MULTIPLY_BASE);
		this.addAttributeModifier(Attributes.ARMOR, "225f674f-68c5-34a8-83e2-35d7872c95f2", -2, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, "dbd7edc2-9a5b-3cb4-b560-07043c314497", -0.3, AttributeModifier.Operation.MULTIPLY_BASE);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}