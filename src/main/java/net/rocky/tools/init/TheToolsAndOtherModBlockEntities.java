
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.rocky.tools.init;

import net.rocky.tools.block.entity.NetheriteChestBlockEntity;
import net.rocky.tools.block.entity.IronChestBlockEntity;
import net.rocky.tools.block.entity.FridgeBlockEntity;
import net.rocky.tools.block.entity.EnredaderaBlockEntity;
import net.rocky.tools.block.entity.Enredadera3BlockEntity;
import net.rocky.tools.block.entity.Enredadera2BlockEntity;
import net.rocky.tools.block.entity.EmeraldTableEnchantedBlockEntity;
import net.rocky.tools.block.entity.DiamondChestBlockEntity;
import net.rocky.tools.block.entity.ChestBlockEntity;
import net.rocky.tools.block.entity.BlastingFurnaceBlockEntity;
import net.rocky.tools.TheToolsAndOtherMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class TheToolsAndOtherModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, TheToolsAndOtherMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ENREDADERA = register("enredadera", TheToolsAndOtherModBlocks.ENREDADERA, EnredaderaBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ENREDADERA_2 = register("enredadera_2", TheToolsAndOtherModBlocks.ENREDADERA_2, Enredadera2BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> ENREDADERA_3 = register("enredadera_3", TheToolsAndOtherModBlocks.ENREDADERA_3, Enredadera3BlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BLASTING_FURNACE = register("blasting_furnace", TheToolsAndOtherModBlocks.BLASTING_FURNACE, BlastingFurnaceBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GLASS_CHEST = register("glass_chest", TheToolsAndOtherModBlocks.GLASS_CHEST, ChestBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> IRON_CHEST = register("iron_chest", TheToolsAndOtherModBlocks.IRON_CHEST, IronChestBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> DIAMOND_CHEST = register("diamond_chest", TheToolsAndOtherModBlocks.DIAMOND_CHEST, DiamondChestBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> NETHERITE_CHEST = register("netherite_chest", TheToolsAndOtherModBlocks.NETHERITE_CHEST, NetheriteChestBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> FRIDGE = register("fridge", TheToolsAndOtherModBlocks.FRIDGE, FridgeBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GOOD_TABLE = register("good_table", TheToolsAndOtherModBlocks.GOOD_TABLE, EmeraldTableEnchantedBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENREDADERA.get(), (blockEntity, side) -> ((EnredaderaBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENREDADERA_2.get(), (blockEntity, side) -> ((Enredadera2BlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ENREDADERA_3.get(), (blockEntity, side) -> ((Enredadera3BlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BLASTING_FURNACE.get(), (blockEntity, side) -> ((BlastingFurnaceBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GLASS_CHEST.get(), (blockEntity, side) -> ((ChestBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, IRON_CHEST.get(), (blockEntity, side) -> ((IronChestBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DIAMOND_CHEST.get(), (blockEntity, side) -> ((DiamondChestBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, NETHERITE_CHEST.get(), (blockEntity, side) -> ((NetheriteChestBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, FRIDGE.get(), (blockEntity, side) -> ((FridgeBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GOOD_TABLE.get(), (blockEntity, side) -> ((EmeraldTableEnchantedBlockEntity) blockEntity).getItemHandler());
	}
}
