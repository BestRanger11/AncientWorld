package me.bestranger11.ancient.NPCS.Shops;

import me.bestranger11.ancient.Food.Pasta.Pasta;
import me.bestranger11.ancient.Weapons.RomanWeapons.Shield.ChanceShield;
import me.bestranger11.ancient.Weapons.RomanWeapons.Spear.RomanSpear;
import me.bestranger11.ancient.Weapons.RomanWeapons.WeakSword.WeakSword;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ClickNpc implements Listener {
    public Inventory inv;

    @EventHandler
    public void onClick(RightClickNPC event) {
        Player player = event.getPlayer();
        player.sendMessage("DID IT WORK?");

    }
}