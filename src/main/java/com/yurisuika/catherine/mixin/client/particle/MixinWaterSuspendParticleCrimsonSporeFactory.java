package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.WaterSuspendParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WaterSuspendParticle.CrimsonSporeFactory.class)
public class MixinWaterSuspendParticleCrimsonSporeFactory {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.9F))
    private static float red(float red) {
        return 0.33333334F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.4F))
    private static float green(float green) {
        return 0.1764706F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.5F))
    private static float blue(float blue) {
        return 0.18431373F;
    }

}
