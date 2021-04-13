package me.bestranger11.ancient.NPCS.Shops.Soldiers;

import me.bestranger11.ancient.Food.Pasta.Pasta;
import me.bestranger11.ancient.Weapons.RomanWeapons.Shield.ChanceShield;
import me.bestranger11.ancient.Weapons.RomanWeapons.Spear.RomanSpear;
import me.bestranger11.ancient.Weapons.RomanWeapons.WeakSword.WeakSword;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GUISoldier implements Listener {
    public Inventory inv;

    public void createINV() {
        inv = Bukkit.createInventory(null, 9, ChatColor.BLACK + "" + ChatColor.BOLD + "Get Troops To Fight");
        ItemStack item = new ItemStack(RomanSpear.RomanSpear);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Spear Soldiers");
        List<String> lore = new ArrayList<String>();
        lore.add("Use to deploy troops!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        inv.setItem(0, item);

        item.setType(Material.TRIDENT);
        meta.setDisplayName("Spear Soldiers");
        lore.add("Use to deploy troops!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        inv.setItem(1, item);


        item.setType(Material.SHIELD);
        meta.setDisplayName("Shield Soldiers");
        lore.add("Use to deploy troops!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        inv.setItem(4, item);

        item.setType(Material.TRIDENT);
        meta.setDisplayName("Shield Soldiers");
        lore.add("Use to deploy troops!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        inv.setItem(3, item);

        item.setType(Material.STONE_SWORD);
        meta.setDisplayName("Weak Sword Soldiers");
        lore.add("Use to deploy troops!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        inv.setItem(7, item);

        item.setType(Material.TRIDENT);
        meta.setDisplayName("Weak Sword Soldiers");
        lore.add("Use to deploy troops!");
        meta.setLore(lore);
        item.setItemMeta(meta);
        inv.setItem(6, item);

        ItemStack pane = new ItemStack(Material.RED_STAINED_GLASS_PANE);

        ItemMeta metapane = pane.getItemMeta();
        meta.setDisplayName("");
        List<String> lorepane = new ArrayList<String>();
        lore.clear();
        metapane.setLore(lorepane);
        pane.setItemMeta(metapane);
        inv.setItem(2, pane);
        inv.setItem(5, pane);

        ItemStack barrier = new ItemStack(Material.BARRIER);
        inv.setItem(8, barrier);
    }

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!event.getInventory().equals(inv))
            return;
        if (event.getCurrentItem() == null)
            return;
        if (event.getCurrentItem().getItemMeta() == null)
            return;
        if (event.getCurrentItem().getItemMeta().getDisplayName() == null)
            return;
        event.setCancelled(true);
        Player player = (Player) event.getWhoClicked();
        Inventory playerinv = player.getInventory();
        if (event.getSlot() == 0 || event.getSlot() == 1)
            if (playerinv.contains(Pasta.Pasta, 5)) {
                playerinv.addItem(RomanSpear.RomanSpear);
                playerinv.removeItem(Pasta.Pasta);
                playerinv.removeItem(Pasta.Pasta);
                playerinv.removeItem(Pasta.Pasta);
                playerinv.removeItem(Pasta.Pasta);
                playerinv.removeItem(Pasta.Pasta);
            } else {
                player.sendMessage(ChatColor.RED + "Not Enough Resources");
            }

        if (event.getSlot() == 4 || event.getSlot() == 3)
            if (playerinv.contains(Pasta.Pasta, 5)) {
                playerinv.addItem(ChanceShield.RomanShield);
                playerinv.removeItem(Pasta.Pasta);
                playerinv.removeItem(Pasta.Pasta);
                playerinv.removeItem(Pasta.Pasta);
                playerinv.removeItem(Pasta.Pasta);
                playerinv.removeItem(Pasta.Pasta);
            } else {
                player.sendMessage(ChatColor.RED + "Not Enough Resources");
            }

        if (event.getSlot() == 6 || event.getSlot() == 7)
            if (playerinv.contains(Pasta.Pasta, 5)) {
                playerinv.addItem(WeakSword.WeakSword);
                playerinv.removeItem(Pasta.Pasta);
                playerinv.removeItem(Pasta.Pasta);
                playerinv.removeItem(Pasta.Pasta);
                playerinv.removeItem(Pasta.Pasta);
                playerinv.removeItem(Pasta.Pasta);
            } else {
                player.sendMessage(ChatColor.RED + "Not Enough Resources");
            }

        if (event.getSlot() == 8) {
            player.closeInventory();

        }
    }
}

