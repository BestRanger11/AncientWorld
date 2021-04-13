package me.bestranger11.ancient.Weapons.RomanWeapons.merchantShopItem;

import me.bestranger11.ancient.NPCS.Shops.Shops;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class MerchantSpawnEvent implements Listener {
    @EventHandler
    public static void interact(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Merchant"))
            if (player.getInventory().getItemInMainHand().getItemMeta().hasLore()) {
                Shops.createSoldierShop(player);


            }
    }
}
