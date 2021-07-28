package com.thepunkoff.welcome;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.ChatColor;

public final class Welcome extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Welcome plugin enabled.");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("Welcome plugin disabled.");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String admin = event.getPlayer().isOp() ? "" + ChatColor.RESET + ChatColor.ITALIC + ChatColor.GOLD + "You are an admin on this server." : "";
        event.getPlayer().sendMessage(String.format("Welcome to Krapnek-Online! %s", admin));
    }
}