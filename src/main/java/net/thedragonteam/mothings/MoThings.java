package net.thedragonteam.mothings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thedragonteam.core.TheDragonCore;
import net.thedragonteam.core.util.LogHelper;
import net.thedragonteam.mothings.client.gui.MTTab;
import net.thedragonteam.mothings.proxy.CommonProxy;

import net.thedragonteam.mothings.registry.ModBlocks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = MoThings.MODID, version = MoThings.VERSION, dependencies = MoThings.DEPEND, name = MoThings.MODNAME)
public class MoThings {
	public static final String MODID = "mothings";
	public static final String MODNAME = "Mo' Things";
	public static final String DEPEND = "required-after:thedragoncore@[" + TheDragonCore.VERSION + ",);";
	public static final String VERSION = "1.0.0";
	public static final String CLIENTPROXY = "net.thedragonteam.mothings.proxy.ClientProxy";
	public static final String COMMONPROXY = "net.thedragonteam.mothings.proxy.CommonProxy";

	@SidedProxy(clientSide = MoThings.CLIENTPROXY, serverSide = MoThings.COMMONPROXY)
	public static CommonProxy proxy;

	public static CreativeTabs TAB_MO_THINGS = new MTTab(CreativeTabs.getNextID(), MoThings.MODID, "things", 0);

	public static Logger logger = LogManager.getLogger(MoThings.MODNAME);

	@Mod.Instance(MoThings.MODID)
	public static MoThings instance;

	public MoThings() {
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
