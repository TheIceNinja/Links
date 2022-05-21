package me.theiceninja.links.commands;

import me.theiceninja.links.Links;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReloadCommand implements CommandExecutor {
    Links plugin;
    public ReloadCommand(Links plugin){
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;
            if (p.hasPermission("links.reload")){
                if (args.length == 0){
                    p.sendMessage(ChatColor.RED + "Usage: /links (reload)");
                    return true;
                }
                if (p.hasPermission("links.reload")){
                    if (args.length >= 1){
                        if (args[0].equalsIgnoreCase("reload")){
                            plugin.reloadConfig();
                            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6הפלאגין רונדר."));
                            return true;

                }else{
                            p.sendMessage(ChatColor.RED + "You dont have the perms to that command.");
                        }
                    }
                }

            }else{
            p.sendMessage(ChatColor.RED + "You dont have the perms to that command.");
            }
        }else{
            sender.sendMessage(ChatColor.RED + "You cant do that command from concole.");
        }
        return true;
    }
}










