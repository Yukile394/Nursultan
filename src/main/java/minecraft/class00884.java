package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class00884 extends class00891 implements class00886 {
   public static final MapCodec<class00884> N = y(class00884::new);
   public static final class06667 y = class06665.B;
   private static final int L = 5;

   private static class00500 T(class00500 var0) {
      if (var0.N(class00869.PN)) {
         return var0;
      } else if (var0.N(class00869.iw)) {
         return class00869.PN.W().y(y, false);
      } else {
         return var0.N(class00869.EI) ? class00869.PN.W().y(y, true) : class00869.K.W();
      }
   }

   public class00884(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, true));
   }

   private static boolean U(class00500 var0) {
      return var0.N(class00869.PN) || var0.N(class00869.K) && var0.Y().R() >= 8 && var0.Y().u();
   }

   @Override
   protected class04688 u(class00500 var1) {
      return class04684.L.N(false);
   }

   public static void y(class07284 var0, class07209 var1, class00500 var2) {
      N(var0, var1, var0.method_8320(var1), var2);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      var3.N(var4, class04684.L, class04684.L.N(var2));
      if (!var1.N(var2, var4) || var5 == class07211.field_11033 || var5 == class07211.field_11036 && !var7.N(class00869.PN) && U(var7)) {
         var3.N(var4, this, 5);
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return class00389.N();
   }

   @Override
   public MapCodec<class00884> N() {
      return N;
   }

   @Override
   public class06584 N(@Nullable class07438 var1, class07284 var2, class07209 var3, class00500 var4) {
      var2.method_8652(var3, class00869.N.W(), 11);
      return new class06584(class06570.jE);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      N(var2, var3, var1, var2.method_8320(var3.method_10074()));
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (var6) {
         class00500 class00500 = var2.method_8320(var3.method_10084());
         if (class00500.M(var2, var3).method_1110() && class00500.Y().W()) {
            var4.method_5700(var1.L(y), var3);
         } else {
            var4.method_5764(var1.L(y));
         }
      }
   }

   public static void N(class07284 var0, class07209 var1, class00500 var2, class00500 var3) {
      if (U(var2)) {
         class00500 class00500 = T(var3);
         var0.method_8652(var1, class00500, 2);
         class07218 class07218 = var1.method_25503().N(class07211.field_11036);

         while (U(var0.method_8320(class07218))) {
            if (!var0.method_8652(class07218, class00500, 2)) {
               return;
            }

            class07218.N(class07211.field_11036);
         }
      }
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      double d0 = var3.method_10263();
      double d1 = var3.method_10264();
      double d2 = var3.method_10260();
      if (var1.L(y)) {
         var2.method_8494(class07107.Nv, d0 + 0.5, d1 + 0.8, d2, 0.0, 0.0, 0.0);
         if (var4.y(200) == 0) {
            var2.method_8486(d0, d1, d2, class04909.uW, class04911.field_15245, 0.2F + var4.z() * 0.2F, 0.9F + var4.z() * 0.15F, false);
         }
      } else {
         var2.method_8494(class07107.Nn, d0 + 0.5, d1, d2 + 0.5, 0.0, 0.04, 0.0);
         var2.method_8494(class07107.Nn, d0 + var4.z(), d1 + var4.z(), d2 + var4.z(), 0.0, 0.04, 0.0);
         if (var4.y(200) == 0) {
            var2.method_8486(d0, d1, d2, class04909.uU, class04911.field_15245, 0.2F + var4.z() * 0.2F, 0.9F + var4.z() * 0.15F, false);
         }
      }
   }

   @Override
   public Optional<class04891> s_() {
      return class04684.L.z();
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class00500 class00500 = var2.method_8320(var3.method_10074());
      return class00500.N(class00869.PN) || class00500.N(class00869.EI) || class00500.N(class00869.iw);
   }

   @Override
   protected class06898 d_(class00500 var1) {
      return class06898.field_11455;
   }
}
