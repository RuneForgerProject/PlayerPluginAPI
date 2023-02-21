package com.playerapi;

import com.playerapi.Player.PlayerManager;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public final class PlayerApi {
    public static void main(String[] args) {

    }

    public String playerEntry(Player player, Plugin plugin){
        PlayerManager playerManager = new PlayerManager();
        playerManager.PlayerEntry(player, plugin);
        return "OK" + player.getName();
    }
}

