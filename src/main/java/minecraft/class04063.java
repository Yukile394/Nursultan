package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class class04063 extends class08815 implements class04065 {
   public static final MapCodec<class04063> i = y(class04063::new);
   private final class04090 R = new class04090(new class04081(this, class04090.N));
   private final class04090 M = new class04090(new class04081(this, class04072.field_37598));

   public class04063(class01362 var1) {
      super(var1);
   }

   public class04090 i() {
      return this.M;
   }

   @Override
   public class04090 y() {
      return this.R;
   }

   private boolean N(class04076 var1, class07284 var2, class07209 var3, class06069 var4) {
      class00500 class00500xxx = var2.method_8320(var3);
      class03530<class00891> class03530 = var1.L();

      for (class07211 class07211xx : class07211.N(var4)) {
         if (N(class00500xxx, class07211xx)) {
            class07209 class07209x = var3.method_10093(class07211xx);
            class00500 class00500x = var2.method_8320(class07209x);
            if (class00500x.N(class03530)) {
               class00500 class00500xx = class00869.bA.W();
               var2.method_8652(class07209x, class00500xx, 3);
               class00891.N_19(class00500x, class00500xx, var2, class07209x);
               var2.method_8396(null, class07209x, class04909.dX, class04911.field_15245, 1.0F, 1.0F);
               this.R.N(class00500xx, var2, class07209x, var1.B());
               class07211 class07211x = class07211xx.b();
               int ix = u.length;

               for (int j = 0; j < ix; j++) {
                  class07211 class07211xx = u[j];
                  if (class07211xx != class07211x) {
                     class07209 class07209x = class07209x.method_10093(class07211xx);
                     class00500 class00500xxx = var2.method_8320(class07209x);
                     if (class00500xxx.N(this)) {
                        this.N(var2, class00500xxx, class07209x, var4);
                     }
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   public static boolean N(class07284 var0, class00500 var1, class07209 var2) {
      if (!var1.N(class00869.bf)) {
         return false;
      } else {
         int ix = u.length;

         for (int j = 0; j < ix; j++) {
            class07211 class07211 = u[j];
            if (N(var1, class07211) && var0.method_8320(var2.method_10093(class07211)).N(class01210.LB)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public MapCodec<class04063> N() {
      return i;
   }

   @Override
   public int N(class04083 var1, class07284 var2, class07209 var3, class06069 var4, class04076 var5, boolean var6) {
      if (var6 && this.N(var5, var2, var1.N(), var4)) {
         return var1.y() - 1;
      } else {
         return var4.y(var5.R()) == 0 ? class04995.y(var1.y() * 0.5F) : var1.y();
      }
   }

   @Override
   public void N(class07284 var1, class00500 var2, class07209 var3, class06069 var4) {
      if (var2.N(this)) {
         int ix = u.length;

         for (int j = 0; j < ix; j++) {
            class07211 class07211 = u[j];
            class06667 class06667 = y(class07211);
            if (var2.L(class06667) && var1.method_8320(var3.method_10093(class07211)).N(class00869.bA)) {
               var2 = var2.y(class06667, false);
            }
         }

         if (!T(var2)) {
            var2 = (var1.method_8316(var3).W() ? class00869.N : class00869.K).W();
         }

         var1.method_8652(var3, var2, 3);
         class04065.super.N(var1, var2, var3, var4);
      }
   }

   public static boolean N(class07284 var0, class07209 var1, class00500 var2, Collection<class07211> var3) {
      boolean flag = false;
      class00500 class00500 = class00869.bf.W();

      for (class07211 class07211 : var3) {
         if (N(var0, var1, class07211)) {
            class00500 = class00500.y(y(class07211), true);
            flag = true;
         }
      }

      if (!flag) {
         return false;
      } else {
         if (!var2.Y().W()) {
            class00500 = class00500.y(class05543.L, true);
         }

         var0.method_8652(var1, class00500, 3);
         return true;
      }
   }
}
