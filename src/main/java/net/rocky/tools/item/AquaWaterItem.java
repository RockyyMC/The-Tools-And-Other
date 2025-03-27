
package net.rocky.tools.item;

import net.rocky.tools.init.TheToolsAndOtherModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class AquaWaterItem extends BucketItem {
	public AquaWaterItem(Item.Properties properties) {
		super(TheToolsAndOtherModFluids.AQUA_WATER.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
