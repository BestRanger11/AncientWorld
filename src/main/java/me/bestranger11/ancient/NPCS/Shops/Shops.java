package me.bestranger11.ancient.NPCS.Shops;

import com.mojang.authlib.GameProfile;
import javafx.util.Pair;
import net.minecraft.server.v1_16_R3.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_16_R3.CraftServer;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class Shops {

    private static List<EntityPlayer> SoldierShop = new ArrayList<EntityPlayer>();
    private static Map<EntityPlayer, List<Pair<EnumItemSlot, ItemStack>>> equipmentMap = new HashMap<>();

    public static void createSoldierShop(Player player) {
        MinecraftServer server = ((CraftServer) Bukkit.getServer()).getServer();
        WorldServer world = ((CraftWorld) Bukkit.getWorld(player.getWorld().getName())).getHandle();
        GameProfile gameProfile = new GameProfile(UUID.fromString("3314ad5c-083e-430c-badd-58152e418f13"), ChatColor.DARK_RED + "" + ChatColor.BOLD + "SoldierShop");
        EntityPlayer npc = new EntityPlayer(server, world, gameProfile, new PlayerInteractManager(world));
        npc.setLocation(player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ(), player.getLocation().getYaw(), player.getLocation().getPitch());
        npc.setInvulnerable(false);
        npc.setHealth(10);

        addSoldierShopPacket(npc);
        SoldierShop.add(npc);
    }



    public static void addSoldierShopPacket(EntityPlayer npc) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
            connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, npc));
            connection.sendPacket(new PacketPlayOutNamedEntitySpawn(npc));
            connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc, (byte) (npc.yaw * 256 / 360)));

        }
    }

    public static void addJoinPacket(Player player) {
        for (EntityPlayer npc : SoldierShop) {
            PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;
            connection.sendPacket(new PacketPlayOutPlayerInfo(PacketPlayOutPlayerInfo.EnumPlayerInfoAction.ADD_PLAYER, npc));
            connection.sendPacket(new PacketPlayOutNamedEntitySpawn(npc));
            connection.sendPacket(new PacketPlayOutEntityHeadRotation(npc, (byte) (npc.yaw * 256 / 360)));


        }

    }

    public static List<EntityPlayer> getNpcs() {
        return SoldierShop;

    }

}
