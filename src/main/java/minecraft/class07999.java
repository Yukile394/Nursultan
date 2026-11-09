package minecraft;

import java.util.EnumSet;

public class class07999 extends class07473 {
   protected final class07475 N;
   private final double y;
   private final boolean L;
   private class00143 u;
   private double i;
   private double R;
   private double M;
   private int B;
   private int Z;
   private final int z = 20;
   private long U;
   private static final long E = 20L;

   @Override
   public void L() {
      this.N.f().N(this.u, this.y);
      this.N.R(true);
      this.B = 0;
      this.Z = 0;
   }

   protected void M() {
      this.Z = this.N(20);
   }

   public class07999(class07475 var1, double var2, boolean var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var4;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   @Override
   public boolean B() {
      return true;
   }

   protected boolean Z() {
      return this.Z <= 0;
   }

   @Override
   public void i() {
      class07438 class07438 = this.N.T();
      if (class07438 != null) {
         this.N.p().N(class07438, 30.0F, 30.0F);
         this.B = Math.max(this.B - 1, 0);
         if ((this.L || this.N.C().N(class07438))
            && this.B <= 0
            && (this.i == 0.0 && this.R == 0.0 && this.M == 0.0 || class07438.method_5649(this.i, this.R, this.M) >= 1.0 || this.N.method_59922().z() < 0.05F)) {
            this.i = class07438.method_23317();
            this.R = class07438.method_23318();
            this.M = class07438.method_23321();
            this.B = 4 + this.N.method_59922().y(7);
            double d0 = this.N.method_5858(class07438);
            if (d0 > 1024.0) {
               this.B += 10;
            } else if (d0 > 256.0) {
               this.B += 5;
            }

            if (!this.N.f().N(class07438, this.y)) {
               this.B += 15;
            }

            this.B = this.N(this.B);
         }

         this.Z = Math.max(this.Z - 1, 0);
         this.N(class07438);
      }
   }

   protected int U() {
      return this.Z;
   }

   @Override
   public void u() {
      class07438 class07438 = this.N.T();
      if (!class07042.i.test(class07438)) {
         this.N.y(null);
      }

      this.N.R(false);
      this.N.f().W();
   }

   protected boolean y(class07438 var1) {
      return this.Z() && this.N.L(var1) && this.N.C().N(var1);
   }

   @Override
   public boolean y() {
      class07438 class07438 = this.N.T();
      if (class07438 == null) {
         return false;
      } else if (!class07438.method_5805()) {
         return false;
      } else if (!this.L) {
         return !this.N.f().U();
      } else {
         return !this.N.L(class07438.method_24515())
            ? false
            : !(class07438 instanceof class08036 class08036 && (class08036.method_7325() || class08036.method_68878()));
      }
   }

   protected int E() {
      return this.N(20);
   }

   protected void N(class07438 var1) {
      if (this.y(var1)) {
         this.M();
         this.N.method_6104(class07050.field_5808);
         this.N.method_6121(N(this.N), var1);
      }
   }

   @Override
   public boolean N() {
      long ix = this.N.method_73183().N();
      if (ix - this.U < 20L) {
         return false;
      } else {
         this.U = ix;
         class07438 class07438 = this.N.T();
         if (class07438 == null) {
            return false;
         } else if (!class07438.method_5805()) {
            return false;
         } else {
            this.u = this.N.f().N(class07438, 0);
            return this.u != null ? true : this.N.L(class07438);
         }
      }
   }
}
