package com.anthony.typemod.items;

import com.anthony.typemod.TypeMod;
import com.anthony.typemod.block.ModBlock;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    /**Registro definido
     * public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModId);
     * */

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TypeMod.MOD_ID);


    public static final RegistryObject<Item> ALUMINUM = ITEMS.register("aluminum",
            () -> new Item(new Item.Properties().tab(ModCreativeModelTab.TYPE_TAB)));

    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum",
            () -> new Item(new Item.Properties().tab(ModCreativeModelTab.TYPE_TAB)));

    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic",
            () -> new Item(new Item.Properties().tab(ModCreativeModelTab.TYPE_TAB)));

    public static final RegistryObject<Item> WEED_SEED = ITEMS.register("weed_seeds",
            () -> new ItemNameBlockItem(ModBlock.WEED_CROP.get(),new Item.Properties().tab(ModCreativeModelTab.TYPE_TAB)));

    public static final RegistryObject<Item> CANNABIS_BUD = ITEMS.register("cannabis_bud",
            () -> new Item(new Item.Properties().tab(ModCreativeModelTab.TYPE_TAB)));

    public static void  register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
