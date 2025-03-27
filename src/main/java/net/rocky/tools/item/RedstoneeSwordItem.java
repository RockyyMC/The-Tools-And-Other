
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RedstoneeSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, 6788, 11f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:redstonee_sword_repair_items")));

	public RedstoneeSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 18f, 0f, properties);
	}
}
