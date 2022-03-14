package com.yurisuika.catherine.mixin.client.gui.screen;

import net.minecraft.client.gui.screen.SplashOverlay;
import net.minecraft.util.math.ColorHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(SplashOverlay.class)
public class SplashOverlayMixin {

    @Shadow
    @Final
    private static final int MOJANG_RED = ColorHelper.Argb.getArgb(255, 19, 19, 19);

    @ModifyArgs(method = "render", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderColor(FFFF)V"))
    private void modifyColor(Args args) {
        args.set(0, 0.125490196078F);
        args.set(1, 0.125490196078F);
        args.set(2, 0.125490196078F);
    }

}
