package ru.mineclass.adamantmod;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import ru.mineclass.adamantmod.CreativeTab.TutorialTab;
import ru.mineclass.adamantmod.material.MaterialAdam;
import ru.mineclass.adamantmod.proxy.CommonProxy;

@Mod(modid = AdamantiumMod.MODID, name = AdamantiumMod.NAME, version = AdamantiumMod.VERSION)
public class AdamantiumMod {
    public static final String MODID = "adamantmod";
    public static final String NAME = "Adamantium Mod";
    public static final String VERSION = "0.1-dev";

    private static Logger logger;

    @SidedProxy(clientSide = "ru.mineclass.adamantmod.proxy.ClientProxy", serverSide = "ru.mineclass.adamantmod.proxy.ServerProxy")
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

    public static final Item.ToolMaterial ADAMANTIUM = EnumHelper.addToolMaterial("ADAMANTIUM", 3, 2123, 10, 7, 50);
    public static final Material ADAM_MATERIAL = new MaterialAdam();

    public static CreativeTabs tabTutorial = new TutorialTab("12");

}

