
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RedReinforcedHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, 13900, 23f, 0, 23, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:red_reinforced_hoe_repair_items")));

	public RedReinforcedHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2f, 19f, properties);
	}
}
