package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.WaterSuspendParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WaterSuspendParticle.WarpedSporeFactory.class)
public class WaterSuspendParticleWarpedSporeFactoryMixin {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.1F, ordinal = 0))
    private static float red(float red) {
        return 0.23921569F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.1F, ordinal = 1))
    private static float green(float green) {
        return 0.22745098F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.3F))
    private static float blue(float blue) {
        return 0.21960784F;
    }

}
