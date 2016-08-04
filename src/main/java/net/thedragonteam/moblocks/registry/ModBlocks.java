package net.thedragonteam.moblocks.registry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.moblocks.MoBlocks;
import net.thedragonteam.moblocks.blocks.slabs.BlockDirtSlab;

import java.util.HashSet;
import java.util.Set;

public class ModBlocks {

    public static Block BLOCK_DIRT_SLAB;

    public static void init() {
        BLOCK_DIRT_SLAB = new BlockDirtSlab().setRegistryName("dirt_slab");
    }

    public static void register() {
        registerBlock(BLOCK_DIRT_SLAB);
    }

    public static void registerRenders() {
        registerRender(BLOCK_DIRT_SLAB);
    }

    public static void registerBlock(Block block) {
        GameRegistry.registerBlock(block, block.getRegistryName().toString());
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(MoBlocks.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}