package net.thedragonteam.mothings.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thedragonteam.core.util.LogHelper;
import net.thedragonteam.mothings.MoThings;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		LogHelper.info("Finished PreInitialization");
	}

	public void init(FMLInitializationEvent event) {
//		MTTab.initialize();

		LogHelper.info("Finished Initialization");
	}

	public void postInit(FMLPostInitializationEvent event) {
		LogHelper.info("Finished PostInitialization");
	}

	public void registerRenderers(MoThings ins) {
	}
}