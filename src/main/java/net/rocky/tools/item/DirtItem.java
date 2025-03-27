
package net.rocky.tools.item;

import net.rocky.tools.init.TheToolsAndOtherModItems;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import java.util.Map;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class DirtItem extends ArmorItem {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(19, Map.of(ArmorType.BOOTS, 15, ArmorType.LEGGINGS, 16, ArmorType.CHESTPLATE, 19, ArmorType.HELMET, 17, ArmorType.BODY, 19), 15,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 1.4f, 1.1f, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:dirt_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("the_tools_and_other:dirt")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_tools_and_other:textures/models/armor/dirt_layer_1.png");
			}
		}, TheToolsAndOtherModItems.DIRT_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_tools_and_other:textures/models/armor/dirt_layer_1.png");
			}
		}, TheToolsAndOtherModItems.DIRT_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_tools_and_other:textures/models/armor/dirt_layer_2.png");
			}
		}, TheToolsAndOtherModItems.DIRT_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_tools_and_other:textures/models/armor/dirt_layer_1.png");
			}
		}, TheToolsAndOtherModItems.DIRT_BOOTS.get());
	}

	private DirtItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends DirtItem {
		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties);
		}
	}

	public static class Chestplate extends DirtItem {
		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties);
		}
	}

	public static class Leggings extends DirtItem {
		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties);
		}
	}

	public static class Boots extends DirtItem {
		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties);
		}
	}
}
