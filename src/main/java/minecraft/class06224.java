package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class class06224 extends class06391<class06225> {
   public static Object NE_0 = LogUtils.getLogger();
   public static Object NE_1 = new class07078[]{class07078.ym, class07078.yx, class07078.yx, class07078.yG};
   public static Object NE_2 = class00869.mr.W();

   public class06224(Codec<class06225> var1) {
      super(var1);
   }

   static {
      i();
   }

   private static void i() {
      NE_0 = null;
      NE_1 = null;
      NE_2 = null;
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      Predicate<class00500> predicate = class06391.N(class01210.Lu);
      class07209 class07209xx = var1.i();
      class06069 class06069 = var1.u();
      class05974 class05974 = var1.y();
      byte b0 = 3;
      int i = class06069.y(2) + 2;
      int j = -i - 1;
      int k = i + 1;
      byte b1 = -1;
      byte b2 = 4;
      int l = class06069.y(2) + 2;
      int i1 = -l - 1;
      int j1 = l + 1;
      int k1 = 0;

      for (int l1 = j; l1 <= k; l1++) {
         for (int i2 = -1; i2 <= 4; i2++) {
            for (int j2 = i1; j2 <= j1; j2++) {
               class07209 class07209x = class07209xx.method_10069(l1, i2, j2);
               boolean flag = class05974.method_8320(class07209x).B();
               if (i2 == -1 && !flag) {
                  return false;
               }

               if (i2 == 4 && !flag) {
                  return false;
               }

               if ((l1 == j || l1 == k || j2 == i1 || j2 == j1) && i2 == 0 && class05974.R(class07209x) && class05974.R(class07209x.method_10084())) {
                  k1++;
               }
            }
         }
      }

      if (k1 >= 1 && k1 <= 5) {
         for (int l2 = j; l2 <= k; l2++) {
            for (int j3 = 3; j3 >= -1; j3--) {
               for (int l3 = i1; l3 <= j1; l3++) {
                  class07209 class07209xx = class07209xx.method_10069(l2, j3, l3);
                  class00500 class00500 = class05974.method_8320(class07209xx);
                  if (l2 == j || j3 == -1 || l3 == i1 || l2 == k || j3 == 4 || l3 == j1) {
                     if (class07209xx.method_10264() >= class05974.method_31607() && !class05974.method_8320(class07209xx.method_10074()).B()) {
                        class05974.method_8652(class07209xx, (class00500)NE_2, 2);
                     } else if (class00500.B() && !class00500.N(class00869.LA)) {
                        if (j3 == -1 && class06069.y(4) != 0) {
                           this.N(class05974, class07209xx, class00869.LK.W(), predicate);
                        } else {
                           this.N(class05974, class07209xx, class00869.W.W(), predicate);
                        }
                     }
                  } else if (!class00500.N(class00869.LA) && !class00500.N(class00869.La)) {
                     this.N(class05974, class07209xx, (class00500)NE_2, predicate);
                  }
               }
            }
         }

         for (int i3 = 0; i3 < 2; i3++) {
            for (int k3 = 0; k3 < 3; k3++) {
               int i4 = class07209xx.method_10263() + class06069.y(i * 2 + 1) - i;
               int j4 = class07209xx.method_10264();
               int k4 = class07209xx.method_10260() + class06069.y(l * 2 + 1) - l;
               class07209 class07209xx = new class07209(i4, j4, k4);
               if (class05974.R(class07209xx)) {
                  int k2 = 0;

                  for (class07211 class07211 : class07221.field_11062) {
                     if (class05974.method_8320(class07209xx.method_10093(class07211)).B()) {
                        k2++;
                     }
                  }

                  if (k2 == 1) {
                     this.N(class05974, class07209xx, class04890.N(class05974, class07209xx, class00869.LA.W()), predicate);
                     class03136.N(class05974, class06069, class07209xx, class06273.L);
                     break;
                  }
               }
            }
         }

         this.N(class05974, class07209xx, class00869.La.W(), predicate);
         if (class05974.method_8321(class07209xx) instanceof class07235 class07235) {
            class07235.N(this.N(class06069), class06069);
         } else {
            ((Logger)NE_0)
               .error(
                  "Failed to fetch mob spawner entity at ({}, {}, {})",
                  new Object[]{class07209xx.method_10263(), class07209xx.method_10264(), class07209xx.method_10260()}
               );
         }

         return true;
      } else {
         return false;
      }
   }

   private class07078<?> N(class06069 var1) {
      return class07536.N((class07078<?>[])((class07078<?>[])NE_1), var1);
   }
}
