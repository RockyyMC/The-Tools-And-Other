
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RedPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 14700, 44f, 0, 44, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:red_pickaxe_repair_items")));

	public RedPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 6f, 0f, properties);
	}
}
