package ru.mineclass.adamantmod.item;

import net.minecraft.creativetab.CreativeTabs;
import ru.mineclass.adamantmod.AdamantiumMod;

public class ItemLavaPickaxe extends net.minecraft.item.ItemPickaxe {
    public static final String NAME = "lavapickaxe";
    public ItemLavaPickaxe() {
        super(AdamantiumMod.ADAMANTIUM);
        setRegistryName(NAME);
        setUnlocalizedName(NAME);
        setCreativeTab(AdamantiumMod.tabTutorial);
        setHarvestLevel("pickaxe", 3);
    }
}