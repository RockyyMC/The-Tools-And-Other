
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RedHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 14700, 44f, 0, 44, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:red_hoe_repair_items")));

	public RedHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2f, 2f, properties);
	}
}
