package me.Xocky.abeMedia.core.media.config;

import me.Xocky.abeMedia.core.configs.Config;

import java.util.Arrays;
import java.util.List;

public class MediaConfig extends Config {
    public MediaConfig() {
        super("media");
        if (!setup()) {
            setupKeys();
        }
    }

    public void setupKeys() {
        getYaml().set("forums", Arrays.asList("&a(!) &8Be sure to visit our Forums:", "&a- "));
        getYaml().set("store", Arrays.asList("&a(!) &8Be sure to visit our Store:", "&a- "));
        getYaml().set("discord", Arrays.asList("&a(!) &8Be sure to join our Discord:", "&a- https://discord.gg/abe"));
        save();
    }
    public List<String> getDiscord() {
        return getYaml().contains("discord")?getYaml().getStringList("discord"):null;
    }
    public List<String> getStore() {
        return getYaml().contains("store")?getYaml().getStringList("store"):null;
    }
    public List<String> getForums() {
        return getYaml().contains("forums")?getYaml().getStringList("forums"):null;
    }
}
