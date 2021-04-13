package me.bestranger11.ancient.Commands;

import me.bestranger11.ancient.Armor.Magician.MagicArmorAbility;
import me.bestranger11.ancient.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Startup implements CommandExecutor {
    private final Main main;

    public Startup(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("startup")) {
            Player player = (Player) sender;
            MagicArmorAbility maa = new MagicArmorAbility(main);
            maa.runnable(player);
            new BukkitRunnable() {
                @SuppressWarnings("deprecation")
                @Override
                public void run() {
                    for (LivingEntity e : Bukkit.getServer().getWorld("world").getLivingEntities()) {
                        e.setCustomName(e.getType() + "" + ChatColor.RED + "[" + e.getHealth() + "/" + e.getMaxHealth() + "]");
                        e.setCustomNameVisible(true);


                    }
                }
            }.runTaskTimerAsynchronously(main, 0, 5);
        }
        return false;
    }
}
