
package net.rocky.tools.item;

import net.rocky.tools.procedures.Colicionar4Procedure;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

public class BlueDiamondTotemItem extends Item {
	public BlueDiamondTotemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(1).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		Colicionar4Procedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}
}
