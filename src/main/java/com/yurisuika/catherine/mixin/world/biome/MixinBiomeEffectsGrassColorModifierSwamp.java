package com.yurisuika.catherine.mixin.world.biome;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(targets = "net.minecraft.world.biome.BiomeEffects$GrassColorModifier$3")
public class MixinBiomeEffectsGrassColorModifierSwamp {

    @SuppressWarnings("UnresolvedMixinReference")
    @Inject(method = "getModifiedGrassColor(DDI)I", at = @At(value = "RETURN"), locals = LocalCapture.CAPTURE_FAILSOFT, cancellable = true)
    private void injected(double x, double z, int color, CallbackInfoReturnable<Integer> cir, double d) {
        cir.setReturnValue(d < -0.1D ? 	7697230 : 8289110);
    }

}
