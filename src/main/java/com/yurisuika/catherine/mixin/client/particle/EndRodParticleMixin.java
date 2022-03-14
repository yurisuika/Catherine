package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.EndRodParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(EndRodParticle.class)
public class EndRodParticleMixin {

    @ModifyConstant(method = "<init>", constant = @Constant(intValue = 15916745))
    private static int color(int color) {
        return 14915624;
    }

}
