
package net.rocky.tools.block;

import net.rocky.tools.init.TheToolsAndOtherModFluids;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

public class MilkBlock extends LiquidBlock {
	public MilkBlock(BlockBehaviour.Properties properties) {
		super(TheToolsAndOtherModFluids.MILK.get(), properties.mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
