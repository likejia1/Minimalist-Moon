
package net.likejia.yueqiu.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class LinDingItem extends Item {
	public LinDingItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
