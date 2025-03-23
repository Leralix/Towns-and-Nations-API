package org.tan.api;


import org.leralix.lib.data.PluginVersion;
import org.tan.api.getters.TanClaimManager;
import org.tan.api.getters.TanLandmarkManager;
import org.tan.api.getters.TanPlayerManager;
import org.tan.api.getters.TanTerritoryManager;

public abstract class TanAPI {
    private static TanAPI instance;

    protected TanAPI() {

    }

    public static void register(TanAPI api) {
        if (instance != null) {
            throw new IllegalStateException("TanAPI is already initialised !");
        }
        instance = api;
    }


    public static TanAPI getInstance() {
        if (instance == null) {
            throw new IllegalStateException("TanAPI is not yet initialised !");
        }
        return instance;
    }


    public abstract TanPlayerManager getPlayerManager();
    public abstract TanTerritoryManager getTerritoryManager();
    public abstract TanClaimManager getClaimManager();
    public abstract TanLandmarkManager getLandmarkManager();


    public abstract PluginVersion getPluginVersion();
    public abstract PluginVersion getMinimumSupportingMapPlugin();

}