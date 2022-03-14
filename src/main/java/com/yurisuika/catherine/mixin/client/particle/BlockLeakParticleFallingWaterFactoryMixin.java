package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.BlockLeakParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BlockLeakParticle.FallingWaterFactory.class)
public class BlockLeakParticleFallingWaterFactoryMixin {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.2F))
    private static float red(float red) {
        return 0.45882353F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.3F))
    private static float green(float green) {
        return 0.49803922F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 1.0F))
    private static float blue(float blue) {
        return 0.50980395F;
    }

}
