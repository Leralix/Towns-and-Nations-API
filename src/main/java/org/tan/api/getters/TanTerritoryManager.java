package org.tan.api.getters;

import org.tan.api.interfaces.TanRegion;
import org.tan.api.interfaces.TanTerritory;
import org.tan.api.interfaces.TanTown;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface TanTerritoryManager {

    /**
     * Get a town by its UUID
     * @param townUUID the UUID of the town
     * @return The town if it exists. {@link Optional#empty()} otherwise
     */
    Optional<TanTown> getTown(UUID townUUID);

    /**
     * Get a town by its name
     * <br>
     * It is recommended to use the UUID instead of the name because
     * names duplicate can happen if the option is enabled in the configuration
     * @param townName the name of the town
     * @return The town if it exists. {@link Optional#empty()} otherwise
     */
    Optional<TanTown> getTown(String townName);

    /**
     * Get all the towns
     * @return a {@link Collection} of all the towns
     */
    Collection<TanTown> getTowns();

    /**
     * Get a region by its UUID
     * @param regionUUID the UUID of the region
     * @return The region if it exists. {@link Optional#empty()} otherwise
     */
    Optional<TanRegion> getRegion(UUID regionUUID);

    /**
     * Get a region by its name
     * <br>
     * It is recommended to use the UUID instead of the name because
     * names duplicate can happen if the option is enabled in the configuration
     * @param regionName the name of the region
     * @return  The region if it exists. {@link Optional#empty()} otherwise
     */
    Optional<TanRegion> getRegion(String regionName);

    /**
     * Get all the regions
     * @return a {@link Collection} of all the regions
     */
    Collection<TanRegion> getRegions();

}
