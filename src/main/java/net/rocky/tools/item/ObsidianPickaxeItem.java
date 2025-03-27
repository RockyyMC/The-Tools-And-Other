
package net.rocky.tools.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ObsidianPickaxeItem extends PickaxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 12500, 23f, 0, 24, TagKey.create(Registries.ITEM, ResourceLocation.parse("the_tools_and_other:obsidian_pickaxe_repair_items")));

	public ObsidianPickaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 5f, 96f, properties);
	}
}
