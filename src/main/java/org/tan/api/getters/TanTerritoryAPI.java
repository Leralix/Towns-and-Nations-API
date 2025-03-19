package org.tan.api.getters;

import org.tan.api.interfaces.TanRegion;
import org.tan.api.interfaces.TanTown;

public interface TanTerritoryAPI {

    TanTown getTown(String townName);
    TanRegion getRegion(String regionName);


}
