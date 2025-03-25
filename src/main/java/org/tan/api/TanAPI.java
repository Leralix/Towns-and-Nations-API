package org.tan.api;


import org.leralix.lib.data.PluginVersion;
import org.tan.api.getters.TanClaimManager;
import org.tan.api.getters.TanLandmarkManager;
import org.tan.api.getters.TanPlayerManager;
import org.tan.api.getters.TanTerritoryManager;

public abstract class TanAPI {

    /**
     * The TanAPI singleton instance.
     */
    private static TanAPI instance;

    protected TanAPI() {

    }

    /**
     * Register the TanAPI instance
     * This method should never be called outside the TanAPI implementation
      * @param api the TanAPI instance
     */
    public static void register(TanAPI api) {
        if (instance != null) {
            throw new IllegalStateException("TanAPI is already initialised !");
        }
        instance = api;
    }

    /**
     * TanAPI entry point
     * @return the TanAPI instance
     */

    public static TanAPI getInstance() {
        if (instance == null) {
            throw new IllegalStateException("TanAPI is not yet initialised !");
        }
        return instance;
    }

    /**
     * @return the player manager, responsible for player access
     */
    public abstract TanPlayerManager getPlayerManager();

    /**
     * @return the territory manager, responsible for territory access
     */
    public abstract TanTerritoryManager getTerritoryManager();

    /**
     * @return the claim manager, responsible for information about claims
     */
    public abstract TanClaimManager getClaimManager();

    /**
     * @return the landmark manager, responsible for landmark access
     */
    public abstract TanLandmarkManager getLandmarkManager();

    /**
     * @return Get the plugin version
     */
    public abstract PluginVersion getPluginVersion();

    /**
     * Get the minimum supporting map plugin version, used for ensuring compatibility with the map plugin
     * @return the minimum supporting map plugin version
     */
    public abstract PluginVersion getMinimumSupportingMapPlugin();

}