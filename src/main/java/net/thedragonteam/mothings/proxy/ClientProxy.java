package net.thedragonteam.mothings.proxy;

import net.thedragonteam.mothings.MoThings;
import net.thedragonteam.mothings.registry.ModBlocks;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerRenderers(MoThings ins) {
        ModBlocks.registerRenders();
    }
}
