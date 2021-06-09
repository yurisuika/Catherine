package com.yurisuika.catherine.mixin.block;

import net.minecraft.block.MapColor;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(MapColor.class)
public class MixinMapColor {

    @Shadow
    @Final
    public static final MapColor CLEAR = new MapColor(0, 0);
    @Shadow
    @Final
    public static final MapColor PALE_GREEN = new MapColor(1, 6185277);
    @Shadow
    @Final
    public static final MapColor PALE_YELLOW = new MapColor(2, 10327430);
    @Shadow
    @Final
    public static final MapColor WHITE_GRAY = new MapColor(3, 12829635);
    @Shadow
    @Final
    public static final MapColor BRIGHT_RED = new MapColor(4, 10307389);
    @Shadow
    @Final
    public static final MapColor PALE_PURPLE = new MapColor(5, 12574173);
    @Shadow
    @Final
    public static final MapColor IRON_GRAY = new MapColor(6, 8487297);
    @Shadow
    @Final
    public static final MapColor DARK_GREEN = new MapColor(7, 4935473);
    @Shadow
    @Final
    public static final MapColor WHITE = new MapColor(8, 15662589);
    @Shadow
    @Final
    public static final MapColor LIGHT_BLUE_GRAY = new MapColor(9, 9272695);
    @Shadow
    @Final
    public static final MapColor DIRT_BROWN = new MapColor(10, 6312516);
    @Shadow
    @Final
    public static final MapColor STONE_GRAY = new MapColor(11, 8487289);
    @Shadow
    @Final
    public static final MapColor WATER_BLUE = new MapColor(12, 5727592);
    @Shadow
    @Final
    public static final MapColor OAK_TAN = new MapColor(13, 8285011);
    @Shadow
    @Final
    public static final MapColor OFF_WHITE = new MapColor(14, 13683910);
    @Shadow
    @Final
    public static final MapColor ORANGE = new MapColor(15, 12618586);
    @Shadow
    @Final
    public static final MapColor MAGENTA = new MapColor(16, 11961017);
    @Shadow
    @Final
    public static final MapColor LIGHT_BLUE = new MapColor(17, 8690366);
    @Shadow
    @Final
    public static final MapColor YELLOW = new MapColor(18, 11841102);
    @Shadow
    @Final
    public static final MapColor LIME = new MapColor(19, 7380845);
    @Shadow
    @Final
    public static final MapColor PINK = new MapColor(20, 12554655);
    @Shadow
    @Final
    public static final MapColor GRAY = new MapColor(21, 6250335);
    @Shadow
    @Final
    public static final MapColor LIGHT_GRAY = new MapColor(22, 9080719);
    @Shadow
    @Final
    public static final MapColor CYAN = new MapColor(23, 6133408);
    @Shadow
    @Final
    public static final MapColor PURPLE = new MapColor(24, 8741278);
    @Shadow
    @Final
    public static final MapColor BLUE = new MapColor(25, 6779057);
    @Shadow
    @Final
    public static final MapColor BROWN = new MapColor(26, 8283732);
    @Shadow
    @Final
    public static final MapColor GREEN = new MapColor(27, 6911825);
    @Shadow
    @Final
    public static final MapColor RED = new MapColor(28, 11823717);
    @Shadow
    @Final
    public static final MapColor BLACK = new MapColor(29, 4737096);
    @Shadow
    @Final
    public static final MapColor GOLD = new MapColor(30, 10784356);
    @Shadow
    @Final
    public static final MapColor DIAMOND_BLUE = new MapColor(31, 8690366);
    @Shadow
    @Final
    public static final MapColor LAPIS_BLUE = new MapColor(32, 4549782);
    @Shadow
    @Final
    public static final MapColor EMERALD_GREEN = new MapColor(33, 5802829);
    @Shadow
    @Final
    public static final MapColor SPRUCE_BROWN = new MapColor(34, 5524530);
    @Shadow
    @Final
    public static final MapColor DARK_RED = new MapColor(35, 6045749);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_WHITE = new MapColor(36, 12954526);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_ORANGE = new MapColor(37, 10379324);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_MAGENTA = new MapColor(38, 9790324);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_LIGHT_BLUE = new MapColor(39, 7828620);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_YELLOW = new MapColor(40, 11700283);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_LIME = new MapColor(41, 7371591);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_PINK = new MapColor(42, 10378076);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_GRAY = new MapColor(43, 4931643);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_LIGHT_GRAY = new MapColor(44, 9007723);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_CYAN = new MapColor(45, 6514279);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_PURPLE = new MapColor(46, 8148323);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_BLUE = new MapColor(47, 5852519);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_BROWN = new MapColor(48, 5981755);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_GREEN = new MapColor(49, 5922624);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_RED = new MapColor(50, 9391683);
    @Shadow
    @Final
    public static final MapColor TERRACOTTA_BLACK = new MapColor(51, 3944491);
    @Shadow
    @Final
    public static final MapColor DULL_RED = new MapColor(52, 6238772);
    @Shadow
    @Final
    public static final MapColor DULL_PINK = new MapColor(53, 4078394);
    @Shadow
    @Final
    public static final MapColor DARK_CRIMSON = new MapColor(54, 6380377);
    @Shadow
    @Final
    public static final MapColor TEAL = new MapColor(55, 4473150);
    @Shadow
    @Final
    public static final MapColor DARK_AQUA = new MapColor(56, 4144702);
    @Shadow
    @Final
    public static final MapColor DARK_DULL_PINK = new MapColor(57, 6644578);
    @Shadow
    @Final
    public static final MapColor BRIGHT_TEAL = new MapColor(58, 3815476);
    @Shadow
    @Final
    public static final MapColor DEEPSLATE_GRAY = new MapColor(59, 6250332);
    @Shadow
    @Final
    public static final MapColor RAW_IRON_PINK = new MapColor(60, 11767405);
    @Shadow
    @Final
    public static final MapColor LICHEN_GREEN = new MapColor(61, 6979157);

}
