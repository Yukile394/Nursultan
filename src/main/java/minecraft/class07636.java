package minecraft;

import org.jspecify.annotations.Nullable;

class class07636 extends class07473 {
   private final class07617 N;
   @Nullable
   private class08036 y;
   @Nullable
   private class07209 L;
   private int u;

   @Override
   public void L() {
      if (this.L != null) {
         this.N.B(false);
         this.N.f().N((double)this.L.method_10263(), (double)this.L.method_10264(), (double)this.L.method_10260(), 1.1F);
      }
   }

   private boolean M() {
      for (class07617 class07617 : this.N.method_73183().N(class07617.class, new class00734(this.L).M(2.0))) {
         if (class07617 != this.N && (class07617.W() || class07617.m())) {
            return true;
         }
      }

      return false;
   }

   public class07636(class07617 var1) {
      super();
      this.N = var1;
   }

   private void Z() {
      class06069 class06069 = this.N.method_59922();
      class07218 class07218 = new class07218();
      class07218.N(this.N.g_() ? this.N.yW().method_24515() : this.N.method_24515());
      this.N
         .method_6082(
            class07218.method_10263() + class06069.y(11) - 5,
            class07218.method_10264() + class06069.y(5) - 2,
            class07218.method_10260() + class06069.y(11) - 5,
            false
         );
      class07218.N(this.N.method_24515());
      this.N
         .method_64169(
            N(this.N),
            class06273.NT,
            (var2x, var3) -> var2x.method_8649(
               new class00717(
                  var2x,
                  (double)class07218.method_10263() - class04995.m(this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 * (float) (Math.PI / 180.0)),
                  class07218.method_10264(),
                  (double)class07218.method_10260() + class04995.P(this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 * (float) (Math.PI / 180.0)),
                  var3
               )
            )
         );
   }

   @Override
   public void i() {
      if (this.y != null && this.L != null) {
         this.N.B(false);
         this.N.f().N((double)this.L.method_10263(), (double)this.L.method_10264(), (double)this.L.method_10260(), 1.1F);
         if (this.N.method_5858(this.y) < 2.5) {
            this.u++;
            if (this.u > this.N(16)) {
               this.N.N(true);
               this.N.z(false);
            } else {
               this.N.N(this.y, 45.0F, 45.0F);
               this.N.z(true);
            }
         } else {
            this.N.N(false);
         }
      }
   }

   @Override
   public void u() {
      this.N.N(false);
      if (this.y.method_7297() >= 100 && this.N.method_73183().method_8409().z() < this.N.method_73183().method_75728().N(class00608.c, this.N.method_73189())) {
         this.Z();
      }

      this.u = 0;
      this.N.z(false);
      this.N.f().W();
   }

   @Override
   public boolean y() {
      return this.N.NQ() && !this.N.NJ() && this.y != null && this.y.method_6113() && this.L != null && !this.M();
   }

   @Override
   public boolean N() {
      if (!this.N.NQ()) {
         return false;
      } else if (this.N.NJ()) {
         return false;
      } else {
         class07438 class07438 = this.N.L_();
         if (class07438 instanceof class08036 class08036) {
            this.y = class08036;
            if (!class07438.method_6113()) {
               return false;
            }

            if (this.N.method_5858(this.y) > 100.0) {
               return false;
            }

            class07209 class07209 = this.y.method_24515();
            class00500 class00500 = this.N.method_73183().method_8320(class07209);
            if (class00500.N(class01210.F)) {
               this.L = class00500.u(class07789.R).map(var1x -> class07209.method_10093(var1x.b())).orElseGet(() -> new class07209(class07209));
               return !this.M();
            }
         }

         return false;
      }
   }
}
