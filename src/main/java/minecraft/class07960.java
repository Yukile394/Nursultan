package minecraft;

import java.util.EnumSet;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class07960 extends class07473 {
   private static final class01328 u = class01328.y().u();
   private static final double i = 2.5;
   private final class01328 R;
   protected final class07079 N;
   protected final double y;
   private double M;
   private double B;
   private double Z;
   private double z;
   private double U;
   @Nullable
   protected class08036 L;
   private int E;
   private boolean W;
   private final Predicate<class06584> m;
   private final boolean P;
   private final double s;

   @Override
   public void L() {
      this.M = this.L.method_23317();
      this.B = this.L.method_23318();
      this.Z = this.L.method_23321();
      this.W = true;
   }

   protected boolean M() {
      return this.P;
   }

   public class07960(class07475 var1, double var2, Predicate<class06584> var4, boolean var5) {
      this((class07079)var1, var2, var4, var5, 2.5);
   }

   public class07960(class07475 var1, double var2, Predicate<class06584> var4, boolean var5, double var6) {
      this((class07079)var1, var2, var4, var5, var6);
   }

   class07960(class07079 var1, double var2, Predicate<class06584> var4, boolean var5, double var6) {
      super();
      this.N = var1;
      this.y = var2;
      this.m = var4;
      this.P = var5;
      this.s = var6;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
      this.R = u.L().N((var1x, var2x) -> this.N(var1x));
   }

   protected void Z() {
      this.N.f().W();
   }

   @Override
   public void i() {
      this.N.p().N(this.L, this.N.NR() + 20, this.N.Ni());
      if (this.N.method_5858(this.L) < this.s * this.s) {
         this.Z();
      } else {
         this.N(this.L);
      }
   }

   public boolean U() {
      return this.W;
   }

   @Override
   public void u() {
      this.L = null;
      this.Z();
      this.E = y(100);
      this.W = false;
   }

   @Override
   public boolean y() {
      if (this.M()) {
         if (this.N.method_5858(this.L) < 36.0) {
            if (this.L.method_5649(this.M, this.B, this.Z) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs(this.L.method_36455() - this.z) > 5.0 || Math.abs(this.L.method_36454() - this.U) > 5.0) {
               return false;
            }
         } else {
            this.M = this.L.method_23317();
            this.B = this.L.method_23318();
            this.Z = this.L.method_23321();
         }

         this.z = this.L.method_36455();
         this.U = this.L.method_36454();
      }

      return this.N();
   }

   @Override
   public boolean N() {
      if (this.E > 0) {
         this.E--;
         return false;
      } else {
         this.L = N(this.N).N(this.R.N(this.N.method_45325(class05298.J)), this.N);
         return this.L != null;
      }
   }

   protected void N(class08036 var1) {
      this.N.f().N(var1, this.y);
   }

   private boolean N(class07438 var1) {
      return this.m.test(var1.method_6047()) || this.m.test(var1.method_6079());
   }
}
