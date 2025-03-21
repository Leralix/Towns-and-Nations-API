package org.tan.api.getters;

import org.bukkit.block.Block;

public interface TanAuthorisationAPI {

    boolean isBlockClaimed(Block block);
    TanTerritoryManager getTerritoryOfBlock(Block block);

}
