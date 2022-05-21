package me.theiceninja.links.TabCompleter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ReloadTabComplete implements TabCompleter {
    List <String> arguments = new ArrayList<String>();
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (arguments.isEmpty()) {
            arguments.add("reload");
        }
        List<String> result = new ArrayList<String>();
        if (args.length == 1){
            for (String a : arguments){
                if (a.toLowerCase(Locale.ROOT).startsWith(args[0].toLowerCase(Locale.ROOT)))
                    result.add(a);
            }
            return result;
        }
        return null;
    }
}
