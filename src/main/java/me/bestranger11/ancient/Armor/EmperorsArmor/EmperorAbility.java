package me.bestranger11.ancient.Armor.EmperorsArmor;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EmperorAbility implements Listener {
    @EventHandler
    public static void onDamage(EntityDamageByEntityEvent event) {
        Player player = (Player) event.getDamager();
        if (player.getInventory().getBoots() == null)
            return;
        if (player.getInventory().getHelmet() == null)
            return;
        if (player.getInventory().getLeggings() == null)
            return;
        if (player.getInventory().getChestplate() == null)
            return;
        if (!player.getInventory().getBoots().getItemMeta().getDisplayName().contains("Emperors"))
            return;
        if (!player.getInventory().getHelmet().getItemMeta().getDisplayName().contains("Emperors"))
            return;
        if (!player.getInventory().getLeggings().getItemMeta().getDisplayName().contains("Emperors"))
            return;
        if (!player.getInventory().getChestplate().getItemMeta().getDisplayName().contains("Emperors"))
            return;
        if (!player.getInventory().getBoots().getItemMeta().getDisplayName().contains("Boots"))
            return;
        if (!player.getInventory().getHelmet().getItemMeta().getDisplayName().contains("Helm"))
            return;
        if (!player.getInventory().getLeggings().getItemMeta().getDisplayName().contains("Covers"))
            return;
        if (!player.getInventory().getLeggings().getItemMeta().getDisplayName().contains("Leg"))
            return;
        if (!player.getInventory().getChestplate().getItemMeta().getDisplayName().contains("Chestpiece"))
            return;
        if (!player.getInventory().getBoots().getItemMeta().hasLore())
            return;
        if (!player.getInventory().getLeggings().getItemMeta().hasLore())
            return;
        if (!player.getInventory().getHelmet().getItemMeta().hasLore())
            return;
        if (!player.getInventory().getChestplate().getItemMeta().hasLore())
            return;
        double damage = event.getDamage() * 1.25;
        event.setDamage(damage);

    }
}