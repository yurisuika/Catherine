package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.WaterSuspendParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WaterSuspendParticle.UnderwaterFactory.class)
public class WaterSuspendParticleUnderwaterFactoryMixin {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.4F, ordinal = 0))
    private static float red(float red) {
        return 0.45882353F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.4F, ordinal = 1))
    private static float green(float green) {
        return 0.49803922F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.7F))
    private static float blue(float blue) {
        return 0.50980395F;
    }

}
