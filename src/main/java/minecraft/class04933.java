package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class04933 {
   private static final int u = 3;
   private static final int i = 3;
   private static final int R = 50;
   private static final int M = 10;
   private static final boolean B = true;
   public static final int N = 64;
   private static final class04918[] Z = new class04918[]{
      new class04918(class04899.class, 40, 0),
      new class04918(class04925.class, 5, 5),
      new class04918(class04896.class, 20, 0),
      new class04918(class04913.class, 20, 0),
      new class04918(class04905.class, 10, 6),
      new class04918(class04929.class, 5, 5),
      new class04918(class04921.class, 5, 5),
      new class04918(class04934.class, 5, 4),
      new class04918(class04936.class, 5, 4),
      new class04908(class04926.class, 10, 2),
      new class04916(class04937.class, 20, 1)
   };
   private static List<class04918> z;
   @Nullable
   static Class<? extends class04931> y;
   private static int U;
   static final class04904 L = new class04904();

   public class04933() {
      super();
   }

   @Nullable
   private static class04931 y(class04898 var0, class03860 var1, class06069 var2, int var3, int var4, int var5, class07211 var6, int var7) {
      if (!y()) {
         return null;
      } else {
         if (y != null) {
            class04931 class04931x = N(y, var1, var2, var3, var4, var5, var6, var7);
            y = null;
            if (class04931x != null) {
               return class04931x;
            }
         }

         int j = 0;

         while (j < 5) {
            j++;
            int ix = var2.y(U);

            for (class04918 class04918 : z) {
               ix -= class04918.y;
               if (ix < 0) {
                  if (!class04918.N(var7) || class04918 == var0.N) {
                     break;
                  }

                  class04931 class04931 = N(class04918.N, var1, var2, var3, var4, var5, var6, var7);
                  if (class04931 != null) {
                     class04918.L++;
                     var0.N = class04918;
                     if (!class04918.N()) {
                        z.remove(class04918);
                     }

                     return class04931;
                  }
               }
            }
         }

         class05163 class05163 = class04928.N(var1, var2, var3, var4, var5, var6);
         return class05163 != null && class05163.Z() > 1 ? new class04928(var7, class05163, var6) : null;
      }
   }

   private static boolean y() {
      boolean flag = false;
      U = 0;

      for (class04918 class04918 : z) {
         if (class04918.u > 0 && class04918.L < class04918.u) {
            flag = true;
         }

         U = U + class04918.y;
      }

      return flag;
   }

   @Nullable
   private static class04931 N(Class<? extends class04931> var0, class03860 var1, class06069 var2, int var3, int var4, int var5, class07211 var6, int var7) {
      Object object = null;
      if (var0 == class04899.class) {
         object = class04899.N(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == class04925.class) {
         object = class04925.N(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == class04896.class) {
         object = class04896.N(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == class04913.class) {
         object = class04913.N(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == class04905.class) {
         object = class04905.N(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == class04929.class) {
         object = class04929.N(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == class04921.class) {
         object = class04921.N(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == class04934.class) {
         object = class04934.N(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == class04936.class) {
         object = class04936.N(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == class04926.class) {
         object = class04926.N(var1, var2, var3, var4, var5, var6, var7);
      } else if (var0 == class04937.class) {
         object = class04937.N(var1, var3, var4, var5, var6, var7);
      }

      return (class04931)object;
   }

   @Nullable
   static class04890 N(class04898 var0, class03860 var1, class06069 var2, int var3, int var4, int var5, class07211 var6, int var7) {
      if (var7 > 50) {
         return null;
      } else if (Math.abs(var3 - var0.L().B()) <= 112 && Math.abs(var5 - var0.L().z()) <= 112) {
         class04931 class04931 = y(var0, var1, var2, var3, var4, var5, var6, var7 + 1);
         if (class04931 != null) {
            var1.N(class04931);
            var0.L.add(class04931);
         }

         return class04931;
      } else {
         return null;
      }
   }

   public static void N() {
      z = Lists.newArrayList();

      for (class04918 class04918 : Z) {
         class04918.L = 0;
         z.add(class04918);
      }

      y = null;
   }
}
