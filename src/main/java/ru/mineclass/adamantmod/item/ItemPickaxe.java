package ru.mineclass.adamantmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPickaxe extends Item {
    public static final String NAME = "lavapickaxe";
    public ItemPickaxe() {
        setRegistryName(NAME);
        setUnlocalizedName(NAME);
        setCreativeTab(CreativeTabs.TOOLS);
        setHarvestLevel("pickaxe", 3);

        //setDamage(ItemStack.EMPTY, 5);
    }
}
