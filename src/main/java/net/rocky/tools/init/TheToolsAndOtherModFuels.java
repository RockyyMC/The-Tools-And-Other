
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.rocky.tools.init;

import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class TheToolsAndOtherModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == TheToolsAndOtherModItems.COLSITEM.get())
			event.setBurnTime(1200);
		else if (itemstack.getItem() == TheToolsAndOtherModItems.FANTIST.get())
			event.setBurnTime(1600);
	}
}
