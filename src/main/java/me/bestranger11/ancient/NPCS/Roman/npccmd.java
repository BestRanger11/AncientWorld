package me.bestranger11.ancient.NPCS.Roman;

import me.bestranger11.ancient.Armor.Magician.MagicArmorAbility;
import me.bestranger11.ancient.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class npccmd implements CommandExecutor {

    private final Main main;


    private Entity entity;

    public npccmd(Main main) {
        this.main = main;
    }


    public boolean onCommand(CommandSender sender, Command command, String label, String[] strings) {
        if (label.equalsIgnoreCase("createnpc_roman")) {
            Player player = (Player) sender;
            RomanNpc1 r1 = new RomanNpc1(main);
            r1.spawn(player);
            RomanNpc2 r2 = new RomanNpc2(main);
            r2.spawn(player);
            RomanNpc3 r3 = new RomanNpc3(main);
            r3.spawn(player);
            RomanNpc4 r4 = new RomanNpc4(main);
            r4.spawn(player);
            RomanNpc5 r5 = new RomanNpc5(main);
            r5.spawn(player);
            RomanNpc6 r6 = new RomanNpc6(main);
            r6.spawn(player);
            RomanNpc7 r7 = new RomanNpc7(main);
            r7.spawn(player);
            RomanNpc8 r8 = new RomanNpc8(main);
            r8.spawn(player);
            RomanNpc9 r9 = new RomanNpc9(main);
            r9.spawn(player);
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


