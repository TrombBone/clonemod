package ru.mineclass.clonemod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAdamantiumOreBlock extends Item {
    public static final String NAME = "adamantore";
    public ItemAdamantiumOreBlock() {
        setRegistryName(NAME);
        setUnlocalizedName(NAME);
        setCreativeTab(CreativeTabs.TOOLS);
    }
    /*
    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);

        //player.addPotionEffect(new PotionEffect(Potion.getPotionById(), 35)); //Под заклинание максимального урона II, т. е. его срезу убьёт!
    }
    */
}