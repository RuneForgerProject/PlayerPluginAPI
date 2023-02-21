package com.playerapi.Util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bukkit.plugin.Plugin;
import com.playerapi.Model.Adventurer;

public class Playerfile {
    //Plugin plugin = RuneForger.getPlugin(RuneForger.class);

    public void create(String uuid, String fileName) {
    }

    public String createFolder(String UUID, Plugin plugin) {
        File folder = new File(plugin.getDataFolder() + File.separator + "Players", UUID);
        if (!folder.exists()) {
            try {
                folder.mkdirs();
                return folder.getAbsolutePath();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return null;
            }
        }
        else{
            System.out.println("Já existe");
            return folder.getAbsolutePath();
        }
    }
    public void createJsonAdventurer(Adventurer adventurer, Plugin plugin){
        String path;
        File folder = new File(plugin.getDataFolder() + File.separator + "Players", adventurer.getUuid());
        if (!folder.exists()) {
            try {
                folder.mkdirs();
                path = folder.getAbsolutePath();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                path = null;
            }
        }
        else{
            System.out.println("Já existe");
            path = folder.getAbsolutePath();
        }

        System.out.println(path);
        ObjectMapper mapper = new ObjectMapper();

        try{
            //ERRO LOGO ABAIXO
            String json = mapper.writeValueAsString(adventurer);
            FileWriter file = new FileWriter(path + "\\playerData.json");
            file.write(json);

            file.close();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readJsonAdventurer(){

    }
}
