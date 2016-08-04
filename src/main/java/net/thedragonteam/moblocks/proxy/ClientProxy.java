package net.thedragonteam.moblocks.proxy;

import net.thedragonteam.moblocks.MoBlocks;
import net.thedragonteam.moblocks.registry.ModBlocks;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderers(MoBlocks ins) {
        ModBlocks.registerRenders();
    }
}
