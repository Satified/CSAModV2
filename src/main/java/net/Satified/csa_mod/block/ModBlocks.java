package net.Satified.csa_mod.block;

import net.Satified.csa_mod.CSA_Mod;
import net.Satified.csa_mod.item.ModCreativeModeTab;
import net.Satified.csa_mod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockCollisions;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CSA_Mod.MOD_ID);

    public static final RegistryObject<Block> STEEL_BLOCK =registerBlock("steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CSA_TAB);
    public static final RegistryObject<Block> TITANIUM_BLOCK =registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CSA_TAB);
    public static final RegistryObject<Block> TITANIUM_ORE =registerBlock("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CSA_TAB);
    public static final RegistryObject<Block> TITANIUM_ALLOY_BLOCK =registerBlock("titanium_alloy_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.CSA_TAB);


    private static <T extends Block>RegistryObject<T>
        registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
      RegistryObject<T> toReturn = BLOCKS.register(name, block);
      registerBlockItem(name, toReturn, tab);
      return toReturn;
    }


    private static <T extends Block> RegistryObject<Item>
        registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){

        return ModItems.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void  register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
