package net.mcreator.anomalies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SteelMixtureItem extends Item {
	public SteelMixtureItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}