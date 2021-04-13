package me.bestranger11.ancient.Armor.Magician;

import me.bestranger11.ancient.Main;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

public class MagicArmorAbility implements Listener {
    public Main plugin;
    public MagicArmorAbility(Main plugin) { this.plugin = plugin; }
    public void runnable(Player player) {
        new BukkitRunnable() {
            @Override
            public void run() {
                if (player.getInventory().getBoots() == null)
                    return;
                if (player.getInventory().getHelmet() == null)
                    return;
                if (player.getInventory().getLeggings() == null)
                    return;
                if (player.getInventory().getChestplate() == null)
                    return;
                if (!player.getInventory().getBoots().getItemMeta().getDisplayName().contains("Magicians"))
                    return;
                if (!player.getInventory().getHelmet().getItemMeta().getDisplayName().contains("Magicians"))
                    return;
                if (!player.getInventory().getLeggings().getItemMeta().getDisplayName().contains("Magicians"))
                    return;
                if (!player.getInventory().getChestplate().getItemMeta().getDisplayName().contains("Magicians"))
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
                if (player.getInventory().getChestplate().getItemMeta().getLore().contains("Wizadry"))
                    return;
                if (player.getInventory().getHelmet().getItemMeta().getLore().contains("Wizadry"))
                    return;
                if (player.getInventory().getBoots().getItemMeta().getLore().contains("Wizadry"))
                    return;
                if (player.getInventory().getLeggings().getItemMeta().getLore().contains("Wizadry"))
                    return;
                List<Entity> nearby = player.getNearbyEntities(32, 32, 32);
                for (Entity tmp : nearby) {
                    ((Damageable) tmp).damage(2);

                            }
                        }

                        }.runTaskTimer(plugin, 20, 20);
            }
        }