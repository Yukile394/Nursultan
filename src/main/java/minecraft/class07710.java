package minecraft;

import com.mojang.serialization.MapCodec;

public class class07710 extends class00891 {
   public static final MapCodec<class07710> N = y(class07710::new);
   public static final class08071 y = class06665.Nk;
   private static final class00494 L = class00891.y(12.0, 0.0, 16.0);

   public class07710(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, 0));
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var2.R(var3.method_10084())) {
         int i = 1;

         while (var2.method_8320(var3.method_10087(i)).N(this)) {
            i++;
         }

         if (i < 3) {
            int j = var1.L(y);
            if (j == 15) {
               var2.method_8501(var3.method_10084(), this.W());
               var2.method_8652(var3, var1.y(y, 0), 260);
            } else {
               var2.method_8652(var3, var1.y(y, j + 1), 260);
            }
         }
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   public MapCodec<class07710> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (!var1.N(var2, var4)) {
         var3.N(var4, this, 1);
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return L;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!var1.N(var2, var3)) {
         var2.N(var3, true);
      }
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class00500 class00500x = var2.method_8320(var3.method_10074());
      if (class00500x.N(this)) {
         return true;
      } else {
         if (class00500x.N(class01210.Ni) || class00500x.N(class01210.I)) {
            class07209 class07209 = var3.method_10074();

            for (class07211 class07211 : class07221.field_11062) {
               class00500 class00500x = var2.method_8320(class07209.method_10093(class07211));
               if (var2.method_8316(class07209.method_10093(class07211)).N(class01231.N) || class00500x.N(class00869.Eg)) {
                  return true;
               }
            }
         }

         return false;
      }
   }
}
