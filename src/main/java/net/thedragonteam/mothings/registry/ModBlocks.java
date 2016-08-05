package net.thedragonteam.mothings.registry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.mothings.MoThings;
import net.thedragonteam.mothings.blocks.BlockBasic;
import net.thedragonteam.mothings.blocks.TMTBlock;
import net.thedragonteam.mothings.blocks.slabs.BlockDirtSlab;

public class ModBlocks {

    public static Block dirtSlab;
    public static Block dragonBlock;
    public static Block tmtBlock;

    public static void init() {
        dirtSlab = new BlockDirtSlab().setRegistryName("dirt_slab");
        dragonBlock = new BlockBasic("the_dragon_block", Material.CLOTH, 1.0F, 5.0F).setRegistryName("the_dragon_block");
        tmtBlock = new TMTBlock("tmt_block", Material.CLOTH, 1.0F, 5.0F).setRegistryName("tmt_block").setCreativeTab(MoThings.TAB_MO_THINGS);
    }

    public static void register() {
        registerBlock(dirtSlab);
        registerBlock(dragonBlock);
        registerBlock(tmtBlock);
    }

    public static void registerRenders() {
        registerRender(dirtSlab);
        registerRender(dragonBlock);
        registerRender(tmtBlock);
    }

    public static void registerBlock(Block block) {
        GameRegistry.registerBlock(block, block.getRegistryName().toString());
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(MoThings.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}