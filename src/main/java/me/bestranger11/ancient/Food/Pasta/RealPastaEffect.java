package me.bestranger11.ancient.Food.Pasta;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class RealPastaEffect implements Listener {
    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR) {
            if (event.getItem() != null) {
                Player player = event.getPlayer();
                if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Pasta"))
                    if (player.getInventory().getItemInMainHand().getItemMeta().hasLore()) {
                        if (player.getGameMode().equals(GameMode.CREATIVE))
                            return;
                        player.sendMessage(ChatColor.YELLOW + "Munch");
                        player.getInventory().removeItem(Pasta.Pasta);
                        double health = player.getHealth()+1;
                        player.setHealth(health);
                        float saturation = player.getSaturation()+4;
                        player.setSaturation(saturation);


                }
            }
        }
    }
}