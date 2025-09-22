package net.rbagw.boyscraft.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rbagw.boyscraft.Boyscraft;
import net.rbagw.boyscraft.item.custom.MasturbatorItem;

public class ModItems {
    public static final Item TALISMAN = registerItem("talisman", new Item(new Item.Settings()));
    public static final Item KEY = registerItem("key", new Item(new Item.Settings()));
    public static final Item Chalk = registerItem("chalk", new Item(new Item.Settings()));
    public static final Item MALE_MASTURBATOR = registerItem("male_masturbator", new MasturbatorItem(new Item.Settings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Boyscraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Boyscraft.LOGGER.info("Registering Mod Items For" + Boyscraft.MOD_ID);
    }
}