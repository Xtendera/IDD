package com.xtendera.handlers;

import com.xtendera.IDD;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Mule;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class MuleDamageHandler implements Listener {
    IDD IDDInstance;
    public MuleDamageHandler(IDD plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
        IDDInstance = plugin;
    }

    @EventHandler
    public void MuleDamage(EntityDeathEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity instanceof Mule && entity.isInvisible()) {
            List<ItemStack> itemDrops = event.getDrops();
            for (ItemStack item : itemDrops) {
                for (int i = 1; i < IDDInstance.getConfig().getInt("dupeMultiplier"); i++) {
                    ItemStack clonedItem = item.clone();
                    World entityWorld = entity.getWorld();
                    entityWorld.dropItem(entity.getLocation(), clonedItem);
                }
            }
        }
    }
}
