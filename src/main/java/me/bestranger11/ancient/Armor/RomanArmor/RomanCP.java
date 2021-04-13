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

    public class RomanCP {

        public static ItemStack RomanChestpiece;
        private final Main main;

        public RomanCP(Main main) { this.main = main; }
        public static void init() { createRomanChestpiece(); }


        private static void createRomanChestpiece() {
            ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.RED + "Roman Chestpiece");
            int amountPts = 6;
            meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("generic.armorToughness", amountPts, AttributeModifier.Operation.ADD_NUMBER));
            meta.setUnbreakable(true);
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            List<String> lore = new ArrayList<>();
            lore.add(ChatColor.YELLOW + "Defend the empire,");
            lore.add(ChatColor.YELLOW + "junior soldier.");
            meta.setLore(lore);
            item.setItemMeta(meta);

            RomanChestpiece = item;





    }
}
