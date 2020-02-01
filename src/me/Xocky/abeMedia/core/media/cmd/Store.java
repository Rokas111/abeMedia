package me.Xocky.abeMedia.core.media.cmd;

import me.Xocky.abeMedia.core.Media;
import me.Xocky.abeMedia.core.cmds.cmd.Command;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Store extends Command {
    public Store() {
        super("abeMedia.store", "store");
    }

    @Override
    public void run(Player p, String[] args) {
        if (Media.mm.getMediaConfig().getStore() != null) {
            Media.mm.getMediaConfig().getStore().forEach(line ->  p.sendMessage(ChatColor.translateAlternateColorCodes('&',line)));
        }
    }
}
