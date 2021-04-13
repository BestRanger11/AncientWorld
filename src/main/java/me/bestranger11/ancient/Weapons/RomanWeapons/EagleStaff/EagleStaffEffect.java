package me.bestranger11.ancient.Weapons.RomanWeapons.EagleStaff;

import net.minecraft.server.v1_16_R3.WorldServer;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class EagleStaffEffect implements Listener {
    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR) {
            if (event.getItem() == null)
                return;
            if (!player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Staff"))
                return;
            if (!player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Eagle"))
                return;
            if (!player.getInventory().getItemInMainHand().getItemMeta().hasLore())
                return;
            Eagle eagle = new Eagle(player.getLocation());
            WorldServer world = ((CraftWorld)player.getWorld()).getHandle();
            world.addEntity(eagle);
                }
    }
        }


