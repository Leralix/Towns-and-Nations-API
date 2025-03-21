package org.tan.api.interfaces;

import org.leralix.lib.position.Vector3D;

public interface TanProperty {

    String getName();
    Vector3D getFirstCorner();
    Vector3D getSecondCorner();
    TanPlayer getOwner();
    boolean isForSale();
    boolean isForRent();
    boolean isRented();
    TanPlayer getRenter();
    double getRentPrice();
    double getSalePrice();
}
