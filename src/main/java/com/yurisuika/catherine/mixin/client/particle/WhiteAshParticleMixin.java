package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.WhiteAshParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WhiteAshParticle.class)
public class WhiteAshParticleMixin {

    @ModifyConstant(method = "<init>", constant = @Constant(floatValue = 0.7294118F))
    private static float red(float colorRed) {
        return 0.7294118F;
    }

    @ModifyConstant(method = "<init>", constant = @Constant(floatValue = 0.69411767F))
    private static float green(float colorGreen) {
        return 0.69411767F;
    }

    @ModifyConstant(method = "<init>", constant = @Constant(floatValue = 0.7607843F))
    private static float blue(float colorBlue) {
        return 0.7607843F;
    }

}
