package minecraft;

import java.util.Set;
import java.util.UUID;

public final class class02284 {
   private static final int N = 20;
   private static final float y = 0.5F;
   private static final float L = 0.02F;
   private static final int u = 20;
   private static final int i = 20;

   public class02284() {
      super();
   }

   private static class06889 y(class07209 var0, class06069 var1) {
      return class06889.N(var0).y(class04995.N(var1, 0.1, 0.9), class04995.N(var1, 0.25, 0.75), class04995.N(var1, 0.1, 0.9));
   }

   private static boolean N(class07209 var0, class02274 var1, class08036 var2) {
      return var2.method_24515().method_10262(var0) <= class04995.E(var1.i());
   }

   private static void N(class07299 var0, class07209 var1, class02274 var2) {
      if (N(var2)) {
         class06069 class06069 = var0.method_8409();
         if (class06069.z() <= 0.02F) {
            var0.method_45446(var1, class04909.Of, class04911.field_15245, class06069.z() * 0.25F + 0.75F, class06069.z() + 0.5F, false);
         }
      }
   }

   public static boolean N(class02274 var0) {
      return var0.y();
   }

   private static class06889 N(class07209 var0, class06069 var1) {
      return class06889.N(var0).y(class04995.N(var1, 0.4, 0.6), class04995.N(var1, 0.4, 0.6), class04995.N(var1, 0.4, 0.6));
   }

   private static class06889 N(class07209 var0, class07211 var1) {
      return class06889.L(var0).y(var1.P() * 0.5, 1.75, var1.T() * 0.5);
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class02264 var3, class02274 var4) {
      var3.L();
      if (var0.N() % 20L == 0L) {
         N(var0, var1, var2, var4);
      }

      N(var0, var1, var4, var2.L(class02271.u) ? class07107.X : class07107.Nc);
      N(var0, var1, var4);
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class02274 var3, class07126 var4) {
      N(var0, var1, var2, var3);
      class06069 class06069 = var0.field_9229;

      for (int ix = 0; ix < 20; ix++) {
         class06889 class06889 = y(var1, class06069);
         var0.method_8406(class07107.NZ, class06889.N(), class06889.y(), class06889.L(), 0.0, 0.0, 0.0);
         var0.method_8406(var4, class06889.N(), class06889.y(), class06889.L(), 0.0, 0.0, 0.0);
      }
   }

   public static void N(class07299 var0, class07209 var1, class07126 var2) {
      class06069 class06069 = var0.field_9229;

      for (int ix = 0; ix < 20; ix++) {
         class06889 class06889x = N(var1, class06069);
         class06889 class06889x = new class06889(class06069.E() * 0.02, class06069.E() * 0.02, class06069.E() * 0.02);
         var0.method_8406(var2, class06889x.N(), class06889x.y(), class06889x.L(), class06889x.N(), class06889x.y(), class06889x.L());
      }
   }

   private static void N(class07299 var0, class07209 var1, class02274 var2, class07126 var3) {
      class06069 class06069 = var0.method_8409();
      if (class06069.z() <= 0.5F) {
         class06889 class06889 = y(var1, class06069);
         var0.method_8406(class07107.NZ, class06889.N(), class06889.y(), class06889.L(), 0.0, 0.0, 0.0);
         if (N(var2)) {
            var0.method_8406(var3, class06889.N(), class06889.y(), class06889.L(), 0.0, 0.0, 0.0);
         }
      }
   }

   private static void N(class07299 var0, class06889 var1, class08036 var2) {
      class06069 class06069 = var0.field_9229;
      class06889 class06889x = var1.N(var2.method_73189().y(0.0, var2.method_17682() / 2.0F, 0.0));
      int ix = class04995.N(class06069, 2, 5);

      for (int j = 0; j < ix; j++) {
         class06889 class06889x = class06889x.N(class06069, 1.0F);
         var0.method_8406(class07107.yi, var1.N(), var1.y(), var1.L(), class06889x.N(), class06889x.y(), class06889x.L());
      }
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, class02274 var3) {
      Set<UUID> set = var3.u();
      if (!set.isEmpty()) {
         class06889 class06889 = N(var1, var2.L(class02271.L));

         for (UUID uuid : set) {
            class08036 class08036 = var0.N(uuid);
            if (class08036 != null && N(var1, var3, class08036)) {
               N(var0, class06889, class08036);
            }
         }
      }
   }
}
