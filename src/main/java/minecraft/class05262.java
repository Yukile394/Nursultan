package minecraft;

import Nursultan.class10504;
import Nursultan.class10505;
import Nursultan.class10506;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

public class class05262 extends class07482 {
   public static final int N = 35;
   public static final int y = 0;
   public static final int L = 1;
   public static final int u = 2;
   private static final int R = 3;
   private static final int j = 30;
   private static final int v = 30;
   private static final int n = 39;
   private final class06695 t = new class06919();
   final class06695 i = new class10504(this, 2);
   private final class05880 G;

   private void L(class06584 var1, class06584 var2) {
      class07323.N(var1, var1x -> {
         for (Entry entry : class07323.y(var2).y()) {
            class03556<class07304> class03556 = (class03556<class07304>)entry.getKey();
            if (!class03556.N(class02625.P) || var1x.N(class03556) == 0) {
               var1x.y(class03556, entry.getIntValue());
            }
         }
      });
   }

   public class05262(int var1, class08044 var2) {
      this(var1, var2, class05880.N);
   }

   public class05262(int var1, class08044 var2, class05880 var3) {
      super(class05851.field_17336, var1);
      this.G = var3;
      this.N(new class10506(this, this.i, 0, 49, 19));
      this.N(new class10505(this, this.i, 1, 49, 40));
      this.N(new class05277(this, this.t, 2, 129, 34, var3));
      this.L(var2, 8, 84);
   }

   private class06584 y(class06584 var1, class06584 var2) {
      if (!var1.N(var2.B())) {
         return class06584.E;
      } else {
         int ix = Math.max(var1.s(), var2.s());
         int jx = var1.s() - var1.P();
         int k = var2.s() - var2.P();
         int l = jx + k + ix * 5 / 100;
         byte b0 = 1;
         if (!var1.W()) {
            if (var1.U() < 2 || !class06584.N(var1, var2)) {
               return class06584.E;
            }

            b0 = 2;
         }

         class06584 class06584 = var1.L(b0);
         if (class06584.W()) {
            class06584.N(class02484.u, Integer.valueOf(ix));
            class06584.y(Math.max(ix - l, 0));
         }

         this.L(class06584, var2);
         return this.y(class06584);
      }
   }

   private class06584 y(class06584 var1) {
      class02710 class02710 = class07323.N(var1, var0 -> var0.N(var0x -> !var0x.N(class02625.P)));
      if (var1.N(class06570.Gq) && class02710.u()) {
         var1 = var1.N((class07310)class06570.jY);
      }

      int ix = 0;

      for (int jx = 0; jx < class02710.L(); jx++) {
         ix = class07497.N(ix);
      }

      var1.N(class02484.n, Integer.valueOf(ix));
      return var1;
   }

   @Override
   public void y(class08036 var1) {
      super.y(var1);
      this.G.N_53((var2, var3) -> this.N(var1, this.i));
   }

   @Override
   public void y(class06695 var1) {
      super.y(var1);
      if (var1 == this.i) {
         this.E();
      }
   }

   private void E() {
      this.t.method_5447(0, this.N(this.i.method_5438(0), this.i.method_5438(1)));
      this.u();
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584xxx = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584xxx = class06584x.t();
         class06584 class06584xx = this.i.method_5438(0);
         class06584 class06584xxx = this.i.method_5438(1);
         if (var2 == 2) {
            if (!this.N(class06584x, 3, 39, true)) {
               return class06584.E;
            }

            class06937.y(class06584x, class06584xxx);
         } else if (var2 != 0 && var2 != 1) {
            if (!class06584xx.R() && !class06584xxx.R()) {
               if (var2 >= 3 && var2 < 30) {
                  if (!this.N(class06584x, 30, 39, false)) {
                     return class06584.E;
                  }
               } else if (var2 >= 30 && var2 < 39 && !this.N(class06584x, 3, 30, false)) {
                  return class06584.E;
               }
            } else if (!this.N(class06584x, 0, 2, false)) {
               return class06584.E;
            }
         } else if (!this.N(class06584x, 3, 39, false)) {
            return class06584.E;
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         } else {
            class06937.M();
         }

         if (class06584x.c() == class06584xxx.c()) {
            return class06584.E;
         }

         class06937.N(var1, class06584x);
      }

      return class06584xxx;
   }

   @Override
   public boolean N(class08036 var1) {
      return N(this.G, var1, class00869.Px);
   }

   private class06584 N(class06584 var1, class06584 var2) {
      if (var1.R() && var2.R()) {
         return class06584.E;
      } else if (var1.c() > 1 || var2.c() > 1) {
         return class06584.E;
      } else if (var1.R() || var2.R()) {
         class06584 class06584 = !var1.R() ? var1 : var2;
         return !class07323.u(class06584) ? class06584.E : this.y(class06584.t());
      } else {
         return this.y(var1, var2);
      }
   }
}
