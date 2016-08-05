package net.thedragonteam.moblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.core.client.util.ClientUtills;
import net.thedragonteam.moblocks.MoBlocks;
import net.thedragonteam.moblocks.client.gui.MBTab;

public class TMTBlock extends Block {

    public TMTBlock(String unlocalizedName, Material material, float hardness, float resistance) {

        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public TMTBlock(String unlocalizedName, float hardness, float resistance) {

        this(unlocalizedName, Material.ROCK, hardness, resistance);

    }

    public TMTBlock(String unlocalizedName) {

        this(unlocalizedName, 2.0f, 10.0f);

    }
    
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {

    	if(worldIn.isRemote){
    		
    		ClientUtills.openLink("https://moddingtrials.xyz");
    		
    	}
    	
    	return true;
    	
    }

}
