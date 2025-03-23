package org.tan.api.interfaces;

import java.util.Collection;

public interface TanTown extends TanTerritory {

    /**
     * @return the level of the town
     */
    int getLevel();
    /**
     * @return a {@link Collection} of {@link TanProperty} in the town
     */
    Collection<TanProperty> getProperties();

    /**
     * @return a {@link Collection} of {@link TanLandmark} owned by the town
     */
    Collection<TanLandmark> getLandmarksOwned();


}
