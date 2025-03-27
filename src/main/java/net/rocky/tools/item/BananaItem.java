
package net.rocky.tools.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BananaItem extends Item {
	public BananaItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(5).saturationModifier(2f).build()));
	}
}
