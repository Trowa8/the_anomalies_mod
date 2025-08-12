package net.mcreator.anomalies.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class WarpedNetherackBlock extends Block {
	public WarpedNetherackBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NYLIUM).strength(2f, 1f).requiresCorrectToolForDrops().speedFactor(0.9f).instrument(NoteBlockInstrument.GUITAR));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}