package minecraft;

import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class class07984 extends class07473 {
   private final class07079 N;
   private final class07172 y;
   @Nullable
   private class07438 L;
   private int u = -1;
   private final double i;
   private int R;
   private final int M;
   private final int B;
   private final float Z;
   private final float z;

   public class07984(class07172 var1, double var2, int var4, float var5) {
      this(var1, var2, var4, var4, var5);
   }

   public class07984(class07172 var1, double var2, int var4, int var5, float var6) {
      super();
      if (!(var1 instanceof class07438)) {
         throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
      } else {
         this.y = var1;
         this.N = (class07079)var1;
         this.i = var2;
         this.M = var4;
         this.B = var5;
         this.Z = var6;
         this.z = var6 * var6;
         this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
      }
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void i() {
      double d0 = this.N.method_5649(this.L.method_23317(), this.L.method_23318(), this.L.method_23321());
      boolean flag = this.N.C().N(this.L);
      if (flag) {
         this.R++;
      } else {
         this.R = 0;
      }

      if (!(d0 > this.z) && this.R >= 5) {
         this.N.f().W();
      } else {
         this.N.f().N(this.L, this.i);
      }

      this.N.p().N(this.L, 30.0F, 30.0F);
      if (--this.u == 0) {
         if (!flag) {
            return;
         }

         float f = (float)Math.sqrt(d0) / this.Z;
         float f1 = class04995.N(f, 0.1F, 1.0F);
         this.y.N(this.L, f1);
         this.u = class04995.y(f * (this.B - this.M) + this.M);
      } else if (this.u < 0) {
         this.u = class04995.N(class04995.u(Math.sqrt(d0) / this.Z, (double)this.M, (double)this.B));
      }
   }

   @Override
   public void u() {
      this.L = null;
      this.R = 0;
      this.u = -1;
   }

   @Override
   public boolean y() {
      return this.N() || this.L.method_5805() && !this.N.f().U();
   }

   @Override
   public boolean N() {
      class07438 class07438 = this.N.T();
      if (class07438 != null && class07438.method_5805()) {
         this.L = class07438;
         return true;
      } else {
         return false;
      }
   }
}
