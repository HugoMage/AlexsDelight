package com.hugomage.alexsdelight.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Pizza extends Item {

    public Pizza() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .fireResistant()
                .food(new Food.Builder()
                                .nutrition(5).saturationMod(1).build()
        )


        );
    }
}
