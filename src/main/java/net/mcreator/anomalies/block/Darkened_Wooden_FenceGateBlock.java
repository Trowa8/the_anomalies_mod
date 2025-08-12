package net.mcreator.anomalies.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class Darkened_Wooden_FenceGateBlock extends FenceGateBlock {
	public Darkened_Wooden_FenceGateBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2.5f, 4f).lightLevel(s -> 3).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).ignitedByLava().instrument(NoteBlockInstrument.DIDGERIDOO).forceSolidOn(),
				WoodType.OAK);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}
}