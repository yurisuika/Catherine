package com.yurisuika.catherine.mixin.client.render;

import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin {

    @ModifyArg(method = "renderLightSky", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/WorldRenderer;renderSky(Lnet/minecraft/client/render/BufferBuilder;F)V"), index = 1)
    private float modifyLight(float f) {
        return (float)Double.NEGATIVE_INFINITY;
    }

    @ModifyArg(method = "renderDarkSky", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/WorldRenderer;renderSky(Lnet/minecraft/client/render/BufferBuilder;F)V"), index = 1)
    private float modifyDark(float f) {
        return (float)Double.NEGATIVE_INFINITY;
    }

}
