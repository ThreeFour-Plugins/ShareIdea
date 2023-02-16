package me.amineos.shareidea.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class reload implements CommandExecutor {

    private JavaPlugin plugin;

    public reload(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // Reload the configuration file
        plugin.reloadConfig();
        sender.sendMessage("Config reloaded!");
        return true;
    }
}