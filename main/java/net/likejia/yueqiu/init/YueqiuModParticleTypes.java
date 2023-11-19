
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.likejia.yueqiu.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.likejia.yueqiu.YueqiuMod;

public class YueqiuModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, YueqiuMod.MODID);
	public static final RegistryObject<SimpleParticleType> YUE_QIU_LI_ZI = REGISTRY.register("yue_qiu_li_zi", () -> new SimpleParticleType(true));
}
