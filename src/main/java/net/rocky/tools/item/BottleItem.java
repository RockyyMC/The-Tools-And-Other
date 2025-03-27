
package net.rocky.tools.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BottleItem extends Item {
	public BottleItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(32));
	}
}
