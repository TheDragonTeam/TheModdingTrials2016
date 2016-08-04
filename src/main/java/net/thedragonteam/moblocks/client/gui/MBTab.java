package net.thedragonteam.moblocks.client.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.moblocks.MoBlocks;
import net.thedragonteam.moblocks.registry.ModBlocks;

public class MBTab extends CreativeTabs {
    private String label;
    private int tab;

    static ItemStack iconArmorPlus;

    public static void initialize() {
        iconArmorPlus = new ItemStack(ModBlocks.dragonBlock);
    }

    public MBTab(int id, String modid, String label, int tab) {
        super(id, modid);
        this.label = label;
        this.tab = tab;
        setBackgroundImageName(MoBlocks.MODID + ".png"); // Automagically has tab_ applied to it. Make sure you change the texture name.

    }

    public boolean hasSearchBar() {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getIconItemStack() {
        return new ItemStack(ModBlocks.dragonBlock);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return getIconItemStack().getItem();
    }

    @Override
    public String getTabLabel() {
        return this.label;
    }
}