package com.yurisuika.catherine.mixin.client.render.block.entity;

import com.mojang.datafixers.util.Pair;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BannerBlockEntityRenderer;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.List;

@Mixin(BannerBlockEntityRenderer.class)
public class BannerBlockEntityRendererMixin {

    /**
     * @author
     * Catherine
     * @reason
     * Dye
     */
    @Overwrite
    public static void renderCanvas(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, ModelPart canvas, SpriteIdentifier baseSprite, boolean isBanner, List<Pair<BannerPattern, DyeColor>> patterns, boolean glint) {
        canvas.render(matrices, baseSprite.getVertexConsumer(vertexConsumers, RenderLayer::getEntitySolid, glint), light, overlay);

        for(int i = 0; i < 17 && i < patterns.size(); ++i) {
            Pair<BannerPattern, DyeColor> pair = (Pair)patterns.get(i);
            float[] fs = ((DyeColor)pair.getSecond()).getColorComponents();
            int wool = ((DyeColor)pair.getSecond()).getId();
            BannerPattern bannerPattern = (BannerPattern)pair.getFirst();
            SpriteIdentifier spriteIdentifier = isBanner ? TexturedRenderLayers.getBannerPatternTextureId(bannerPattern) : TexturedRenderLayers.getShieldPatternTextureId(bannerPattern);

            if (wool == 0) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.85882354F, 0.85882354F, 0.85882354F, 1.0F);}
            else if (wool == 1) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.7529412F, 0.54509807F, 0.3529412F, 1.0F);}
            else if (wool == 2) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.7137255F, 0.50980395F, 0.7254902F, 1.0F);}
            else if (wool == 3) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.5176471F, 0.6039216F, 0.74509805F, 1.0F);}
            else if (wool == 4) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.7058824F, 0.68235296F, 0.30588236F, 1.0F);}
            else if (wool == 5) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.4392157F, 0.62352943F, 0.42745098F, 1.0F);}
            else if (wool == 6) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.7490196F, 0.5686275F, 0.62352943F, 1.0F);}
            else if (wool == 7) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.37254903F, 0.37254903F, 0.37254903F, 1.0F);}
            else if (wool == 8) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.5411765F, 0.56078434F, 0.56078434F, 1.0F);}
            else if (wool == 9) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.3647059F, 0.5882353F, 0.627451F, 1.0F);}
            else if (wool == 10) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.52156866F, 0.38039216F, 0.61960787F, 1.0F);}
            else if (wool == 11) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.40392157F, 0.4392157F, 0.69411767F, 1.0F);}
            else if (wool == 12) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.49411765F, 0.4F, 0.32941177F, 1.0F);}
            else if (wool == 13) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.4117647F, 0.46666667F, 0.31764707F, 1.0F);}
            else if (wool == 14) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.7058824F, 0.41568628F, 0.39607844F, 1.0F);}
            else if (wool == 15) {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, 0.28235295F, 0.28235295F, 0.28235295F, 1.0F);}

            else {canvas.render(matrices, spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityNoOutline), light, overlay, fs[0], fs[1], fs[2], 1.0F);}
        }

    }

}
