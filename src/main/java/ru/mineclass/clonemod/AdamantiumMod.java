package ru.mineclass.clonemod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import ru.mineclass.clonemod.proxy.CommonProxy;

@Mod(modid = AdamantiumMod.MODID, name = AdamantiumMod.NAME, version = AdamantiumMod.VERSION)
public class AdamantiumMod {
    public static final String MODID = "adamantmod";
    public static final String NAME = "Adamantium Mod";
    public static final String VERSION = "0.1-dev";

    private static Logger logger;

    @SidedProxy(clientSide = "ru.mineclass.clonemod.proxy.ClientProxy", serverSide = "ru.mineclass.clonemod.proxy.ServerProxy")
    private static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }
    public void postInIt(FMLPostInitializationEvent event) {
        proxy.postInIt(event);
    }
}
