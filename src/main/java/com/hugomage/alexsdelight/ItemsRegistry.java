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
    public static final RegistryObject<Item> BLOBFISH_SOUP = ITEMS.register("monstorous_soup", BlobfishSoup::new);
    public static final RegistryObject<Item> MINCED_KANGAROO = ITEMS.register("minced_raw_kangaroo", MincedKangaroo::new);
    public static final RegistryObject<Item> MINCED_COOKED_KANGAROO = ITEMS.register("minced_cooked_kangaroo", MincedCookedKangaroo::new);
    public static final RegistryObject<Item> BACON_EGG_CHEESE_SANWICH = ITEMS.register("bacon_egg_and_cheese_sandwich", BaconEggCheeseSandwich::new);
    public static final RegistryObject<Item> DELUXE_KANG = ITEMS.register("deluxe_kangaroo_burger", DeluxeKangarooBurger::new);
    public static final RegistryObject<Item> CHEESE_CAKE = ITEMS.register("cheesecake", CheeseCake::new);
    public static final RegistryObject<Item> CHEESE_CAKE_SLICE = ITEMS.register("cheesecake_slice", CheeseCakeSlice::new);
    public static final RegistryObject<Item> GRILLED_CHEESE = ITEMS.register("grilled_cheese_sandwich", GrilledCheese::new);
    public static final RegistryObject<Item> FRIED_CHEESE = ITEMS.register("fried_cheese", FriedCheese::new);



}
