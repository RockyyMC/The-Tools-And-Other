
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EmeraldASwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 15600, 55f, 0, 55, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:emerald_a_sword_repair_items")));

	public EmeraldASwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 26f, 3f, properties);
	}
}
