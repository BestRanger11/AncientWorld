package me.bestranger11.ancient.NPCS.Roman;

import net.minecraft.server.v1_16_R3.*;

import java.util.EnumSet;

public class Pathfinding extends PathfinderGoal {
    private final EntityInsentient a;
    private EntityLiving b;
    private final double f;
    private final float g;
    private double c;
    private double d;
    private double e;
    public Pathfinding(EntityInsentient a, double speed, float distance) {
        this.a = a;
        this.f = speed;
        this.g = distance;
        this.a(EnumSet.of(Type.MOVE));
    }


    @Override
    public boolean a() {
        this.b = this.a.getGoalTarget();
        if (this.b == null)
            return false;


        else {

            Vec3D vec = RandomPositionGenerator.a((EntityCreature)this.a, 16, 7, this.b.getPositionVector());
            if (vec == null)
                return false;

            this.c = this.b.locX();
            this.d = this.b.locY();
            this.e = this.b.locZ();
            return true;
        }
    }
    public void c() {
        this.a.getNavigation().a(this.c, this.d, this.e, this.f);

    }
    public boolean b() {


        return !this.a.getNavigation().m() && this.b.h(this.a) < (double) (this.g * this.g);
    }
    public void d() {
        this.b = null;
    }
}



