package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.SnowflakeParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(SnowflakeParticle.Factory.class)
public class MixinSnowflakeParticle {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.923F))
    private static float red(float red) {
        return 0.9137255F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.964F))
    private static float green(float green) {
        return 0.99215686F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.999F))
    private static float blue(float blue) {
        return 0.99215686F;
    }

}
