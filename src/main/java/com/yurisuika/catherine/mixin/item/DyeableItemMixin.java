package com.yurisuika.catherine.mixin.item;

import net.minecraft.item.DyeableItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DyeableItem.class)
public interface DyeableItemMixin {

    @Final
    @Shadow
    int DEFAULT_COLOR = 6246727;

    @Inject(method = "getColor", at = @At("RETURN"), cancellable = true)
    private void injectGetColor(ItemStack stack, CallbackInfoReturnable<Integer> cir) {
        NbtCompound nbtCompound = stack.getSubNbt("display");
        cir.setReturnValue(nbtCompound != null && nbtCompound.contains("color", 99) ? nbtCompound.getInt("color") : 6246727);
    }

}
