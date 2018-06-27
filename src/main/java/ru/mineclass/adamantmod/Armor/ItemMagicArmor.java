/*
package ru.mineclass.adamantmod.Armor;

import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMagicArmor extends ItemArmor {
    public ItemMagicArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
    public static ItemArmor.ArmorMaterial armorMaterial = EnumHelper.addArmorMaterial("adamantmod:adamantium", "adamantmod:textures", 16, new int[]{1, 1, 1, 1}, 19, SoundEvents.ITEM_BUCKET_FILL_LAVA, 5.0F).setRepairItem(new ItemStack(Item.getItemFromBlock(Blocks.DIAMOND_BLOCK)));

    public static Item
            BOOTS = new ItemMagicArmor("adamantboots", armorMaterial, 1, EntityEquipmentSlot.FEET),
            LEGGS = new ItemMagicArmor("adamantleggs", armorMaterial, 2, EntityEquipmentSlot.LEGS),
            CHESTPLATE = new ItemMagicArmor("adamantchestplate", armorMaterial, 1, EntityEquipmentSlot.CHEST),
            HELMET = new ItemMagicArmor("adamanthelmet", armorMaterial, 1, EntityEquipmentSlot.HEAD);

}
*/