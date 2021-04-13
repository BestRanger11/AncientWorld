package me.bestranger11.ancient.Armor.RomanArmor;

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

    public class RomanLegs {

        public static ItemStack RomanLegs;
        private final Main main;

        public RomanLegs(Main main) { this.main = main; }
        public static void init() { createRomanLegs(); }


        private static void createRomanLegs() {
            ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.RED + "Roman Leg Covers");
            int amountPts = 5;
            meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("generic.armorToughness", amountPts, AttributeModifier.Operation.ADD_NUMBER));
            meta.setUnbreakable(true);
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            List<String> lore = new ArrayList<>();
            lore.add(ChatColor.YELLOW + "Defend the empire,");
            lore.add(ChatColor.YELLOW + "junior soldier.");
            meta.setLore(lore);
            item.setItemMeta(meta);

            RomanLegs = item;


        }


    }





