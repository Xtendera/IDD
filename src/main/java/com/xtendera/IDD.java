package com.xtendera;

import com.xtendera.handlers.MuleDamageHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class IDD extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        if (getConfig().getInt("dupeMultiplier") > 1) {
            getConfig().options().copyDefaults(true);
            saveDefaultConfig();
            new MuleDamageHandler(this);
            Bukkit.getLogger().info("Loaded IDD dupe plugin.");
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
