
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.likejia.yueqiu.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.likejia.yueqiu.client.particle.YueQiuLiZiParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class YueqiuModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(YueqiuModParticleTypes.YUE_QIU_LI_ZI.get(), YueQiuLiZiParticle::provider);
	}
}
