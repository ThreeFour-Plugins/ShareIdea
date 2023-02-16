package me.amineos.shareidea;


import me.amineos.shareidea.commands.HelpCommand;
import me.amineos.shareidea.commands.example;
import me.amineos.shareidea.commands.reload;
import me.amineos.shareidea.events.WelcomeMessage;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class ShareIdea extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("ShareIdea has been enabled!");
        this.getCommand("example").setExecutor(new example());
        String welcomeMessage = this.getConfig().getString("welcome-message");
        List<String> bannedWords = this.getConfig().getStringList("banned-words");
        int banDuration = this.getConfig().getInt("ban-duration");
        this.getCommand("reload").setExecutor(new reload(this));
        getServer().getPluginManager().registerEvents(new WelcomeMessage(this),this);
        getCommand("help").setExecutor(new HelpCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("ShareIdea has been disabled.");
    }
}