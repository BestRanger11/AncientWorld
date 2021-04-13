package me.bestranger11.ancient;

import me.bestranger11.ancient.Armor.EmperorsArmor.*;
import me.bestranger11.ancient.Armor.Magician.MagicianBoots;
import me.bestranger11.ancient.Armor.Magician.MagicianCP;
import me.bestranger11.ancient.Armor.Magician.MagicianHelm;
import me.bestranger11.ancient.Armor.Magician.MagicianLegs;
import me.bestranger11.ancient.Armor.RomanArmor.RomanBoots;
import me.bestranger11.ancient.Armor.RomanArmor.RomanCP;
import me.bestranger11.ancient.Armor.RomanArmor.RomanHat;
import me.bestranger11.ancient.Armor.RomanArmor.RomanLegs;
import me.bestranger11.ancient.Commands.armorcompleter;
import me.bestranger11.ancient.Commands.customitemcompleter;
import me.bestranger11.ancient.Commands.romanarmorsoldier;
import me.bestranger11.ancient.Commands.romancustomitemscmd;
import me.bestranger11.ancient.Food.Pasta.Pasta;
import me.bestranger11.ancient.Food.Pasta.RawPasta;
import me.bestranger11.ancient.Food.Pasta.RealPastaEffect;
import me.bestranger11.ancient.NPCS.Persian.PersianJoin;
import me.bestranger11.ancient.NPCS.Persian.PersianNpccmd;
import me.bestranger11.ancient.NPCS.Roman.Join;
import me.bestranger11.ancient.NPCS.Roman.npccmd;
import me.bestranger11.ancient.NPCS.Shops.ClickNpc;
import me.bestranger11.ancient.NPCS.Shops.PacketReader;
import me.bestranger11.ancient.NPCS.Shops.ShopsCmd;
import me.bestranger11.ancient.NPCS.Shops.ShopsJoin;
import me.bestranger11.ancient.Weapons.RomanWeapons.EagleStaff.EagleStaff;
import me.bestranger11.ancient.Weapons.RomanWeapons.EagleStaff.EagleStaffEffect;
import me.bestranger11.ancient.Weapons.RomanWeapons.EmperorsScythe.EmperorScythe;
import me.bestranger11.ancient.Weapons.RomanWeapons.EmperorsScythe.ScytheAbility;
import me.bestranger11.ancient.Weapons.RomanWeapons.MagicianSword.MagicSword;
import me.bestranger11.ancient.Weapons.RomanWeapons.MagicianSword.MagicSwordAbility;
import me.bestranger11.ancient.Weapons.RomanWeapons.Shield.ChanceShield;
import me.bestranger11.ancient.Weapons.RomanWeapons.Shield.ShieldDodge;
import me.bestranger11.ancient.Weapons.RomanWeapons.Spear.RomanSpear;
import me.bestranger11.ancient.Weapons.RomanWeapons.WeakSword.WeakSword;
import me.bestranger11.ancient.Weapons.RomanWeapons.merchantShopItem.MerchantPlace;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;


public final class Main extends JavaPlugin implements Listener {
    private Player player;
    Plugin plugin;
    private Main main;
    private List<Player> damage = new ArrayList<Player>();


    @Override
    public void onEnable() {
        if (!Bukkit.getOnlinePlayers().isEmpty()) {
            for (Player player : Bukkit.getOnlinePlayers()) {
                PacketReader reader = new PacketReader();
                reader.inject(player);
            }
        }
        this.plugin = plugin;
        RawPasta.init();
        this.getServer().getPluginManager().registerEvents(new ClickNpc(), this);
        MerchantPlace.init();
        this.getServer().getPluginManager().registerEvents(new ShopsJoin(), this);
        RomanCP.init();
        WeakSword.init();
        RomanHat.init();
        RomanLegs.init();
        RomanBoots.init();
        EmperorHelm.init();
        EmperorBoots.init();
        EmperorLegs.init();
        EmperorCP.init();
        RomanSpear.init();
        EagleStaff.init();
        ChanceShield.init();
        EmperorScythe.init();
        MagicSword.init();
        MagicianCP.init();
        MagicianHelm.init();
        MagicianLegs.init();
        MagicianBoots.init();
        Pasta.init();
        this.getCommand("romanarmor").setExecutor(new romanarmorsoldier());
        this.getCommand("romanarmor").setTabCompleter(new armorcompleter());
        this.getCommand("customroman").setExecutor(new romancustomitemscmd());
        this.getCommand("customroman").setTabCompleter(new customitemcompleter());
        getServer().getPluginCommand("createnpc_roman").setExecutor(new npccmd(this));
        getServer().getPluginCommand("createnpc_persian").setExecutor(new PersianNpccmd(this));
        getServer().getPluginCommand("soldier_shop").setExecutor(new ShopsCmd(this));
        getServer().getPluginManager().registerEvents(new EmperorAbility(), this);
        getServer().getPluginManager().registerEvents(new MagicSwordAbility(), this);
        this.getServer().getPluginManager().registerEvents(new Join(), this);
        getServer().getPluginManager().registerEvents(new PersianJoin(), this);
        getServer().getPluginManager().registerEvents(new ScytheAbility(), this);
        getServer().getPluginManager().registerEvents(new EagleStaffEffect(), this);
        getServer().getPluginManager().registerEvents(new ShieldDodge(), this);
        getServer().getPluginManager().registerEvents(new RealPastaEffect(), this);
        getServer().getPluginManager().registerEvents(new Events(this), this);
        Recipes r = new Recipes();
        Bukkit.addRecipe(r.Pasta());
        Bukkit.addRecipe(r.recipeMerchant());

    }

    @Override
    public void onDisable() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            PacketReader reader = new PacketReader();
            reader.unInject(player);
        }

    }
}
















