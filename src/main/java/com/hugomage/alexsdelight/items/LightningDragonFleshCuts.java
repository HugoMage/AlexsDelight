package com.hugomage.alexsdelight.items;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.world.World;

public class LightningDragonFleshCuts extends Item {

    public LightningDragonFleshCuts() {
        super(new Properties()
                .tab(ItemGroup.TAB_FOOD)
                .fireResistant()
                .food(new Food.Builder()
                                .nutrition(4).saturationMod(1).build()
        )


        );
    }
    public ItemStack finishUsingItem(ItemStack p_77654_1_, World p_77654_2_, LivingEntity livingEntity) {
        super.finishUsingItem(p_77654_1_, p_77654_2_, livingEntity);
        if (livingEntity instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)livingEntity;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, p_77654_1_);
            serverplayerentity.awardStat(Stats.ITEM_USED.get(this));
        }

        if(!livingEntity.level.isClientSide){
            LightningBoltEntity lightningboltentity = EntityType.LIGHTNING_BOLT.create(livingEntity.level);
            lightningboltentity.moveTo(livingEntity.position());
            if(!livingEntity.level.isClientSide){
                livingEntity.level.addFreshEntity(lightningboltentity);
            }
        }

       {
            return p_77654_1_;
        }
    }

}
