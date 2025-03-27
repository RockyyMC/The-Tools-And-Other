
package net.rocky.tools.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ColsitemItem extends Item {
	public ColsitemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(32));
	}
}
