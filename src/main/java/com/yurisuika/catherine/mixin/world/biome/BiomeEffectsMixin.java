package com.yurisuika.catherine.mixin.world.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import org.spongepowered.asm.mixin.*;

import java.util.Optional;

@Mixin(BiomeEffects.class)
public class BiomeEffectsMixin {

    @Shadow @Final private int waterFogColor;

    @Shadow @Final private int waterColor;

    @Shadow @Final private int fogColor;

    @Shadow @Final private int skyColor;

    @Mutable
    @Shadow @Final private Optional<Integer> foliageColor;
    @Shadow @Final private Optional<Integer> grassColor;

    /**
     * @author
     * Catherine
     * @reason
     * Fog Color
     */
    @Overwrite()
    public int getFogColor() {
        //Overworld
        if (fogColor == 12638463) {return 13227488;}
        //Nether Wastes
        else if (fogColor == 3344392) {return 3344135;}
        //Soul Sand Valley
        else if (fogColor == 1787717) {return 3344135;}
        //Basalt Deltas
        else if (fogColor == 6840176) {return 3344135;}
        //Crimson Forest
        else if (fogColor == 3343107) {return 3344135;}
        //Warped Forest
        else if (fogColor == 1705242) {return 3344135;}
        //The End
        else if (fogColor == 10518688) {return 1250072;}
        else {return fogColor;}
    }

    /**
     * @author
     * Catherine
     * @reason
     * Grass Color
     */
    @Overwrite()
    public Optional<Integer> getGrassColor() {
        //Badlands
        int opt = grassColor.map(Integer::intValue).orElse(0);
        if (opt == 9470285) {opt = 11645821; foliageColor = Optional.ofNullable(opt);}
        return foliageColor;
    }

    /**
     * @author
     * Catherine
     * @reason
     * Water Color
     */
    @Overwrite()
    public int getWaterColor() {
        if (waterColor == 6388580) {return 15459523;}
        else {return 16777215;}
    }

    /**
     * @author
     * Catherine
     * @reason
     * Water Fog Color
     */
    @Overwrite()
    public int getWaterFogColor() {
        if (waterFogColor == 2302743) {return 10590841;}
        else {return 8359826;}
    }

    /**
     * @author
     * Catherine
     * @reason
     * Sky Color
     */
    @Overwrite()
    public int getSkyColor() {
        if (skyColor == 0) {return 1579032;}
        else {return 12177892;}
    }

    /**
     * @author
     * Catherine
     * @reason
     * Foliage Color
     */
    @SuppressWarnings("removal")
    @Overwrite()
    public Optional<Integer> getFoliageColor() {
        double x = 0;
        double z = 0;
        double d = Biome.FOLIAGE_NOISE.sample(x * 0.0225D, z * 0.0225D, false);
        int opt = foliageColor.map(Integer::intValue).orElse(0);
        //Swamp
        if (opt == 6975545) {opt = d < -0.1D ? 6250554 : 6842177; foliageColor = Optional.ofNullable(opt);}
        //Badlands
        else if (opt == 10387789) {opt = 8949348; foliageColor = Optional.ofNullable(opt);}
        return foliageColor;
    }
}
