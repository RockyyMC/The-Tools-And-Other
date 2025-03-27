
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.rocky.tools.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class TheToolsAndOtherModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == TheToolsAndOtherModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(TheToolsAndOtherModItems.REDSTONE_HELMET.get()), 7, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(TheToolsAndOtherModItems.ONE_HUNDRED_DOLLARS.get(), 6), 5, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 12), new ItemStack(TheToolsAndOtherModItems.NETHERITE_HAMMER.get()), 3, 5, 0.09f));
		}
		if (event.getType() == TheToolsAndOtherModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(TheToolsAndOtherModItems.REDSTONE_CHESTPLATE.get()), 2, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(TheToolsAndOtherModItems.REDSTONE_LEGGINGS.get()), 6, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(TheToolsAndOtherModItems.REDSTONE_BOOTS.get()), 4, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 14), new ItemStack(TheToolsAndOtherModItems.PENTIST_HELMET.get()), 5, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 18), new ItemStack(TheToolsAndOtherModItems.PENTIST_HELMET.get()), 6, 5, 0.09f));
		}
		if (event.getType() == TheToolsAndOtherModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 23), new ItemStack(TheToolsAndOtherModItems.PENTIST_CHESTPLATE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 16), new ItemStack(TheToolsAndOtherModItems.PENTIST_LEGGINGS.get()), 5, 5, 0.05f));
		}
		if (event.getType() == TheToolsAndOtherModVillagerProfessions.MATISTA_2.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 14), new ItemStack(TheToolsAndOtherModItems.PENTIST_BOOTS.get()), 6, 5, 0.05f));
		}
	}
}
