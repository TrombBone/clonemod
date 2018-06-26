package ru.mineclass.adamantmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import ru.mineclass.adamantmod.AdamantiumMod;

public class ItemSickle extends ItemSword {
    public static final String NAME = "sickle";
    public ItemSickle() {
        super(AdamantiumMod.ADAMANTIUM);
        setRegistryName(NAME);
        setUnlocalizedName(NAME);
        setCreativeTab(AdamantiumMod.tabTutorial);
        setHarvestLevel("sword", 3);
    }
}