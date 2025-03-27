
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

public abstract class PetrolleoFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> TheToolsAndOtherModFluidTypes.PETROLLEO_TYPE.get(), () -> TheToolsAndOtherModFluids.PETROLLEO.get(),
			() -> TheToolsAndOtherModFluids.FLOWING_PETROLLEO.get()).explosionResistance(100f).tickRate(1).bucket(() -> TheToolsAndOtherModItems.PETROLLEO_BUCKET.get()).block(() -> (LiquidBlock) TheToolsAndOtherModBlocks.PETROLLEO.get());

	private PetrolleoFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PetrolleoFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PetrolleoFluid {
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
