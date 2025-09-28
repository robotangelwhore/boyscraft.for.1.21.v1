package net.rbagw.boyscraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.rbagw.boyscraft.block.ModBlocks;

import net.rbagw.boyscraft.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHALK_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHALK_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TALISMAN, Models.GENERATED);
        itemModelGenerator.register(ModItems.KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHALK, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUM_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_PETAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MALE_MASTURBATOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ARMOR_PLATE, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CHASTITY_CAGE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SILVER_BOOTS));


    }
}
