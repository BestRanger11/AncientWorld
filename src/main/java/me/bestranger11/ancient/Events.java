package me.bestranger11.ancient;

import me.bestranger11.ancient.Food.Pasta.Pasta;
import me.bestranger11.ancient.Food.Pasta.RawPasta;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;

public class Events implements Listener {
    private final Main main;

    public Events(Main main) {
        this.main = main;
    }


    @EventHandler
    public static void lightingplayer(EntityDamageEvent e) {
        Player player = (Player) e.getEntity();
        if (e.getCause() == EntityDamageEvent.DamageCause.LIGHTNING && player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains("Magic"))
            if (e.getEntity() instanceof Player) {
                e.setCancelled(true);
            }
    }

    @EventHandler
    public static void furnaceCanceller(FurnaceSmeltEvent event) {
        if (event.getSource().equals(RawPasta.RawPasta)) {
            event.setResult(Pasta.Pasta);
        }
    }
}
