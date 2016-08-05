package net.thedragonteam.mothings.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block {

    public BlockBasic(String unlocalizedName, Material material, float hardness, float resistance) {

        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public BlockBasic(String unlocalizedName, float hardness, float resistance) {

        this(unlocalizedName, Material.ROCK, hardness, resistance);

    }

    public BlockBasic(String unlocalizedName) {

        this(unlocalizedName, 2.0f, 10.0f);

    }

}
