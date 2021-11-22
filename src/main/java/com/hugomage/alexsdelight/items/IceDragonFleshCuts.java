package com.hugomage.alexsdelight.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class IceDragonFleshCuts extends Item {

    public IceDragonFleshCuts() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .fireResistant()
                .food(new Food.Builder()
                        .nutrition(4).saturationMod(1)
                        .effect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 100, 2), 1.0F).build()
                )


        );
    }

}
