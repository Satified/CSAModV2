package net.Satified.csa_mod.item;

import net.Satified.csa_mod.CSA_Mod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CSA_Mod.MOD_ID);

    public static final RegistryObject<Item> TITANIUM_ALLOY = ITEMS.register("titanium_alloy",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));

    public static final RegistryObject<Item> TITANIUM = ITEMS.register("titanium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));

    public static final RegistryObject<Item> STEEL = ITEMS.register("steel",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));

    public static final RegistryObject<Item> STEEL_BLEND = ITEMS.register("steel_blend",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            ()-> new SwordItem(ModTiers.STEEL, 5,3,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            ()-> new PickaxeItem(ModTiers.STEEL, 2,1,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            ()-> new AxeItem(ModTiers.STEEL, 5,3,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            ()-> new ShovelItem(ModTiers.STEEL, 5,3,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            ()-> new SwordItem(ModTiers.TITANIUM, 5,3,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            ()-> new PickaxeItem(ModTiers.TITANIUM, 5,3,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            ()-> new ShovelItem(ModTiers.TITANIUM, 5,3,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            ()-> new AxeItem(ModTiers.TITANIUM, 5,3,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> TITANIUM_ALLOY_SWORD = ITEMS.register("titanium_alloy_sword",
            ()-> new SwordItem(ModTiers.TITANIUM_ALLOY, 5,3,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> TITANIUM_ALLOY_PICKAXE = ITEMS.register("titanium_alloy_pickaxe",
            ()-> new PickaxeItem(ModTiers.TITANIUM_ALLOY, 5,3,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> TITANIUM_ALLOY_AXE = ITEMS.register("titanium_alloy_axe",
            ()-> new AxeItem(ModTiers.TITANIUM_ALLOY, 5,3,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> TITANIUM_ALLOY_SHOVEL = ITEMS.register("titanium_alloy_shovel",
            ()-> new ShovelItem(ModTiers.TITANIUM_ALLOY, 5,3,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            ()-> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
            ()-> new ArmorItem(ModArmorMaterials.Titanium, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> TITANIUM_ALLOY_HELMET = ITEMS.register("titanium_alloy_helmet",
            ()-> new ArmorItem(ModArmorMaterials.TITANIUM_ALLOY, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.Titanium, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> TITANIUM_ALLOY_CHESTPLATE = ITEMS.register("titanium_alloy_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.TITANIUM_ALLOY, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            ()-> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.LEGS
                    , new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
            ()-> new ArmorItem(ModArmorMaterials.Titanium, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));

    public static final RegistryObject<Item> TITANIUM_ALLOY_LEGGINGS = ITEMS.register("titanium_alloy_leggings",
            ()-> new ArmorItem(ModArmorMaterials.TITANIUM_ALLOY, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));

    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            ()-> new ArmorItem(ModArmorMaterials.STEEL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));
    public static final RegistryObject<Item> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
            ()-> new ArmorItem(ModArmorMaterials.Titanium, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));

    public static final RegistryObject<Item> TITANIUM_ALLOY_BOOTS = ITEMS.register("titanium_alloy_boots",
            ()-> new ArmorItem(ModArmorMaterials.Titanium, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.CSA_TAB)));





    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
