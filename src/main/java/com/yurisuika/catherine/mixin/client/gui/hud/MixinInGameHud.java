package com.yurisuika.catherine.mixin.client.gui.hud;

import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(InGameHud.class)
public class MixinInGameHud {

    @ModifyConstant(method = "renderExperienceBar", constant = @Constant(intValue = 8453920))
    private int xpTextColor(int value) {
            return 5867913;
    }

}
