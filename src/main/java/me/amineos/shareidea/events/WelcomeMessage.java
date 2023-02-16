package me.amineos.shareidea.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class WelcomeMessage implements Listener {

    private JavaPlugin plugin;

    public WelcomeMessage(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage("Welcome to the server, " + event.getPlayer().getName() + "!");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage("Goodbye, " + event.getPlayer().getName() + "!");
    }
}