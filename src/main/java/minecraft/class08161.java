package minecraft;

import java.util.EnumSet;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class08161<T extends class07150> extends class07473 {
   static final int N = 6;
   static final int y = 7;
   static final int L = 9;
   static final int u = 11;
   static final double i = y(100);
   private final T z;
   @Nullable
   private class08177 U;
   double R;
   double M;
   float B;
   float Z;

   @Override
   public void L() {
      super.L();
      this.z.R(true);
      this.U = new class08177();
   }

   private boolean M() {
      return this.z.T() != null && this.z.method_6047().L(class02484.X);
   }

   public class08161(T var1, double var2, double var4, float var6, float var7) {
      super();
      this.z = (T)var1;
      this.R = var2;
      this.M = var4;
      this.B = var6 * var6;
      this.Z = var7 * var7;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   private int Z() {
      return y(Optional.ofNullable(this.z.method_6047().method_58694(class02484.X)).map(class08174::N).orElse(0));
   }

   @Override
   public void i() {
      if (this.U != null) {
         class07438 class07438 = this.z.T();
         double d0 = this.z.method_5649(class07438.method_23317(), class07438.method_23318(), class07438.method_23321());
         class07049 class07049 = this.z.method_5668();
         float f = 1.0F;
         if (class07049 instanceof class07079 class07079) {
            f = class07079.K_();
         }

         int ix = this.z.method_5765() ? 2 : 0;
         this.z.N(class07438, 30.0F, 30.0F);
         this.z.p().N(class07438, 30.0F, 30.0F);
         if (this.U.N()) {
            if (d0 > this.B) {
               this.z.f().N(class07438, f * this.M);
               return;
            }

            this.U.N(this.Z());
            this.z.method_6019(class07050.field_5808);
         }

         if (this.U.y()) {
            this.z.method_6021();
            double d1 = Math.sqrt(d0);
            this.U.y = class05456.N(this.z, Math.max(0.0, 9 + ix - d1), Math.max(1.0, 11 + ix - d1), 7, class07438.method_73189());
            this.U.N = 1;
         }

         if (!this.U.L()) {
            if (this.U.y != null) {
               this.z.f().N(this.U.y.M, this.U.y.B, this.U.y.Z, f * this.M);
               if (this.z.f().U()) {
                  if (this.U.N > 0) {
                     this.U.L = true;
                     return;
                  }

                  this.U.y = null;
               }
            } else {
               this.z.f().N(class07438, f * this.R);
               if (d0 < this.Z || this.z.f().U()) {
                  double d2 = Math.sqrt(d0);
                  this.U.y = class05456.N(this.z, 6 + ix - d2, 7 + ix - d2, 7, class07438.method_73189());
               }
            }
         }
      }
   }

   @Override
   public void u() {
      super.u();
      this.z.f().W();
      this.z.R(false);
      this.U = null;
      this.z.method_6021();
   }

   @Override
   public boolean y() {
      return this.U != null && !this.U.L && this.M();
   }

   @Override
   public boolean N() {
      return this.M() && !this.z.method_6115();
   }
}
