package ru.mineclass.adamantmod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ru.mineclass.adamantmod.AdamantiumMod;

public class ItemAdamantFood extends ItemFood {
    public static final String NAME = "adamantfood";
    public ItemAdamantFood() {
        super(3, 1f, false);
        setRegistryName(NAME);
        setUnlocalizedName(NAME);
        setCreativeTab(AdamantiumMod.tabTutorial);
        setAlwaysEdible();
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(19)));
    }
}