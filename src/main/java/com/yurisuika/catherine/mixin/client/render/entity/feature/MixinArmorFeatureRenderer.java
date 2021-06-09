package com.yurisuika.catherine.mixin.client.render.entity.feature;

import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ArmorFeatureRenderer.class)
public class MixinArmorFeatureRenderer{

    @ModifyVariable(method = "renderArmor",
            at = @At(value = "STORE"),
            ordinal = 1)
    private int modifyColor(int original) {
        return original == 10511680 ? 6246727 : original;
    }

}
