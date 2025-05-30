
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MagneSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 5700, 12f, 0, 15, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:magne_sword_repair_items")));

	public MagneSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 10f, 0f, properties);
	}
}
