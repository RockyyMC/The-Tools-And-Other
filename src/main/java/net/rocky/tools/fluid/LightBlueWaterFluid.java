
package net.rocky.tools.fluid;

import net.rocky.tools.init.TheToolsAndOtherModItems;
import net.rocky.tools.init.TheToolsAndOtherModFluids;
import net.rocky.tools.init.TheToolsAndOtherModFluidTypes;
import net.rocky.tools.init.TheToolsAndOtherModBlocks;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class LightBlueWaterFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> TheToolsAndOtherModFluidTypes.LIGHT_BLUE_WATER_TYPE.get(), () -> TheToolsAndOtherModFluids.LIGHT_BLUE_WATER.get(),
			() -> TheToolsAndOtherModFluids.FLOWING_LIGHT_BLUE_WATER.get()).explosionResistance(100f).tickRate(4).bucket(() -> TheToolsAndOtherModItems.LIGHT_BLUE_WATER_BUCKET.get())
			.block(() -> (LiquidBlock) TheToolsAndOtherModBlocks.LIGHT_BLUE_WATER.get());

	private LightBlueWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LightBlueWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LightBlueWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
