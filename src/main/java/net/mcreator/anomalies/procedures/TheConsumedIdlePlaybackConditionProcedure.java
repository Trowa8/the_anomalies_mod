package net.mcreator.anomalies.procedures;

import net.minecraft.world.entity.Entity;

public class TheConsumedIdlePlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getDeltaMovement().x() == 0 && entity.getDeltaMovement().z() == 0 && entity.getDeltaMovement().y() == 0) {
			return true;
		}
		return false;
	}
}