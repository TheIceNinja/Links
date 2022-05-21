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
        Bukkit.getConsoleSender().sendMessage(ColorUtils.translateColorCodes("&#CE0EF9Links &8» &#0CF37Cenabled"));
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
        Bukkit.getConsoleSender().sendMessage(ColorUtils.translateColorCodes("&#CE0EF9Links &8» &#E85923disabled"));
    }
}
