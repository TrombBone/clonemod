package ru.mineclass.adamantmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ru.mineclass.adamantmod.AdamantiumMod;

public class ItemAdamantiumOre extends Item {
    public static final String NAME = "adamantore";
    public ItemAdamantiumOre() {
        setRegistryName(NAME);
        setUnlocalizedName(NAME);
        setCreativeTab(AdamantiumMod.tabTutorial);
    }
}