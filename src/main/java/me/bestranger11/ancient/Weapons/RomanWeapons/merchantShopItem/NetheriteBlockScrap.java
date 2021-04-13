package me.bestranger11.ancient.Weapons.RomanWeapons.merchantShopItem;

import me.bestranger11.ancient.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class NetheriteBlockScrap {
    public static ItemStack MerchantItem;
    private final Main main;

    public NetheriteBlockScrap(Main main) { this.main = main; }
    public static void init() { createMerchantNetherite(); }


    private static void createMerchantNetherite() {
        ItemStack item = new ItemStack(Material.NETHERITE_BLOCK, 3);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Fools Netherite");

        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_RED + "Netherite Scrap Block");
        meta.setLore(lore);
        item.setItemMeta(meta);

        MerchantItem = item;
    }
}