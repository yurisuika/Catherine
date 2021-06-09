package com.yurisuika.catherine.mixin.client.render;

import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(WorldRenderer.class)
public class MixinWorldRenderer {

    @ModifyConstant(
            method = "renderSky",
            constant = @Constant(doubleValue = 0, ordinal = 0),
            slice = @Slice(
                    from = @At(
                            value = "INVOKE",
                            target = "Lnet/minecraft/client/world/ClientWorld$Properties;getSkyDarknessHeight(Lnet/minecraft/world/HeightLimitView;)D"
                    )
            )
    )
    private double getSkyDarknessHeight(double zero) {
            return Double.NEGATIVE_INFINITY;
    }

}
