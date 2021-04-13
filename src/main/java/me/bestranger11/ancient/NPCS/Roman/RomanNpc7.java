package me.bestranger11.ancient.NPCS.Roman;

import com.mojang.authlib.GameProfile;
import javafx.util.Pair;
import me.bestranger11.ancient.Main;
import net.minecraft.server.v1_16_R3.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R3.CraftServer;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.*;

public class RomanNpc7 implements Listener {

    private static List<EntityPlayer> RomanNpc7 = new ArrayList<EntityPlayer>();
    private static Map<EntityPlayer, List<Pair<EnumItemSlot, ItemStack>>> equipmentMap = new HashMap<>();
    private me.bestranger11.ancient.Main plugin;
    private double prevx = 0;
    private double prevy = 0;
    private double prevz = 0;
    public UUID id;
    private float currentHealth;
    public RomanNpc7(Main plugin) { this.plugin = plugin; }

    public void spawn(Player player) {

        MinecraftServer server = ((CraftServer) Bukkit.getServer()).getServer();
        WorldServer world = ((CraftWorld) Bukkit.getWorld(player.getWorld().getName())).getHandle();
        GameProfile gameProfile = new GameProfile(UUID.fromString("a3dbfb1b-8204-445f-a6ac-5e73789a4326"), ChatColor.DARK_RED + "" + ChatColor.BOLD + "Roman");
        EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
        npc.setLocation(player.getLocation().getX()+4, player.getLocation().getY(), player.getLocation().getZ()+2, player.getLocation().getYaw(), player.getLocation().getPitch());
        addRomanNpc7Packet(npc);
        RomanNpc7.add(npc);
        Location loc = player.getLocation();
        PathfindingRoman mob = new PathfindingRoman(loc, player);
        mob.setPosition(player.getLocation().getX()+4, player.getLocation().getY(), player.getLocation().getZ()+2);
        world.addEntity(mob);
        id = mob.getUniqueID();
        prevx  = mob.locX();
        prevy  = mob.locY();
        prevz  = mob.locZ();
        currentHealth = mob.getHealth();
        new BukkitRunnable() {
            public void run() {
                mob.setSilent(true);
                mob.setInvisible(true);

            }
        }.runTaskLater(plugin, 2);
        new BukkitRunnable() {

            public void run() {
                update(npc, mob);

                double x = mob.locX();
                double y = mob.locY();
                double z = mob.locZ();

                if (x != prevx || y != prevy || z != prevz) {
                    double getx = x - prevx;
                    double gety = y - prevy;
                    double getz = z - prevz;

                    npcMove(npc, getx, gety, getz);

                    prevx = x;
                    prevy = y;
                    prevz = z;
                }
                if (mob.getHealth() < currentHealth) {
                    npcTakeDamage(npc);
                    currentHealth = mob.getHealth();

                }
                if (mob.dead == true) {
                    removeRomanNpc7Packet(npc);
                    RomanNpc7.remove(npc);
                    cancel();
                }
            }
        }.runTaskTimer(plugin, 0, 0);
    }



    public void remove() {
        EntityPlayer npc = RomanNpc7.get(RomanNpc7.size() - 1);
        RomanNpc7.remove(npc);
        removeRomanNpc7Packet(npc);

    }



    public void addRomanNpc7Packet(EntityPlayer npc) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
            connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, npc));
            connection.sendPacket(new PacketPlayOutNamedEntitySpawn(npc));
            connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc, (byte) (npc.yaw * 356 / 360)));

        }
    }
    public void removeRomanNpc7Packet(EntityPlayer npc) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
            DataWatcher watcher = npc.getDataWatcher();
            watcher.set(new DataWatcherObject<>(16, DataWatcherRegistry.a), (byte) 255);
            connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.REMOVE_PLAYER, npc));
            connection.sendPacket(new PacketPlayOutEntityDestroy(npc.getId()));

        }
    }

    public void addJoinPacket(Player player) {
        for (EntityPlayer npc : RomanNpc7) {
            PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
            connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, npc));
            connection.sendPacket(new PacketPlayOutNamedEntitySpawn(npc));
            connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc, (byte) (npc.yaw * 356 / 360)));


        }

    }

    public void update(EntityPlayer npc, PathfindingRoman mob) {
        for (Player player : Bukkit.getOnlinePlayers()) {

            PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;

            connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc, (byte) (mob.lastYaw * 256 / 360)));
            connection.sendPacket(new PacketPlayOutEntity.PacketPlayOutEntityLook(npc.getId(), (byte) (mob.lastYaw * 256 / 360), (byte) (mob.lastPitch * 256 / 360), true));

        }
    }

    public void npcMove(EntityPlayer npc, double x, double y, double z) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
            connection.sendPacket(new PacketPlayOutEntity.PacketPlayOutRelEntityMove(npc.getId(), (short) (x * 4096), (short) (y * 4096), (short) (z * 4096), true));


        }
    }

    public void npcTakeDamage(EntityPlayer npc) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
            connection.sendPacket(new PacketPlayOutAnimation(npc, 1));
        }
    }

    public static List<EntityPlayer> getNpcs() {
        return RomanNpc7;
    }
}