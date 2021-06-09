package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.SquidInkParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(SquidInkParticle.GlowSquidInkFactory.class)
public class MixinSquidInkParticleGlowSquidInkFactory {

    @ModifyConstant(method = "createParticle", constant = @Constant(intValue = 204))
    private static int red(int red) {
        return 156;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(intValue = 31))
    private static int green(int green) {
        return 94;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(intValue = 102))
    private static int blue(int blue) {
        return 107;
    }

}
