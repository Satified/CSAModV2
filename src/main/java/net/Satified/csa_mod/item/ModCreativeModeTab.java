package net.Satified.csa_mod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CSA_TAB =new CreativeModeTab("Csa Mod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TITANIUM_ALLOY.get());
        };
    };
}
