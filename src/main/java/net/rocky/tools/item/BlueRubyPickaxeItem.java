
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class BlueRubyPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 6799, 11f, 0, 16, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:blue_ruby_pickaxe_repair_items")));

	public BlueRubyPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 2f, -2f, properties);
	}
}
