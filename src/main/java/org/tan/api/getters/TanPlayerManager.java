package org.tan.api.getters;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.tan.api.interfaces.TanPlayer;

import java.util.UUID;

public interface TanPlayerManager {

    TanPlayer get(String playerName);
    TanPlayer get(UUID playerUUID);
    TanPlayer get(Player player);
    TanPlayer get(OfflinePlayer offlinePlayer);
}
