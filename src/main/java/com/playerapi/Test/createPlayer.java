package com.playerapi.Test;

import com.playerapi.Model.Adventurer;
import com.playerapi.Model.AdventurerAttributes;

import java.time.Instant;

public class createPlayer {
    public static Adventurer newPlayer(String uuid, String nick, String displayName){
        Adventurer adventurer = new Adventurer();
        adventurer.setUuid(uuid);
        adventurer.setNick(nick);
        adventurer.setDisplay_nick(displayName);
        adventurer.setEmail("teste@teste.com");
        adventurer.setPermission("Player");
        adventurer.setCreate_time(Instant.now().toString());
        adventurer.setAdventurerAttributes(AdventurerAttributes.basicAdventurer);
        return adventurer;
    }
}
