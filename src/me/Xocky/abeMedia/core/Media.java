package me.Xocky.abeMedia.core;

import me.Xocky.abeMedia.core.cmds.CommandManager;
import me.Xocky.abeMedia.core.cmds.cmd.ICommand;
import me.Xocky.abeMedia.core.configs.ConfigManager;
import me.Xocky.abeMedia.core.media.MediaManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Media extends JavaPlugin {
    public static final String PLUGIN_FOLDER = "abeMedia";
    public static CommandManager cc;
    public static ConfigManager cm;
    public static MediaManager mm;
    public void onEnable() {
        cc = new CommandManager(this);
        cm = new ConfigManager(this);
        mm = new MediaManager(this);
        cm.initialize();
        mm.initialize();
    }
    @Override
    public boolean onCommand(CommandSender s, Command command, String label, String[] args) {
        Player p = (Player) s;
        ICommand cmd = cc.getCommand(command.getName().toLowerCase());
        if (cmd != null) {
            if (!p.getPlayer().hasPermission(cmd.getPermission())) {
                p.sendMessage(ChatColor.RED + "Insufficient permission to execute this command");
                return true;
            }
            cmd.run(p, args);
        }
        return true;
    }
    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] args) {
        List<String> suggestions = new ArrayList<>();
        List<String> completions = new ArrayList<>();
        cc.getCommands().forEach(cmd -> {
            completions.add(cmd.getName());
        });
        StringUtil.copyPartialMatches(args[0], completions, suggestions);
        Collections.sort(suggestions);
        return suggestions;
    }
}
