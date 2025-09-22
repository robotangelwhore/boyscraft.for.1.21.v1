package net.rbagw.boyscraft.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CUM_BOTTLE = new FoodComponent.Builder().nutrition(3)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20), 0.7F).build();
}
