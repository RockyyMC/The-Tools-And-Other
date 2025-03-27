
package net.rocky.tools.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GreenAppleJuiceVoidItem extends Item {
	public GreenAppleJuiceVoidItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(32));
	}
}
