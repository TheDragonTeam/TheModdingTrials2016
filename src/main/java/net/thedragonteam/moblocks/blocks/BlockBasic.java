package net.thedragonteam.moblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.thedragonteam.moblocks.MoBlocks;
import net.thedragonteam.moblocks.client.gui.MBTab;

public class BlockBasic extends Block {

    public BlockBasic(String unlocalizedName, Material material, float hardness, float resistance) {

        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setCreativeTab(MoBlocks.TAB_MO_BLOCKS);
    }

    public BlockBasic(String unlocalizedName, float hardness, float resistance) {

        this(unlocalizedName, Material.ROCK, hardness, resistance);

    }

    public BlockBasic(String unlocalizedName) {

        this(unlocalizedName, 2.0f, 10.0f);

    }

}
