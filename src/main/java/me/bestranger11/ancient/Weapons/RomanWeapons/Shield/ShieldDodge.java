package me.bestranger11.ancient.Weapons.RomanWeapons.Shield;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.util.Random;

public class ShieldDodge implements Listener {
    @EventHandler
    public static void onDamage(EntityDamageByEntityEvent event) {
        Player player = (Player) event.getEntity();
        Random rnd = new Random();
        if (!player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().contains("Shield"))
            return;
        if (!player.getInventory().getItemInOffHand().getItemMeta().getDisplayName().contains("Roman"))
            return;
        if (!player.getInventory().getItemInOffHand().getItemMeta().hasLore())
            return;
        if (rnd.nextInt(100) <= 75) {
            event.setCancelled(true);



        }
    }
}