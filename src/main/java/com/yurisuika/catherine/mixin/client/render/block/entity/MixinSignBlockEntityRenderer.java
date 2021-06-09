package com.yurisuika.catherine.mixin.client.render.block.entity;

import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.client.render.block.entity.SignBlockEntityRenderer;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.util.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SignBlockEntityRenderer.class)
public class MixinSignBlockEntityRenderer {

//    /**
//     * @author
//     * Catherine
//     * @reason
//     * Dye
//     */
//    @Overwrite
//    private static int method_37311(SignBlockEntity signBlockEntity) {
//        int i = signBlockEntity.getTextColor().getSignColor();
//
//        if (i == 16777215) {i = 16777215;}
//        else if (i == 16738335) {i = 15905331;}
//        else if (i == 16711935) {i = 15040472;}
//        else if (i == 10141901) {i = 10072818;}
//        else if (i == 16776960) {i = 15066419;}
//        else if (i == 12582656) {i = 8375321;}
//        else if (i == 16738740) {i = 15905484;}
//        else if (i == 8421504) {i = 5000268;}
//        else if (i == 13882323) {i = 10066329;}
//        else if (i == 65535) {i = 5020082;}
//        else if (i == 10494192) {i = 11691749;}
//        else if (i == 255) {i = 3368652;}
//        else if (i == 9127187) {i = 8349260;}
//        else if (i == 65280) {i = 6717235;}
//        else if (i == 16711680) {i = 13388876;}
//        else if (i == 0) {i = 1644825;}
//
////        if (i == 16777215) {i = 14408667;}
////        else if (i == 16738335) {i = 12618586;}
////        else if (i == 16711935) {i = 11961017;}
////        else if (i == 10141901) {i = 8690366;}
////        else if (i == 16776960) {i = 11841102;}
////        else if (i == 12582656) {i = 7380845;}
////        else if (i == 16738740) {i = 12554655;}
////        else if (i == 8421504) {i = 6250335;}
////        else if (i == 13882323) {i = 9080719;}
////        else if (i == 65535) {i = 6133408;}
////        else if (i == 10494192) {i = 8741278;}
////        else if (i == 255) {i = 6779057;}
////        else if (i == 9127187) {i = 8283732;}
////        else if (i == 65280) {i = 6911825;}
////        else if (i == 16711680) {i = 11823717;}
////        else if (i == 0) {i = 4737096;}
//
////        if (i == 16777215) {i = 15790320;}
////        else if (i == 16738335) {i = 15435844;}
////        else if (i == 16711935) {i = 12801229;}
////        else if (i == 10141901) {i = 6719955;}
////        else if (i == 16776960) {i = 14602026;}
////        else if (i == 12582656) {i = 4312372;}
////        else if (i == 16738740) {i = 14188952;}
////        else if (i == 8421504) {i = 4408131;}
////        else if (i == 13882323) {i = 7304308;}
////        else if (i == 65535) {i = 2651799;}
////        else if (i == 10494192) {i = 8073150;}
////        else if (i == 255) {i = 2437522;}
////        else if (i == 9127187) {i = 5320730;}
////        else if (i == 65280) {i = 3887386;}
////        else if (i == 16711680) {i = 11743532;}
////        else if (i == 0) {i = 1973019;}
//
//        double d = 0.4D;
//        int j = (int)((double)NativeImage.getRed(i) * 0.4D);
//        int k = (int)((double)NativeImage.getGreen(i) * 0.4D);
//        int l = (int)((double)NativeImage.getBlue(i) * 0.4D);
//
//        return i == DyeColor.BLACK.getSignColor() && signBlockEntity.isGlowingText() ? -988212 : NativeImage.getAbgrColor(0, l, k, j);
//
//    }

}
