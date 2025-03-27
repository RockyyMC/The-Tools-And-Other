
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.rocky.tools.init;

import net.rocky.tools.world.inventory.NetheriteChestGUIMenu;
import net.rocky.tools.world.inventory.IronChestGUIMenu;
import net.rocky.tools.world.inventory.FurnacingMenu;
import net.rocky.tools.world.inventory.FridgeGUIMenu;
import net.rocky.tools.world.inventory.EnchantsMenu;
import net.rocky.tools.world.inventory.DiamondChestGUIMenu;
import net.rocky.tools.world.inventory.ChestGUIMenu;
import net.rocky.tools.TheToolsAndOtherMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

public class TheToolsAndOtherModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, TheToolsAndOtherMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<FurnacingMenu>> FURNACING = REGISTRY.register("furnacing", () -> IMenuTypeExtension.create(FurnacingMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ChestGUIMenu>> CHEST_GUI = REGISTRY.register("chest_gui", () -> IMenuTypeExtension.create(ChestGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<IronChestGUIMenu>> IRON_CHEST_GUI = REGISTRY.register("iron_chest_gui", () -> IMenuTypeExtension.create(IronChestGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DiamondChestGUIMenu>> DIAMOND_CHEST_GUI = REGISTRY.register("diamond_chest_gui", () -> IMenuTypeExtension.create(DiamondChestGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<NetheriteChestGUIMenu>> NETHERITE_CHEST_GUI = REGISTRY.register("netherite_chest_gui", () -> IMenuTypeExtension.create(NetheriteChestGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<FridgeGUIMenu>> FRIDGE_GUI = REGISTRY.register("fridge_gui", () -> IMenuTypeExtension.create(FridgeGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<EnchantsMenu>> ENCHANTS = REGISTRY.register("enchants", () -> IMenuTypeExtension.create(EnchantsMenu::new));
}
