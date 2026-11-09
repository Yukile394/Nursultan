package minecraft;

import Nursultan.class10569;
import Nursultan.class10570;
import Nursultan.class10571;
import Nursultan.class10573;

public class class06231 extends class07482 {
   public static final int N = 0;
   public static final int y = 1;
   public static final int L = 2;
   private static final int R = 3;
   private static final int j = 30;
   private static final int v = 30;
   private static final int n = 39;
   private final class05880 t;
   long u;
   public final class06695 i = new class10570(this, 2);
   private final class06919 G = new class10573(this);

   public class06231(int var1, class08044 var2) {
      this(var1, var2, class05880.N);
   }

   public class06231(int var1, class08044 var2, class05880 var3) {
      super(class05851.field_17343, var1);
      this.t = var3;
      this.N(new class10569(this, this.i, 0, 15, 15));
      this.N(new class10571(this, this.i, 1, 15, 52));
      this.N(new class06269(this, this.G, 2, 145, 39, var3));
      this.L(var2, 8, 84);
   }

   @Override
   public void y(class06695 var1) {
      class06584 class06584xx = this.i.method_5438(0);
      class06584 class06584x = this.i.method_5438(1);
      class06584 class06584xx = this.G.method_5438(2);
      if (class06584xx.R() || !class06584xx.R() && !class06584x.R()) {
         if (!class06584xx.R() && !class06584x.R()) {
            this.N(class06584xx, class06584x, class06584xx);
         }
      } else {
         this.G.method_5441(2);
      }
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      this.G.method_5441(2);
      this.t.N_53((var2, var3) -> this.N(var1, this.i));
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584x = class06584x.t();
         if (var2 == 2) {
            class06584x.B().L(class06584x, var1);
            if (!this.N(class06584x, 3, 39, true)) {
               return class06584.E;
            }

            class06937.y(class06584x, class06584x);
         } else if (var2 != 1 && var2 != 0) {
            if (class06584x.L(class02484.f)) {
               if (!this.N(class06584x, 0, 1, false)) {
                  return class06584.E;
               }
            } else if (!class06584x.N(class06570.jk) && !class06584x.N(class06570.Gt) && !class06584x.N(class06570.Mg)) {
               if (var2 >= 3 && var2 < 30) {
                  if (!this.N(class06584x, 30, 39, false)) {
                     return class06584.E;
                  }
               } else if (var2 >= 30 && var2 < 39 && !this.N(class06584x, 3, 30, false)) {
                  return class06584.E;
               }
            } else if (!this.N(class06584x, 1, 2, false)) {
               return class06584.E;
            }
         } else if (!this.N(class06584x, 3, 39, false)) {
            return class06584.E;
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         }

         class06937.M();
         if (class06584x.c() == class06584x.c()) {
            return class06584.E;
         }

         class06937.N(var1, class06584x);
         this.u();
      }

      return class06584x;
   }

   @Override
   public boolean N(class06584 var1, class06937 var2) {
      return var2.L != this.G && super.N(var1, var2);
   }

   private void N(class06584 var1, class06584 var2, class06584 var3) {
      this.t.N_53((var4, var5) -> {
         class07769 class07769 = class06548.y(var1, var4);
         if (class07769 != null) {
            class06584 class06584;
            if (var2.N(class06570.jk) && !class07769.Z && class07769.M < 4) {
               class06584 = var1.L(1);
               class06584.N(class02484.S, class02705.field_49354);
               this.u();
            } else if (var2.N(class06570.Mg) && !class07769.Z) {
               class06584 = var1.L(1);
               class06584.N(class02484.S, class02705.field_49353);
               this.u();
            } else {
               if (!var2.N(class06570.Gt)) {
                  this.G.method_5441(2);
                  this.u();
                  return;
               }

               class06584 = var1.L(2);
               this.u();
            }

            if (!class06584.N(class06584, var3)) {
               this.G.method_5447(2, class06584);
               this.u();
            }
         }
      });
   }

   @Override
   public boolean N(class08036 var1) {
      return N(this.t, var1, class00869.PC);
   }
}
