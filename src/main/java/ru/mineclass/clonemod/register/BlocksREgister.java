package ru.mineclass.clonemod.register;


import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.mineclass.clonemod.blocks.BlockAdamantium;

public class BlocksREgister {
    public static BlockAdamantium block = new BlockAdamantium();

    private static final Block[] blocks = {
            block
    } ;

    public static void register() {
        setRegister(blocks);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(blocks);
    }

    private static void setRegister(Block[] blocks) {
        ForgeRegistries.BLOCKS.registerAll(blocks);
        for (Block b: blocks) {
            ForgeRegistries.ITEMS.register(
                    new ItemBlock(block).setRegistryName(b.getRegistryName())
            );
        }
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Block[] blocks) {
        for (Block b: blocks) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(b), 0,
                    new ModelResourceLocation(b.getRegistryName(), "inventory"));
        }
    }

    /*
    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        for (final Block blocks : blocks) {
            registry.register(new ItemBlock(blocks).setRegistryName(blocks.getRegistryName()));
        }
    }
    public static void redisterModels(){
    }
    */

}
