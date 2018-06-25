package ru.mineclass.adamantmod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.mineclass.adamantmod.register.BlocksREgister;
import ru.mineclass.adamantmod.register.ItemsREgister;

/*
import ru.mineclass.adamantmod.AdamantiumMod;
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
