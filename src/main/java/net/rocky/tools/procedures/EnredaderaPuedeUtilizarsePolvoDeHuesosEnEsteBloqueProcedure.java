package net.rocky.tools.procedures;

import net.rocky.tools.init.TheToolsAndOtherModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class EnredaderaPuedeUtilizarsePolvoDeHuesosEnEsteBloqueProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TheToolsAndOtherModBlocks.ENREDADERA.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TheToolsAndOtherModBlocks.ENREDADERA_2.get();
	}
}
