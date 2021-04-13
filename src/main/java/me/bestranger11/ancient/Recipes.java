package me.bestranger11.ancient;

import me.bestranger11.ancient.Food.Pasta.Pasta;
import me.bestranger11.ancient.Food.Pasta.RawPasta;
import me.bestranger11.ancient.Weapons.RomanWeapons.merchantShopItem.MerchantPlace;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class Recipes implements Listener {

    public ShapedRecipe recipeMerchant() {
        ItemStack item = new ItemStack(MerchantPlace.MerchantItem);

        ShapedRecipe merchant = new ShapedRecipe(item);

        merchant.shape("E E", " E ", "EEE");
        merchant.setIngredient('E', Material.NETHERITE_INGOT);

        return merchant;

    }

    public ShapedRecipe Pasta() {
        ItemStack item = new ItemStack(RawPasta.RawPasta);

        ShapedRecipe pasta = new ShapedRecipe(item);

        pasta.shape("E E", " E ", "SSS");
        pasta.setIngredient('E', Material.BREAD);
        pasta.setIngredient('S', Material.WHEAT);


        return pasta;
    }
}
