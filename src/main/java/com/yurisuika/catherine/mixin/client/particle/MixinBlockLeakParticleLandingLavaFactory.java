package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.BlockLeakParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BlockLeakParticle.LandingLavaFactory.class)
public class MixinBlockLeakParticleLandingLavaFactory {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 1.0F))
    private static float red(float red) {
        return 0.88235295F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.2857143F))
    private static float green(float green) {
        return 0.38039216F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.083333336F))
    private static float blue(float blue) {
        return 0.03137255F;
    }

}