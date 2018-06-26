package ru.mineclass.adamantmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import ru.mineclass.adamantmod.AdamantiumMod;
import ru.mineclass.adamantmod.register.ItemsREgister;

public class BlockAdamantiumOre extends Block {
    public static final String NAME = "adamantoreblock";
    public BlockAdamantiumOre() {
        super(Material.IRON);
        setRegistryName(NAME);
        setUnlocalizedName(NAME);
        setHardness(2);
        setCreativeTab(AdamantiumMod.tabTutorial);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        //super.getDrops(drops, world, pos, state, fortune);
        drops.add(new ItemStack(ItemsREgister.item2, 1));
    }
}