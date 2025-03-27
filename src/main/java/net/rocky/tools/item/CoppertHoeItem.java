
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CoppertHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 7890, 11f, 0, 13, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:coppert_hoe_repair_items")));

	public CoppertHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 0f, 0f, properties);
	}
}
