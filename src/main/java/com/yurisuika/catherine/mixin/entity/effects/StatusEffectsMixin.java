package com.yurisuika.catherine.mixin.entity.effects;

import net.minecraft.entity.effect.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(StatusEffects.class)
public class StatusEffectsMixin {

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 8171462))
    private static int speed(int value) {
        return 8171462;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5926017))
    private static int slowness(int value) {
        return 5926017;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 14270531))
    private static int haste(int value) {
        return 14270531;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 4866583))
    private static int miningFatigue(int value) {
        return 4866583;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 9643043))
    private static int strength(int value) {
        return 9643043;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16262179, ordinal = 0))
    private static int instantHealth(int value) {
        return 16262179;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 4393481))
    private static int instantDamage(int value) {
        return 4393481;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 2293580))
    private static int jumpBoost(int value) {
        return 7889559;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5578058))
    private static int nausea(int value) {
        return 5578058;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 13458603))
    private static int regeneration(int value) {
        return 13458603;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 10044730))
    private static int resistance(int value) {
        return 10044730;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 14981690))
    private static int fireResistance(int value) {
        return 14981690;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 3035801))
    private static int waterBreathing(int value) {
        return 3035801;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 8356754))
    private static int invisibility(int value) {
        return 8356754;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 2039587))
    private static int blindness(int value) {
        return 2039587;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 2039713))
    private static int nightVision(int value) {
        return 2039713;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5797459))
    private static int hunger(int value) {
        return 5797459;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 4738376))
    private static int weakness(int value) {
        return 4738376;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 5149489))
    private static int poison(int value) {
        return 5149489;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 3484199))
    private static int wither(int value) {
        return 3484199;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16284963))
    private static int healthBoost(int value) {
        return 16284963;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 2445989))
    private static int absorption(int value) {
        return 2445989;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16262179, ordinal = 1))
    private static int saturation(int value) {
        return 16262179;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 9740385))
    private static int glowing(int value) {
        return 9740385;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 13565951))
    private static int levitation(int value) {
        return 13565951;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 3381504))
    private static int luck(int value) {
        return 7844950;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 12624973))
    private static int unluck(int value) {
        return 14792324;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 16773073))
    private static int slowFalling(int value) {
        return 13820415;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 1950417))
    private static int conduitPower(int value) {
        return 3247492;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 8954814))
    private static int dolphinsGrace(int value) {
        return 9364479;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 745784))
    private static int badOmen(int value) {
        return 209438;
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @ModifyConstant(method = "<clinit>", constant = @Constant(intValue = 4521796))
    private static int heroOfTheVillage(int value) {
        return 16765039;
    }

}
