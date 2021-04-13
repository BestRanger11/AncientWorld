package me.bestranger11.ancient.NPCS.Shops;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ShopsJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        if (Shops.getNpcs().isEmpty())
            return;
        if (Shops.getNpcs() == null)
            return;

        Shops.addJoinPacket(event.getPlayer());
        PacketReader reader = new PacketReader();
        reader.inject(event.getPlayer());

    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        PacketReader reader = new PacketReader();
        reader.unInject(event.getPlayer());
    }
}
