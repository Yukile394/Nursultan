package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class class05173 {
   public static final int N = 90;
   static final class01894 y = class01894.y("igloo/top");
   private static final class01894 i = class01894.y("igloo/middle");
   private static final class01894 R = class01894.y("igloo/bottom");
   static final Map<class01894, class07209> L = ImmutableMap.of(y, new class07209(3, 5, 5), i, new class07209(1, 3, 1), R, new class07209(3, 6, 7));
   static final Map<class01894, class07209> u = ImmutableMap.of(y, class07209.field_10980, i, new class07209(2, -3, 4), R, new class07209(0, -3, -2));

   public class05173() {
      super();
   }

   public static void N(class01224 var0, class07209 var1, class06993 var2, class03860 var3, class06069 var4) {
      if (var4.U() < 0.5) {
         int ix = var4.y(8) + 4;
         var3.N(new class05165(var0, R, var1, var2, ix * 3));

         for (int j = 0; j < ix - 1; j++) {
            var3.N(new class05165(var0, i, var1, var2, j * 3));
         }
      }

      var3.N(new class05165(var0, y, var1, var2, 0));
   }
}
