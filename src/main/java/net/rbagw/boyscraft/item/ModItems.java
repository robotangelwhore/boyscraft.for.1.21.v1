package net.rbagw.boyscraft.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rbagw.boyscraft.Boyscraft;
import net.rbagw.boyscraft.item.custom.MasturbatorItem;
import net.rbagw.boyscraft.item.custom.ModArmorMaterials;

public class ModItems {

    public static final Item TALISMAN = registerItem("talisman", new Item(new Item.Settings()));
    public static final Item KEY = registerItem("key", new Item(new Item.Settings()));
    public static final Item CHALK = registerItem("chalk", new Item(new Item.Settings()));
    public static final Item MALE_MASTURBATOR = registerItem("male_masturbator", new MasturbatorItem(new Item.Settings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));
    public static final Item CUM_BOTTLE = registerItem("cum_bottle", new Item(new Item.Settings().food(ModFoodComponents.CUM_BOTTLE)));

    public static Item CHASTITY_CAGE;

    public static void registerModItems() {
        Boyscraft.LOGGER.info("Registering Mod Items for " + Boyscraft.MOD_ID);

        ModArmorMaterials.register();

        CHASTITY_CAGE = registerItem("chastity_cage",
                new ArmorItem(ModArmorMaterials.SILVER_INGOT_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Boyscraft.MOD_ID, name), item);
    }
}
