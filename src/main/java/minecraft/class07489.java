package minecraft;

import Nursultan.class10752;
import Nursultan.class10756;

public class class07489 extends class07482 {
   public static final class01894 N = class01894.y("container/slot/brewing_fuel");
   static final class01894 y = class01894.y("container/slot/potion");
   private static final int L = 0;
   private static final int u = 2;
   private static final int i = 3;
   private static final int R = 4;
   private static final int j = 5;
   private static final int v = 2;
   private static final int n = 5;
   private static final int t = 32;
   private static final int G = 32;
   private static final int l = 41;
   private final class06695 d;
   private final class05845 w;
   private final class06937 k;

   public class07489(int var1, class08044 var2) {
      this(var1, var2, new class07075(5), new class05853(2));
   }

   public class07489(int var1, class08044 var2, class06695 var3, class05845 var4) {
      super(class05851.field_17332, var1);
      N(var3, 5);
      N(var4, 2);
      this.d = var3;
      this.w = var4;
      class06511 class06511 = var2.z.method_73183().method_59547();
      this.N(new class07484(var3, 0, 56, 51));
      this.N(new class07484(var3, 1, 79, 58));
      this.N(new class07484(var3, 2, 102, 51));
      this.k = this.N(new class10752(class06511, var3, 3, 79, 17));
      this.N(new class10756(var3, 4, 17, 17));
      this.N(var4);
      this.L(var2, 8, 84);
   }

   public int E() {
      return this.w.N(1);
   }

   @Override
   public class06584 N(class08036 var1, int var2) {
      class06584 class06584x = class06584.E;
      class06937 class06937 = this.T.get(var2);
      if (class06937 != null && class06937.R()) {
         class06584 class06584x = class06937.i();
         class06584x = class06584x.t();
         if ((var2 < 0 || var2 > 2) && var2 != 3 && var2 != 4) {
            if (class10756.y(class06584x)) {
               if (this.N(class06584x, 4, 5, false) || this.k.N(class06584x) && !this.N(class06584x, 3, 4, false)) {
                  return class06584.E;
               }
            } else if (this.k.N(class06584x)) {
               if (!this.N(class06584x, 3, 4, false)) {
                  return class06584.E;
               }
            } else if (class07484.y(class06584x)) {
               if (!this.N(class06584x, 0, 3, false)) {
                  return class06584.E;
               }
            } else if (var2 >= 5 && var2 < 32) {
               if (!this.N(class06584x, 32, 41, false)) {
                  return class06584.E;
               }
            } else if (var2 >= 32 && var2 < 41) {
               if (!this.N(class06584x, 5, 32, false)) {
                  return class06584.E;
               }
            } else if (!this.N(class06584x, 5, 41, false)) {
               return class06584.E;
            }
         } else {
            if (!this.N(class06584x, 5, 41, true)) {
               return class06584.E;
            }

            class06937.y(class06584x, class06584x);
         }

         if (class06584x.R()) {
            class06937.u(class06584.E);
         } else {
            class06937.M();
         }

         if (class06584x.c() == class06584x.c()) {
            return class06584.E;
         }

         class06937.N(var1, class06584x);
      }

      return class06584x;
   }

   @Override
   public boolean N(class08036 var1) {
      return this.d.method_5443(var1);
   }

   public int W() {
      return this.w.N(0);
   }
}
