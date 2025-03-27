
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

public abstract class RedWaterFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> TheToolsAndOtherModFluidTypes.RED_WATER_TYPE.get(), () -> TheToolsAndOtherModFluids.RED_WATER.get(),
			() -> TheToolsAndOtherModFluids.FLOWING_RED_WATER.get()).explosionResistance(100f).bucket(() -> TheToolsAndOtherModItems.RED_WATER_BUCKET.get()).block(() -> (LiquidBlock) TheToolsAndOtherModBlocks.RED_WATER.get());

	private RedWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends RedWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends RedWaterFluid {
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
