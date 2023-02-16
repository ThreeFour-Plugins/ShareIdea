package me.amineos.shareidea.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Map;

public class HelpCommand implements CommandExecutor {
    private final JavaPlugin plugin;

    public HelpCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("help")) {
            // Get a list of all registered commands from the plugin.yml file
            Map<String, Map<String, Object>> commands = plugin.getDescription().getCommands();
            sender.sendMessage(ChatColor.YELLOW + "Commands:");
            for (Map.Entry<String, Map<String, Object>> entry : commands.entrySet()) {
                String name = entry.getKey();
                Map<String, Object> properties = entry.getValue();
                String description = (String) properties.get("description");
                String usage = (String) properties.get("usage");
                sender.sendMessage(ChatColor.GREEN + "/" + name + " " + ChatColor.WHITE + usage + " - " + description);
            }
            return true;
        }
        return false;
    }
}