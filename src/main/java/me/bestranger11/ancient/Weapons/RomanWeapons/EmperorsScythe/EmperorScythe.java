package me.bestranger11.ancient.Weapons.RomanWeapons.EmperorsScythe;

import me.bestranger11.ancient.Food.Pasta.RawPasta;
import me.bestranger11.ancient.Main;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Firework;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class EmperorScythe {
    public static ItemStack EmperorScythe;
    private final Main main;

    public EmperorScythe(Main main) { this.main = main; }
    public static void init() { createEmperorScythe(); }


    private static void createEmperorScythe() {
        ItemStack item = new ItemStack(Material.NETHERITE_HOE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "Emperor's Scythe");
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.removeAttributeModifier(Attribute.GENERIC_ATTACK_SPEED);
        int amountPts = 17;
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.weaponDamage", amountPts, AttributeModifier.Operation.ADD_NUMBER));
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.DARK_RED + "Destroy The Enemy!!");
        meta.setLore(lore);
        meta.removeAttributeModifier(Attribute.GENERIC_ATTACK_SPEED);
        item.setItemMeta(meta);

        EmperorScythe = item;


    }
}




