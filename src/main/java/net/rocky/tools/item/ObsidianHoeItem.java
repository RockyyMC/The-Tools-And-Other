
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ObsidianHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 12500, 23.8f, 0, 24, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:obsidian_hoe_repair_items")));

	public ObsidianHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 0f, 96f, properties);
	}
}
