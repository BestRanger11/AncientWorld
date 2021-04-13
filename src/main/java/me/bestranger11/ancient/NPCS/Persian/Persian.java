package me.bestranger11.ancient.NPCS.Persian;

import me.bestranger11.ancient.NPCS.Roman.PathfindingRoman;
import net.minecraft.server.v1_16_R3.*;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;
import org.bukkit.entity.Player;

public class Persian extends EntityZombie{
    public Persian(Location loc, Player player) {
        super(EntityTypes.ZOMBIE, ((CraftWorld) loc.getWorld()).getHandle());
        this.setPosition(loc.getX(), loc.getY(), loc.getZ());
        this.setInvisible(true);
        this.setSilent(true);
        this.setHealth(500);
        this.setSprinting(true);
    }

    @Override
        public void setOnFire(int i) {
    }
    @Override
    public void initPathfinder() {
        this.goalSelector.a(1, new PathfinderGoalFloat(this));
        this.goalSelector.a(4, new PathfinderGoalMeleeAttack(this, 1.0D, true));
        this.goalSelector.a(5, new PathfinderGoalMoveTowardsRestriction(this, 3.0));
        this.goalSelector.a(1, new PathfinderGoalNearestAttackableTarget<PathfindingRoman>(this, PathfindingRoman.class, true));
        this.goalSelector.a(7, new PathfinderGoalRandomStrollLand(this, 1.0));
        this.goalSelector.a(8, new PathfinderGoalRandomLookaround(this));
        this.goalSelector.a(2, new PathfinderGoalHurtByTarget(this));

        }

}
