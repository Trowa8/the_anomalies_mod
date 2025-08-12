package net.mcreator.anomalies.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class OlivineBlockBlock extends Block {
	public OlivineBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(7f, 10f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BELL));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}