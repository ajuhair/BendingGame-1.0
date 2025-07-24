package me.bikram.bendinggame;

import org.bukkit.plugin.java.JavaPlugin;

public class BendingGame extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("BendingGame enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("BendingGame disabled.");
    }
}
