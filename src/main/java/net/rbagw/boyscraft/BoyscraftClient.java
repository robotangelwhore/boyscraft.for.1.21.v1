package net.rbagw.boyscraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.rbagw.boyscraft.block.ModBlocks;

public class BoyscraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LUXURIA_NYMPHAEA, RenderLayer.getCutout());


    }
}
