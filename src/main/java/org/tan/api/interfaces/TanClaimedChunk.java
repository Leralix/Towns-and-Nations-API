package org.tan.api.interfaces;

import java.util.UUID;

public interface TanClaimedChunk {

    boolean equals(Object o);
    boolean getOwnerID();
    int getX();
    int getZ();
    UUID getWorldUUID();

    void unclaim();
    void claim(TanTerritory territory);
    void isClaimed();

    boolean canBeGriefByExplosion();
    boolean canBeGriefByFire();
    boolean canPvpHappen();

}
