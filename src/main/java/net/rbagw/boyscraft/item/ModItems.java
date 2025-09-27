package net.rbagw.boyscraft.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rbagw.boyscraft.Boyscraft;
import net.rbagw.boyscraft.item.custom.MasturbatorItem;

public class ModItems {

    public static final Item TALISMAN = registerItem("talisman", new Item(new Item.Settings()));
    public static final Item KEY = registerItem("key", new Item(new Item.Settings()));
    public static final Item CHALK = registerItem("chalk", new Item(new Item.Settings()));
    public static final Item MALE_MASTURBATOR = registerItem("male_masturbator", new MasturbatorItem(new Item.Settings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));
    public static final Item CUM_BOTTLE = registerItem("cum_bottle", new Item(new Item.Settings().food(ModFoodComponents.CUM_BOTTLE)));
    public static final Item SILVER_PETAL = registerItem("silver_petal", new Item(new Item.Settings()));
    public static final Item ARMOR_PLATE = registerItem("armor_plate", new Item(new Item.Settings()));

    public static final Item SILVER_HELMET = registerItem("silver_helmet", new ArmorItem(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
            .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(9))));
    public static final Item SILVER_CHESTPLATE = registerItem("silver_chestplate", new ArmorItem(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
            .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(9))));
    public static final Item SILVER_BOOTS = registerItem("silver_boots", new ArmorItem(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
            .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(9))));

    public static Item CHASTITY_CAGE;

    public static void registerModItems() {
        Boyscraft.LOGGER.info("Registering Mod Items for " + Boyscraft.MOD_ID);

        CHASTITY_CAGE = registerItem("chastity_cage",
                new ArmorItem(net.rbagw.boyscraft.item.ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()));

    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Boyscraft.MOD_ID, name), item);
    }
}