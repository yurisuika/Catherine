package com.yurisuika.catherine.mixin.potion;

import net.minecraft.potion.PotionUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(PotionUtil.class)
public class MixinPotionUtil {

    @ModifyConstant(method = "getColor(Ljava/util/Collection;)I", constant = @Constant(intValue = 3694022, ordinal = 0))
    private static final int waterColor(int value) {
        return 7700354;
    }

    @ModifyConstant(method = "getColor(Ljava/util/Collection;)I", constant = @Constant(intValue = 3694022, ordinal = 1))
    private static final int emptyColor(int value) {
        return 7700354;
    }

}
