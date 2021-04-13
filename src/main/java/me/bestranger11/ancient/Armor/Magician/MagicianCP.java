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

public class MagicianCP {


    public static ItemStack MagicianCP;
    private final Main main;

    public MagicianCP(Main main) {
        this.main = main;
    }

    public static void init() {
        createMagicianCP();
    }


    private static void createMagicianCP() {
        ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Magicians Chestpiece");

        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        int amountPts = 9;
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("generic.armorToughness", amountPts, AttributeModifier.Operation.ADD_NUMBER));

        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_RED + "Master of Wizadry!");
        meta.setLore(lore);
        item.setItemMeta(meta);

        MagicianCP = item;
    }
}

