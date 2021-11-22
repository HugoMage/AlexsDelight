package com.hugomage.alexsdelight.items;

import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class CookedFireDragonFleshCuts extends Item {

    public CookedFireDragonFleshCuts() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .fireResistant()
                .food(new Food.Builder()
                        .effect(new EffectInstance(Effects.DAMAGE_BOOST, 200, 1), 1.0F)
                        .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 200, 1), 1.0F)
                                .nutrition(2).saturationMod(0.3F).build()
        )


        );
    }

}
