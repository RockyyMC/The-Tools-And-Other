
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class EmeraldAHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 15600, 55f, 0, 55, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:emerald_a_hoe_repair_items")));

	public EmeraldAHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2f, 0f, properties);
	}
}
