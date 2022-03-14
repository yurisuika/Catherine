package com.yurisuika.catherine.mixin.client.render.entity.feature;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.feature.WolfCollarFeatureRenderer;
import net.minecraft.client.render.entity.model.WolfEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(WolfCollarFeatureRenderer.class)
public class WolfCollarFeatureRendererMixin extends FeatureRenderer<WolfEntity, WolfEntityModel<WolfEntity>> {
    private static final Identifier SKIN = new Identifier("textures/entity/wolf/wolf_collar.png");

    public WolfCollarFeatureRendererMixin(FeatureRendererContext<WolfEntity, WolfEntityModel<WolfEntity>> featureRendererContext) {
        super(featureRendererContext);
    }

    /**
     * @author
     * Catherine
     * @reason
     * Dye
     */
    @Overwrite
    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, WolfEntity wolfEntity, float f, float g, float h, float j, float k, float l) {
        if (wolfEntity.isTamed() && !wolfEntity.isInvisible()) {
            int dye = wolfEntity.getCollarColor().getId();
            float[] fs = wolfEntity.getCollarColor().getColorComponents();

            if (dye == 0) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 1.0F, 1.0F, 1.0F);}
            else if (dye == 1) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.9490196F, 0.69803923F, 0.2F);}
            else if (dye == 2) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.8980392F, 0.49803922F, 0.84705883F);}
            else if (dye == 3) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.6F, 0.69803923F, 0.9490196F);}
            else if (dye == 4) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.8980392F, 0.8980392F, 0.2F);}
            else if (dye == 5) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.49803922F, 0.8F, 0.09803922F);}
            else if (dye == 6) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.9490196F, 0.69803923F, 0.8F);}
            else if (dye == 7) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.29803923F, 0.29803923F, 0.29803923F);}
            else if (dye == 8) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.6F, 0.6F, 0.6F);}
            else if (dye == 9) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.29803923F, 0.6F, 0.69803923F);}
            else if (dye == 10) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.69803923F, 0.4F, 0.8980392F);}
            else if (dye == 11) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.2F, 0.4F, 0.8F);}
            else if (dye == 12) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.49803922F, 0.4F, 0.29803923F);}
            else if (dye == 13) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.4F, 0.49803922F, 0.2F);}
            else if (dye == 14) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.8F, 0.29803923F, 0.29803923F);}
            else if (dye == 15) {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, 0.09803922F, 0.09803922F, 0.09803922F);}

            else {renderModel(this.getContextModel(), SKIN, matrixStack, vertexConsumerProvider, i, wolfEntity, fs[0], fs[1], fs[2]);}
        }
    }

}
