
package net.rocky.tools.item;

import net.rocky.tools.init.TheToolsAndOtherModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class LightBlueWaterItem extends BucketItem {
	public LightBlueWaterItem(Item.Properties properties) {
		super(TheToolsAndOtherModFluids.LIGHT_BLUE_WATER.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
