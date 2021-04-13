package me.bestranger11.ancient.NPCS.Roman;

import me.bestranger11.ancient.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {
    private Main plugin;

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        if (RomanNpc.getNpcs() == null)
            return;
        if (RomanNpc.getNpcs().isEmpty())
            return;
        if (RomanNpc1.getNpcs() == null)
            return;
        if (RomanNpc1.getNpcs().isEmpty())
            return;
        if (RomanNpc2.getNpcs() == null)
            return;
        if (RomanNpc2.getNpcs().isEmpty())
            return;
        if (RomanNpc3.getNpcs() == null)
            return;
        if (RomanNpc3.getNpcs().isEmpty())
            return;
        if (RomanNpc4.getNpcs() == null)
            return;
        if (RomanNpc4.getNpcs().isEmpty())
            return;
        if (RomanNpc5.getNpcs() == null)
            return;
        if (RomanNpc5.getNpcs().isEmpty())
            return;
        if (RomanNpc6.getNpcs() == null)
            return;
        if (RomanNpc6.getNpcs().isEmpty())
            return;
        if (RomanNpc7.getNpcs() == null)
            return;
        if (RomanNpc7.getNpcs().isEmpty())
            return;
        if (RomanNpc8.getNpcs() == null)
            return;
        if (RomanNpc8.getNpcs().isEmpty())
            return;
        if (RomanNpc9.getNpcs() == null)
            return;
        if (RomanNpc9.getNpcs().isEmpty())
            return;
        RomanNpc r = new RomanNpc(plugin);
        r.addJoinPacket(event.getPlayer());
        RomanNpc1 r1 = new RomanNpc1(plugin);
        r1.addJoinPacket(event.getPlayer());
        RomanNpc2 r2 = new RomanNpc2(plugin);
        r2.addJoinPacket(event.getPlayer());
        RomanNpc3 r3 = new RomanNpc3(plugin);
        r3.addJoinPacket(event.getPlayer());
        RomanNpc4 r4 = new RomanNpc4(plugin);
        r4.addJoinPacket(event.getPlayer());
        RomanNpc5 r5 = new RomanNpc5(plugin);
        r5.addJoinPacket(event.getPlayer());
        RomanNpc6 r6 = new RomanNpc6(plugin);
        r6.addJoinPacket(event.getPlayer());
        RomanNpc7 r7 = new RomanNpc7(plugin);
        r7.addJoinPacket(event.getPlayer());
        RomanNpc8 r8 = new RomanNpc8(plugin);
        r8.addJoinPacket(event.getPlayer());
        RomanNpc9 r9 = new RomanNpc9(plugin);
        r9.addJoinPacket(event.getPlayer());
    }

}
