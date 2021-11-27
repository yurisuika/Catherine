package com.yurisuika.catherine.mixin.client.toast;

import net.minecraft.client.toast.RecipeToast;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(RecipeToast.class)
public class MixinRecipeToast {

    @ModifyConstant(method = "draw", constant = @Constant(intValue = 3, ordinal = 0))
    private static int first(int value) {
        return 999;
    }

    @ModifyConstant(method = "draw", constant = @Constant(intValue = 3, ordinal = 1))
    private static int second(int value) {
        return 999;
    }

}