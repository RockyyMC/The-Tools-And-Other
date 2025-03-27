
package net.rocky.tools.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OneHundredDollarsItem extends Item {
	public OneHundredDollarsItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64));
	}
}
