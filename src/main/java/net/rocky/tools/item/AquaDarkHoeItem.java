
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class AquaDarkHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL, 7000, 16f, 0, 14, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:aqua_dark_hoe_repair_items")));

	public AquaDarkHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 0f, 0f, properties);
	}
}
