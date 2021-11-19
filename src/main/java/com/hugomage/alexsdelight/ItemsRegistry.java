package com.hugomage.alexsdelight;


import com.hugomage.alexsdelight.items.BlobfishSoup;
import com.hugomage.alexsdelight.items.MincedCookedKangaroo;
import com.hugomage.alexsdelight.items.MincedKangaroo;
import com.hugomage.alexsdelight.items.MungusGummie;
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
    public static final RegistryObject<Item> MUNGUS_GUMMIE = ITEMS.register("mungus_gummie", MungusGummie::new);
    public static final RegistryObject<Item> CHEESE_PASTA = ITEMS.register("cheese_pasta", CheesePasta::new);
    public static final RegistryObject<Item> BLOBFISH_SOUP = ITEMS.register("blobfish_soup", BlobfishSoup::new);
    public static final RegistryObject<Item> MINCED_KANGAROO = ITEMS.register("minced_raw_kangaroo", MincedKangaroo::new);
    public static final RegistryObject<Item> MINCED_COOKED_KANGAROO = ITEMS.register("minced_cooked_kangaroo", MincedCookedKangaroo::new);






}
