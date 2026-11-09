package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class class05160 {
   private static final int M = 8;
   static final class05159 N = new class05145();
   static final List<class05034<class06993, class07209>> y = Lists.newArrayList(
      new class05034[]{
         new class05034<>(class06993.field_11467, new class07209(1, -1, 0)),
         new class05034<>(class06993.field_11463, new class07209(6, -1, 1)),
         new class05034<>(class06993.field_11465, new class07209(0, -1, 5)),
         new class05034<>(class06993.field_11464, new class07209(5, -1, 6))
      }
   );
   static final class05159 L = new class05161();
   static final class05159 u = new class05174();
   static final List<class05034<class06993, class07209>> i = Lists.newArrayList(
      new class05034[]{
         new class05034<>(class06993.field_11467, new class07209(4, -1, 0)),
         new class05034<>(class06993.field_11463, new class07209(12, -1, 4)),
         new class05034<>(class06993.field_11465, new class07209(0, -1, 8)),
         new class05034<>(class06993.field_11464, new class07209(8, -1, 12))
      }
   );
   static final class05159 R = new class05155();

   public class05160() {
      super();
   }

   static class05180 N(List<class04890> var0, class05180 var1) {
      var0.add(var1);
      return var1;
   }

   static boolean N(class01224 var0, class05159 var1, int var2, class05180 var3, class07209 var4, List<class04890> var5, class06069 var6) {
      if (var2 > 8) {
         return false;
      } else {
         ArrayList arraylist = Lists.newArrayList();
         if (var1.N(var0, var2, var3, var4, arraylist, var6)) {
            boolean flag = false;
            int ix = var6.M();

            for (class04890 class04890x : arraylist) {
               class04890x.y(ix);
               class04890 class04890x = class04890.N(var5, class04890x.L());
               if (class04890x != null && class04890x.u() != var3.u()) {
                  flag = true;
                  break;
               }
            }

            if (!flag) {
               var5.addAll(arraylist);
               return true;
            }
         }

         return false;
      }
   }

   static class05180 N(class01224 var0, class05180 var1, class07209 var2, String var3, class06993 var4, boolean var5) {
      class05180 class05180 = new class05180(var0, var3, var1.z(), var4, var5);
      class07209 class07209 = var1.Z().N(var1.U(), var2, class05180.U(), class07209.field_10980);
      class05180.N(class07209.method_10263(), class07209.method_10264(), class07209.method_10260());
      return class05180;
   }

   public static void N(class01224 var0, class07209 var1, class06993 var2, List<class04890> var3, class06069 var4) {
      R.N();
      N.N();
      u.N();
      L.N();
      class05180 class05180 = N(var3, new class05180(var0, "base_floor", var1, var2, true));
      class05180 = N(var3, N(var0, class05180, new class07209(-1, 0, -1), "second_floor_1", var2, false));
      class05180 = N(var3, N(var0, class05180, new class07209(-1, 4, -1), "third_floor_1", var2, false));
      class05180 = N(var3, N(var0, class05180, new class07209(-1, 8, -1), "third_roof", var2, true));
      N(var0, L, 1, class05180, null, var3, var4);
   }
}
