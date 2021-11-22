package com.hugomage.alexsdelight;


import com.hugomage.alexsdelight.items.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlexsDelight.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AlexsDelight.MOD_ID);


    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }



    // Items
    public static final RegistryObject<Item> MUNGUS_GUMMIE = ITEMS.register("mungus_gummy", MungusGummie::new);
    public static final RegistryObject<Item> CHEESE_PASTA = ITEMS.register("cheese_pasta", CheesePasta::new);
    public static final RegistryObject<Item> BLOBFISH_SOUP = ITEMS.register("monstrous_soup", BlobfishSoup::new);
    public static final RegistryObject<Item> MINCED_KANGAROO = ITEMS.register("minced_raw_kangaroo", MincedKangaroo::new);
    public static final RegistryObject<Item> MINCED_COOKED_KANGAROO = ITEMS.register("minced_cooked_kangaroo", MincedCookedKangaroo::new);
    public static final RegistryObject<Item> BACON_EGG_CHEESE_SANWICH = ITEMS.register("bacon_egg_and_cheese_sandwich", BaconEggCheeseSandwich::new);
    public static final RegistryObject<Item> DELUXE_KANG = ITEMS.register("deluxe_kangaroo_burger", DeluxeKangarooBurger::new);
    public static final RegistryObject<Item> CHEESE_CAKE = ITEMS.register("cheesecake", CheeseCake::new);
    public static final RegistryObject<Item> CHEESE_CAKE_SLICE = ITEMS.register("cheesecake_slice", CheeseCakeSlice::new);
    public static final RegistryObject<Item> GRILLED_CHEESE = ITEMS.register("grilled_cheese_sandwich", GrilledCheese::new);
    public static final RegistryObject<Item> FRIED_CHEESE = ITEMS.register("fried_cheese", FriedCheese::new);
    public static final RegistryObject<Item> MUNGUS_JELLY_SANDWICH = ITEMS.register("mungus_jelly_sandwich", MungusJellySandwich::new);
    public static final RegistryObject<Item> ICE_DRAGON_ALE = ITEMS.register("ice_dragon_ale", IceDragonAle::new);
    public static final RegistryObject<Item> FIRE_DRAGON_ALE = ITEMS.register("fire_dragon_ale", FireDragonAle::new);
    public static final RegistryObject<Item> LIGHTNING_DRAGON_ALE = ITEMS.register("lightning_dragon_ale", LightningDragonAle::new);
    public static final RegistryObject<Item> LOBSTERPOTATOES = ITEMS.register("lobster_and_potatoes", LobsterPotatoes::new);
    public static final RegistryObject<Item> SEAFOOD_SOUP = ITEMS.register("seafood_soup", SeaFoodSoup::new);
    public static final RegistryObject<Item> SEAFOOD_PASTA = ITEMS.register("seafood_pasta", SeafoodPasta::new);
    public static final RegistryObject<Item> CHOCOLATE_CANNOLI = ITEMS.register("chocolate_cannoli", ChocolateCannoli::new);
    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza", Pizza::new);
    public static final RegistryObject<Item> PIZZA_SLICE = ITEMS.register("pizza_slice", PizzaSlice::new);
    public static final RegistryObject<Item> RAW_RAT_LEG = ITEMS.register("raw_rat_leg", RawRatLeg::new);
    public static final RegistryObject<Item> COOKED_RAT_LEG = ITEMS.register("cooked_rat_leg", CookedRatLeg::new);
    public static final RegistryObject<Item> RAT_BURGER = ITEMS.register("rat_cheeseburger", DeluxeKangarooBurger::new);
    public static final RegistryObject<Item> RAT_STEW = ITEMS.register("rat_stew", SeaFoodSoup::new);
    public static final RegistryObject<Item> ROASTED_RAT = ITEMS.register("roasted_rat", SeaFoodSoup::new);
    public static final RegistryObject<Item> RATSTICK = ITEMS.register("rat_kebab", ChocolateCannoli::new);
    public static final RegistryObject<Item> ICEDRAGON = ITEMS.register("ice_dragon_flesh_cuts", IceDragonFleshCuts::new);
    public static final RegistryObject<Item> FIREDRAGON = ITEMS.register("fire_dragon_flesh_cuts", FireDragonFleshCuts::new);
    public static final RegistryObject<Item> LIGHTNINGDRAGON = ITEMS.register("lightning_dragon_flesh_cuts", LightningDragonFleshCuts::new);
    public static final RegistryObject<Item> COOKEDICEDRAGON = ITEMS.register("cooked_ice_dragon_flesh_cuts", CookedIceDragonFleshCuts::new);
    public static final RegistryObject<Item> COOKEDFIREDRAGON = ITEMS.register("cooked_fire_dragon_flesh_cuts", CookedFireDragonFleshCuts::new);
    public static final RegistryObject<Item> COOKEDLIGHTNINGDRAGON = ITEMS.register("cooked_lightning_dragon_flesh_cuts", CookedLightningDragonFleshCuts::new);
}
