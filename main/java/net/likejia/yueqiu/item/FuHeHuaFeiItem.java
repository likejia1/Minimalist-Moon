
package net.likejia.yueqiu.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.likejia.yueqiu.procedures.FuHeHuaFeiDangYouJianDianJiFangKuaiShiProcedure;

public class FuHeHuaFeiItem extends Item {
	public FuHeHuaFeiItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 1;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		FuHeHuaFeiDangYouJianDianJiFangKuaiShiProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
