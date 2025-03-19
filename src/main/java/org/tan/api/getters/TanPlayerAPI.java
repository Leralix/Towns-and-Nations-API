package org.tan.api.getters;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.tan.api.interfaces.TanPlayer;

import java.util.UUID;

public interface TanPlayerAPI {

    TanPlayer getPlayer(String playerName);
    TanPlayer getPlayer(UUID playerUUID);
    TanPlayer getPlayer(Player player);
    TanPlayer getPlayer(OfflinePlayer offlinePlayer);
}
