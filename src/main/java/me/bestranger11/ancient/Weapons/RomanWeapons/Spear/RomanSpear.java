package me.bestranger11.ancient.Weapons.RomanWeapons.Spear;

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

public class RomanSpear {
    public static ItemStack RomanSpear;
    private final Main main;

    public RomanSpear(Main main) { this.main = main; }
    public static void init() { createRomanSpear(); }


    private static void createRomanSpear() {
        ItemStack item = new ItemStack(Material.TRIDENT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Spear");
        int amountPts = 7;
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.weaponDamage", amountPts, AttributeModifier.Operation.ADD_NUMBER));
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.YELLOW + "Pointy Stick defeats all");
        meta.setLore(lore);
        item.setItemMeta(meta);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        RomanSpear = item;
    }
}
