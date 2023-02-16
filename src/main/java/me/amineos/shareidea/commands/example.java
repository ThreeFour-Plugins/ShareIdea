package me.amineos.shareidea.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class example implements CommandExecutor {
        @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            // This method is called when the "example" command is executed
            if (sender instanceof Player) {
                sender.sendMessage("Hello, World!");
            } else {
                sender.sendMessage("This command is only for players!");
            }
            return true;
        }
    }
