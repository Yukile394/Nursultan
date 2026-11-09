package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class class05989 extends class00891 {
   private static final int N = 8;
   private static final int y = 1;
   private static final int L = 3;
   private final float u;
   protected static final class00494 O = class00891.y(16.0, 0.0, 1.0);

   public class05989(class01362 var1, float var2) {
      super(var1);
      this.u = var2;
   }

   protected abstract boolean U(class00500 var1);

   private static boolean y(class07299 var0, class07209 var1, class07211 var2) {
      if (!N(var0)) {
         return false;
      } else {
         class07218 class07218 = var1.method_25503();
         boolean flag = false;

         for (class07211 class07211 : class07211.values()) {
            if (var0.method_8320(class07218.N(var1).N(class07211)).N(class00869.LV)) {
               flag = true;
               break;
            }
         }

         if (!flag) {
            return false;
         } else {
            class07185 class07185 = var2.z().L() ? var2.M().z() : class07221.field_11062.y(var0.field_9229);
            return class07121.N((class07284)var0, var1, class07185).isPresent();
         }
      }
   }

   public static class00500 y(class07290 var0, class07209 var1) {
      class07209 class07209 = var1.method_10074();
      return class06001.T(var0.method_8320(class07209)) ? class00869.LX.W() : ((class00756)class00869.Lc).N(var0, var1);
   }

   @Override
   public class00500 N(class07299 var1, class07209 var2, class00500 var3, class08036 var4) {
      if (!var1.method_8608()) {
         var1.method_8444(null, 1009, var2, 0);
      }

      return super.N(var1, var2, var3, var4);
   }

   @Override
   protected void N(class07299 var1, class08036 var2, class07209 var3, class00500 var4) {
   }

   private static boolean N(class07299 var0) {
      return var0.method_27983() == class07299.field_25179 || var0.method_27983() == class07299.field_25180;
   }

   public static boolean N(class07299 var0, class07209 var1, class07211 var2) {
      return !var0.method_8320(var1).P() ? false : y(var0, var1).N((class05487)var0, var1) || y(var0, var1, var2);
   }

   public static void N(class07049 var0) {
      if (!var0.method_5753()) {
         if (var0.method_20802() < 0) {
            var0.method_20803(var0.method_20802() + 1);
         } else if (var0 instanceof class04770) {
            int i = var0.method_73183().method_8409().y(1, 3);
            var0.method_20803(var0.method_20802() + i);
         }

         if (var0.method_20802() >= 0) {
            var0.method_5639(8.0F);
         }
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      return y(var1.method_8045(), var1.method_8037());
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return O;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var4.y(24) == 0) {
         var2.method_8486(
            var3.method_10263() + 0.5,
            var3.method_10264() + 0.5,
            var3.method_10260() + 0.5,
            class04909.Uo,
            class04911.field_15245,
            1.0F + var4.z(),
            var4.z() * 0.7F + 0.3F,
            false
         );
      }

      class07209 class07209 = var3.method_10074();
      class00500 class00500 = var2.method_8320(class07209);
      if (!this.U(class00500) && !class00500.L(var2, class07209, class07211.field_11036)) {
         if (this.U(var2.method_8320(var3.method_10067()))) {
            for (int j = 0; j < 2; j++) {
               double d3 = var3.method_10263() + var4.U() * 0.1F;
               double d8 = var3.method_10264() + var4.U();
               double d13 = var3.method_10260() + var4.U();
               var2.method_8406(class07107.Ny, d3, d8, d13, 0.0, 0.0, 0.0);
            }
         }

         if (this.U(var2.method_8320(var3.method_10078()))) {
            for (int k = 0; k < 2; k++) {
               double d4 = var3.method_10263() + 1 - var4.U() * 0.1F;
               double d9 = var3.method_10264() + var4.U();
               double d14 = var3.method_10260() + var4.U();
               var2.method_8406(class07107.Ny, d4, d9, d14, 0.0, 0.0, 0.0);
            }
         }

         if (this.U(var2.method_8320(var3.method_10095()))) {
            for (int l = 0; l < 2; l++) {
               double d5 = var3.method_10263() + var4.U();
               double d10 = var3.method_10264() + var4.U();
               double d15 = var3.method_10260() + var4.U() * 0.1F;
               var2.method_8406(class07107.Ny, d5, d10, d15, 0.0, 0.0, 0.0);
            }
         }

         if (this.U(var2.method_8320(var3.method_10072()))) {
            for (int i1 = 0; i1 < 2; i1++) {
               double d6 = var3.method_10263() + var4.U();
               double d11 = var3.method_10264() + var4.U();
               double d16 = var3.method_10260() + 1 - var4.U() * 0.1F;
               var2.method_8406(class07107.Ny, d6, d11, d16, 0.0, 0.0, 0.0);
            }
         }

         if (this.U(var2.method_8320(var3.method_10084()))) {
            for (int j1 = 0; j1 < 2; j1++) {
               double d7 = var3.method_10263() + var4.U();
               double d12 = var3.method_10264() + 1 - var4.U() * 0.1F;
               double d17 = var3.method_10260() + var4.U();
               var2.method_8406(class07107.Ny, d7, d12, d17, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int i = 0; i < 3; i++) {
            double d0 = var3.method_10263() + var4.U();
            double d1 = var3.method_10264() + var4.U() * 0.5 + 0.5;
            double d2 = var3.method_10260() + var4.U();
            var2.method_8406(class07107.Ny, d0, d1, d2, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      var5.N(class08397.field_61896);
      var5.N(class08397.field_56643);
      var5.y(class08397.field_56643, var1x -> var1x.method_64419(var1x.method_73183().method_48963().N(), this.u));
   }

   @Override
   protected abstract MapCodec<? extends class05989> N();

   @Override
   public void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var4.N(var1.i())) {
         if (N(var2)) {
            Optional<class07121> optional = class07121.N((class07284)var2, var3, class07185.field_11048);
            if (optional.isPresent()) {
               optional.get().N(var2);
               return;
            }
         }

         if (!var1.N((class05487)var2, var3)) {
            var2.method_8650(var3, false);
         }
      }
   }
}
