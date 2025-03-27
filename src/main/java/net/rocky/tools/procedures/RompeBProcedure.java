package net.rocky.tools.procedures;

import net.rocky.tools.init.TheToolsAndOtherModItems;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;

public class RompeBProcedure {
	public static void execute() {
		if (new ItemStack(TheToolsAndOtherModItems.OPTINIUM_HAMMER.get()).isCorrectToolForDrops(Blocks.BEDROCK.defaultBlockState())) {
			if (new ItemStack(Blocks.BEDROCK).getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
				ItemStack _setstack = new ItemStack(Blocks.BEDROCK).copy();
				_setstack.setCount(1);
				_modHandlerItemSetSlot.setStackInSlot(0, _setstack);
			}
		}
	}
}
