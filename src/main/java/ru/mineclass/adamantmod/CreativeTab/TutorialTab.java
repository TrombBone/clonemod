package ru.mineclass.adamantmod.CreativeTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.mineclass.adamantmod.register.BlocksREgister;

public class TutorialTab extends CreativeTabs {

    public TutorialTab(String lable) {
        super(lable);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem()
    {
        return new ItemStack(Item.getItemFromBlock(BlocksREgister.block));
    }


}
