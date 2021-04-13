package me.bestranger11.ancient.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class armorcompleter implements TabCompleter {
    List<String> items = new ArrayList<String>();

    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] args) {
        if (items.isEmpty()) {
            items.add("MagicArmor");items.add("EmperorsArmor");items.add("RomanArmor");

        }
        List<String> result = new ArrayList<String>();
        if (args.length == 1) {
            for (String a : items) {
                if (a.toLowerCase().startsWith(args[0].toLowerCase()))
                    result.add(a);


            }
            return result;
        }
        return null;
    }
}


