package ru.mineclass.adamantmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemAdamantiumOre extends Item {
    public static final String NAME = "adamantore";
    public ItemAdamantiumOre() {
        setRegistryName(NAME);
        setUnlocalizedName(NAME);
        setCreativeTab(CreativeTabs.TOOLS);
    }
}