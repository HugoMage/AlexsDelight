package com.hugomage.alexsdelight.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class DeluxeKangarooBurger extends Item {

    public DeluxeKangarooBurger() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .fireResistant()
                .food(new Food.Builder()
                                .nutrition(4).saturationMod(1)
                        .effect(new EffectInstance(Effects.JUMP, 100, 1), 1.0F).build()
        )


        );
    }
}
