package me.bestranger11.ancient.NPCS.Roman;

import me.bestranger11.ancient.Armor.RomanArmor.RomanBoots;
import me.bestranger11.ancient.Armor.RomanArmor.RomanCP;
import me.bestranger11.ancient.Armor.RomanArmor.RomanHat;
import me.bestranger11.ancient.Armor.RomanArmor.RomanLegs;
import me.bestranger11.ancient.NPCS.Persian.Persian;
import me.bestranger11.ancient.Weapons.RomanWeapons.Spear.RomanSpear;
import net.minecraft.server.v1_16_R3.*;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftItem;
import org.bukkit.craftbukkit.v1_16_R3.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PathfindingRoman extends EntityZombie {
    public PathfindingRoman(Location loc, Player player) {
        super(EntityTypes.ZOMBIE, ((CraftWorld) loc.getWorld()).getHandle());
        this.setPosition(loc.getX(), loc.getY(), loc.getZ());
        this.setSilent(true);
        this.setHealth(500);
        this.setSprinting(true);
        ItemStack spear = new ItemStack(RomanSpear.RomanSpear);
        ItemStack helm = new ItemStack(RomanHat.RomanHat);
        ItemStack boots = new ItemStack(RomanBoots.RomanBoots);
        ItemStack chest = new ItemStack(RomanCP.RomanChestpiece);
        ItemStack legs = new ItemStack(RomanLegs.RomanLegs);
        this.setSlot(EnumItemSlot.MAINHAND, CraftItemStack.asNMSCopy(spear));
        this.setSlot(EnumItemSlot.FEET, CraftItemStack.asNMSCopy(boots));
        this.setSlot(EnumItemSlot.HEAD, CraftItemStack.asNMSCopy(helm));
        this.setSlot(EnumItemSlot.LEGS, CraftItemStack.asNMSCopy(legs));
        this.setSlot(EnumItemSlot.CHEST, CraftItemStack.asNMSCopy(chest));
    }
    @Override
    public void setOnFire(int i) {

    }
    @Override
    protected void initPathfinder() {
        this.goalSelector.a(1, new PathfinderGoalFloat(this));
        this.goalSelector.a(4, new PathfinderGoalMeleeAttack(this, 1.0D, true));
        this.goalSelector.a(5, new PathfinderGoalMoveTowardsRestriction(this, 3.0));
        this.goalSelector.a(1, new PathfinderGoalNearestAttackableTarget<Persian>(this, Persian.class, true));
        this.goalSelector.a(7, new PathfinderGoalRandomStrollLand(this, 1.0));
        this.goalSelector.a(8, new PathfinderGoalRandomLookaround(this));
        this.goalSelector.a(2, new PathfinderGoalHurtByTarget(this));




    }

}