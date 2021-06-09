package com.yurisuika.catherine.mixin.world;

import net.minecraft.client.color.world.FoliageColors;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(FoliageColors.class)
public class MixinFoliageColors {

    /**
     * @author
     * Catherine
     * @reason
     * Spruce Color
     */
    @Overwrite()
    public static int getSpruceColor() {
        return 6977367;
    }

    /**
     * @author
     * Catherine
     * @reason
     * Birch Color
     */
    @Overwrite()
    public static int getBirchColor() {
        return 9082990;
    }

    /**
     * @author
     * Catherine
     * @reason
     * Default Color
     */
    @Overwrite()
    public static int getDefaultColor() { return 7700309; }

}
