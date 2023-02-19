package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.WaterSuspendParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WaterSuspendParticle.SporeBlossomAirFactory.class)
public class WaterSuspendParticleSporeBlossomAirFactoryMixin {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.32F))
    private static float red(float red) {
        return 0.50980395F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.5F))
    private static float green(float green) {
        return 0.40784314F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.22F))
    private static float blue(float blue) {
        return 0.34901962F;
    }

}