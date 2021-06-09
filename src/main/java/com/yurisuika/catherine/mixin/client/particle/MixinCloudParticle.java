package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.CloudParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(CloudParticle.SneezeFactory.class)
public class MixinCloudParticle {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 200.0F))
    private static float red(float red) {
        return 100.0F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 50.0F))
    private static float green(float green) {
        return 81.0F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 120.0F))
    private static float blue(float blue) {
        return 115.0F;
    }

}
