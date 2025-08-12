package net.mcreator.anomalies.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.anomalies.AnomaliesMod;

public class StructureFinderGUIButtonPressProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double nCurrentStructure = 0;
		String sVillageText = "";
		String sVillageCmd = "";
		String sStrongholdCmd = "";
		String sStrongholdText = "";
		StructureFinderRightclickedProcedure.execute(world, x, y, z, entity);
		AnomaliesMod.queueServerWork(100, () -> {
			if (entity instanceof Player _player)
				_player.closeContainer();
		});
	}
}