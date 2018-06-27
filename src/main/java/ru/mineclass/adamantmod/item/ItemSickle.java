package ru.mineclass.adamantmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
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


    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        entity.setFire(3);
        BlockPos position = player.getPosition();
        Vec3d look = player.getLookVec();
        entity.setPosition(position.getX() - look.x * 5, position.getY() - look.y * 5, position.getZ() - 5);
        return super.onLeftClickEntity(stack, player, entity);
    }
}