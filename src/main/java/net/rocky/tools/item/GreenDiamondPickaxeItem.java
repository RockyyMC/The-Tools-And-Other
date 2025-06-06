
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class GreenDiamondPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 27900, 70f, 0, 67, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:green_diamond_pickaxe_repair_items")));

	public GreenDiamondPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 4f, 5f, properties.fireResistant());
	}
}
