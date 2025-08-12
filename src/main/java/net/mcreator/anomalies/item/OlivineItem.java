package net.mcreator.anomalies.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OlivineItem extends Item {
	public OlivineItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}