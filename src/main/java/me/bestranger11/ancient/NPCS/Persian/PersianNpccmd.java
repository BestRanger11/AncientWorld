package me.bestranger11.ancient.NPCS.Persian;

import me.bestranger11.ancient.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

public class PersianNpccmd implements CommandExecutor {

    private final Main main;


    private LivingEntity entity;

    public PersianNpccmd(Main main) { this.main = main; }


    public boolean onCommand(CommandSender sender, Command command, String label, String[] strings) {
        if (label.equalsIgnoreCase("createnpc_persian")) {
            Player player = (Player) sender;
            PersianNpc1 r1 = new PersianNpc1(main);
            r1.spawn(player);
            PersianNpc2 r2 = new PersianNpc2(main);
            r2.spawn(player);
            PersianNpc3 r3 = new PersianNpc3(main);
            r3.spawn(player);
            PersianNpc4 r4 = new PersianNpc4(main);
            r4.spawn(player);
            PersianNpc5 r5 = new PersianNpc5(main);
            r5.spawn(player);
            PersianNpc6 r6 = new PersianNpc6(main);
            r6.spawn(player);
            PersianNpc7 r7 = new PersianNpc7(main);
            r7.spawn(player);
            PersianNpc8 r8 = new PersianNpc8(main);
            r8.spawn(player);
            PersianNpc9 r9 = new PersianNpc9(main);
            r9.spawn(player);






        }
    return false;
    }
}

