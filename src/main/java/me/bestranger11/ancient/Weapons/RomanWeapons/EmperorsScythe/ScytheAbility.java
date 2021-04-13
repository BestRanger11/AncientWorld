package me.bestranger11.ancient.Weapons.RomanWeapons.EmperorsScythe;

import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.util.List;
public class ScytheAbility implements Listener {
    @EventHandler
    public static void onDamage(EntityDamageByEntityEvent event) {
        Player player = (Player) event.getDamager();
        if (!player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Scythe"))
            return;
        if (!player.getInventory().getItemInMainHand().getItemMeta().hasLore())
            return;
        List<Entity> nearby = player.getNearbyEntities(8, 8, 8);
        nearby.remove(event.getEntity());
        for (Entity tmp : nearby)
            if (tmp != event.getEntity())
                ((Damageable) tmp).damage(15);


    }
}
