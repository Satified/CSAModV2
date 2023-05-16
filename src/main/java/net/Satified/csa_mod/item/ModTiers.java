package net.Satified.csa_mod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier STEEL = new ForgeTier(3,2000,1.5f,2f,
            5, BlockTags.NEEDS_DIAMOND_TOOL, ()-> Ingredient.of(ModItems.STEEL.get()));

    public static final ForgeTier TITANIUM = new ForgeTier(3,4000,2.5f,4f,
            10, BlockTags.NEEDS_DIAMOND_TOOL, ()-> Ingredient.of(ModItems.TITANIUM.get()));
    public static final ForgeTier TITANIUM_ALLOY = new ForgeTier(4,8000,4.5f,8f,
            20, BlockTags.NEEDS_DIAMOND_TOOL, ()-> Ingredient.of(ModItems.TITANIUM_ALLOY.get()));
}
