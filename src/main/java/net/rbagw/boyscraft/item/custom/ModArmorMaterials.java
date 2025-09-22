package net.rbagw.boyscraft.item.custom;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.rbagw.boyscraft.Boyscraft;
import net.rbagw.boyscraft.item.ModItems;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static RegistryEntry<ArmorMaterial> SILVER_INGOT_ARMOR_MATERIAL;

    public static void register() {
        Identifier id = Identifier.of(Boyscraft.MOD_ID, "silver_ingot");
        ArmorMaterial material = new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
            typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 2);
            typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 4);
            typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 6);
            typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 2);
        }), 20, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
                () -> Ingredient.ofItems(ModItems.SILVER_INGOT),
                List.of(new ArmorMaterial.Layer(Identifier.of(Boyscraft.MOD_ID, "silver_ingot"))),
                0, 0);

        Registry.register(Registries.ARMOR_MATERIAL, id, material);

        // Now get the RegistryEntry safely *after* registration
        SILVER_INGOT_ARMOR_MATERIAL = Registries.ARMOR_MATERIAL.getEntry(id)
                .orElseThrow(() -> new IllegalStateException("Failed to get RegistryEntry for " + id));
    }
}