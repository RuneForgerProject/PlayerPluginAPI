package com.playerapi.Player;
import com.playerapi.Model.Adventurer;
import com.playerapi.Test.createPlayer;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import org.bukkit.event.Listener;

public class PlayerManager implements Listener {
    public void PlayerEntry(Player player) {

        //Verificação pra pegar os dados do player.
        Adventurer adventurer = createPlayer.newPlayer(player.getUniqueId().toString(), player.getName(), player.getDisplayName());

        System.out.println(adventurer.getUuid());
        System.out.println(player.getUniqueId());
        if(adventurer.getUuid().toString().replaceAll("\\s+","").equals(player.getUniqueId().toString().replaceAll("\\s+",""))){
            //Cria pasta e aqruivo json
            /*String path = new Playerfile().createFolder(player.getUniqueId().toString());
            System.out.println("criando Json");
            new Playerfile().createJsonAdventurer(adventurer);
            */
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lLogado com sucesso."));
        }
        else{
            player.kickPlayer("Player não bate com uuid informado.");
        }
    }

    public void PlayerExit(Player player) {

    }

    public void getPlayerDataByNick(Player player){

    }

    public void teste(Player player){
        player.sendMessage("Funcionando!");
        System.out.println("Funcionando!1");
    }
}
