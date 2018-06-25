package ru.mineclass.clonemod.register;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.mineclass.clonemod.item.ItemAdamantiumOreBlock;
import ru.mineclass.clonemod.item.ItemPickaxe;

public class ItemsREgister {
    public static Item item = new ItemPickaxe();
    public static Item itemfood = new ItemAdamantiumOreBlock();
    public static Item[] items = {
            item,
            itemfood,
    };

    public static void register() {
        setRegister(items);
    }

    public static void registerRender() {
        setRender(items);
    }

    private static void setRegister(Item[] items) {
        ForgeRegistries.ITEMS.registerAll(items);
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Item[] items) {
        for (Item b : items) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(b, 0,
                    new ModelResourceLocation(b.getRegistryName(), "inventory"));
        }
    }


}
