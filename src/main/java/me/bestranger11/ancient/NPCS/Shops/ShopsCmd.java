package me.bestranger11.ancient.NPCS.Shops;

import me.bestranger11.ancient.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ShopsCmd implements CommandExecutor {

    private final Main main;
    public ShopsCmd(Main main) { this.main = main; }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("soldier_shop")) {
            if (!(sender instanceof Player)) {
                return true;
            }
            Player player = (Player) sender;
            Shops.createSoldierShop(player);



        }
      return false;
    }
}
