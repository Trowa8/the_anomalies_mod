package net.mcreator.anomalies.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.anomalies.init.AnomaliesModMenus;
import net.mcreator.anomalies.AnomaliesMod;

public class StructureFinderRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double strLength = 0;
		double nStringLetter = 0;
		String strLocation = "";
		String sInput = "";
		sInput = (entity instanceof Player _entity0 && _entity0.containerMenu instanceof AnomaliesModMenus.MenuAccessor _menu0) ? _menu0.getMenuState(0, "input", "") : "";
		strLocation = new Object() {
			public String getResult(LevelAccessor world, Vec3 pos, String _command) {
				StringBuilder _result = new StringBuilder();
				if (world instanceof ServerLevel _level) {
					CommandSource _dataConsumer = new CommandSource() {
						@Override
						public void sendSystemMessage(Component message) {
							_result.append(message.getString());
						}

						@Override
						public boolean acceptsSuccess() {
							return true;
						}

						@Override
						public boolean acceptsFailure() {
							return true;
						}

						@Override
						public boolean shouldInformAdmins() {
							return false;
						}
					};
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(_dataConsumer, pos, Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null), _command);
				}
				return _result.toString();
			}
		}.getResult(world, new Vec3(x, y, z), ("locate structure" + " " + sInput));
		strLength = (strLocation).length();
		nStringLetter = 0;
		AnomaliesMod.LOGGER.info(strLength);
		AnomaliesMod.LOGGER.info(sInput);
		AnomaliesMod.LOGGER.info(strLocation);
		if (strLength != 0) {
			for (int index0 = 0; index0 < (int) strLength; index0++) {
				if (nStringLetter != strLength) {
					if ((strLocation.substring((int) nStringLetter, (int) (nStringLetter + 3))).equals("] (")) {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Closest structure:" + " " + strLocation.substring((int) (nStringLetter + 1), (int) strLength))), true);
						if (entity instanceof Player _player)
							_player.closeContainer();
						break;
					} else {
						nStringLetter = nStringLetter + 1;
					}
				}
			}
		}
	}
}