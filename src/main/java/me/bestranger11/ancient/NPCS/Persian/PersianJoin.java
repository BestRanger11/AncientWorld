package me.bestranger11.ancient.NPCS.Persian;

import me.bestranger11.ancient.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PersianJoin implements Listener {
    private Main plugin;

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        if (PersianNpc.getNpcs() == null)
            return;
        if (PersianNpc.getNpcs().isEmpty())
            return;
        if (PersianNpc1.getNpcs() == null)
            return;
        if (PersianNpc1.getNpcs().isEmpty())
            return;
        if (PersianNpc2.getNpcs() == null)
            return;
        if (PersianNpc2.getNpcs().isEmpty())
            return;
        if (PersianNpc3.getNpcs() == null)
            return;
        if (PersianNpc3.getNpcs().isEmpty())
            return;
        if (PersianNpc4.getNpcs() == null)
            return;
        if (PersianNpc4.getNpcs().isEmpty())
            return;
        if (PersianNpc5.getNpcs() == null)
            return;
        if (PersianNpc5.getNpcs().isEmpty())
            return;
        if (PersianNpc6.getNpcs() == null)
            return;
        if (PersianNpc6.getNpcs().isEmpty())
            return;
        if (PersianNpc7.getNpcs() == null)
            return;
        if (PersianNpc7.getNpcs().isEmpty())
            return;
        if (PersianNpc8.getNpcs() == null)
            return;
        if (PersianNpc8.getNpcs().isEmpty())
            return;
        if (PersianNpc9.getNpcs() == null)
            return;
        if (PersianNpc9.getNpcs().isEmpty())
            return;
        PersianNpc r = new PersianNpc(plugin);
        r.addJoinPacket(event.getPlayer());
        PersianNpc1 r1 = new PersianNpc1(plugin);
        r1.addJoinPacket(event.getPlayer());
        PersianNpc2 r2 = new PersianNpc2(plugin);
        r2.addJoinPacket(event.getPlayer());
        PersianNpc3 r3 = new PersianNpc3(plugin);
        r3.addJoinPacket(event.getPlayer());
        PersianNpc4 r4 = new PersianNpc4(plugin);
        r4.addJoinPacket(event.getPlayer());
        PersianNpc5 r5 = new PersianNpc5(plugin);
        r5.addJoinPacket(event.getPlayer());
        PersianNpc6 r6 = new PersianNpc6(plugin);
        r6.addJoinPacket(event.getPlayer());
        PersianNpc7 r7 = new PersianNpc7(plugin);
        r7.addJoinPacket(event.getPlayer());
        PersianNpc8 r8 = new PersianNpc8(plugin);
        r8.addJoinPacket(event.getPlayer());
        PersianNpc9 r9 = new PersianNpc9(plugin);
        r9.addJoinPacket(event.getPlayer());
    }

}
