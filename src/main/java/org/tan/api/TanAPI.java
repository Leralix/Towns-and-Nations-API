package org.tan.api;


import org.leralix.lib.data.PluginVersion;
import org.tan.api.getters.TanPlayerManager;
import org.tan.api.getters.TanTerritoryManager;

public abstract class TanAPI {
    private static TanAPI instance;

    protected TanAPI() {
        if (instance != null) {
            throw new IllegalStateException("TanAPI instance already exist !");
        }
        instance = this;
    }

    public static TanAPI getInstance() {
        if (instance == null) {
            throw new IllegalStateException("TanAPI is not yet initialised !");
        }
        return instance;
    }

    public abstract TanPlayerManager getPlayerManager();
    public abstract TanTerritoryManager getTownManager();
    public abstract PluginVersion getPluginVersion();
    public abstract PluginVersion getMinimumSupportingMapPlugin();

}