package org.tan.api.getters;

import org.bukkit.block.Block;
import org.tan.api.interfaces.TanTerritory;

import java.util.Optional;

public interface TanClaimManager {

    /**
     * Check if a block is claimed by a territory or a landmark.
     * @param block The block to check.
     * @return True if the block is claimed, false otherwise.
     */
    boolean isBlockClaimed(Block block);

    /**
     * Get the territory own a block.
     * <br>
     * If the block is claimed by a landmark, the territory owning the landmark will be returned.
     * @param block The block to check.
     * @return The territory owning the block, or empty if the block is not claimed.
     */
    Optional<TanTerritory> getTerritoryOfBlock(Block block);

}
