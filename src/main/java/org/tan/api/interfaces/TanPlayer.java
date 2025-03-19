package org.tan.api.interfaces;

import java.util.Collection;

public interface TanPlayer {

    String getNameStored();
    void setNameStored(String name);
    String getUUID();

    boolean hasTown();
    TanTown getTown();
    void setTown(TanTown town);

    boolean hasRegion();
    TanRegion getRegion();

    Collection<TanProperty> getPropertiesOwned();
    Collection<TanProperty> getPropertiesRented();
    Collection<TanProperty> getPropertiesForSale();
}
