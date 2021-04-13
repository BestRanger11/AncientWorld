package me.bestranger11.ancient.Weapons.RomanWeapons.MagicianSword;

import me.bestranger11.ancient.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MagicSword {
    public static ItemStack MagicSword;
    private final Main main;

    public MagicSword(Main main) { this.main = main; }
    public static void init() { createMagicSword(); }


    private static void createMagicSword() {
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Magic Sword");

        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        int amountPts = 12;
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.weaponDamage", amountPts, AttributeModifier.Operation.ADD_NUMBER));
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_RED + "Master of wizardy");
        meta.setLore(lore);
        item.setItemMeta(meta);

        MagicSword = item;
    }
}