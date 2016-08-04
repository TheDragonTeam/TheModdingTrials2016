package net.thedragonteam.moblocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thedragonteam.core.TheDragonCore;
import net.thedragonteam.core.util.LogHelper;
import net.thedragonteam.moblocks.client.gui.MBTab;
import net.thedragonteam.moblocks.proxy.CommonProxy;

import net.thedragonteam.moblocks.registry.ModBlocks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = MoBlocks.MODID, version = MoBlocks.VERSION, dependencies = MoBlocks.DEPEND, name = MoBlocks.MODNAME)
public class MoBlocks {
	public static final String MODID = "moblocks";
	public static final String MODNAME = "Mo' Blocks";
	public static final String DEPEND = "required-after:thedragoncore@[" + TheDragonCore.VERSION + ",);";
	public static final String VERSION = "1.0.0";
	public static final String CLIENTPROXY = "net.thedragonteam.moblocks.proxy.ClientProxy";
	public static final String COMMONPROXY = "net.thedragonteam.moblocks.proxy.CommonProxy";

	@SidedProxy(clientSide = MoBlocks.CLIENTPROXY, serverSide = MoBlocks.COMMONPROXY)
	public static CommonProxy proxy;

	public static CreativeTabs TAB_MO_BLOCKS = new MBTab(CreativeTabs.getNextID(), MoBlocks.MODID, "blocks", 0);

	public static Logger logger = LogManager.getLogger(MoBlocks.MODNAME);

	@Mod.Instance(MoBlocks.MODID)
	public static MoBlocks instance;

	public MoBlocks() {
		LogHelper.info("Welcoming Minecraft");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ModBlocks.register();
		proxy.registerRenderers(this);
		proxy.preInit(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
