package me.bestranger11.ancient.Armor.EmperorsArmor;

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

public class EmperorCP {


    public static ItemStack EmperorsCP;
    private final Main main;

    public EmperorCP(Main main) {
        this.main = main;
    }

    public static void init() {
        createEmperorsCP();
    }


    private static void createEmperorsCP() {
        ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Emperors Chestpiece");
        int amountPts = 12;
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("generic.armorToughness", amountPts, AttributeModifier.Operation.ADD_NUMBER));
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_RED + "Guide us to victory, Master");
        meta.setLore(lore);
        item.setItemMeta(meta);

        EmperorsCP = item;
    }
}

