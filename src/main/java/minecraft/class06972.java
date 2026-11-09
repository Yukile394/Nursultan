package minecraft;

import java.util.ArrayList;
import java.util.List;

public class class06972 implements class01857 {
   private static final int N = 30;
   private static final float y = 0.32F;
   private static final int L = -23296;
   private final class05375 u;

   public class06972(class05375 var1) {
      super();
      this.u = var1;
   }

   private List<String> N(class00465 var1, boolean var2, class00457 var3) {
      ArrayList arraylist = new ArrayList();
      var3.L(class00429.L, (var3x, var4x) -> {
         if (var2 ? var4x.y(var1.N()) : var4x.N(var1.N())) {
            arraylist.add(class01445.N(var3x.method_5667()));
         }
      });
      return arraylist;
   }

   private static void N(String var0, class00465 var1, int var2, int var3) {
      class06724.N(var0, var1.N(), var2, var3, 0.32F);
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      class07209 class07209 = class07209.method_49637(var1, var3, var5);
      var7.y(class00429.Z, (var3x, var4) -> {
         if (class07209.method_19771(var3x, 30.0)) {
            N(var3x);
            this.N(var4, var7);
         }
      });
      this.u.N(var7).forEach((var3x, var4) -> {
         if (var7.N(class00429.Z, var3x) == null) {
            if (class07209.method_19771(var3x, 30.0)) {
               this.N(var3x, (List<String>)var4);
            }
         }
      });
   }

   private static void N(class07209 var0) {
      float f = 0.05F;
      class06724.N(var0, 0.05F, class06747.y(class02566.N(0.3F, 0.2F, 0.2F, 1.0F)));
   }

   private void N(class07209 var1, List<String> var2) {
      float f = 0.05F;
      class06724.N(var1, 0.05F, class06747.y(class02566.N(0.3F, 0.2F, 0.2F, 1.0F)));
      class06724.N(var2.toString(), var1, 0, -256, 0.32F);
      class06724.N("Ghost POI", var1, 1, -65536, 0.32F);
   }

   private void N(class00465 var1, class00457 var2) {
      int i = 0;
      if (class07529.p) {
         List<String> list = this.N(var1, false, var2);
         if (list.size() < 4) {
            N("Owners: " + list, var1, i, -256);
         } else {
            N(list.size() + " ticket holders", var1, i, -256);
         }

         i++;
         List<String> list1 = this.N(var1, true, var2);
         if (list1.size() < 4) {
            N("Candidates: " + list1, var1, i, -23296);
         } else {
            N(list1.size() + " potential owners", var1, i, -23296);
         }

         i++;
      }

      N("Free tickets: " + var1.L(), var1, i, -256);
      N(var1.y().M(), var1, ++i, -1);
   }
}
