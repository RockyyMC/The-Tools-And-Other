package net.rocky.tools.procedures;

import net.rocky.tools.init.TheToolsAndOtherModBlocks;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CrecerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.01) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TheToolsAndOtherModBlocks.ENREDADERA.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = TheToolsAndOtherModBlocks.ENREDADERA.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TheToolsAndOtherModBlocks.ENREDADERA.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = TheToolsAndOtherModBlocks.ENREDADERA_2.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TheToolsAndOtherModBlocks.ENREDADERA_2.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = TheToolsAndOtherModBlocks.ENREDADERA_2.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == TheToolsAndOtherModBlocks.ENREDADERA_2.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = TheToolsAndOtherModBlocks.ENREDADERA_3.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}
