package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.SquidInkParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(SquidInkParticle.Factory.class)
public class SquidInkParticleFactoryMixin {

    @ModifyArgs(method = "createParticle(Lnet/minecraft/particle/DefaultParticleType;Lnet/minecraft/client/world/ClientWorld;DDDDDD)Lnet/minecraft/client/particle/Particle;", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/ColorHelper$Argb;getArgb(IIII)I"))
    private void injectSetColor(Args args) {
        args.set(1, (255));
        args.set(2, (255));
        args.set(3, (255));
    }


}
