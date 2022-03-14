package com.yurisuika.catherine.mixin.client.color.item;

import net.minecraft.client.color.item.ItemColors;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemColors.class)
public class ItemColorsMixin {

    @Inject(method = "method_1700", at = @At(value = "RETURN", ordinal = 0), cancellable = true)
    private static void injectFireworkStarColor(ItemStack stack, int tintIndex, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(9079434);
    }

}
