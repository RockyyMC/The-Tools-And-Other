
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
public abstract class AquaArmorItem extends ArmorItem {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(20, Map.of(ArmorType.BOOTS, 23, ArmorType.LEGGINGS, 22, ArmorType.CHESTPLATE, 23, ArmorType.HELMET, 22, ArmorType.BODY, 23), 9,
			BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EMPTY), 9f, 1f, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:aqua_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, ResourceLocation.parse("the_tools_and_other:aqua_armor")));

	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_tools_and_other:textures/models/armor/aqua_layer_1.png");
			}
		}, TheToolsAndOtherModItems.AQUA_ARMOR_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_tools_and_other:textures/models/armor/aqua_layer_1.png");
			}
		}, TheToolsAndOtherModItems.AQUA_ARMOR_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_tools_and_other:textures/models/armor/aqua_layer_2.png");
			}
		}, TheToolsAndOtherModItems.AQUA_ARMOR_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			@Override
			public ResourceLocation getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, ResourceLocation _default) {
				return ResourceLocation.parse("the_tools_and_other:textures/models/armor/aqua_layer_1.png");
			}
		}, TheToolsAndOtherModItems.AQUA_ARMOR_BOOTS.get());
	}

	private AquaArmorItem(ArmorType type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends AquaArmorItem {
		public Helmet(Item.Properties properties) {
			super(ArmorType.HELMET, properties);
		}
	}

	public static class Chestplate extends AquaArmorItem {
		public Chestplate(Item.Properties properties) {
			super(ArmorType.CHESTPLATE, properties);
		}
	}

	public static class Leggings extends AquaArmorItem {
		public Leggings(Item.Properties properties) {
			super(ArmorType.LEGGINGS, properties);
		}
	}

	public static class Boots extends AquaArmorItem {
		public Boots(Item.Properties properties) {
			super(ArmorType.BOOTS, properties);
		}
	}
}
