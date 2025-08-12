package net.mcreator.anomalies.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.anomalies.init.AnomaliesModBlocks;

public class Darkened_Tool_AxeItem extends AxeItem {
	public Darkened_Tool_AxeItem() {
		super(new Tier() {
			public int getUses() {
				return 80;
			}

			public float getSpeed() {
				return 3f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AnomaliesModBlocks.DARKENED_WOODEN_PLANKS.get()));
			}
		}, 1, -2.7f, new Item.Properties());
	}
}