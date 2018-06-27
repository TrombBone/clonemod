package ru.mineclass.adamantmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
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

    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        entity.setFire(3);
        return super.onLeftClickEntity(stack, player, entity);
    }
}