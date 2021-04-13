package me.bestranger11.ancient.Weapons.RomanWeapons.MagicianSword;

import me.bestranger11.ancient.Main;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class MagicSwordAbility implements Listener {

    private Main plugin;

    @EventHandler
    public void onHit(EntityDamageByEntityEvent e) {
        Player player = (Player) e.getDamager();
        if (!player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Magic"))
            return;
        if (!player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Sword"))
            return;
        if (!player.getInventory().getItemInMainHand().getItemMeta().hasLore())
            return;
        Entity victim = e.getEntity();
        Location loc = victim.getLocation();
        player.getWorld().strikeLightning(loc);
            }
    }

