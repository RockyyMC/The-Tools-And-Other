
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rocky.tools.init;

import net.rocky.tools.TheToolsAndOtherMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class TheToolsAndOtherModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheToolsAndOtherMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ARMADURAS = REGISTRY.register("armaduras",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_tools_and_other.armaduras")).icon(() -> new ItemStack(TheToolsAndOtherModItems.AMETHYST_ARMOR_CHESTPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheToolsAndOtherModItems.AQUA_DARK_ARMOR_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_DARK_ARMOR_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_DARK_ARMOR_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_DARK_ARMOR_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.RED_ARMOR_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.RED_ARMOR_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.RED_ARMOR_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.RED_ARMOR_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.RED_EMERALD_A_ARMOR_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.RED_EMERALD_A_ARMOR_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.RED_EMERALD_A_ARMOR_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.RED_EMERALD_A_ARMOR_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.EMERALDA_ARMOR_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.EMERALDA_ARMOR_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.EMERALDA_ARMOR_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.EMERALDA_ARMOR_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.MAGNIF_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.MAGNIF_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.MAGNIF_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.MAGNIF_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.PENTIST_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.PENTIST_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.PENTIST_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.PENTIST_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.BEDROCK_ARMOR_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.BEDROCK_ARMOR_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.BEDROCK_ARMOR_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.BEDROCK_ARMOR_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.CREEPER_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.CREEPER_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.CREEPER_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.CREEPER_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_BRICK_ARMOR_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_BRICK_ARMOR_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_BRICK_ARMOR_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_BRICK_ARMOR_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.AXOLTL_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.AMETHYST_ARMOR_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.AMETHYST_ARMOR_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.AMETHYST_ARMOR_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.AMETHYST_ARMOR_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.CHERRY_ARMOR_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.CHERRY_ARMOR_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.CHERRY_ARMOR_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.CHERRY_ARMOR_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_RUBY_ARMOR_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_RUBY_ARMOR_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_RUBY_ARMOR_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_RUBY_ARMOR_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.REDSTONE_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.REDSTONE_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.REDSTONE_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.REDSTONE_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.COPPER_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.COPPER_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.COPPER_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.COPPER_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.OBSIDIAN_ARMOR_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.OBSIDIAN_ARMOR_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.OBSIDIAN_ARMOR_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.OBSIDIAN_ARMOR_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_ARMOR_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_ARMOR_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_ARMOR_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_ARMOR_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.MAGNE_ARMOR_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.MAGNE_ARMOR_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.MAGNE_ARMOR_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.MAGNE_ARMOR_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.DIRT_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.DIRT_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.DIRT_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.DIRT_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.STONE_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.STONE_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.STONE_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.STONE_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.METAL_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.METAL_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.METAL_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.METAL_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.PALE_ARMOR_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.PALE_ARMOR_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.PALE_ARMOR_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.PALE_ARMOR_BOOTS.get());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HERRAMIENTAS = REGISTRY.register("herramientas",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_tools_and_other.herramientas")).icon(() -> new ItemStack(TheToolsAndOtherModItems.AMETHYST_PICKAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheToolsAndOtherModItems.AMETHYST_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.AMETHYST_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.AMETHYST_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.AMETHYST_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.AMETHYST_HOE.get());
				tabData.accept(TheToolsAndOtherModItems.CHERRY_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.CHERRY_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.CHERRY_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.CHERRY_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.CHERRY_HOE.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_RUBY_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_RUBY_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_RUBY_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_RUBY_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_RUBY_HOE.get());
				tabData.accept(TheToolsAndOtherModItems.REDSTONEE_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.REDSTONEE_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.REDSTONEE_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.REDSTONEE_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.REDSTONEE_HOE.get());
				tabData.accept(TheToolsAndOtherModItems.COPPERT_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.COPPERT_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.COPPERT_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.COPPERT_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.COPPERT_HOE.get());
				tabData.accept(TheToolsAndOtherModItems.OBSIDIAN_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.OBSIDIAN_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.OBSIDIAN_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.OBSIDIAN_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.OBSIDIAN_HOE.get());
				tabData.accept(TheToolsAndOtherModItems.MAGNE_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.MAGNE_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.MAGNE_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.MAGNE_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.MAGNE_HOE.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_HOE.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_DARK_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_DARK_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_DARK_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_DARK_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_DARK_HOE.get());
				tabData.accept(TheToolsAndOtherModItems.RED_REINFORCED_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.RED_REINFORCED_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.RED_REINFORCED_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.RED_REINFORCED_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.RED_REINFORCED_HOE.get());
				tabData.accept(TheToolsAndOtherModItems.RED_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.RED_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.RED_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.RED_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.RED_HOE.get());
				tabData.accept(TheToolsAndOtherModItems.EMERALD_A_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.EMERALD_A_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.EMERALD_A_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.EMERALD_A_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.EMERALD_A_HOE.get());
				tabData.accept(TheToolsAndOtherModItems.CORTADOR.get());
				tabData.accept(TheToolsAndOtherModItems.COLOSAL.get());
				tabData.accept(TheToolsAndOtherModItems.BERNY_DIMENCION.get());
				tabData.accept(TheToolsAndOtherModItems.STICK.get());
				tabData.accept(TheToolsAndOtherModItems.OPTINIUM_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.OPTINIUM_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.OPTINIUM_ROT.get());
				tabData.accept(TheToolsAndOtherModItems.MACE.get());
				tabData.accept(TheToolsAndOtherModItems.SWORDS.get());
				tabData.accept(TheToolsAndOtherModItems.METAL_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.METAL_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.METAL_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.METAL_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.METAL_HOE.get());
			}).withTabsBefore(ARMADURAS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ITEMS = REGISTRY.register("items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_tools_and_other.items")).icon(() -> new ItemStack(TheToolsAndOtherModItems.REDSTONE_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheToolsAndOtherModItems.BLUE_RUBY_INGOT.get());
				tabData.accept(TheToolsAndOtherModItems.REDSTONE_INGOT.get());
				tabData.accept(TheToolsAndOtherModItems.REDSTONENUGGET.get());
				tabData.accept(TheToolsAndOtherModItems.COPPERNUGGET.get());
				tabData.accept(TheToolsAndOtherModItems.RED_EMERALD_FRAGMENT.get());
				tabData.accept(TheToolsAndOtherModItems.CANDYBASTON.get());
				tabData.accept(TheToolsAndOtherModItems.MONEYY.get());
				tabData.accept(TheToolsAndOtherModItems.ONE_HUNDRED_DOLLARS.get());
				tabData.accept(TheToolsAndOtherModItems.MAGNIF_INGOT.get());
				tabData.accept(TheToolsAndOtherModItems.GREEN_APPLE_JUICE_VOID.get());
				tabData.accept(TheToolsAndOtherModItems.RED_APPLE_JUICE_VOID.get());
				tabData.accept(TheToolsAndOtherModItems.BOTTLE.get());
				tabData.accept(TheToolsAndOtherModItems.FIFTY_DOLLAR.get());
				tabData.accept(TheToolsAndOtherModItems.FIVE_DOLLARS.get());
				tabData.accept(TheToolsAndOtherModItems.PENTIST_INGOT.get());
				tabData.accept(TheToolsAndOtherModItems.OPTINIUM_INGOT.get());
				tabData.accept(TheToolsAndOtherModBlocks.BLOOD_1.get().asItem());
				tabData.accept(TheToolsAndOtherModItems.FOLLIAGE_FRAGMENT.get());
				tabData.accept(TheToolsAndOtherModItems.METAL_INGOT.get());
			}).withTabsBefore(HERRAMIENTAS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FOODS = REGISTRY.register("foods",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_tools_and_other.foods")).icon(() -> new ItemStack(TheToolsAndOtherModItems.PIZZA.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheToolsAndOtherModItems.PIZZA.get());
				tabData.accept(TheToolsAndOtherModItems.RODAJA_DE_PIZZA.get());
				tabData.accept(TheToolsAndOtherModItems.STRAWBERRY_NUTELLA.get());
				tabData.accept(TheToolsAndOtherModItems.CHOCOLATE_NUTELLA.get());
				tabData.accept(TheToolsAndOtherModItems.VAINILLA_NUTELLA.get());
				tabData.accept(TheToolsAndOtherModItems.GREE_APPLE_JUICE.get());
				tabData.accept(TheToolsAndOtherModItems.RED_APPLE_JUICE.get());
				tabData.accept(TheToolsAndOtherModItems.BANANA.get());
				tabData.accept(TheToolsAndOtherModItems.REDSTONE_APPLE.get());
				tabData.accept(TheToolsAndOtherModItems.REDSTONE_ENCHANTED_APPLE.get());
				tabData.accept(TheToolsAndOtherModItems.DIAMOND_APPLE.get());
				tabData.accept(TheToolsAndOtherModItems.ENCHANTED_DIAMOND_APPLE.get());
				tabData.accept(TheToolsAndOtherModItems.GOLD_PORKCHOP.get());
				tabData.accept(TheToolsAndOtherModItems.GOLD_PORKCHOP_COOKED.get());
				tabData.accept(TheToolsAndOtherModItems.STRAWBERRY.get());
				tabData.accept(TheToolsAndOtherModItems.PIZZA_V_2.get());
				tabData.accept(TheToolsAndOtherModItems.GRAPE.get());
			}).withTabsBefore(ITEMS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BLOCKS = REGISTRY.register("blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_tools_and_other.blocks")).icon(() -> new ItemStack(TheToolsAndOtherModBlocks.RED_EMERALD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheToolsAndOtherModBlocks.BLUE_RUBY_BLOCK.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.RED_REINFORCED_BRICKS.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BERNY_WOOD.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BERNY_LOG.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BERNY_PLANKS.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BERNY_STAIRS.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BERNY_SLAB.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BERNY_FENCE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BERNY_FENCE_GATE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BERNY_PRESSURE_PLATE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BERNY_BUTTON.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MAGNIFICTECIOSS.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MAGNIFICTECIOSS_REINFORCED.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MAGNE_LOG.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MAGNE_PLANKS.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MAGNE_WOOD.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MAGNE_DOOR.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MAGNE_TRAPDOOR.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MAGNE_FENCE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MAGNE_FENCE_GATE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MAGNE_PRESSURE_PLATE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MAGNE_BUTTOM.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_LOG.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_PLANKS.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_WOOD.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_DOOR.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_TRAPDOOR.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_PRESSURE_PLATE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_BUTTOM.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_DARK_LOG.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_DARK_PLANKS.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_DARK_WOOD.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_DARK_DOOR.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_DARK_TRAPDOOR.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_DARK_PRESSURE_PLATE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_DARK_BUTTOM.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_DARK_FENCE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_DARK_FENCE_GATE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BULL.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.RED_EMERALD.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.LIGHTBLUE_WOOD.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MONEY.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.CANDY.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MID_NIGHT.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MOON.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.SUN.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MAGNIF_BLOCK.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.PENTIST_BLOCK.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BLASTING_FURNACE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.OPTINIUM.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MOSSY_BLUE_BRICKS.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BLUE_BRICKS.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BLUE_REINFORCED_BRICKS.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.FOLLIAGE_BLOCK.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.FOLLIAGE_DOOR.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.WINDOW.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BLOOD.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BOX_OF_PIZZA.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.RED_VOLCANIC.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.VOLCANIC.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.YELLOW_VOLCANIC.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.GREEN_VOLCANIC.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BLUE_VOLCANIC.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.GREEN_OAK.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.GREEN_PLANKS.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.GREEN_OAK_WOOD.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.CLITPALLS_BLOCK.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.FOLLIAGE_TRAPDOOR.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.FOLLIAGE_FENCE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.FOLLIAGE_FENCE_GATE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.FOLLIAGE_STAIR.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.FOLLIAGE_SLAB.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.FOLLIAGE_BOTTOM.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.FOLLIAGE_PRESSURE_PLATE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.FOLLIAGE_WALL.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.GREEN_OAK_DOOR.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.GREEN_OAK_TRAP_DOOR.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.SIRPINT_LOG.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.SIRPINT_PLANKS.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.SIRPINT_WOOD.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.LIGHT_BLUE_SAND.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BLUE_SAND.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.YELLOW_SAND.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.GREEN_SAND.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.RED_SAND.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BLUE_SAND_STONE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.GREEN_SAND_STONE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.GRAPE_LOG.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.YELLOW_SAND_STONE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.FRIDGE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.METAL_BLOCK.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.GOOD_TABLE.get().asItem());
			}).withTabsBefore(FOODS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NATURALS = REGISTRY.register("naturals",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_tools_and_other.naturals")).icon(() -> new ItemStack(TheToolsAndOtherModBlocks.BERNY_LEAVES.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheToolsAndOtherModBlocks.BERNY_LEAVES.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_LEAVES.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.MAGNE_LEAVES.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.AQUA_DARK_LEAVES.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.ARBUST.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.RED_EMERALD_ORE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.RED_EMERALD_ORE_DEEPSLATE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.ENREDADERA.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.COLOSAL_GRASS.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BANANA_FRUIT.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.COLSITEM_B.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.OPTINIUM_ORE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.GREEN_OAK_LEAVES.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.BLUERUBYORE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.GRAPE_LEAVES.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.METAL_ORE.get().asItem());
			}).withTabsBefore(BLOCKS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ENTITIES = REGISTRY.register("entities",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_tools_and_other.entities")).icon(() -> new ItemStack(TheToolsAndOtherModItems.DUCK_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheToolsAndOtherModItems.DUCK_SPAWN_EGG.get());
				tabData.accept(TheToolsAndOtherModItems.MATIST_SPAWN_EGG.get());
			}).withTabsBefore(NATURALS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FLUIDS = REGISTRY.register("fluids",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_tools_and_other.fluids")).icon(() -> new ItemStack(TheToolsAndOtherModItems.GREEN_WATER_BUCKET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheToolsAndOtherModItems.GREEN_WATER_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.RED_WATER_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.LIGHT_BLUE_WATER_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.MILK_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.CURSED_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.TOXIC_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.YELLOW_WATER_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.PINK_WATER_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.PURPLE_WATER_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.WATER_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.ORANGE_WATER_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.ARCOIRIS_WATER_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.PETROLLEO_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.BROWN_WATER_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.AQUA_WATER_BUCKET.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_WATER_BUCKET.get());
			}).withTabsBefore(ENTITIES.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HAMMER = REGISTRY.register("hammer",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_tools_and_other.hammer")).icon(() -> new ItemStack(TheToolsAndOtherModItems.DIAMOND_HAMMER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheToolsAndOtherModItems.IRON_HAMMER.get());
				tabData.accept(TheToolsAndOtherModItems.LAPIS_LAZULI_HAMMER.get());
				tabData.accept(TheToolsAndOtherModItems.REDSTONE_HAMMER.get());
				tabData.accept(TheToolsAndOtherModItems.DIAMOND_HAMMER.get());
				tabData.accept(TheToolsAndOtherModItems.NETHERITE_HAMMER.get());
				tabData.accept(TheToolsAndOtherModItems.DIAMOND_HAMMER_3D.get());
				tabData.accept(TheToolsAndOtherModItems.OPTINIUM_HAMMER.get());
			}).withTabsBefore(FLUIDS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> COMBUSTIBLE = REGISTRY.register("combustible",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_tools_and_other.combustible")).icon(() -> new ItemStack(Items.COAL)).displayItems((parameters, tabData) -> {
				tabData.accept(TheToolsAndOtherModItems.COLSITEM.get());
				tabData.accept(TheToolsAndOtherModItems.FANTIST.get());
			}).withTabsBefore(HAMMER.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CHESTS = REGISTRY.register("chests",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_tools_and_other.chests")).icon(() -> new ItemStack(TheToolsAndOtherModBlocks.GLASS_CHEST.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheToolsAndOtherModBlocks.GLASS_CHEST.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.IRON_CHEST.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.DIAMOND_CHEST.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.NETHERITE_CHEST.get().asItem());
			}).withTabsBefore(COMBUSTIBLE.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> DIAMONDS = REGISTRY.register("diamonds",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_tools_and_other.diamonds")).icon(() -> new ItemStack(TheToolsAndOtherModBlocks.RED_DIAMOND_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheToolsAndOtherModBlocks.RED_DIAMOND_BLOCK.get().asItem());
				tabData.accept(TheToolsAndOtherModItems.RED_DIAMOND_INGOT.get());
				tabData.accept(TheToolsAndOtherModItems.RED_DIAMOND_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.RED_DIAMOND_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.RED_DIAMOND_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.RED_DIAMOND_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.RED_DIAMOND_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.RED_DIAMOND_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.RED_DIAMOND_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.RED_DIAMOND_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.RED_DIAMOND_HOE.get());
				tabData.accept(TheToolsAndOtherModBlocks.GREEN_DIAMOND_BLOCK.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.RED_DIAMOND_ORE.get().asItem());
				tabData.accept(TheToolsAndOtherModItems.GREEN_DIAMOND_INGOT.get());
				tabData.accept(TheToolsAndOtherModItems.GREEN_DIAMOND_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.GREEN_DIAMOND_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.GREEN_DIAMOND_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.GREEN_DIAMOND_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.GREEN_DIAMOND_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.GREEN_DIAMOND_PICKAXE.get());
				tabData.accept(TheToolsAndOtherModItems.GREEN_DIAMOND_AXE.get());
				tabData.accept(TheToolsAndOtherModItems.GREEN_DIAMOND_SHOVEL.get());
				tabData.accept(TheToolsAndOtherModItems.GREEN_DIAMOND_HOE.get());
				tabData.accept(TheToolsAndOtherModBlocks.GREEN_DIAMOND_ORE.get().asItem());
			}).withTabsBefore(CHESTS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TOTEMS = REGISTRY.register("totems",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_tools_and_other.totems")).icon(() -> new ItemStack(TheToolsAndOtherModItems.TOTEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheToolsAndOtherModItems.TOTEM.get());
				tabData.accept(TheToolsAndOtherModItems.RED_TOTEM.get());
				tabData.accept(TheToolsAndOtherModItems.BLACK_TOTEM.get());
				tabData.accept(TheToolsAndOtherModItems.BLUE_DIAMOND_TOTEM.get());
			}).withTabsBefore(DIAMONDS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> IN_PROGRESS = REGISTRY.register("in_progress",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_tools_and_other.in_progress")).icon(() -> new ItemStack(Items.KNOWLEDGE_BOOK)).displayItems((parameters, tabData) -> {
				tabData.accept(TheToolsAndOtherModItems.YELLOW_DIAMOND_INGOT.get());
				tabData.accept(TheToolsAndOtherModItems.YELLOW_DIAMOND_HELMET.get());
				tabData.accept(TheToolsAndOtherModItems.YELLOW_DIAMOND_CHESTPLATE.get());
				tabData.accept(TheToolsAndOtherModItems.YELLOW_DIAMOND_LEGGINGS.get());
				tabData.accept(TheToolsAndOtherModItems.YELLOW_DIAMOND_BOOTS.get());
				tabData.accept(TheToolsAndOtherModItems.YELLOW_DIAMOND_SWORD.get());
				tabData.accept(TheToolsAndOtherModItems.GOLD_MACE.get());
				tabData.accept(TheToolsAndOtherModBlocks.TRUSTANIC_BLOCK.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.TRUSTANIC_ORE.get().asItem());
				tabData.accept(TheToolsAndOtherModBlocks.COPSIDIAN.get().asItem());
			}).withTabsBefore(TOTEMS.getId()).build());
}
