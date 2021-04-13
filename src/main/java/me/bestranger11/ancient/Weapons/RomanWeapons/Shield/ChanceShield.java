package me.bestranger11.ancient.Weapons.RomanWeapons.Shield;

import me.bestranger11.ancient.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ChanceShield {
    public static ItemStack RomanShield;
    private final Main main;

    public ChanceShield(Main main) { this.main = main; }
    public static void init() { createRomanShield(); }


    private static void createRomanShield() {
        ItemStack item = new ItemStack(Material.SHIELD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "RomanShield");
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.YELLOW + "Dodge Attacks!");
        meta.setLore(lore);
        item.setItemMeta(meta);

        RomanShield = item;


    }


}


