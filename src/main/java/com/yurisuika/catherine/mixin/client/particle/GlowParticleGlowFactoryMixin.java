package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.GlowParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(GlowParticle.GlowFactory.class)
public class GlowParticleGlowFactoryMixin {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.6F))
    private static float red(float red) {
        return 0.3882353F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 1.0F))
    private static float green(float green) {
        return 0.6313726F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.8F))
    private static float blue(float blue) {
        return 0.5803922F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.08F))
    private static float redDark(float red) {
        return 0.28627452F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.4F, ordinal = 0))
    private static float greenDark(float green) {
        return 0.46666667F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.4F, ordinal = 1))
    private static float blueDark(float blue) {
        return 0.43529412F;
    }

}
