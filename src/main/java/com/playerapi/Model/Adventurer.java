package com.playerapi.Model;

import java.util.Date;

public class Adventurer {
    private String uuid;
    private String nick;
    private String display_nick;
    private String email;
    private String permission;
    private String create_time;
    private AdventurerAttributes adventurerAttributes;
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getDisplay_nick() {
        return display_nick;
    }

    public void setDisplay_nick(String display_nick) {
        this.display_nick = display_nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public AdventurerAttributes getAdventurerAttributes() {
        return adventurerAttributes;
    }

    public void setAdventurerAttributes(AdventurerAttributes adventurerAttributes) {
        this.adventurerAttributes = adventurerAttributes;
    }
}
