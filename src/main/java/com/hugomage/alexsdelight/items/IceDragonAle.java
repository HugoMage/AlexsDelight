package com.hugomage.alexsdelight.items;

import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class IceDragonAle extends Item {

    public IceDragonAle() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .fireResistant()
                .food(new Food.Builder()
                        .effect(new EffectInstance(Effects.WATER_BREATHING, 200, 1), 1.0F)
                        .effect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 200, 3), 1.0F)
                        .effect(new EffectInstance(Effects.DOLPHINS_GRACE, 200, 1), 1.0F)
                                .nutrition(2).saturationMod(0.3F).build()
        )


        );
    }

    public UseAction getUseAnimation(ItemStack p_77661_1_) {
        return UseAction.DRINK;
    }

    public SoundEvent getDrinkingSound() {
        return SoundEvents.HONEY_DRINK;
    }

    public SoundEvent getEatingSound() {
        return SoundEvents.HONEY_DRINK;
    }
}
