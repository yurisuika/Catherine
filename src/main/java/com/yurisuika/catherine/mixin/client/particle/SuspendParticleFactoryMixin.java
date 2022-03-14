package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.SuspendParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(SuspendParticle.Factory.class)
public class SuspendParticleFactoryMixin {

    @ModifyArgs(method = "createParticle(Lnet/minecraft/particle/DefaultParticleType;Lnet/minecraft/client/world/ClientWorld;DDDDDD)Lnet/minecraft/client/particle/Particle;", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/particle/SuspendParticle;setColor(FFF)V"))
    private void injectSetColor(Args args) {
        args.set(0, (1.0F));
        args.set(1, (1.0F));
        args.set(2, (1.0F));
    }

}
