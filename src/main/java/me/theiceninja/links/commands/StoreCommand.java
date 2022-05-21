package me.theiceninja.links.commands;

import me.theiceninja.links.Links;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StoreCommand implements CommandExecutor {
      Links plugin;
      public StoreCommand(Links plugin){
          this.plugin = plugin;
      }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;
            String store = plugin.getConfig().getString("links.store");
            p.sendMessage(ColorsUtils.translateColorCodes(store));

        }else{
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cYou cant do that command so login the server and do that command please."));
        }
        return true;
    }
}

