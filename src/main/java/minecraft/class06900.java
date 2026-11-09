package minecraft;

import com.mojang.serialization.MapCodec;

public class class06900 extends class07760 {
   public static final MapCodec<class06900> y = y(class06900::new);
   public static final class08064<class08080> L = class06665.NE;
   public static final class06667 u = class06665.k;

   @Override
   public class08092<class08080> L() {
      return L;
   }

   public class06900(class01362 var1) {
      super(true, var1);
      this.P(this.Q.y().y(L, class08080.field_12665).y(u, false).y(N, false));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      class08080 class08080x = var1.L(L);
      class08080 class08080x = this.N(class08080x, var2);
      return var1.y(L, class08080x);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      class08080 class08080x = var1.L(L);
      class08080 class08080x = this.N(class08080x, var2);
      return var1.y(L, class08080x);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, u, N);
   }

   @Override
   public MapCodec<class06900> N() {
      return y;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   protected boolean N(class07299 var1, class07209 var2, class00500 var3, boolean var4, int var5) {
      if (var5 >= 8) {
         return false;
      } else {
         int i = var2.method_10263();
         int j = var2.method_10264();
         int k = var2.method_10260();
         boolean flag = true;
         class08080 class08080 = var3.L(L);
         switch (class08080) {
            case field_12665:
               if (var4) {
                  k++;
               } else {
                  k--;
               }
               break;
            case field_12674:
               if (var4) {
                  i--;
               } else {
                  i++;
               }
               break;
            case field_12667:
               if (var4) {
                  i--;
               } else {
                  i++;
                  j++;
                  flag = false;
               }

               class08080 = class08080.field_12674;
               break;
            case field_12666:
               if (var4) {
                  i--;
                  j++;
                  flag = false;
               } else {
                  i++;
               }

               class08080 = class08080.field_12674;
               break;
            case field_12670:
               if (var4) {
                  k++;
               } else {
                  k--;
                  j++;
                  flag = false;
               }

               class08080 = class08080.field_12665;
               break;
            case field_12668:
               if (var4) {
                  k++;
                  j++;
                  flag = false;
               } else {
                  k--;
               }

               class08080 = class08080.field_12665;
         }

         return this.N(var1, new class07209(i, j, k), var4, var5, class08080)
            ? true
            : flag && this.N(var1, new class07209(i, j - 1, k), var4, var5, class08080);
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4) {
      boolean flag = var1.L(u);
      boolean flag1 = var2.W(var3) || this.N(var2, var3, var1, true, 0) || this.N(var2, var3, var1, false, 0);
      if (flag1 != flag) {
         var2.method_8652(var3, var1.y(u, flag1), 3);
         var2.method_8408(var3.method_10074(), this);
         if (var1.L(L).y()) {
            var2.method_8408(var3.method_10084(), this);
         }
      }
   }

   protected boolean N(class07299 var1, class07209 var2, boolean var3, int var4, class08080 var5) {
      class00500 class00500 = var1.method_8320(var2);
      if (!class00500.N(this)) {
         return false;
      } else {
         class08080 class08080 = class00500.L(L);
         if (var5 != class08080.field_12674
            || class08080 != class08080.field_12665 && class08080 != class08080.field_12670 && class08080 != class08080.field_12668) {
            if (var5 != class08080.field_12665
               || class08080 != class08080.field_12674 && class08080 != class08080.field_12667 && class08080 != class08080.field_12666) {
               if (!class00500.L(u)) {
                  return false;
               } else {
                  return var1.W(var2) ? true : this.N(var1, var2, class00500, var3, var4 + 1);
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }
}
