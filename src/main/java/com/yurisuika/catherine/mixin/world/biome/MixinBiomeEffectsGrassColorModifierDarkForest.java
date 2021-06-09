package com.yurisuika.catherine.mixin.world.biome;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "net.minecraft.world.biome.BiomeEffects$GrassColorModifier$2")
public class MixinBiomeEffectsGrassColorModifierDarkForest {

    @SuppressWarnings("UnresolvedMixinReference")
    @Inject(method = "getModifiedGrassColor(DDI)I", at = @At(value = "RETURN"), cancellable = true)
    private void injected(double x, double z, int color, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue((color & 16711422) + 0 >> 1);
    }

}
