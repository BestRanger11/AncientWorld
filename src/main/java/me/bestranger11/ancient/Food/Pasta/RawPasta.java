package me.bestranger11.ancient.Food.Pasta;

import me.bestranger11.ancient.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class RawPasta {
    public static ItemStack RawPasta;
    private final Main main;

    public RawPasta(Main main) {
        this.main = main;
    }

    public static void init() {
        createRawPasta();
    }


    private static void createRawPasta() {
        ItemStack item = new ItemStack(Material.BROWN_MUSHROOM, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Pasta");
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_RED + "Eat up Soldier");
        meta.setLore(lore);
        item.setItemMeta(meta);

        RawPasta = item;
    }
}
