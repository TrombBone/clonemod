package ru.mineclass.adamantmod.register;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.mineclass.adamantmod.item.ItemAdamantiumOre;
import ru.mineclass.adamantmod.item.ItemPickaxe;

public class ItemsREgister {
    public static Item item = new ItemPickaxe();
    public static Item item2 = new ItemAdamantiumOre();
    public static Item[] items = {
            item,
            item2,
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
