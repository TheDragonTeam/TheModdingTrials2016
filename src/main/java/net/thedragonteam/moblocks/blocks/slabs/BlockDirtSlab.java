package net.thedragonteam.moblocks.blocks.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.moblocks.MoBlocks;


public class BlockDirtSlab extends Block {

    public BlockDirtSlab() {
        super(Material.SAND);
        this.setUnlocalizedName("dirt_slab");
        this.setHardness(2.0F);
        this.setHarvestLevel("shovel", 0);
        this.setCreativeTab(MoBlocks.TAB_MO_BLOCKS);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public Block setUnlocalizedName(String name) {
        return super.setUnlocalizedName(name);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}