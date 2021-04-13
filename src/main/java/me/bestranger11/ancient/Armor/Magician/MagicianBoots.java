package me.bestranger11.ancient.Armor.Magician;

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

public class MagicianBoots {

    public static ItemStack MagiciansBoots;
    private final Main main;

    public MagicianBoots(Main main) {
        this.main = main;
    }

    public static void init() {
        createMagiciansBoots();
    }


    private static void createMagiciansBoots() {
        ItemStack item = new ItemStack(Material.GOLDEN_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Magicians Boots");
        int amountPts = 5;
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("generic.armorToughness", amountPts, AttributeModifier.Operation.ADD_NUMBER));
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_RED + "Master of Wizadry!");
        meta.setLore(lore);
        item.setItemMeta(meta);

        MagiciansBoots = item;
    }
}

