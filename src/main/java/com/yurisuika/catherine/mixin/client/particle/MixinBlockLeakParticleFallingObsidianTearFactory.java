package com.yurisuika.catherine.mixin.client.particle;

import net.minecraft.client.particle.BlockLeakParticle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BlockLeakParticle.FallingObsidianTearFactory.class)
public class MixinBlockLeakParticleFallingObsidianTearFactory {

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.51171875F))
    private static float red(float red) {
        return 0.2F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.03125F))
    private static float green(float green) {
        return 0.14117648F;
    }

    @ModifyConstant(method = "createParticle", constant = @Constant(floatValue = 0.890625F))
    private static float blue(float blue) {
        return 0.27450982F;
    }

}
