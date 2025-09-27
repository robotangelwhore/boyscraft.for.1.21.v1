package net.rbagw.boyscraft;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.world.gen.feature.OreFeature;
import net.rbagw.boyscraft.block.ModBlocks;
import net.rbagw.boyscraft.item.ModItemGroups;
import net.rbagw.boyscraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Boyscraft implements ModInitializer {
	public static final String MOD_ID = "boyscraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        FuelRegistry.INSTANCE.add(ModItems.SILVER_PETAL, 2000);
	}
}