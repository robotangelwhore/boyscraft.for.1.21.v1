package net.rbagw.boyscraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.rbagw.boyscraft.block.ModBlocks;
import net.rbagw.boyscraft.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> CHALK_SMELTABLES = List.of(ModBlocks.CHALK_ORE);
        offerSmelting(exporter, CHALK_SMELTABLES, RecipeCategory.MISC, ModItems.CHALK, 0.1f, 200, "chalk");
        offerBlasting(exporter, CHALK_SMELTABLES, RecipeCategory.MISC, ModItems.CHALK, 0.1f, 100, "chalk");

        List<ItemConvertible> SILVER_SMELTABLES = List.of(ModBlocks.SILVER_ORE, ModItems.RAW_SILVER, ModItems.CHASTITY_CAGE);
        offerSmelting(exporter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.7f, 200, "silver_ingot");
        offerBlasting(exporter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.7f, 100, "silver_ingot");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SILVER_INGOT, RecipeCategory.DECORATIONS, ModBlocks.SILVER_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SILVER_BLOCK)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.SILVER_INGOT)
                .criterion(hasItem(ModItems.SILVER_INGOT), conditionsFromItem(ModItems.SILVER_INGOT))
                .offerTo(exporter);

    }
}
