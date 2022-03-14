package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.GlowParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(GlowParticle.WaxOnFactory.class)
public class GlowParticleWaxOnFactoryMixin {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.91F))
    private static float red(float red) {
        return 0.7529412F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.55F))
    private static float green(float green) {
        return 0.5921569F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.08F))
    private static float blue(float blue) {
        return 0.2901961F;
    }

}
