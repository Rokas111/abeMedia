package me.Xocky.abeMedia.core.cmds;

import me.Xocky.abeMedia.core.cmds.cmd.ICommand;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommandManager {
    private List<ICommand> commands;
    private Plugin pl;
    public CommandManager(Plugin plugin) {
        this.pl = plugin;
        commands = new ArrayList<>();
    }
    public ICommand getCommand(String command) {
        return !commands.stream().filter(cmd -> cmd.getName().equals(command)).collect(Collectors.toList()).isEmpty()?commands.stream().filter(cmd -> cmd.getName().equals(command)).collect(Collectors.toList()).get(0):null;
    }
    public List<ICommand> getCommands() {
        return this.commands;
    }
    public void registerCommand(ICommand cmd) {
        commands.add(cmd);
    }
}
