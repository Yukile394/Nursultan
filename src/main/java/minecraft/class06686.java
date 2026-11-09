package minecraft;

import java.util.List;
import java.util.function.Predicate;

public class class06686 {
   public static final String N = "Items";

   public class06686() {
      super();
   }

   public static void N(class08329 var0, class00743<class06584> var1, boolean var2) {
      class08294<class08332> class08294 = var0.N("Items", class08332.N);

      for (int i = 0; i < var1.size(); i++) {
         class06584 class06584 = (class06584)var1.get(i);
         if (!class06584.R()) {
            class08294.N(new class08332(i, class06584));
         }
      }

      if (class08294.N() && !var2) {
         var0.L("Items");
      }
   }

   public static void N(class08299 var0, class00743<class06584> var1) {
      for (class08332 class08332 : var0.L("Items", class08332.N)) {
         if (class08332.N(var1.size())) {
            var1.set(class08332.N(), class08332.y());
         }
      }
   }

   public static int N(class06695 var0, Predicate<class06584> var1, int var2, boolean var3) {
      int i = 0;

      for (int j = 0; j < var0.method_5439(); j++) {
         class06584 class06584 = var0.method_5438(j);
         int k = N(class06584, var1, var2 - i, var3);
         if (k > 0 && !var3 && class06584.R()) {
            var0.method_5447(j, class06584.E);
         }

         i += k;
      }

      return i;
   }

   public static int N(class06584 var0, Predicate<class06584> var1, int var2, boolean var3) {
      if (var0.R() || !var1.test(var0)) {
         return 0;
      } else if (var3) {
         return var0.c();
      } else {
         int i = var2 < 0 ? var0.c() : Math.min(var2, var0.c());
         var0.B(i);
         return i;
      }
   }

   public static void N(class08329 var0, class00743<class06584> var1) {
      N(var0, var1, true);
   }

   public static class06584 N(List<class06584> var0, int var1) {
      return var1 >= 0 && var1 < var0.size() ? var0.set(var1, class06584.E) : class06584.E;
   }

   public static class06584 N(List<class06584> var0, int var1, int var2) {
      return var1 >= 0 && var1 < var0.size() && !((class06584)var0.get(var1)).R() && var2 > 0 ? ((class06584)var0.get(var1)).N(var2) : class06584.E;
   }
}
