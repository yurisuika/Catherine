package com.yurisuika.catherine.mixin.util;

import net.minecraft.util.DyeColor;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(DyeColor.class)
public class DyeColorMixin {

    // FIREWORKS

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=WHITE")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int whiteFirework (int fireworkColor) {
        return 14408667;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=ORANGE")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int orangeFirework (int fireworkColor) {
        return 12618586;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=MAGENTA")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int magentaFirework (int fireworkColor) {
        return 11961017;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=LIGHT_BLUE")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int lightBlueFirework (int fireworkColor) {
        return 8690366;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=YELLOW")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int yellowFirework (int fireworkColor) {
        return 11841102;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=LIME")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int limeFirework (int fireworkColor) {
        return 7380845;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=PINK")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int pinkFirework (int fireworkColor) {
        return 12554655;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=GRAY")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int grayFirework (int fireworkColor) {
        return 6250335;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=LIGHT_GRAY")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int lightGrayFirework (int fireworkColor) {
        return 9080719;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=CYAN")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int cyanFirework (int fireworkColor) {
        return 6133408;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=PURPLE")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int purpleFirework (int fireworkColor) {
        return 8741278;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=BLUE")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int blueFirework (int fireworkColor) {
        return 6779057;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=BROWN")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int brownFirework (int fireworkColor) {
        return 8283732;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=GREEN")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int greenFirework (int fireworkColor) {
        return 6911825;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=RED")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int redFirework (int fireworkColor) {
        return 11823717;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyArg(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=BLACK")), at = @At(value = "INVOKE", target = "Lnet/minecraft/util/DyeColor;<init> (Ljava/lang/String;IILjava/lang/String;ILnet/minecraft/class_3620;II)V", ordinal = 0), index = 6)
    private static int blackFirework (int fireworkColor) {
        return 4737096;
    }

    // SHEEP + BANNERS + DYES

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=WHITE")), constant = @Constant(intValue = 16383998))
    private static int white (int color) {
        return 15790320;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=ORANGE")), constant = @Constant(intValue = 16351261))
    private static int orange (int color) {
        return 15435844;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=MAGENTA")), constant = @Constant(intValue = 13061821))
    private static int magenta (int color) {
        return 12801229;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=LIGHT_BLUE")), constant = @Constant(intValue = 3847130))
    private static int lightBlue (int color) {
        return 6719955;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=YELLOW")), constant = @Constant(intValue = 16701501))
    private static int yellow (int color) {
        return 14602026;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=LIME")), constant = @Constant(intValue = 8439583))
    private static int lime (int color) {
        return 4312372;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=PINK")), constant = @Constant(intValue = 15961002))
    private static int pink (int color) {
        return 14188952;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=GRAY")), constant = @Constant(intValue = 4673362))
    private static int gray (int color) {
        return 4408131;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=LIGHT_GRAY")), constant = @Constant(intValue = 10329495))
    private static int lightGray (int color) {
        return 7304308;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=CYAN")), constant = @Constant(intValue = 1481884))
    private static int cyan (int color) {
        return 2651799;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=PURPLE")), constant = @Constant(intValue = 8991416))
    private static int purple (int color) {
        return 8073150;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=BLUE")), constant = @Constant(intValue = 3949738))
    private static int blue (int color) {
        return 2437522;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=BROWN")), constant = @Constant(intValue = 8606770))
    private static int brown (int color) {
        return 5320730;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=GREEN")), constant = @Constant(intValue = 6192150))
    private static int green (int color) {
        return 3887386;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=RED")), constant = @Constant(intValue = 11546150))
    private static int red (int color) {
        return 11743532;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=BLACK")), constant = @Constant(intValue = 1908001))
    private static int black (int color) {
        return 1973019;
    }

    // SIGNS

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=WHITE")), constant = @Constant(intValue = 16777215))
    private static int whiteSign (int signColor) {
        return 16777215;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=ORANGE")), constant = @Constant(intValue = 16738335))
    private static int orangeSign (int signColor) {
        return 15905331;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=MAGENTA")), constant = @Constant(intValue = 16711935))
    private static int magentaSign (int signColor) {
        return 15040472;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=LIGHT_BLUE")), constant = @Constant(intValue = 10141901))
    private static int lightBlueSign (int signColor) {
        return 10072818;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=YELLOW")), constant = @Constant(intValue = 16776960))
    private static int yellowSign (int signColor) {
        return 15066419;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=LIME")), constant = @Constant(intValue = 12582656))
    private static int limeSign (int signColor) {
        return 8375321;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=PINK")), constant = @Constant(intValue = 16738740))
    private static int pinkSign (int signColor) {
        return 15905484;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=GRAY")), constant = @Constant(intValue = 8421504))
    private static int graySign (int signColor) {
        return 5000268;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=LIGHT_GRAY")), constant = @Constant(intValue = 13882323))
    private static int lightGraySign (int signColor) {
        return 10066329;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=CYAN")), constant = @Constant(intValue = 65535))
    private static int cyanSign (int signColor) {
        return 5020082;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=PURPLE")), constant = @Constant(intValue = 10494192))
    private static int purpleSign (int signColor) {
        return 11691749;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=BLUE")), constant = @Constant(intValue = 255))
    private static int blueSign (int signColor) {
        return 3368652;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=BROWN")), constant = @Constant(intValue = 9127187))
    private static int brownSign (int signColor) {
        return 8349260;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=GREEN")), constant = @Constant(intValue = 65280))
    private static int greenSign (int signColor) {
        return 6717235;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=RED")), constant = @Constant(intValue = 16711680))
    private static int redSign (int signColor) {
        return 13388876;
    }
    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=BLACK")), constant = @Constant(intValue = 0))
    private static int blackSign (int signColor) {
        return 1644825;
    }

}
