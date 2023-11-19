
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.likejia.yueqiu.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.likejia.yueqiu.item.YueQiuItem;
import net.likejia.yueqiu.item.LinDingItem;
import net.likejia.yueqiu.item.LiKuangShiItem;
import net.likejia.yueqiu.item.GaoNengMeiTanItem;
import net.likejia.yueqiu.item.FuHeHuaFeiItem;
import net.likejia.yueqiu.YueqiuMod;

public class YueqiuModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, YueqiuMod.MODID);
	public static final RegistryObject<Item> YUE_RANG = block(YueqiuModBlocks.YUE_RANG);
	public static final RegistryObject<Item> YUE_YAN = block(YueqiuModBlocks.YUE_YAN);
	public static final RegistryObject<Item> YUE_QIU = REGISTRY.register("yue_qiu", () -> new YueQiuItem());
	public static final RegistryObject<Item> YUE_QIU_LI_KUANG = block(YueqiuModBlocks.YUE_QIU_LI_KUANG);
	public static final RegistryObject<Item> LI_KUANG_SHI = REGISTRY.register("li_kuang_shi", () -> new LiKuangShiItem());
	public static final RegistryObject<Item> GAO_NENG_MEI_TAN = REGISTRY.register("gao_neng_mei_tan", () -> new GaoNengMeiTanItem());
	public static final RegistryObject<Item> YUE_QIU_LIN_KUANG = block(YueqiuModBlocks.YUE_QIU_LIN_KUANG);
	public static final RegistryObject<Item> LIN_DING = REGISTRY.register("lin_ding", () -> new LinDingItem());
	public static final RegistryObject<Item> FU_HE_HUA_FEI = REGISTRY.register("fu_he_hua_fei", () -> new FuHeHuaFeiItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
