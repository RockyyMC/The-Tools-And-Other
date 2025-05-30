
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class BlueRubySwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 6799, 9f, 0, 16, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:blue_ruby_sword_repair_items")));

	public BlueRubySwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 17f, -1f, properties);
	}
}
