package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.GlowParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(GlowParticle.ScrapeFactory.class)
public class MixinGlowParticleScrapeFactory {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.29F))
    private static float red(float red) {
        return 0.4392157F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.58F))
    private static float green(float green) {
        return 0.49411765F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.51F))
    private static float blue(float blue) {
        return 0.39607844F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.43F))
    private static float redDark(float red) {
        return 0.30588236F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.77F))
    private static float greenDark(float green) {
        return 0.3254902F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.62F))
    private static float blueDark(float blue) {
        return 0.25882354F;
    }

}
