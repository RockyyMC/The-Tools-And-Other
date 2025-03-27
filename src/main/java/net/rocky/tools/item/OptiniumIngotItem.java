
package net.rocky.tools.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OptiniumIngotItem extends Item {
	public OptiniumIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).fireResistant());
	}
}
