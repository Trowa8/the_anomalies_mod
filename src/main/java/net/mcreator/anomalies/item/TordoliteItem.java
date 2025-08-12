package net.mcreator.anomalies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TordoliteItem extends Item {
	public TordoliteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}