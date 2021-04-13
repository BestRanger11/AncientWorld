package me.bestranger11.ancient.Commands;

import me.bestranger11.ancient.Armor.EmperorsArmor.EmperorBoots;
import me.bestranger11.ancient.Armor.EmperorsArmor.EmperorCP;
import me.bestranger11.ancient.Armor.EmperorsArmor.EmperorHelm;
import me.bestranger11.ancient.Armor.EmperorsArmor.EmperorLegs;
import me.bestranger11.ancient.Armor.Magician.MagicianBoots;
import me.bestranger11.ancient.Armor.Magician.MagicianCP;
import me.bestranger11.ancient.Armor.Magician.MagicianHelm;
import me.bestranger11.ancient.Armor.Magician.MagicianLegs;
import me.bestranger11.ancient.Armor.RomanArmor.RomanBoots;
import me.bestranger11.ancient.Armor.RomanArmor.RomanCP;
import me.bestranger11.ancient.Armor.RomanArmor.RomanHat;
import me.bestranger11.ancient.Armor.RomanArmor.RomanLegs;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class romanarmorsoldier implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("romanarmor")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("Only players can do this");
                return true;
            }
            Player player = (Player) sender;
            Inventory inv = player.getInventory();
            if (args.length == 0) {
                player.sendMessage("usage {MagicArmor/EmperorsArmor/RomanArmor}");
                return true;

            }
            if (args.length >= 1) {
                if (args[0].equalsIgnoreCase("RomanArmor")) {
                    inv.addItem(RomanCP.RomanChestpiece);
                    inv.addItem(RomanHat.RomanHat);
                    inv.addItem(RomanBoots.RomanBoots);
                    inv.addItem(RomanLegs.RomanLegs);
                    return true;
                }
                if (args[0].equalsIgnoreCase("EmperorsArmor")) {
                    inv.addItem(EmperorHelm.EmperorsHelm);
                    inv.addItem(EmperorLegs.EmperorLegs);
                    inv.addItem(EmperorCP.EmperorsCP);
                    inv.addItem(EmperorBoots.EmperorsBoots);
                    return true;
                }

                if (args[0].equalsIgnoreCase("MagicArmor")) {
                    inv.addItem(MagicianCP.MagicianCP);
                    inv.addItem(MagicianHelm.MagiciansHelm);
                    inv.addItem(MagicianLegs.MagicianLegs);
                    inv.addItem(MagicianBoots.MagiciansBoots);
                    return true;
                }


            }
        }
        return false;
    }
}

