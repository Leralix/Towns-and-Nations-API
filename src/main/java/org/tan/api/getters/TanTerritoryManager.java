package org.tan.api.getters;

import org.tan.api.interfaces.TanRegion;
import org.tan.api.interfaces.TanTown;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface TanTerritoryManager {

    /**
     * Get a town by its ID
     * @param townID the ID of the town
     * @return The town if it exists. {@link Optional#empty()} otherwise
     */
    Optional<TanTown> getTown(String townID);

    /**
     * Get a town by its name
     * <br>
     * It is recommended to use the UUID instead of the name because
     * names duplicate can happen if the option is enabled in the configuration
     * @param townName the name of the town
     * @return The town if it exists. {@link Optional#empty()} otherwise
     */
    Optional<TanTown> getTownByName(String townName);

    /**
     * Get all the towns
     * @return a {@link Collection} of all the towns
     */
    Collection<TanTown> getTowns();

    /**
     * Get a region by its ID
     * @param regionID the ID of the region
     * @return The region if it exists. {@link Optional#empty()} otherwise
     */
    Optional<TanRegion> getRegion(String regionID);

    /**
     * Get a region by its name
     * <br>
     * It is recommended to use the UUID instead of the name because
     * names duplicate can happen if the option is enabled in the configuration
     * @param regionName the name of the region
     * @return  The region if it exists. {@link Optional#empty()} otherwise
     */
    Optional<TanRegion> getRegionByName(String regionName);

    /**
     * Get all the regions
     * @return a {@link Collection} of all the regions
     */
    Collection<TanRegion> getRegions();

}
