package net.rbagw.boyscraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SILVER_BLOCK)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.SILVER_INGOT)
                .criterion(hasItem(ModItems.SILVER_INGOT), conditionsFromItem(ModItems.SILVER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TALISMAN)
                .pattern("   ")
                .pattern("CPR")
                .pattern("   ")
                .input('P', Items.PAPER)
                .input('R', Items.REDSTONE)
                .input('C', ModItems.CHALK)
                .criterion(hasItem(ModItems.CHALK), conditionsFromItem(ModItems.CHALK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.KEY)
                .pattern(" G ")
                .pattern(" G ")
                .pattern(" S ")
                .input('G', Items.GOLD_INGOT)
                .input('S', ModItems.SILVER_INGOT)
                .criterion(hasItem(ModItems.SILVER_INGOT), conditionsFromItem(ModItems.SILVER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_HELMET)
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .input('S', ModItems.SILVER_INGOT)
                .criterion(hasItem(ModItems.SILVER_INGOT), conditionsFromItem(ModItems.SILVER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_CHESTPLATE)
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.SILVER_INGOT)
                .criterion(hasItem(ModItems.SILVER_INGOT), conditionsFromItem(ModItems.SILVER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHASTITY_CAGE)
                .pattern("   ")
                .pattern("SSS")
                .pattern(" S ")
                .input('S', ModItems.SILVER_INGOT)
                .criterion(hasItem(ModItems.SILVER_INGOT), conditionsFromItem(ModItems.SILVER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SILVER_BOOTS)
                .pattern("   ")
                .pattern("S S")
                .pattern("S S")
                .input('S', ModItems.SILVER_INGOT)
                .criterion(hasItem(ModItems.SILVER_INGOT), conditionsFromItem(ModItems.SILVER_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ARMOR_PLATE)
                .pattern("OSO")
                .pattern("OSO")
                .pattern("OSO")
                .input('O', Items.OBSIDIAN)
                .input('S', ModItems.SILVER_INGOT)
                .criterion(hasItem(ModItems.SILVER_INGOT), conditionsFromItem(ModItems.SILVER_INGOT))
                .offerTo(exporter);

    }
}
