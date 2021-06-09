package com.yurisuika.catherine.mixin.client.color.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.potion.PotionUtil;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Iterator;

@Mixin(ItemColors.class)
public class MixinItemColors {

//    @ModifyArg(method = "create", at = @At(value = "RETURN", ordinal = 0))
//    private static void injected(ItemStack stack, int tintIndex,CallbackInfoReturnable<Integer> cir) {
//        cir.setReturnValue(tintIndex > 0 ? -1 : ((DyeableItem)stack.getItem()).getColor(stack) == 10511680 ? 6246727 : ((DyeableItem)stack.getItem()).getColor(stack));
//    }

    /**
     * @author
     * Catherine
     * @reason
     * Dye
     */
    @Overwrite
    public static ItemColors create(BlockColors blockColors) {
        ItemColors itemColors = new ItemColors();
        itemColors.register((stack, tintIndex) -> {
            return tintIndex > 0 ? -1 : ((DyeableItem)stack.getItem()).getColor(stack) == 10511680 ? 6246727 : ((DyeableItem)stack.getItem()).getColor(stack);
        }, Items.LEATHER_HELMET, Items.LEATHER_CHESTPLATE, Items.LEATHER_LEGGINGS, Items.LEATHER_BOOTS, Items.LEATHER_HORSE_ARMOR);
        itemColors.register((stack, tintIndex) -> {
            return GrassColors.getColor(0.5D, 1.0D);
        }, Blocks.TALL_GRASS, Blocks.LARGE_FERN);
        itemColors.register((stack, tintIndex) -> {
            if (tintIndex != 1) {
                return -1;
            } else {
                NbtCompound nbtCompound = stack.getSubTag("Explosion");
                int[] is = nbtCompound != null && nbtCompound.contains("Colors", 11) ? nbtCompound.getIntArray("Colors") : null;
                if (is != null && is.length != 0) {
                    if (is.length == 1) {
                        return is[0];
                    } else {
                        int i = 0;
                        int j = 0;
                        int k = 0;
                        int[] var7 = is;
                        int var8 = is.length;

                        for(int var9 = 0; var9 < var8; ++var9) {
                            int l = var7[var9];
                            i += (l & 16711680) >> 16;
                            j += (l & '\uff00') >> 8;
                            k += (l & 255) >> 0;
                        }

                        i /= is.length;
                        j /= is.length;
                        k /= is.length;
                        return i << 16 | j << 8 | k;
                    }
                } else {
                    return 9079434;
                }
            }
        }, Items.FIREWORK_STAR);
        itemColors.register((stack, tintIndex) -> {
            return tintIndex > 0 ? -1 : PotionUtil.getColor(stack);
        }, Items.POTION, Items.SPLASH_POTION, Items.LINGERING_POTION);
        Iterator var2 = SpawnEggItem.getAll().iterator();

        while(var2.hasNext()) {
            SpawnEggItem spawnEggItem = (SpawnEggItem)var2.next();
            itemColors.register((stack, tintIndex) -> {
                return spawnEggItem.getColor(tintIndex);
            }, spawnEggItem);
        }

        itemColors.register((stack, tintIndex) -> {
            BlockState blockState = ((BlockItem)stack.getItem()).getBlock().getDefaultState();
            return blockColors.getColor(blockState, (BlockRenderView)null, (BlockPos)null, tintIndex);
        }, Blocks.GRASS_BLOCK, Blocks.GRASS, Blocks.FERN, Blocks.VINE, Blocks.OAK_LEAVES, Blocks.SPRUCE_LEAVES, Blocks.BIRCH_LEAVES, Blocks.JUNGLE_LEAVES, Blocks.ACACIA_LEAVES, Blocks.DARK_OAK_LEAVES, Blocks.LILY_PAD);
        itemColors.register((stack, tintIndex) -> {
            return tintIndex == 0 ? PotionUtil.getColor(stack) : -1;
        }, Items.TIPPED_ARROW);
        itemColors.register((stack, tintIndex) -> {
            return tintIndex == 0 ? -1 : FilledMapItem.getMapColor(stack);
        }, Items.FILLED_MAP);
        return itemColors;
    }

}
