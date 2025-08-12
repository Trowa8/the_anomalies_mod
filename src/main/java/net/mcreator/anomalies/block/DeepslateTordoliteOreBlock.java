package net.mcreator.anomalies.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class DeepslateTordoliteOreBlock extends Block {
	public DeepslateTordoliteOreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(6.5f, 6f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BELL));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}