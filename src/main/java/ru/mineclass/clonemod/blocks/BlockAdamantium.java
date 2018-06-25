package ru.mineclass.clonemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import ru.mineclass.clonemod.register.BlocksREgister;
/*
import net.minecraft.init.Items;
import net.minecraft.items.Item;
*/
public class BlockAdamantium extends Block {
    public static final String NAME = "adamantblock";
    public BlockAdamantium() {
        super(Material.ROCK);
        setRegistryName(NAME);
        setUnlocalizedName(NAME);
        setHardness(3);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        //super.getDrops(drops, world, pos, state, fortune);
        drops.add(new ItemStack(BlocksREgister.block, 1));
    }
}