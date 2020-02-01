package me.Xocky.abeMedia.core.media.cmd;

import me.Xocky.abeMedia.core.Media;
import me.Xocky.abeMedia.core.cmds.cmd.Command;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Forums extends Command {
    public Forums() {
        super("abeMedia.forums", "forums");
    }

    @Override
    public void run(Player p, String[] args) {
        if (Media.mm.getMediaConfig().getForums() != null) {
            Media.mm.getMediaConfig().getForums().forEach(line ->  p.sendMessage(ChatColor.translateAlternateColorCodes('&',line)));
        }
    }
}
