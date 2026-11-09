package minecraft;

import com.mojang.datafixers.util.Pair;
import org.jspecify.annotations.Nullable;

public class class05721 extends class06520 {
   @Nullable
   private static Pair<class06584, class06584> L(class02903 var0) {
      if (var0.i() != 2) {
         return null;
      } else {
         class06584 class06584x = null;

         for (int i = 0; i < var0.N(); i++) {
            class06584 class06584x = var0.N(i);
            if (!class06584x.R()) {
               if (class06584x != null) {
                  return N(class06584x, class06584x) ? Pair.of(class06584x, class06584x) : null;
               }

               class06584x = class06584x;
            }
         }

         return null;
      }
   }

   public class05721(class03762 var1) {
      super(var1);
   }

   private static boolean N(class06584 var0, class06584 var1) {
      return var1.N(var0.B()) && var0.c() == 1 && var1.c() == 1 && var0.L(class02484.u) && var1.L(class02484.u) && var0.L(class02484.i) && var1.L(class02484.i);
   }

   public boolean method_8115(class02903 var1, class07299 var2) {
      return L(var1) != null;
   }

   public class06584 method_8116(class02903 var1, class01929 var2) {
      Pair<class06584, class06584> pair = L(var1);
      if (pair == null) {
         return class06584.E;
      } else {
         class06584 class06584xx = (class06584)pair.getFirst();
         class06584 class06584x = (class06584)pair.getSecond();
         int i = Math.max(class06584xx.s(), class06584x.s());
         int j = class06584xx.s() - class06584xx.P();
         int k = class06584x.s() - class06584x.P();
         int l = j + k + i * 5 / 100;
         class06584 class06584xx = new class06584(class06584xx.B());
         class06584xx.N(class02484.u, Integer.valueOf(i));
         class06584xx.y(Math.max(i - l, 0));
         class02710 class02710x = class07323.y(class06584xx);
         class02710 class02710x = class07323.y(class06584x);
         class07323.N(class06584xx, var3x -> var2.y(class04227.yR).z().filter(var0x -> var0x.N(class02625.P)).forEach(var3xx -> {
            int ix = Math.max(class02710x.N(var3xx), class02710.N(var3xx));
            if (ix > 0) {
               var3x.y(var3xx, ix);
            }
         }));
         return class06584xx;
      }
   }

   @Override
   public class06514<class05721> method_8119() {
      return class06514.P;
   }
}
