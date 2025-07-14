package org.nonolbc1.opb;

import net.fabricmc.api.ModInitializer;

public class Opb implements ModInitializer {

    @Override
    public void onInitialize() {
        ModCreativeTab.registerTabs();
    }
}
