package com.hugomage.alexsdelight.items;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.stats.Stats;
import net.minecraft.world.World;

public class FireDragonFleshCuts extends Item {

    public FireDragonFleshCuts() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .fireResistant()
                .food(new Food.Builder()
                                .nutrition(4).saturationMod(1).build()
        )


        );
    }
    public ItemStack finishUsingItem(ItemStack p_77654_1_, World p_77654_2_, LivingEntity p_77654_3_) {
        super.finishUsingItem(p_77654_1_, p_77654_2_, p_77654_3_);
        if (p_77654_3_ instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)p_77654_3_;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, p_77654_1_);
            serverplayerentity.awardStat(Stats.ITEM_USED.get(this));
        }

        if (!p_77654_2_.isClientSide) {
            p_77654_3_.setSecondsOnFire(5);
        }

       {
            return p_77654_1_;
        }
    }

}
