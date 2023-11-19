
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.likejia.yueqiu.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.likejia.yueqiu.world.features.ores.YueQiuLinKuangFeature;
import net.likejia.yueqiu.world.features.ores.YueQiuLiKuangFeature;
import net.likejia.yueqiu.world.features.YunShiKengFeature;
import net.likejia.yueqiu.YueqiuMod;

@Mod.EventBusSubscriber
public class YueqiuModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, YueqiuMod.MODID);
	public static final RegistryObject<Feature<?>> YUN_SHI_KENG = REGISTRY.register("yun_shi_keng", YunShiKengFeature::new);
	public static final RegistryObject<Feature<?>> YUE_QIU_LI_KUANG = REGISTRY.register("yue_qiu_li_kuang", YueQiuLiKuangFeature::new);
	public static final RegistryObject<Feature<?>> YUE_QIU_LIN_KUANG = REGISTRY.register("yue_qiu_lin_kuang", YueQiuLinKuangFeature::new);
}
