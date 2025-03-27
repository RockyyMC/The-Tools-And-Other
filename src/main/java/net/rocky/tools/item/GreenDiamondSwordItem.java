
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class GreenDiamondSwordItem extends SwordItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 27900, 69f, 0, 70, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:green_diamond_sword_repair_items")));

	public GreenDiamondSwordItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 46f, -1f, properties.fireResistant());
	}
}
