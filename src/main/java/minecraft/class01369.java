package minecraft;

import java.util.Arrays;
import java.util.Locale;

public final class class01369 {
   private static final class07211[] u = class07211.values();
   private static final int i = class01020.values().length;
   public final class00494 N;
   public final boolean y;
   private final boolean[] R;
   public final boolean L;

   class01369(class00500 var1) {
      super();
      class00891 class00891 = var1.i();
      this.N = class00891.y_4(var1, class00515.field_12294, class07209.field_10980, class06092.N());
      if (!this.N.method_1110() && var1.l()) {
         throw new IllegalStateException(
            String.format(
               Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", class04206.i.y(class00891)
            )
         );
      } else {
         this.y = Arrays.stream(class07185.values()).anyMatch(var1x -> this.N.method_1091(var1x) < 0.0 || this.N.method_1105(var1x) > 1.0);
         this.R = new boolean[u.length * i];
         int ix = u.length;

         for (int j = 0; j < ix; j++) {
            class07211 class07211 = u[j];

            for (class01020 class01020 : class01020.values()) {
               this.R[y(class07211, class01020)] = class01020.N(var1, class00515.field_12294, class07209.field_10980, class07211);
            }
         }

         this.L = class00891.N(var1.M(class00515.field_12294, class07209.field_10980));
      }
   }

   private static int y(class07211 var0, class01020 var1) {
      return var0.ordinal() * i + var1.ordinal();
   }

   public boolean N(class07211 var1, class01020 var2) {
      return this.R[y(var1, var2)];
   }
}
