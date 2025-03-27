
package net.rocky.tools.block;

import net.rocky.tools.init.TheToolsAndOtherModBlocks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

public class CopsidianBlock extends Block {
	public CopsidianBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(0f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public ItemStack getCloneItemStack(LevelReader world, BlockPos pos, BlockState state, boolean includeData, Player entity) {
		return new ItemStack(TheToolsAndOtherModBlocks.COPSIDIAN.get());
	}
}
