package com.playerapi.Util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.bukkit.plugin.Plugin;
import com.playerapi.Model.Adventurer;

public class Playerfile {
    public void create(String uuid, String fileName) {
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

    public Adventurer returnAdventurer(String uuid, Plugin plugin){
        String path;
        File folder = new File(plugin.getDataFolder() + File.separator + "Players", uuid);

        if (folder.exists()) {
            System.out.println("Encontrado caminho");
            path = folder.getAbsolutePath();
        }
        else{
            return null;
        }

        ObjectMapper mapper = new ObjectMapper();
        InputStream is = Adventurer.class.getResourceAsStream(path + "\\playerData.json");
        try {
            Adventurer adventurer = mapper.readValue(is, Adventurer.class);
            return adventurer;
        } catch (IOException e) {
            return null;
        }
    }
}
