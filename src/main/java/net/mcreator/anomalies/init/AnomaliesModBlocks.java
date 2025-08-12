/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomalies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.anomalies.block.WarpedNetherackBlock;
import net.mcreator.anomalies.block.TorvineBlockBlock;
import net.mcreator.anomalies.block.TordoliteOreBlock;
import net.mcreator.anomalies.block.TordoliteBlockBlock;
import net.mcreator.anomalies.block.SteelBlockBlock;
import net.mcreator.anomalies.block.SpeedlumBlock;
import net.mcreator.anomalies.block.PureAmethystBlockBlock;
import net.mcreator.anomalies.block.OlivineOreBlock;
import net.mcreator.anomalies.block.OlivineBlockBlock;
import net.mcreator.anomalies.block.NetherrackironoreBlock;
import net.mcreator.anomalies.block.NetherrackLapisOreBlock;
import net.mcreator.anomalies.block.NetherrackGoldOreBlock;
import net.mcreator.anomalies.block.LimestoneBlock;
import net.mcreator.anomalies.block.JumplumBlock;
import net.mcreator.anomalies.block.DeepslateTordoliteOreBlock;
import net.mcreator.anomalies.block.DarkenedwoodladderBlock;
import net.mcreator.anomalies.block.Darkened_Wooden_WoodBlock;
import net.mcreator.anomalies.block.Darkened_Wooden_StairsBlock;
import net.mcreator.anomalies.block.Darkened_Wooden_SlabBlock;
import net.mcreator.anomalies.block.Darkened_Wooden_PressurePlateBlock;
import net.mcreator.anomalies.block.Darkened_Wooden_PlanksBlock;
import net.mcreator.anomalies.block.Darkened_Wooden_LogBlock;
import net.mcreator.anomalies.block.Darkened_Wooden_LeavesBlock;
import net.mcreator.anomalies.block.Darkened_Wooden_FenceGateBlock;
import net.mcreator.anomalies.block.Darkened_Wooden_FenceBlock;
import net.mcreator.anomalies.block.Darkened_Wooden_ButtonBlock;
import net.mcreator.anomalies.block.DarkenedWoodDoorBlock;
import net.mcreator.anomalies.block.DarkenedGrassBlock;
import net.mcreator.anomalies.block.DarkenedDirtBlock;
import net.mcreator.anomalies.block.DarkenedChestBlock;
import net.mcreator.anomalies.block.CoalCokeBlockBlock;
import net.mcreator.anomalies.AnomaliesMod;

public class AnomaliesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AnomaliesMod.MODID);
	public static final RegistryObject<Block> DARKENED_GRASS = REGISTRY.register("darkened_grass", () -> new DarkenedGrassBlock());
	public static final RegistryObject<Block> DARKENED_DIRT = REGISTRY.register("darkened_dirt", () -> new DarkenedDirtBlock());
	public static final RegistryObject<Block> DARKENED_WOODEN_LOG = REGISTRY.register("darkened_wooden_log", () -> new Darkened_Wooden_LogBlock());
	public static final RegistryObject<Block> DARKENED_WOODEN_WOOD = REGISTRY.register("darkened_wooden_wood", () -> new Darkened_Wooden_WoodBlock());
	public static final RegistryObject<Block> DARKENED_WOODEN_PLANKS = REGISTRY.register("darkened_wooden_planks", () -> new Darkened_Wooden_PlanksBlock());
	public static final RegistryObject<Block> DARKENED_WOODEN_LEAVES = REGISTRY.register("darkened_wooden_leaves", () -> new Darkened_Wooden_LeavesBlock());
	public static final RegistryObject<Block> DARKENED_WOODEN_STAIRS = REGISTRY.register("darkened_wooden_stairs", () -> new Darkened_Wooden_StairsBlock());
	public static final RegistryObject<Block> DARKENED_WOODEN_SLAB = REGISTRY.register("darkened_wooden_slab", () -> new Darkened_Wooden_SlabBlock());
	public static final RegistryObject<Block> DARKENED_WOODEN_FENCE = REGISTRY.register("darkened_wooden_fence", () -> new Darkened_Wooden_FenceBlock());
	public static final RegistryObject<Block> DARKENED_WOODEN_FENCE_GATE = REGISTRY.register("darkened_wooden_fence_gate", () -> new Darkened_Wooden_FenceGateBlock());
	public static final RegistryObject<Block> DARKENED_WOODEN_PRESSURE_PLATE = REGISTRY.register("darkened_wooden_pressure_plate", () -> new Darkened_Wooden_PressurePlateBlock());
	public static final RegistryObject<Block> DARKENED_WOODEN_BUTTON = REGISTRY.register("darkened_wooden_button", () -> new Darkened_Wooden_ButtonBlock());
	public static final RegistryObject<Block> DARKENED_WOOD_DOOR = REGISTRY.register("darkened_wood_door", () -> new DarkenedWoodDoorBlock());
	public static final RegistryObject<Block> SPEEDLUM = REGISTRY.register("speedlum", () -> new SpeedlumBlock());
	public static final RegistryObject<Block> LIMESTONE = REGISTRY.register("limestone", () -> new LimestoneBlock());
	public static final RegistryObject<Block> JUMPLUM = REGISTRY.register("jumplum", () -> new JumplumBlock());
	public static final RegistryObject<Block> TORDOLITE_ORE = REGISTRY.register("tordolite_ore", () -> new TordoliteOreBlock());
	public static final RegistryObject<Block> TORDOLITE_BLOCK = REGISTRY.register("tordolite_block", () -> new TordoliteBlockBlock());
	public static final RegistryObject<Block> DEEPSLATE_TORDOLITE_ORE = REGISTRY.register("deepslate_tordolite_ore", () -> new DeepslateTordoliteOreBlock());
	public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlockBlock());
	public static final RegistryObject<Block> COAL_COKE_BLOCK = REGISTRY.register("coal_coke_block", () -> new CoalCokeBlockBlock());
	public static final RegistryObject<Block> WARPED_NETHERACK = REGISTRY.register("warped_netherack", () -> new WarpedNetherackBlock());
	public static final RegistryObject<Block> NETHERRACKIRONORE = REGISTRY.register("netherrackironore", () -> new NetherrackironoreBlock());
	public static final RegistryObject<Block> NETHERRACK_GOLD_ORE = REGISTRY.register("netherrack_gold_ore", () -> new NetherrackGoldOreBlock());
	public static final RegistryObject<Block> NETHERRACK_LAPIS_ORE = REGISTRY.register("netherrack_lapis_ore", () -> new NetherrackLapisOreBlock());
	public static final RegistryObject<Block> OLIVINE_ORE = REGISTRY.register("olivine_ore", () -> new OlivineOreBlock());
	public static final RegistryObject<Block> OLIVINE_BLOCK = REGISTRY.register("olivine_block", () -> new OlivineBlockBlock());
	public static final RegistryObject<Block> TORVINE_BLOCK = REGISTRY.register("torvine_block", () -> new TorvineBlockBlock());
	public static final RegistryObject<Block> DARKENEDWOODLADDER = REGISTRY.register("darkenedwoodladder", () -> new DarkenedwoodladderBlock());
	public static final RegistryObject<Block> PURE_AMETHYST_BLOCK = REGISTRY.register("pure_amethyst_block", () -> new PureAmethystBlockBlock());
	public static final RegistryObject<Block> DARKENED_CHEST = REGISTRY.register("darkened_chest", () -> new DarkenedChestBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			DarkenedGrassBlock.blockColorLoad(event);
			DarkenedDirtBlock.blockColorLoad(event);
		}
	}
}