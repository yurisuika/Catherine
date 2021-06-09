package com.yurisuika.catherine.mixin.entity.passive;

import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.util.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SheepEntity.class)
public class MixinSheepEntity {

    /**
     * @author
     * Catherine
     * @reason
     * Dye
     */
    @Overwrite
    private static float[] getDyedColor(DyeColor color) {
        if (color == DyeColor.WHITE) {
            return new float[]{0.85882354F, 0.85882354F, 0.85882354F};
        } else if (color == DyeColor.ORANGE) {
            return new float[]{0.7529412F, 0.54509807F, 0.3529412F};
        } else if (color == DyeColor.MAGENTA) {
            return new float[]{0.7137255F, 0.50980395F, 0.7254902F};
        } else if (color == DyeColor.LIGHT_BLUE) {
            return new float[]{0.5176471F, 0.6039216F, 0.74509805F};
        } else if (color == DyeColor.YELLOW) {
            return new float[]{0.7058824F, 0.68235296F, 0.30588236F};
        } else if (color == DyeColor.LIME) {
            return new float[]{0.4392157F, 0.62352943F, 0.42745098F};
        } else if (color == DyeColor.PINK) {
            return new float[]{0.7490196F, 0.5686275F, 0.62352943F};
        } else if (color == DyeColor.GRAY) {
            return new float[]{0.37254903F, 0.37254903F, 0.37254903F};
        } else if (color == DyeColor.LIGHT_GRAY) {
            return new float[]{0.5411765F, 0.56078434F, 0.56078434F};
        } else if (color == DyeColor.CYAN) {
            return new float[]{0.3647059F, 0.5882353F, 0.627451F};
        } else if (color == DyeColor.PURPLE) {
            return new float[]{0.52156866F, 0.38039216F, 0.61960787F};
        } else if (color == DyeColor.BLUE) {
            return new float[]{0.40392157F, 0.4392157F, 0.69411767F};
        } else if (color == DyeColor.BROWN) {
            return new float[]{0.49411765F, 0.4F, 0.32941177F};
        } else if (color == DyeColor.GREEN) {
            return new float[]{0.4117647F, 0.46666667F, 0.31764707F};
        } else if (color == DyeColor.RED) {
            return new float[]{0.7058824F, 0.41568628F, 0.39607844F};
        } else if (color == DyeColor.BLACK) {
            return new float[]{0.28235295F, 0.28235295F, 0.28235295F};
        } else {
            float[] fs = color.getColorComponents();
            float f = 0.75F;
            return new float[]{fs[0] * 0.75F, fs[1] * 0.75F, fs[2] * 0.75F};
        }
    }

}
