
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.likejia.yueqiu.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.likejia.yueqiu.block.YueYanBlock;
import net.likejia.yueqiu.block.YueRangBlock;
import net.likejia.yueqiu.block.YueQiuPortalBlock;
import net.likejia.yueqiu.block.YueQiuLinKuangBlock;
import net.likejia.yueqiu.block.YueQiuLiKuangBlock;
import net.likejia.yueqiu.YueqiuMod;

public class YueqiuModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, YueqiuMod.MODID);
	public static final RegistryObject<Block> YUE_RANG = REGISTRY.register("yue_rang", () -> new YueRangBlock());
	public static final RegistryObject<Block> YUE_YAN = REGISTRY.register("yue_yan", () -> new YueYanBlock());
	public static final RegistryObject<Block> YUE_QIU_PORTAL = REGISTRY.register("yue_qiu_portal", () -> new YueQiuPortalBlock());
	public static final RegistryObject<Block> YUE_QIU_LI_KUANG = REGISTRY.register("yue_qiu_li_kuang", () -> new YueQiuLiKuangBlock());
	public static final RegistryObject<Block> YUE_QIU_LIN_KUANG = REGISTRY.register("yue_qiu_lin_kuang", () -> new YueQiuLinKuangBlock());
}
