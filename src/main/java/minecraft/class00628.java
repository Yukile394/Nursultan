package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class00628 extends class00891 {
   public static final MapCodec<class00628> N = y(class00628::new);
   public static final class08071 y = class06665.Nq;
   public static final class08071 L = class06665.No;
   public static final int u = 2;
   public static final int i = 1;
   public static final int R = 4;
   private static final class00494 M = class00891.N(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final class00494 B = class00891.y(14.0, 0.0, 7.0);

   public class00628(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, 0).y(L, 1));
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (this.N((class07299)var2, var3) && N((class07290)var2, var3)) {
         int ix = var1.L(y);
         if (ix < 2) {
            var2.method_8396(null, var3, class04909.OY, class04911.field_15245, 0.7F, 0.9F + var4.z() * 0.2F);
            var2.method_8652(var3, var1.y(y, ix + 1), 2);
            var2.N(class01194.L, var3, class01164.N(var1));
         } else {
            var2.method_8396(null, var3, class04909.OQ, class04911.field_15245, 0.7F, 0.9F + var4.z() * 0.2F);
            var2.method_8650(var3, false);
            var2.N(class01194.R, var3, class01164.N(var1));

            for (int j = 0; j < var1.L(L); j++) {
               var2.N(2001, var3, class00891.W(var1));
               class07872 class07872 = class07078.yK.N(var2, class06113.field_16466);
               if (class07872 != null) {
                  class07872.u(-24000);
                  class07872.N(var3);
                  class07872.method_5808(var3.method_10263() + 0.3 + j * 0.2, var3.method_10264(), var3.method_10260() + 0.3, 0.0F, 0.0F);
                  var2.method_8649(class07872);
               }
            }
         }
      }
   }

   public static boolean y(class07290 var0, class07209 var1) {
      return var0.method_8320(var1).N(class01210.I);
   }

   @Override
   public void N(class07299 var1, class08036 var2, class07209 var3, class00500 var4, @Nullable class00394 var5, class06584 var6) {
      super.N(var1, var2, var3, var4, var5, var6);
      this.N(var1, var3, var4);
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = var1.method_8045().method_8320(var1.method_8037());
      return class00500.N(this) ? class00500.y(L, Math.min(4, class00500.L(L) + 1)) : super.N(var1);
   }

   @Override
   protected boolean N(class00500 var1, class06942 var2) {
      return !var2.method_8046() && var2.method_8041().N(this.B()) && var1.L(L) < 4 ? true : super.N(var1, var2);
   }

   @Override
   public MapCodec<class00628> N() {
      return N;
   }

   private boolean N(class04782 var1, class07049 var2) {
      if (var2 instanceof class07872 || var2 instanceof class07632) {
         return false;
      } else {
         return !(var2 instanceof class07438) ? false : var2 instanceof class08036 || var1.method_64395().N(class07305.I);
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return var1.L(L) == 1 ? M : B;
   }

   private void N(class07299 var1, class07209 var2, class00500 var3) {
      var1.method_8396(null, var2, class04909.Ok, class04911.field_15245, 0.7F, 0.9F + var1.field_9229.z() * 0.2F);
      int ix = var3.L(L);
      if (ix <= 1) {
         var1.N(var2, false);
      } else {
         var1.method_8652(var2, var3.y(L, ix - 1), 2);
         var1.N(class01194.R, var2, class01164.N(var3));
         var1.N(2001, var2, class00891.W(var3));
      }
   }

   private void N(class07299 var1, class00500 var2, class07209 var3, class07049 var4, int var5) {
      if (var2.N(class00869.my) && var1 instanceof class04782 class04782 && this.N(class04782, var4) && var1.field_9229.y(var5) == 0) {
         this.N(class04782, var3, var2);
      }
   }

   @Override
   public void N(class07299 var1, class00500 var2, class07209 var3, class07049 var4, double var5) {
      if (!(var4 instanceof class08004)) {
         this.N(var1, var2, var3, var4, 3);
      }

      super.N(var1, var2, var3, var4, var5);
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, class07049 var4) {
      if (!var4.method_21749()) {
         this.N(var1, var3, var2, var4, 100);
      }

      super.N(var1, var2, var3, var4);
   }

   public static boolean N(class07290 var0, class07209 var1) {
      return y(var0, var1.method_10074());
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (N((class07290)var2, var3) && !var2.method_8608()) {
         var2.N(2012, var3, 15);
      }
   }

   private boolean N(class07299 var1, class07209 var2) {
      float f = var1.method_75728().N(class00608.q, var2);
      return f > 0.0F && var1.field_9229.z() < f;
   }
}
