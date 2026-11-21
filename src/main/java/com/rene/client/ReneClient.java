package com.rene.client;

import net.fabricmc.api.ClientModInitializer;

public class ReneClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("RENE CLIENT loaded!");
    }
}
