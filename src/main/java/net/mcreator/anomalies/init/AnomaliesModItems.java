/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.anomalies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.anomalies.item.WoodenDaggerItem;
import net.mcreator.anomalies.item.TorvineSwordItem;
import net.mcreator.anomalies.item.TorvineShovelItem;
import net.mcreator.anomalies.item.TorvinePickaxeItem;
import net.mcreator.anomalies.item.TorvineHoeItem;
import net.mcreator.anomalies.item.TorvineAxeItem;
import net.mcreator.anomalies.item.TorvineArmorItem;
import net.mcreator.anomalies.item.TorvineAlloyItem;
import net.mcreator.anomalies.item.TordoliteSwordItem;
import net.mcreator.anomalies.item.TordoliteShovelItem;
import net.mcreator.anomalies.item.TordolitePickaxeItem;
import net.mcreator.anomalies.item.TordoliteItem;
import net.mcreator.anomalies.item.TordoliteHoeItem;
import net.mcreator.anomalies.item.TordoliteAxeItem;
import net.mcreator.anomalies.item.TordoliteArmorItem;
import net.mcreator.anomalies.item.StructureFinderItem;
import net.mcreator.anomalies.item.StoneDaggerItem;
import net.mcreator.anomalies.item.SteelSwordItem;
import net.mcreator.anomalies.item.SteelShovelItem;
import net.mcreator.anomalies.item.SteelPickaxeItem;
import net.mcreator.anomalies.item.SteelMixtureItem;
import net.mcreator.anomalies.item.SteelIngotItem;
import net.mcreator.anomalies.item.SteelHoeItem;
import net.mcreator.anomalies.item.SteelAxeItem;
import net.mcreator.anomalies.item.SteelArmorItem;
import net.mcreator.anomalies.item.PureAmethystItem;
import net.mcreator.anomalies.item.PeacockTailItem;
import net.mcreator.anomalies.item.OlivineSwordItem;
import net.mcreator.anomalies.item.OlivineShovelItem;
import net.mcreator.anomalies.item.OlivinePickaxeItem;
import net.mcreator.anomalies.item.OlivineItem;
import net.mcreator.anomalies.item.OlivineHoeItem;
import net.mcreator.anomalies.item.OlivineAxeItem;
import net.mcreator.anomalies.item.OlivineArmorItem;
import net.mcreator.anomalies.item.Oak_ArmorItem;
import net.mcreator.anomalies.item.LogoItem;
import net.mcreator.anomalies.item.IronDaggerItem;
import net.mcreator.anomalies.item.GoldDaggerItem;
import net.mcreator.anomalies.item.DiamondDaggerItem;
import net.mcreator.anomalies.item.Darkened_Tool_SwordItem;
import net.mcreator.anomalies.item.Darkened_Tool_ShovelItem;
import net.mcreator.anomalies.item.Darkened_Tool_PickaxeItem;
import net.mcreator.anomalies.item.Darkened_Tool_HoeItem;
import net.mcreator.anomalies.item.Darkened_Tool_AxeItem;
import net.mcreator.anomalies.item.CoalCokeItem;
import net.mcreator.anomalies.item.AmethystSwordItem;
import net.mcreator.anomalies.item.AmethystShovelItem;
import net.mcreator.anomalies.item.AmethystPickaxeItem;
import net.mcreator.anomalies.item.AmethystHoeItem;
import net.mcreator.anomalies.item.AmethystAxeItem;
import net.mcreator.anomalies.item.AmethystArmorItem;
import net.mcreator.anomalies.AnomaliesMod;

