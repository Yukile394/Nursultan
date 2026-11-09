package minecraft;

import com.mojang.serialization.Codec;

public class class06003 extends class06391<class06225> {
   public class06003(Codec<class06225> var1) {
      super(var1);
   }

   private boolean y(class07284 var1, class06069 var2, class07209 var3) {
      if (var2.y(10) != 0) {
         var1.method_8652(var3, class00869.iY.W(), 2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      class07209 class07209 = var1.i();
      class05974 class05974 = var1.y();
      class06069 class06069 = var1.u();
      if (class05974.R(class07209) && !class05974.R(class07209.method_10084())) {
         class07218 class07218xx = class07209.method_25503();
         class07218 class07218x = class07209.method_25503();
         boolean flag = true;
         boolean flag1 = true;
         boolean flag2 = true;
         boolean flag3 = true;

         while (class05974.R(class07218xx)) {
            if (class05974.method_31606(class07218xx)) {
               return true;
            }

            class05974.method_8652(class07218xx, class00869.iY.W(), 2);
            flag = flag && this.y(class05974, class06069, class07218x.N(class07218xx, class07211.field_11043));
            flag1 = flag1 && this.y(class05974, class06069, class07218x.N(class07218xx, class07211.field_11035));
            flag2 = flag2 && this.y(class05974, class06069, class07218x.N(class07218xx, class07211.field_11039));
            flag3 = flag3 && this.y(class05974, class06069, class07218x.N(class07218xx, class07211.field_11034));
            class07218xx.N(class07211.field_11033);
         }

         class07218xx.N(class07211.field_11036);
         this.N(class05974, class06069, class07218x.N(class07218xx, class07211.field_11043));
         this.N(class05974, class06069, class07218x.N(class07218xx, class07211.field_11035));
         this.N(class05974, class06069, class07218x.N(class07218xx, class07211.field_11039));
         this.N(class05974, class06069, class07218x.N(class07218xx, class07211.field_11034));
         class07218xx.N(class07211.field_11033);
         class07218 class07218xx = new class07218();

         for (int i = -3; i < 4; i++) {
            for (int j = -3; j < 4; j++) {
               int k = class04995.N(i) * class04995.N(j);
               if (class06069.y(10) < 10 - k) {
                  class07218xx.N(class07218xx.method_10069(i, 0, j));
                  int l = 3;

                  while (class05974.R(class07218x.N(class07218xx, class07211.field_11033))) {
                     class07218xx.N(class07211.field_11033);
                     if (--l <= 0) {
                        break;
                     }
                  }

                  if (!class05974.R(class07218x.N(class07218xx, class07211.field_11033))) {
                     class05974.method_8652(class07218xx, class00869.iY.W(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void N(class07284 var1, class06069 var2, class07209 var3) {
      if (var2.Z()) {
         var1.method_8652(var3, class00869.iY.W(), 2);
      }
   }
}
