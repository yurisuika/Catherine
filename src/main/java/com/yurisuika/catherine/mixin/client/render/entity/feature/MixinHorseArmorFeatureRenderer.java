package com.yurisuika.catherine.mixin.client.render.entity.feature;

import net.minecraft.client.render.entity.feature.HorseArmorFeatureRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(HorseArmorFeatureRenderer.class)
public class MixinHorseArmorFeatureRenderer {

    @ModifyVariable(method = "render",
            at = @At(value = "STORE"),
            ordinal = 1)
    private int modifyColor(int original) {
        return original == 10511680 ? 6246727 : original;
    }

}
