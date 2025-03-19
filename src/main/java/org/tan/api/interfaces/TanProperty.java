package org.tan.api.interfaces;

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
