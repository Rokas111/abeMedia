package me.Xocky.abeMedia.core.cmds.cmd;

public abstract class Command implements ICommand {
    private String name;
    private String permission;
    public Command(String permission, String name) {
        this.name = name;
        this.permission = permission;
    }
    public String getName() {
        return this.name;
    }
    public String getPermission() {
        return this.permission;
    }

}
