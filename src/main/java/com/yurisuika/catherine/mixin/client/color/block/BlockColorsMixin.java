package com.yurisuika.catherine.mixin.client.color.block;

import net.minecraft.block.*;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockColors.class)
public class BlockColorsMixin {

    private static int color;

    @Inject(method = "method_1695", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/color/world/FoliageColors;getSpruceColor()I"), cancellable = true)
    private static void injectSpruceColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(6977367);
    }

    @Inject(method = "method_1687", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/color/world/FoliageColors;getBirchColor()I"), cancellable = true)
    private static void injectBirchColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(9082990);
    }

    @Inject(method = "method_1692", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/color/world/FoliageColors;getDefaultColor()I"), cancellable = true)
    private static void injectFoliageColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(7700309);
    }

    @Inject(method = "method_1698", at = @At(value = "RETURN"), cancellable = true)
    private static void injectAttachedStemColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(10590319);
    }

    @Inject(method = "method_1696", at = @At(value = "RETURN"), cancellable = true)
    private static void injectStemColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex, CallbackInfoReturnable<Integer> cir) {
        int age = state.get(StemBlock.AGE);

        switch (age) {
            case 0 -> color = 7303761;
            case 1 -> color = 7632211;
            case 2 -> color = 8026711;
            case 3 -> color = 8552795;
            case 4 -> color = 9144160;
            case 5 -> color = 9670245;
            case 6 -> color = 10195817;
            case 7 -> color = 10590319;
        }

        cir.setReturnValue(color);
    }

    @Inject(method = "method_1684", at = @At(value = "RETURN"), cancellable = true)
    private static void injectLilyPadColor(BlockState state, @Nullable BlockRenderView world, @Nullable BlockPos pos, int tintIndex, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(world != null && pos != null ? 6778186 : 6778186);
    }

}
