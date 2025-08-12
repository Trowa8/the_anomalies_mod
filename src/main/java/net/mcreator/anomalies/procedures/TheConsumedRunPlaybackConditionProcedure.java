package net.mcreator.anomalies.procedures;

import net.minecraft.world.entity.Entity;

public class TheConsumedRunPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.isSprinting();
	}
}