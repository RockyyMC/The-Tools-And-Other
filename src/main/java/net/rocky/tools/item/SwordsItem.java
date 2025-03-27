
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SwordsItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3456, 55f, 0, 55, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:swords_repair_items")));

	public SwordsItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 32f, -3f, properties);
	}
}
