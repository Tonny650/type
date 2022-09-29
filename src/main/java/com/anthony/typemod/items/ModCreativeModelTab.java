package com.anthony.typemod.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModelTab {
    public static final CreativeModeTab TYPE_TAB = new CreativeModeTab("typetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ALUMINUM.get());
        }
    };

}
