package me.theiceninja.links;
import me.theiceninja.links.TabCompleter.ReloadTabComplete;
import me.theiceninja.links.commands.*;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Links extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.of("#0CF3A6") + "plugin is enabled");
        getCommand("discord").setExecutor(new DiscordCommand(this));
        getCommand("youtube").setExecutor(new YoutubeCommand(this));
        getCommand("namemc").setExecutor(new NameMcCommand(this));
        getCommand("store").setExecutor(new StoreCommand(this));
        getCommand("links").setExecutor(new ReloadCommand(this));
        getCommand("links").setTabCompleter(new ReloadTabComplete());
        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage(ChatColor.of("#F32F0C") + "plugin is disabled");
    }
}
