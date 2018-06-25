package ru.mineclass.clonemod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.mineclass.clonemod.register.BlocksREgister;
import ru.mineclass.clonemod.register.ItemsREgister;

/*
import ru.mineclass.clonemod.AdamantiumMod;
import net.minecraft.client.renderer.blocks.model.ModelResourceLocation;
import net.minecraft.items.Item;
import net.minecraftforge.client.model.ModelLoader;
*/

public class ClientProxy extends CommonProxy{
    /*
    @Override
    public void registerItemRenderer(Item items, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(items, meta,
                new ModelResourceLocation(
                        AdamantiumMod.MODID + ":" + id, "inventory"));
    }
    */
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        BlocksREgister.registerRender();
        ItemsREgister.registerRender();
    }

    @Override
    public void postInIt(FMLPostInitializationEvent event) {
        super.postInIt(event);
    }
}
