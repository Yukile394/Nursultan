package minecraft;

import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class07457 extends class07473 {
   private final class07079 N;
   private final Predicate<class07079> y;
   @Nullable
   private class07079 L;
   private final double u;
   private final class07623 i;
   private int R;
   private final float M;
   private float B;
   private final float Z;

   @Override
   public void L() {
      this.R = 0;
      this.B = this.N.N(class04425.field_18);
      this.N.N(class04425.field_18, 0.0F);
   }

   public class07457(class07079 var1, double var2, float var4, float var5) {
      super();
      this.N = var1;
      this.y = var1x -> var1.getClass() != var1x.getClass();
      this.u = var2;
      this.i = var1.f();
      this.M = var4;
      this.Z = var5;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
      if (!(var1.f() instanceof class07655) && !(var1.f() instanceof class07991)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
      }
   }

   @Override
   public void i() {
      if (this.L != null && !this.N.g_()) {
         this.N.p().N(this.L, 10.0F, this.N.Ni());
         if (--this.R <= 0) {
            this.R = this.N(10);
            double d0 = this.N.method_23317() - this.L.method_23317();
            double d1 = this.N.method_23318() - this.L.method_23318();
            double d2 = this.N.method_23321() - this.L.method_23321();
            double d3 = d0 * d0 + d1 * d1 + d2 * d2;
            if (!(d3 <= this.M * this.M)) {
               this.i.N(this.L, this.u);
            } else {
               this.i.W();
               class07442 class07442 = this.L.p();
               if (d3 <= this.M
                  || class07442.i() == this.N.method_23317() && class07442.R() == this.N.method_23318() && class07442.M() == this.N.method_23321()) {
                  double d4 = this.L.method_23317() - this.N.method_23317();
                  double d5 = this.L.method_23321() - this.N.method_23321();
                  this.i.N(this.N.method_23317() - d4, this.N.method_23318(), this.N.method_23321() - d5, this.u);
               }
            }
         }
      }
   }

   @Override
   public void u() {
      this.L = null;
      this.i.W();
      this.N.N(class04425.field_18, this.B);
   }

   @Override
   public boolean y() {
      return this.L != null && !this.i.U() && this.N.method_5858(this.L) > this.M * this.M;
   }

   @Override
   public boolean N() {
      List<class07079> list = this.N.method_73183().N(class07079.class, this.N.method_5829().M(this.Z), this.y);
      if (!list.isEmpty()) {
         for (class07079 class07079 : list) {
            if (!class07079.method_5767()) {
               this.L = class07079;
               return true;
            }
         }
      }

      return false;
   }
}
