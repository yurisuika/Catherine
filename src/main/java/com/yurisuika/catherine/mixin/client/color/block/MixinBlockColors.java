package com.yurisuika.catherine.mixin.client.color.block;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.*;
import net.minecraft.client.color.block.BlockColors;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockColors.class)
public class MixinBlockColors {

    /**
     * @author
     * Catherine
     * @reason
     * Block Colors
     */
    @Inject(method = "create", at = @At("RETURN"))
    private static void injected(CallbackInfoReturnable<BlockColors> cir) {
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xa1986f, Blocks.ATTACHED_MELON_STEM);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xa1986f, Blocks.ATTACHED_PUMPKIN_STEM);

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
            int i = (Integer)state.get(StemBlock.AGE);

            int j = 111;
            int k = 114;
            int l = 81;

            if (i == 0) {j = 111; k = 114; l = 81; return j << 16 | k << 8 | l;}
            else if (i == 1) {j = 116; k = 117; l = 83; return j << 16 | k << 8 | l;}
            else if (i == 2) {j = 122; k = 122; l = 87; return j << 16 | k << 8 | l;}
            else if (i == 3) {j = 130; k = 129; l = 91; return j << 16 | k << 8 | l;}
            else if (i == 4) {j = 139; k = 135; l = 96; return j << 16 | k << 8 | l;}
            else if (i == 5) {j = 147; k = 142; l = 101; return j << 16 | k << 8 | l;}
            else if (i == 6) {j = 155; k = 147; l = 105; return j << 16 | k << 8 | l;}
            else if (i == 7) {j = 161; k = 152; l = 111; return j << 16 | k << 8 | l;}

            return j << 16 | k << 8 | l;
        }, Blocks.MELON_STEM, Blocks.PUMPKIN_STEM);

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x676d4a, Blocks.LILY_PAD);
    }

}
