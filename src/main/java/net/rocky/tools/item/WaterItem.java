
package net.rocky.tools.item;

import net.rocky.tools.init.TheToolsAndOtherModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class WaterItem extends BucketItem {
	public WaterItem(Item.Properties properties) {
		super(TheToolsAndOtherModFluids.WATER.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
