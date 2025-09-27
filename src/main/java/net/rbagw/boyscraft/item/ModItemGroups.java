package net.rbagw.boyscraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rbagw.boyscraft.Boyscraft;
import net.rbagw.boyscraft.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup BOYS_RESOURCES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Boyscraft.MOD_ID, "boys_resources"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TALISMAN))
                    .displayName(Text.translatable("itemgroup.boyscraft.boys_resources"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TALISMAN);
                        entries.add(ModItems.CHALK);
                        entries.add(ModItems.KEY);
                        entries.add(ModItems.SILVER_PETAL);
                    })
                    .build());

    public static final ItemGroup BOYS_Blocks_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Boyscraft.MOD_ID, "boys_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.CHALK_ORE))
                    .displayName(Text.translatable("itemgroup.boyscraft.boys_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.CHALK_ORE);
                        entries.add(ModBlocks.SILVER_ORE);
                        entries.add(ModBlocks.SILVER_BLOCK);

                    })
                    .build());

    public static final ItemGroup BOYS_ARMOUR_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Boyscraft.MOD_ID, "boys_armour"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHASTITY_CAGE))
                    .displayName(Text.translatable("itemgroup.boyscraft.boys_armour"))
                    .entries((displayContext, entries) -> {
                        entries.add((ModItems.CHASTITY_CAGE));

                    })
                    .build());

    public static final ItemGroup FORGE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Boyscraft.MOD_ID, "forge_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.KEY))
                    .displayName(Text.translatable("itemgroup.boyscraft.forge_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.KEY);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.SILVER_INGOT);
                    })
                    .build());

    public static final ItemGroup LUST_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Boyscraft.MOD_ID, "lust_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MALE_MASTURBATOR))
                    .displayName(Text.translatable("itemgroup.boyscraft.lust_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MALE_MASTURBATOR);
                        entries.add(ModItems.CUM_BOTTLE);
                        entries.add(ModItems.SILVER_PETAL);

                    })
                    .build());

    public static void registerItemGroups() {
        Boyscraft.LOGGER.info("Registering Item Groups for " + Boyscraft.MOD_ID);
    }
}