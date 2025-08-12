/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomalies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.anomalies.world.inventory.StructureFinderGUIMenu;
import net.mcreator.anomalies.world.inventory.DarkenedChestGUIMenu;
import net.mcreator.anomalies.network.MenuStateUpdateMessage;
import net.mcreator.anomalies.AnomaliesMod;

import java.util.Map;

public class AnomaliesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AnomaliesMod.MODID);
	public static final RegistryObject<MenuType<DarkenedChestGUIMenu>> DARKENED_CHEST_GUI = REGISTRY.register("darkened_chest_gui", () -> IForgeMenuType.create(DarkenedChestGUIMenu::new));
	public static final RegistryObject<MenuType<StructureFinderGUIMenu>> STRUCTURE_FINDER_GUI = REGISTRY.register("structure_finder_gui", () -> IForgeMenuType.create(StructureFinderGUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				AnomaliesMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof AnomaliesModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				AnomaliesMod.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}