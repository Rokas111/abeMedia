package me.Xocky.abeMedia.core.configs;

public abstract interface IConfig {
    public abstract String getConfig();
    public abstract void setupKeys();
    public abstract void save();
}
