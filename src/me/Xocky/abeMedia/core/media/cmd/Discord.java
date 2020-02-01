package me.Xocky.abeMedia.core.media.cmd;

import me.Xocky.abeMedia.core.Media;
import me.Xocky.abeMedia.core.cmds.cmd.Command;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Discord extends Command {
    public Discord() {
        super("abeMedia.discord", "discord");
    }

    @Override
    public void run(Player p, String[] args) {
        if (Media.mm.getMediaConfig().getDiscord() != null) {
            Media.mm.getMediaConfig().getDiscord().forEach(line ->  p.sendMessage(ChatColor.translateAlternateColorCodes('&',line)));
        }
    }
}
