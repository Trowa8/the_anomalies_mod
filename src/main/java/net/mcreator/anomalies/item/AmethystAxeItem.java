package net.mcreator.anomalies.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.anomalies.init.AnomaliesModItems;

public class AmethystAxeItem extends AxeItem {
	public AmethystAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 323;
			}

			public float getSpeed() {
				return 4.5f;
			}

			public float getAttackDamageBonus() {
				return 4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(AnomaliesModItems.PURE_AMETHYST.get()), new ItemStack(Items.AMETHYST_SHARD));
			}
		}, 1, -3f, new Item.Properties());
	}
}