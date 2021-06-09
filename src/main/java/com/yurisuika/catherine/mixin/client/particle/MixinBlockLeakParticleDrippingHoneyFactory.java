package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.BlockLeakParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BlockLeakParticle.DrippingHoneyFactory.class)
public class MixinBlockLeakParticleDrippingHoneyFactory {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.622F))
    private static float red(float red) {
        return 0.627451F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.508F))
    private static float green(float green) {
        return 0.49411765F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.082F))
    private static float blue(float blue) {
        return 0.24313726F;
    }

}
