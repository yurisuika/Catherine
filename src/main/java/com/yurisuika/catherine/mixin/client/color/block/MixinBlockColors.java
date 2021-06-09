package com.yurisuika.catherine.mixin.client.color.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.state.property.Property;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Set;

@Mixin(BlockColors.class)
public class MixinBlockColors {

    /**
     * @author
     * Catherine
     * @reason
     * Block Colors
     */
    @Overwrite
    public static BlockColors create() {
        BlockColors blockColors = new BlockColors();
        blockColors.registerColorProvider((state, world, pos, tintIndex) -> {
            return world != null && pos != null ? BiomeColors.getGrassColor(world, state.get(TallPlantBlock.HALF) == DoubleBlockHalf.UPPER ? pos.down() : pos) : -1;
        }, Blocks.LARGE_FERN, Blocks.TALL_GRASS);
        blockColors.registerColorProperty(TallPlantBlock.HALF, Blocks.LARGE_FERN, Blocks.TALL_GRASS);
        blockColors.registerColorProvider((state, world, pos, tintIndex) -> {
            return world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getColor(0.5D, 1.0D);
        }, Blocks.GRASS_BLOCK, Blocks.FERN, Blocks.GRASS, Blocks.POTTED_FERN);
        blockColors.registerColorProvider((state, world, pos, tintIndex) -> {
            return FoliageColors.getSpruceColor();
        }, Blocks.SPRUCE_LEAVES);
        blockColors.registerColorProvider((state, world, pos, tintIndex) -> {
            return FoliageColors.getBirchColor();
        }, Blocks.BIRCH_LEAVES);
        blockColors.registerColorProvider((state, world, pos, tintIndex) -> {
            return world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor();
        }, Blocks.OAK_LEAVES, Blocks.JUNGLE_LEAVES, Blocks.ACACIA_LEAVES, Blocks.DARK_OAK_LEAVES, Blocks.VINE);
        blockColors.registerColorProvider((state, world, pos, tintIndex) -> {
            return world != null && pos != null ? BiomeColors.getWaterColor(world, pos) : -1;
        }, Blocks.WATER, Blocks.BUBBLE_COLUMN, Blocks.WATER_CAULDRON);
        blockColors.registerColorProvider((state, world, pos, tintIndex) -> {
            return RedstoneWireBlock.getWireColor((Integer)state.get(RedstoneWireBlock.POWER));
        }, Blocks.REDSTONE_WIRE);
        blockColors.registerColorProperty(RedstoneWireBlock.POWER, Blocks.REDSTONE_WIRE);
        blockColors.registerColorProvider((state, world, pos, tintIndex) -> {
            return world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : -1;
        }, Blocks.SUGAR_CANE);
        blockColors.registerColorProvider((state, world, pos, tintIndex) -> {
            return 10590319;
        }, Blocks.ATTACHED_MELON_STEM, Blocks.ATTACHED_PUMPKIN_STEM);
        blockColors.registerColorProvider((state, world, pos, tintIndex) -> {
            int i = (Integer)state.get(StemBlock.AGE);

            int j = 111;
            int k = 114;
            int l = 81;

//            int j = 112 + 7 * i;
//            int k = 110 + 6 * i;
//            int l = 76 + 5 * i;

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
        blockColors.registerColorProperty(StemBlock.AGE, Blocks.MELON_STEM, Blocks.PUMPKIN_STEM);
        blockColors.registerColorProvider((state, world, pos, tintIndex) -> {
            return world != null && pos != null ? 6778186 : 6778186;
        }, Blocks.LILY_PAD);
        return blockColors;
    }

}