public class AnomaliesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AnomaliesMod.MODID);
	public static final RegistryObject<Item> DARKENED_GRASS = block(AnomaliesModBlocks.DARKENED_GRASS);
	public static final RegistryObject<Item> DARKENED_DIRT = block(AnomaliesModBlocks.DARKENED_DIRT);
	public static final RegistryObject<Item> DARKENED_WOODEN_LOG = block(AnomaliesModBlocks.DARKENED_WOODEN_LOG, new Item.Properties().fireResistant());
	public static final RegistryObject<Item> DARKENED_WOODEN_WOOD = block(AnomaliesModBlocks.DARKENED_WOODEN_WOOD, new Item.Properties().fireResistant());
	public static final RegistryObject<Item> DARKENED_WOODEN_PLANKS = block(AnomaliesModBlocks.DARKENED_WOODEN_PLANKS);
	public static final RegistryObject<Item> DARKENED_WOODEN_LEAVES = block(AnomaliesModBlocks.DARKENED_WOODEN_LEAVES);
	public static final RegistryObject<Item> DARKENED_WOODEN_STAIRS = block(AnomaliesModBlocks.DARKENED_WOODEN_STAIRS);
	public static final RegistryObject<Item> DARKENED_WOODEN_SLAB = block(AnomaliesModBlocks.DARKENED_WOODEN_SLAB);
	public static final RegistryObject<Item> DARKENED_WOODEN_FENCE = block(AnomaliesModBlocks.DARKENED_WOODEN_FENCE);
	public static final RegistryObject<Item> DARKENED_WOODEN_FENCE_GATE = block(AnomaliesModBlocks.DARKENED_WOODEN_FENCE_GATE);
	public static final RegistryObject<Item> DARKENED_WOODEN_PRESSURE_PLATE = block(AnomaliesModBlocks.DARKENED_WOODEN_PRESSURE_PLATE);
	public static final RegistryObject<Item> DARKENED_WOODEN_BUTTON = block(AnomaliesModBlocks.DARKENED_WOODEN_BUTTON);
	public static final RegistryObject<Item> DARKENED_WOOD_DOOR = doubleBlock(AnomaliesModBlocks.DARKENED_WOOD_DOOR);
	public static final RegistryObject<Item> DARKENED_TOOL_PICKAXE = REGISTRY.register("darkened_tool_pickaxe", () -> new Darkened_Tool_PickaxeItem());
	public static final RegistryObject<Item> DARKENED_TOOL_AXE = REGISTRY.register("darkened_tool_axe", () -> new Darkened_Tool_AxeItem());
	public static final RegistryObject<Item> DARKENED_TOOL_SWORD = REGISTRY.register("darkened_tool_sword", () -> new Darkened_Tool_SwordItem());
	public static final RegistryObject<Item> DARKENED_TOOL_SHOVEL = REGISTRY.register("darkened_tool_shovel", () -> new Darkened_Tool_ShovelItem());
	public static final RegistryObject<Item> DARKENED_TOOL_HOE = REGISTRY.register("darkened_tool_hoe", () -> new Darkened_Tool_HoeItem());
	public static final RegistryObject<Item> OAK_ARMOR_HELMET = REGISTRY.register("oak_armor_helmet", () -> new Oak_ArmorItem.Helmet());
	public static final RegistryObject<Item> OAK_ARMOR_CHESTPLATE = REGISTRY.register("oak_armor_chestplate", () -> new Oak_ArmorItem.Chestplate());
	public static final RegistryObject<Item> OAK_ARMOR_LEGGINGS = REGISTRY.register("oak_armor_leggings", () -> new Oak_ArmorItem.Leggings());
	public static final RegistryObject<Item> OAK_ARMOR_BOOTS = REGISTRY.register("oak_armor_boots", () -> new Oak_ArmorItem.Boots());
	public static final RegistryObject<Item> SPEEDLUM = block(AnomaliesModBlocks.SPEEDLUM, new Item.Properties().fireResistant());
	public static final RegistryObject<Item> COAL_COKE = REGISTRY.register("coal_coke", () -> new CoalCokeItem());
	public static final RegistryObject<Item> STEEL_MIXTURE = REGISTRY.register("steel_mixture", () -> new SteelMixtureItem());
	public static final RegistryObject<Item> LIMESTONE = block(AnomaliesModBlocks.LIMESTONE, new Item.Properties().fireResistant());
	public static final RegistryObject<Item> WOODEN_DAGGER = REGISTRY.register("wooden_dagger", () -> new WoodenDaggerItem());
	public static final RegistryObject<Item> IRON_DAGGER = REGISTRY.register("iron_dagger", () -> new IronDaggerItem());
	public static final RegistryObject<Item> STONE_DAGGER = REGISTRY.register("stone_dagger", () -> new StoneDaggerItem());
	public static final RegistryObject<Item> DIAMOND_DAGGER = REGISTRY.register("diamond_dagger", () -> new DiamondDaggerItem());
	public static final RegistryObject<Item> GOLD_DAGGER = REGISTRY.register("gold_dagger", () -> new GoldDaggerItem());
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
	public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
	public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
	public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
	public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new SteelHoeItem());
	public static final RegistryObject<Item> STEEL_ARMOR_HELMET = REGISTRY.register("steel_armor_helmet", () -> new SteelArmorItem.Helmet());
	public static final RegistryObject<Item> STEEL_ARMOR_CHESTPLATE = REGISTRY.register("steel_armor_chestplate", () -> new SteelArmorItem.Chestplate());
	public static final RegistryObject<Item> STEEL_ARMOR_LEGGINGS = REGISTRY.register("steel_armor_leggings", () -> new SteelArmorItem.Leggings());
	public static final RegistryObject<Item> STEEL_ARMOR_BOOTS = REGISTRY.register("steel_armor_boots", () -> new SteelArmorItem.Boots());
	public static final RegistryObject<Item> PURE_AMETHYST = REGISTRY.register("pure_amethyst", () -> new PureAmethystItem());
	public static final RegistryObject<Item> AMETHYST_PICKAXE = REGISTRY.register("amethyst_pickaxe", () -> new AmethystPickaxeItem());
	public static final RegistryObject<Item> AMETHYST_AXE = REGISTRY.register("amethyst_axe", () -> new AmethystAxeItem());
	public static final RegistryObject<Item> AMETHYST_SWORD = REGISTRY.register("amethyst_sword", () -> new AmethystSwordItem());
	public static final RegistryObject<Item> AMETHYST_SHOVEL = REGISTRY.register("amethyst_shovel", () -> new AmethystShovelItem());
	public static final RegistryObject<Item> AMETHYST_HOE = REGISTRY.register("amethyst_hoe", () -> new AmethystHoeItem());
	public static final RegistryObject<Item> AMETHYST_ARMOR_HELMET = REGISTRY.register("amethyst_armor_helmet", () -> new AmethystArmorItem.Helmet());
	public static final RegistryObject<Item> AMETHYST_ARMOR_CHESTPLATE = REGISTRY.register("amethyst_armor_chestplate", () -> new AmethystArmorItem.Chestplate());
	public static final RegistryObject<Item> AMETHYST_ARMOR_LEGGINGS = REGISTRY.register("amethyst_armor_leggings", () -> new AmethystArmorItem.Leggings());
	public static final RegistryObject<Item> AMETHYST_ARMOR_BOOTS = REGISTRY.register("amethyst_armor_boots", () -> new AmethystArmorItem.Boots());
	public static final RegistryObject<Item> THE_CONSUMED_SPAWN_EGG = REGISTRY.register("the_consumed_spawn_egg", () -> new ForgeSpawnEggItem(AnomaliesModEntities.THE_CONSUMED, -16777216, -7339761, new Item.Properties()));
	public static final RegistryObject<Item> JUMPLUM = block(AnomaliesModBlocks.JUMPLUM, new Item.Properties().fireResistant());
	public static final RegistryObject<Item> PEACOCK_TAIL_CHESTPLATE = REGISTRY.register("peacock_tail_chestplate", () -> new PeacockTailItem.Chestplate());
	public static final RegistryObject<Item> TORDOLITE = REGISTRY.register("tordolite", () -> new TordoliteItem());
	public static final RegistryObject<Item> TORDOLITE_ORE = block(AnomaliesModBlocks.TORDOLITE_ORE);
	public static final RegistryObject<Item> TORDOLITE_BLOCK = block(AnomaliesModBlocks.TORDOLITE_BLOCK);
	public static final RegistryObject<Item> TORDOLITE_PICKAXE = REGISTRY.register("tordolite_pickaxe", () -> new TordolitePickaxeItem());
	public static final RegistryObject<Item> TORDOLITE_AXE = REGISTRY.register("tordolite_axe", () -> new TordoliteAxeItem());
	public static final RegistryObject<Item> TORDOLITE_SWORD = REGISTRY.register("tordolite_sword", () -> new TordoliteSwordItem());
	public static final RegistryObject<Item> TORDOLITE_SHOVEL = REGISTRY.register("tordolite_shovel", () -> new TordoliteShovelItem());
	public static final RegistryObject<Item> TORDOLITE_HOE = REGISTRY.register("tordolite_hoe", () -> new TordoliteHoeItem());
	public static final RegistryObject<Item> TORDOLITE_ARMOR_HELMET = REGISTRY.register("tordolite_armor_helmet", () -> new TordoliteArmorItem.Helmet());
	public static final RegistryObject<Item> TORDOLITE_ARMOR_CHESTPLATE = REGISTRY.register("tordolite_armor_chestplate", () -> new TordoliteArmorItem.Chestplate());
	public static final RegistryObject<Item> TORDOLITE_ARMOR_LEGGINGS = REGISTRY.register("tordolite_armor_leggings", () -> new TordoliteArmorItem.Leggings());
	public static final RegistryObject<Item> TORDOLITE_ARMOR_BOOTS = REGISTRY.register("tordolite_armor_boots", () -> new TordoliteArmorItem.Boots());
	public static final RegistryObject<Item> DEEPSLATE_TORDOLITE_ORE = block(AnomaliesModBlocks.DEEPSLATE_TORDOLITE_ORE);
	public static final RegistryObject<Item> STEEL_BLOCK = block(AnomaliesModBlocks.STEEL_BLOCK);
	public static final RegistryObject<Item> COAL_COKE_BLOCK = block(AnomaliesModBlocks.COAL_COKE_BLOCK);
	public static final RegistryObject<Item> WARPED_NETHERACK = block(AnomaliesModBlocks.WARPED_NETHERACK);
	public static final RegistryObject<Item> NETHERRACKIRONORE = block(AnomaliesModBlocks.NETHERRACKIRONORE);
	public static final RegistryObject<Item> NETHERRACK_GOLD_ORE = block(AnomaliesModBlocks.NETHERRACK_GOLD_ORE);
	public static final RegistryObject<Item> NETHERRACK_LAPIS_ORE = block(AnomaliesModBlocks.NETHERRACK_LAPIS_ORE);
	public static final RegistryObject<Item> RESIDUOUS_LONER_SPAWN_EGG = REGISTRY.register("residuous_loner_spawn_egg", () -> new ForgeSpawnEggItem(AnomaliesModEntities.RESIDUOUS_LONER, -16777216, -1, new Item.Properties()));
	public static final RegistryObject<Item> OLIVINE = REGISTRY.register("olivine", () -> new OlivineItem());
	public static final RegistryObject<Item> OLIVINE_ORE = block(AnomaliesModBlocks.OLIVINE_ORE, new Item.Properties().fireResistant());
	public static final RegistryObject<Item> OLIVINE_BLOCK = block(AnomaliesModBlocks.OLIVINE_BLOCK, new Item.Properties().fireResistant());
	public static final RegistryObject<Item> OLIVINE_PICKAXE = REGISTRY.register("olivine_pickaxe", () -> new OlivinePickaxeItem());
	public static final RegistryObject<Item> OLIVINE_AXE = REGISTRY.register("olivine_axe", () -> new OlivineAxeItem());
	public static final RegistryObject<Item> OLIVINE_SWORD = REGISTRY.register("olivine_sword", () -> new OlivineSwordItem());
	public static final RegistryObject<Item> OLIVINE_SHOVEL = REGISTRY.register("olivine_shovel", () -> new OlivineShovelItem());
	public static final RegistryObject<Item> OLIVINE_HOE = REGISTRY.register("olivine_hoe", () -> new OlivineHoeItem());
	public static final RegistryObject<Item> OLIVINE_ARMOR_HELMET = REGISTRY.register("olivine_armor_helmet", () -> new OlivineArmorItem.Helmet());
	public static final RegistryObject<Item> OLIVINE_ARMOR_CHESTPLATE = REGISTRY.register("olivine_armor_chestplate", () -> new OlivineArmorItem.Chestplate());
	public static final RegistryObject<Item> OLIVINE_ARMOR_LEGGINGS = REGISTRY.register("olivine_armor_leggings", () -> new OlivineArmorItem.Leggings());
	public static final RegistryObject<Item> OLIVINE_ARMOR_BOOTS = REGISTRY.register("olivine_armor_boots", () -> new OlivineArmorItem.Boots());
	public static final RegistryObject<Item> TORVINE_ALLOY = REGISTRY.register("torvine_alloy", () -> new TorvineAlloyItem());
	public static final RegistryObject<Item> TORVINE_PICKAXE = REGISTRY.register("torvine_pickaxe", () -> new TorvinePickaxeItem());
	public static final RegistryObject<Item> TORVINE_AXE = REGISTRY.register("torvine_axe", () -> new TorvineAxeItem());
	public static final RegistryObject<Item> TORVINE_SWORD = REGISTRY.register("torvine_sword", () -> new TorvineSwordItem());
	public static final RegistryObject<Item> TORVINE_SHOVEL = REGISTRY.register("torvine_shovel", () -> new TorvineShovelItem());
	public static final RegistryObject<Item> TORVINE_HOE = REGISTRY.register("torvine_hoe", () -> new TorvineHoeItem());
	public static final RegistryObject<Item> TORVINE_ARMOR_HELMET = REGISTRY.register("torvine_armor_helmet", () -> new TorvineArmorItem.Helmet());
	public static final RegistryObject<Item> TORVINE_ARMOR_CHESTPLATE = REGISTRY.register("torvine_armor_chestplate", () -> new TorvineArmorItem.Chestplate());
	public static final RegistryObject<Item> TORVINE_ARMOR_LEGGINGS = REGISTRY.register("torvine_armor_leggings", () -> new TorvineArmorItem.Leggings());
	public static final RegistryObject<Item> TORVINE_ARMOR_BOOTS = REGISTRY.register("torvine_armor_boots", () -> new TorvineArmorItem.Boots());
	public static final RegistryObject<Item> TORVINE_BLOCK = block(AnomaliesModBlocks.TORVINE_BLOCK, new Item.Properties().rarity(Rarity.UNCOMMON).fireResistant());
	public static final RegistryObject<Item> DARKENEDWOODLADDER = block(AnomaliesModBlocks.DARKENEDWOODLADDER);
	public static final RegistryObject<Item> PURE_AMETHYST_BLOCK = block(AnomaliesModBlocks.PURE_AMETHYST_BLOCK);
	public static final RegistryObject<Item> DARKENED_CHEST = block(AnomaliesModBlocks.DARKENED_CHEST);
	public static final RegistryObject<Item> STRUCTURE_FINDER = REGISTRY.register("structure_finder", () -> new StructureFinderItem());
	public static final RegistryObject<Item> LOGO = REGISTRY.register("logo", () -> new LogoItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), properties));
	}
}