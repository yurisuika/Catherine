package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.PortalParticle;
import net.minecraft.client.particle.SpriteBillboardParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PortalParticle.class)
public abstract class MixinPortalParticle extends SpriteBillboardParticle {

    private MixinPortalParticle() {
        super(null, 0.0, 0.0, 0.0);
    }

    @Inject(method = "<init>", at = @At("RETURN"))
    private void onConstruct(CallbackInfo info) {
        int color = 7158135;
        int red = (color & 16711680) >> 16;
        int green = (color & '\uff00') >> 8;
        int blue = (color & 255) >> 0;
        this.colorRed = (red / 255.0F) * 0.9F;
        this.colorGreen = (green / 255.0F) * 0.3F;
        this.colorBlue = blue / 255.0F;
    }

}
