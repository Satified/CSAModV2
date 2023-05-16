package net.Satified.csa_mod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier STEEL = new ForgeTier(3,3000,3f,2f,
            5, BlockTags.NEEDS_DIAMOND_TOOL, ()-> Ingredient.of(ModItems.STEEL.get()));

    public static final ForgeTier TITANIUM = new ForgeTier(3,6000,5f,4f,
            10, BlockTags.NEEDS_DIAMOND_TOOL, ()-> Ingredient.of(ModItems.TITANIUM.get()));
    public static final ForgeTier TITANIUM_ALLOY = new ForgeTier(4,10000,7f,8f,
            20, BlockTags.NEEDS_DIAMOND_TOOL, ()-> Ingredient.of(ModItems.TITANIUM_ALLOY.get()));
}
