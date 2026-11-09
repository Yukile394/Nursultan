package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public class class00898 extends class00891 {
   public static final MapCodec<class00898> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04206.i.T().fieldOf("plant").forGetter(var0x -> var0x.i), t()).apply(var0, class00898::new)
   );
   public static final int y = 5;
   public static final class08071 L = class06665.Nd;
   private static final class00494 u = class00891.y(14.0, 0.0, 15.0);
   private final class00891 i;

   public class00898(class00891 var1, class01362 var2) {
      super(var2);
      this.i = var1;
      this.P(this.Q.y().y(L, 0));
   }

   @Override
   public class00494 u(class00500 var1, class07290 var2, class07209 var3) {
      return u;
   }

   private static boolean y(class05487 var0, class07209 var1, @Nullable class07211 var2) {
      for (class07211 class07211 : class07221.field_11062) {
         if (class07211 != var2 && !var0.R(var1.method_10093(class07211))) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      class07209 class07209x = var3.method_10084();
      if (var2.R(class07209x) && class07209x.method_10264() <= var2.method_31600()) {
         int ix = var1.L(L);
         if (ix < 5) {
            boolean flag = false;
            boolean flag1 = false;
            class00500 class00500x = var2.method_8320(var3.method_10074());
            if (class00500x.N(class00869.MP)) {
               flag = true;
            } else if (class00500x.N(this.i)) {
               int j = 1;

               for (int k = 0; k < 4; k++) {
                  class00500 class00500x = var2.method_8320(var3.method_10087(j + 1));
                  if (!class00500x.N(this.i)) {
                     if (class00500x.N(class00869.MP)) {
                        flag1 = true;
                     }
                     break;
                  }

                  j++;
               }

               if (j < 2 || j <= var4.y(flag1 ? 5 : 4)) {
                  flag = true;
               }
            } else if (class00500x.P()) {
               flag = true;
            }

            if (flag && y(var2, class07209x, null) && var2.R(var3.method_10086(2))) {
               var2.method_8652(var3, class06771.N(var2, var3, this.i.W()), 2);
               this.N(var2, class07209x, ix);
            } else if (ix < 4) {
               int l = var4.y(4);
               if (flag1) {
                  l++;
               }

               boolean flag2 = false;

               for (int i1 = 0; i1 < l; i1++) {
                  class07211 class07211 = class07221.field_11062.N(var4);
                  class07209 class07209x = var3.method_10093(class07211);
                  if (var2.R(class07209x) && var2.R(class07209x.method_10074()) && y(var2, class07209x, class07211.b())) {
                     this.N(var2, class07209x, ix + 1);
                     flag2 = true;
                  }
               }

               if (flag2) {
                  var2.method_8652(var3, class06771.N(var2, var3, this.i.W()), 2);
               } else {
                  this.N(var2, var3);
               }
            } else {
               this.N(var2, var3);
            }
         }
      }
   }

   public static void N(class07284 var0, class07209 var1, class06069 var2, int var3) {
      var0.method_8652(var1, class06771.N(var0, var1, class00869.ET.W()), 2);
      N(var0, var1, var2, var1, var3, 0);
   }

   private static void N(class07284 var0, class07209 var1, class06069 var2, class07209 var3, int var4, int var5) {
      class00891 class00891 = class00869.ET;
      int ix = var2.y(4) + 1;
      if (var5 == 0) {
         ix++;
      }

      for (int j = 0; j < ix; j++) {
         class07209 class07209x = var1.method_10086(j + 1);
         if (!y(var0, class07209x, null)) {
            return;
         }

         var0.method_8652(class07209x, class06771.N(var0, class07209x, class00891.W()), 2);
         var0.method_8652(class07209x.method_10074(), class06771.N(var0, class07209x.method_10074(), class00891.W()), 2);
      }

      boolean flag = false;
      if (var5 < 4) {
         int l = var2.y(4);
         if (var5 == 0) {
            l++;
         }

         for (int k = 0; k < l; k++) {
            class07211 class07211 = class07221.field_11062.N(var2);
            class07209 class07209 = var1.method_10086(ix).method_10093(class07211);
            if (Math.abs(class07209.method_10263() - var3.method_10263()) < var4
               && Math.abs(class07209.method_10260() - var3.method_10260()) < var4
               && var0.R(class07209)
               && var0.R(class07209.method_10074())
               && y(var0, class07209, class07211.b())) {
               flag = true;
               var0.method_8652(class07209, class06771.N(var0, class07209, class00891.W()), 2);
               var0.method_8652(class07209.method_10093(class07211.b()), class06771.N(var0, class07209.method_10093(class07211.b()), class00891.W()), 2);
               N(var0, class07209, var2, var3, var4, var5 + 1);
            }
         }
      }

      if (!flag) {
         var0.method_8652(var1.method_10086(ix), class00869.Eb.W().y(L, 5), 2);
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L);
   }

   @Override
   public MapCodec<class00898> N() {
      return N;
   }

   @Override
   protected void N(class07299 var1, class00500 var2, class06183 var3, class08005 var4) {
      class07209 class07209 = var3.u();
      if (var1 instanceof class04782 class04782 && var4.method_36971(class04782, class07209) && var4.N(class04782)) {
         var1.N(class07209, true, var4);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!var1.N(var2, var3)) {
         var2.N(var3, true);
      }
   }

   private void N(class07299 var1, class07209 var2) {
      var1.method_8652(var2, this.W().y(L, 5), 2);
      var1.N(1034, var2, 0);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5 != class07211.field_11036 && !var1.N(var2, var4)) {
         var3.N(var4, this, 1);
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private void N(class07299 var1, class07209 var2, int var3) {
      var1.method_8652(var2, this.W().y(L, var3), 2);
      var1.N(1033, var2, 0);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class00500 class00500x = var2.method_8320(var3.method_10074());
      if (!class00500x.N(this.i) && !class00500x.N(class00869.MP)) {
         if (!class00500x.P()) {
            return false;
         } else {
            boolean flag = false;

            for (class07211 class07211 : class07221.field_11062) {
               class00500 class00500x = var2.method_8320(var3.method_10093(class07211));
               if (class00500x.N(this.i)) {
                  if (flag) {
                     return false;
                  }

                  flag = true;
               } else if (!class00500x.P()) {
                  return false;
               }
            }

            return flag;
         }
      } else {
         return true;
      }
   }

   @Override
   protected boolean e_(class00500 var1) {
      return var1.L(L) < 5;
   }
}
