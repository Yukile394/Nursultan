package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;

public class class06393 extends class06391<class06225> {
   private static final class06670 NE = class06670.N(class00869.e);
   private final class00500 NW = class00869.e.W();
   private final class00500 Nm = class00869.Ud.W();
   private final class00500 NP = class00869.yL.W();
   private final class00500 Ns = class00869.K.W();

   public class06393(Codec<class06225> var1) {
      super(var1);
   }

   private static void y(class05974 var0, class07209 var1) {
      var0.method_8652(var1, class00869.H.W(), 3);
      var0.N(var1, class00404.field_42780).ifPresent(var1x -> var1x.N(class06273.yz, var1.method_10063()));
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209x = var1.i();
      class07209x = class07209x.method_10084();

      while (class05974.R(class07209x) && class07209x.method_10264() > class05974.method_31607() + 2) {
         class07209x = class07209x.method_10074();
      }

      if (!NE.test(class05974.method_8320(class07209x))) {
         return false;
      } else {
         for (int var4 = -2; var4 <= 2; var4++) {
            for (int var5 = -2; var5 <= 2; var5++) {
               if (class05974.R(class07209x.method_10069(var4, -1, var5)) && class05974.R(class07209x.method_10069(var4, -2, var5))) {
                  return false;
               }
            }
         }

         for (int l = -2; l <= 0; l++) {
            for (int i1 = -2; i1 <= 2; i1++) {
               for (int k = -2; k <= 2; k++) {
                  class05974.method_8652(class07209x.method_10069(i1, l, k), this.NP, 2);
               }
            }
         }

         class05974.method_8652(class07209x, this.Ns, 2);

         for (class07211 class07211x : class07221.field_11062) {
            class05974.method_8652(class07209x.method_10093(class07211x), this.Ns, 2);
         }

         class07209 class07209x = class07209x.method_10074();
         class05974.method_8652(class07209x, this.NW, 2);

         for (class07211 class07211 : class07221.field_11062) {
            class05974.method_8652(class07209x.method_10093(class07211), this.NW, 2);
         }

         for (int j1 = -2; j1 <= 2; j1++) {
            for (int i2 = -2; i2 <= 2; i2++) {
               if (j1 == -2 || j1 == 2 || i2 == -2 || i2 == 2) {
                  class05974.method_8652(class07209x.method_10069(j1, 1, i2), this.NP, 2);
               }
            }
         }

         class05974.method_8652(class07209x.method_10069(2, 1, 0), this.Nm, 2);
         class05974.method_8652(class07209x.method_10069(-2, 1, 0), this.Nm, 2);
         class05974.method_8652(class07209x.method_10069(0, 1, 2), this.Nm, 2);
         class05974.method_8652(class07209x.method_10069(0, 1, -2), this.Nm, 2);

         for (int k1 = -1; k1 <= 1; k1++) {
            for (int j2 = -1; j2 <= 1; j2++) {
               if (k1 == 0 && j2 == 0) {
                  class05974.method_8652(class07209x.method_10069(k1, 4, j2), this.NP, 2);
               } else {
                  class05974.method_8652(class07209x.method_10069(k1, 4, j2), this.Nm, 2);
               }
            }
         }

         for (int l1 = 1; l1 <= 3; l1++) {
            class05974.method_8652(class07209x.method_10069(-1, l1, -1), this.NP, 2);
            class05974.method_8652(class07209x.method_10069(-1, l1, 1), this.NP, 2);
            class05974.method_8652(class07209x.method_10069(1, l1, -1), this.NP, 2);
            class05974.method_8652(class07209x.method_10069(1, l1, 1), this.NP, 2);
         }

         List list = List.of(class07209x, class07209x.method_10078(), class07209x.method_10072(), class07209x.method_10067(), class07209x.method_10095());
         class06069 class06069 = var1.u();
         y(class05974, class07536.<class07209>N_77(list, class06069).method_10087(1));
         y(class05974, class07536.<class07209>N_77(list, class06069).method_10087(2));
         return true;
      }
   }
}
