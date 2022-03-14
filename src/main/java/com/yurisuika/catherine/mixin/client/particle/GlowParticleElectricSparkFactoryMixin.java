package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.GlowParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(GlowParticle.ElectricSparkFactory.class)
public class GlowParticleElectricSparkFactoryMixin {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 1.0F, ordinal = 0))
    private static float red(float red) {
        return 0.92156863F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.9F))
    private static float green(float green) {
        return 0.85882354F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 1.0F, ordinal = 1))
    private static float blue(float blue) {
        return 0.85882354F;
    }

}
