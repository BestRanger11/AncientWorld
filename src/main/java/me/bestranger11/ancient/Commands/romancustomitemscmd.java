package me.bestranger11.ancient.Commands;

import me.bestranger11.ancient.Food.Pasta.Pasta;
import me.bestranger11.ancient.Food.Pasta.RawPasta;
import me.bestranger11.ancient.Weapons.RomanWeapons.EagleStaff.EagleStaff;
import me.bestranger11.ancient.Weapons.RomanWeapons.EmperorsScythe.EmperorScythe;
import me.bestranger11.ancient.Weapons.RomanWeapons.MagicianSword.MagicSword;
import me.bestranger11.ancient.Weapons.RomanWeapons.Shield.ChanceShield;
import me.bestranger11.ancient.Weapons.RomanWeapons.Spear.RomanSpear;
import me.bestranger11.ancient.Weapons.RomanWeapons.WeakSword.WeakSword;
import me.bestranger11.ancient.Weapons.RomanWeapons.merchantShopItem.MerchantPlace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class romancustomitemscmd implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("customroman")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("Only players can do this");
                return true;
            }
            Player player = (Player) sender;
            Inventory inv = player.getInventory();
            if (args.length == 0) {
                inv.addItem(EmperorScythe.EmperorScythe); inv.addItem(ChanceShield.RomanShield);inv.addItem(MagicSword.MagicSword);inv.addItem(EagleStaff.EagleStaff);inv.addItem(Pasta.Pasta);
                return true;

            }
            if (args.length >= 1) {
                if (args[0].equalsIgnoreCase("Spear")) {
                    inv.addItem(RomanSpear.RomanSpear);
                    return true;
                }

                if (args[0].equalsIgnoreCase("EmperorsScythe")) {
                    inv.addItem(EmperorScythe.EmperorScythe);
                    return true;
                }

                if (args[0].equalsIgnoreCase("Shield")) {
                    inv.addItem(ChanceShield.RomanShield);
                    return true;
                }
                if (args[0].equalsIgnoreCase("MerchantItem")) {
                    inv.addItem(MerchantPlace.MerchantItem);
                    return true;
                }
                if (args[0].equalsIgnoreCase("MagicSword")) {
                    inv.addItem(MagicSword.MagicSword);
                    return true;
                }

                if (args[0].equalsIgnoreCase("Pasta")) {
                    inv.addItem(Pasta.Pasta);
                    return true;
                }
                if (args[0].equalsIgnoreCase("RawPasta")) {
                    inv.addItem(RawPasta.RawPasta);
                    return true;
                }
                if (args[0].equalsIgnoreCase("WeakSword")) {
                    inv.addItem(WeakSword.WeakSword);
                    return true;
                }
                if (args[0].equalsIgnoreCase("EagleStaff")) {
                    inv.addItem(EagleStaff.EagleStaff);
                    return true;
                }

            }
        }
        return false;
    }
}









