
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.likejia.yueqiu.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.likejia.yueqiu.YueqiuMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class YueqiuModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, YueqiuMod.MODID);
	public static final RegistryObject<CreativeModeTab> YUE_QIU_MO_ZU = REGISTRY.register("yue_qiu_mo_zu",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.yueqiu.yue_qiu_mo_zu")).icon(() -> new ItemStack(YueqiuModBlocks.YUE_YAN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(YueqiuModBlocks.YUE_QIU_LI_KUANG.get().asItem());
				tabData.accept(YueqiuModItems.LI_KUANG_SHI.get());
				tabData.accept(YueqiuModItems.GAO_NENG_MEI_TAN.get());
				tabData.accept(YueqiuModBlocks.YUE_QIU_LIN_KUANG.get().asItem());
				tabData.accept(YueqiuModItems.LIN_DING.get());
				tabData.accept(YueqiuModItems.FU_HE_HUA_FEI.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(YueqiuModBlocks.YUE_RANG.get().asItem());
			tabData.accept(YueqiuModBlocks.YUE_YAN.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(YueqiuModItems.YUE_QIU.get());
		}
	}
}
