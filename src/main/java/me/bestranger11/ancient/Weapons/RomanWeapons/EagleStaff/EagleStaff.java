package me.bestranger11.ancient.Weapons.RomanWeapons.EagleStaff;

import me.bestranger11.ancient.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class EagleStaff {
    public static ItemStack EagleStaff;
    private final Main main;

    public EagleStaff(Main main) { this.main = main; }
    public static void init() { createEagleStaff(); }


    private static void createEagleStaff() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Eagle Staff");
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.YELLOW + "Do Not Lose The Eagle Of The Legion");
        meta.setLore(lore);
        item.setItemMeta(meta);

        EagleStaff = item;


    }


}

