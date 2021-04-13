package me.bestranger11.ancient.Weapons.RomanWeapons.EagleStaff;

import me.bestranger11.ancient.NPCS.Persian.Persian;
import net.minecraft.server.v1_16_R3.ChatComponentText;
import net.minecraft.server.v1_16_R3.EntityBat;
import net.minecraft.server.v1_16_R3.EntityTypes;
import net.minecraft.server.v1_16_R3.PathfinderGoalNearestAttackableTarget;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;

public class Eagle extends EntityBat {
    public Eagle (Location loc) {
        super(EntityTypes.BAT, ((CraftWorld) loc.getWorld()).getHandle());
        this.setPosition(loc.getX(), loc.getY(), loc.getBlockZ());
        this.setHealth(500);
        this.setCustomNameVisible(true);
        this.setCustomName(new ChatComponentText(ChatColor.DARK_RED + "Eagle"));
    }


    public void initPathfinder() {
        super.initPathfinder();
        this.goalSelector.a(1, new PathfinderGoalNearestAttackableTarget<Persian>(this, Persian.class, true));



    }
}

