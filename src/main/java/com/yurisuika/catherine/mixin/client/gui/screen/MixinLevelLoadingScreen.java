package com.yurisuika.catherine.mixin.client.gui.screen;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.client.gui.screen.LevelLoadingScreen;
import net.minecraft.util.Util;
import net.minecraft.world.chunk.ChunkStatus;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(LevelLoadingScreen.class)
public class MixinLevelLoadingScreen {

    @Shadow
    @Final
    private static final Object2IntMap<ChunkStatus> STATUS_TO_COLOR = (Object2IntMap)Util.make(new Object2IntOpenHashMap(), (map) -> {
        map.defaultReturnValue(1250067);
        map.put(ChunkStatus.EMPTY, 315860);
        map.put(ChunkStatus.STRUCTURE_STARTS, 1381653);
        map.put(ChunkStatus.STRUCTURE_REFERENCES, 1447446);
        map.put(ChunkStatus.BIOMES, 1513239);
        map.put(ChunkStatus.NOISE, 1579032);
        map.put(ChunkStatus.SURFACE, 1644825);
        map.put(ChunkStatus.CARVERS, 1710618);
        map.put(ChunkStatus.LIQUID_CARVERS, 1776411);
        map.put(ChunkStatus.FEATURES, 1842204);
        map.put(ChunkStatus.LIGHT, 1907997);
        map.put(ChunkStatus.SPAWN, 1973790);
        map.put(ChunkStatus.HEIGHTMAPS, 2039583);
        map.put(ChunkStatus.FULL, 2105376);
    });

}
