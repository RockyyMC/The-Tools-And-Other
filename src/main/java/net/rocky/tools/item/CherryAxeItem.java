
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class CherryAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 3000, 9f, 0, 14, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:cherry_axe_repair_items")));

	public CherryAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 8f, -3f, properties);
	}
}
