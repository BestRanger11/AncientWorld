package me.bestranger11.ancient.Weapons.RomanWeapons.merchantShopItem;

import me.bestranger11.ancient.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MerchantPlace {
    public static ItemStack MerchantItem;
    private final Main main;

    public MerchantPlace(Main main) { this.main = main; }
    public static void init() { createMerchantItem(); }


    private static void createMerchantItem() {
        ItemStack item = new ItemStack(Material.ANVIL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Merchant Place Item");

        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_RED + "Spawn a random merchant!");
        meta.setLore(lore);
        item.setItemMeta(meta);

        MerchantItem = item;
    }
}

