package com.hugomage.alexsdelight.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RawRatLeg extends Item {

    public RawRatLeg() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .fireResistant()
                .food(new Food.Builder()
                                .nutrition(1).saturationMod(0.2F).build()
        )


        );
    }
}
