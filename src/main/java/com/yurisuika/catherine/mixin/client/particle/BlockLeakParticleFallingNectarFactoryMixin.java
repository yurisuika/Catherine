package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.BlockLeakParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BlockLeakParticle.FallingNectarFactory.class)
public class BlockLeakParticleFallingNectarFactoryMixin {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.92F))
    private static float red(float red) {
        return 0.8784314F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.782F))
    private static float green(float green) {
        return 0.79607844F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.72F))
    private static float blue(float blue) {
        return 0.5647059F;
    }

}
