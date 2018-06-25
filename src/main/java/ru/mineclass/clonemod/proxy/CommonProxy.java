package ru.mineclass.clonemod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.mineclass.clonemod.register.BlocksREgister;
import ru.mineclass.clonemod.register.ItemsREgister;

/*
import jdk.nashorn.internal.ir.Block;import net.minecraft.items.Item;

public class CommonProxy {
    public void registerItemRenderer(Item items, int meta, String id) {
    }
}
*/

public abstract class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        BlocksREgister.register();
        ItemsREgister.register();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInIt(FMLPostInitializationEvent event) {

    }

}