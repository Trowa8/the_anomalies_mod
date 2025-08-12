package net.mcreator.anomalies.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.anomalies.procedures.StructureFinderRightclicked2Procedure;

public class StructureFinderItem extends Item {
	public StructureFinderItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		StructureFinderRightclicked2Procedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return ar;
	}
}