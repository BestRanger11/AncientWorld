package me.bestranger11.ancient.Weapons.RomanWeapons.WeakSword;

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

public class WeakSword {
    public static ItemStack WeakSword;
    private final Main main;

    public WeakSword(Main main) {
        this.main = main;
    }

    public static void init() {
        createWeakSword();
    }


    private static void createWeakSword() {
        ItemStack item = new ItemStack(Material.STONE_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Weak Sword");
        int amountPts = 4;
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.weaponDamage", amountPts, AttributeModifier.Operation.ADD_NUMBER));
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.YELLOW + "A weak sword. bad, but cheap.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);

        WeakSword = item;
    }
}