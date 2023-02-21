package com.playerapi;

import com.playerapi.Player.PlayerManager;
import org.bukkit.entity.Player;

public final class PlayerApi {
    public static void main(String[] args) {
        new PlayerApi().test(null);
        new PlayerApi().testPlayer(null);
    }

    public String test(String test) {
        if (test != null) {
            return "Hello " + test;
        }
        return null;
    }

    public String testPlayer(Player player) {
        if (player != null) {
            String nick = player.getName();
            player.sendMessage("A principio supimpa.");
            return "Ok" + nick;
        }
        return null;
    }

    public String playerEntry(Player player){
        PlayerManager playerManager = new PlayerManager();
        playerManager.PlayerEntry(player);
        return "OK" + player.getName();
    }
}

