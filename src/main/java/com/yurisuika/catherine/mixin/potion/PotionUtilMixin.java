package com.yurisuika.catherine.mixin.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.PotionUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Collection;

@Mixin(PotionUtil.class)
public class PotionUtilMixin {

    @Inject(method = "getColor(Ljava/util/Collection;)I", at = @At(value = "RETURN", ordinal = 0), cancellable = true)
    private static void injectEmptyColor(Collection<StatusEffectInstance> effects, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(7700354);
    }

    @ModifyVariable(method = "getColor(Ljava/util/Collection;)I", at = @At("STORE"), ordinal = 0)
    private static int injectWaterColor(int value) {
        return 7700354;
    }

}
