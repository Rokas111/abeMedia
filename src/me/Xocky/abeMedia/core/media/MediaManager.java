package me.Xocky.abeMedia.core.media;

import me.Xocky.abeMedia.core.Media;
import me.Xocky.abeMedia.core.media.cmd.Discord;
import me.Xocky.abeMedia.core.media.cmd.Forums;
import me.Xocky.abeMedia.core.media.cmd.Store;
import me.Xocky.abeMedia.core.media.config.MediaConfig;
import org.bukkit.plugin.Plugin;

public class MediaManager {
    private Plugin pl;
    private MediaConfig mc;
    public MediaManager(Plugin pl) {
        this.pl = pl;
    }
    public void initialize() {
        registerConfigs();
        registerCommands();
    }
    private void registerConfigs() {
        Media.cm.registerConfig(new MediaConfig());
        mc = (MediaConfig) Media.cm.getYaml("media");
    }
    public MediaConfig getMediaConfig() {
        return this.mc;
    }
    private void registerCommands() {
        Media.cc.registerCommand(new Discord());
        Media.cc.registerCommand(new Forums());
        Media.cc.registerCommand(new Store());
    }
}
