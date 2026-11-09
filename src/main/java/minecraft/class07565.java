package minecraft;

import java.util.EnumSet;

class class07565 extends class07473 {
   private final class07530 N;
   private int y;
   private int L;
   private int u;

   @Override
   public void L() {
      this.y = 0;
   }

   private double M() {
      return this.N.method_45325(class05298.P);
   }

   public class07565(class07530 var1) {
      super();
      this.N = var1;
      this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void i() {
      this.L--;
      class07438 class07438 = this.N.T();
      if (class07438 != null) {
         boolean flag = this.N.C().N(class07438);
         if (flag) {
            this.u = 0;
         } else {
            this.u++;
         }

         double d0 = this.N.method_5858(class07438);
         if (d0 < 4.0) {
            if (!flag) {
               return;
            }

            if (this.L <= 0) {
               this.L = 20;
               this.N.method_6121(N(this.N), class07438);
            }

            this.N.F().N(class07438.method_23317(), class07438.method_23318(), class07438.method_23321(), 1.0);
         } else if (d0 < this.M() * this.M() && flag) {
            double d1 = class07438.method_23317() - this.N.method_23317();
            double d2 = class07438.method_23323(0.5) - this.N.method_23323(0.5);
            double d3 = class07438.method_23321() - this.N.method_23321();
            if (this.L <= 0) {
               this.y++;
               if (this.y == 1) {
                  this.L = 60;
                  this.N.N(true);
               } else if (this.y <= 4) {
                  this.L = 6;
               } else {
                  this.L = 100;
                  this.y = 0;
                  this.N.N(false);
               }

               if (this.y > 1) {
                  double d4 = Math.sqrt(Math.sqrt(d0)) * 0.5;
                  if (!this.N.method_5701()) {
                     this.N.method_73183().method_8444(null, 1018, this.N.method_24515(), 0);
                  }

                  for (int i = 0; i < 1; i++) {
                     class06889 class06889 = new class06889(this.N.method_59922().N(d1, 2.297 * d4), d2, this.N.method_59922().N(d3, 2.297 * d4));
                     class08029 class08029 = new class08029(this.N.method_73183(), this.N, class06889.u());
                     class08029.method_5814(class08029.method_23317(), this.N.method_23323(0.5) + 0.5, class08029.method_23321());
                     this.N.method_73183().method_8649(class08029);
                  }
               }
            }

            this.N.p().N(class07438, 10.0F, 10.0F);
         } else if (this.u < 5) {
            this.N.F().N(class07438.method_23317(), class07438.method_23318(), class07438.method_23321(), 1.0);
         }

         super.i();
      }
   }

   @Override
   public void u() {
      this.N.N(false);
      this.u = 0;
   }

   @Override
   public boolean N() {
      class07438 class07438 = this.N.T();
      return class07438 != null && class07438.method_5805() && this.N.method_18395(class07438);
   }
}
