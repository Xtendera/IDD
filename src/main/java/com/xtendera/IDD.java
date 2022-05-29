package com.xtendera;

import com.xtendera.handlers.MuleDamageHandler;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class IDD extends JavaPlugin {

    FileConfiguration config = getConfig();
    @Override
    public void onEnable() {
        // Plugin startup logic
        if (config.getInt("dupeMultiplier") > 1) {
            new MuleDamageHandler(this);
            Bukkit.getLogger().info("Loaded IDD dupe plugin.");
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public FileConfiguration getConfigFile() {
        return config;
    }
}
