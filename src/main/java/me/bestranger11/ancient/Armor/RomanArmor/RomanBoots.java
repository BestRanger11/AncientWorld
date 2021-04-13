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

    public class RomanBoots {

        public static ItemStack RomanBoots;
        private final Main main;

        public RomanBoots(Main main) { this.main = main; }
        public static void init() { createRomanBoots(); }


        private static void createRomanBoots() {
            ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.RED + "Roman Boots");
            int amountPts = 3;
            meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, new AttributeModifier("generic.armorToughness", amountPts, AttributeModifier.Operation.ADD_NUMBER));
            meta.setUnbreakable(true);
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
            List<String> lore = new ArrayList<>();
            lore.add(ChatColor.YELLOW + "Defend the empire,");
            lore.add(ChatColor.YELLOW + "junior soldier.");
            meta.setLore(lore);
            item.setItemMeta(meta);

            RomanBoots = item;





    }

}
