
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.rocky.tools.init;

import net.rocky.tools.client.gui.NetheriteChestGUIScreen;
import net.rocky.tools.client.gui.IronChestGUIScreen;
import net.rocky.tools.client.gui.FurnacingScreen;
import net.rocky.tools.client.gui.FridgeGUIScreen;
import net.rocky.tools.client.gui.EnchantsScreen;
import net.rocky.tools.client.gui.DiamondChestGUIScreen;
import net.rocky.tools.client.gui.ChestGUIScreen;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheToolsAndOtherModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(TheToolsAndOtherModMenus.FURNACING.get(), FurnacingScreen::new);
		event.register(TheToolsAndOtherModMenus.CHEST_GUI.get(), ChestGUIScreen::new);
		event.register(TheToolsAndOtherModMenus.IRON_CHEST_GUI.get(), IronChestGUIScreen::new);
		event.register(TheToolsAndOtherModMenus.DIAMOND_CHEST_GUI.get(), DiamondChestGUIScreen::new);
		event.register(TheToolsAndOtherModMenus.NETHERITE_CHEST_GUI.get(), NetheriteChestGUIScreen::new);
		event.register(TheToolsAndOtherModMenus.FRIDGE_GUI.get(), FridgeGUIScreen::new);
		event.register(TheToolsAndOtherModMenus.ENCHANTS.get(), EnchantsScreen::new);
	}
}
