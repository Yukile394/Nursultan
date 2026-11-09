package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class class04672 extends class05787 {
   public static final float i = 0.44444445F;

   @Override
   protected float L() {
      return 100.0F;
   }

   @Override
   public int L(class05487 var1) {
      return u(var1) ? 1 : 2;
   }

   public class04672() {
      super();
   }

   @Nullable
   @Override
   public class07126 B() {
      return class07107.z;
   }

   @Override
   protected boolean Z() {
      return true;
   }

   @Override
   public class04651 i() {
      return class04684.i;
   }

   @Override
   public Optional<class04891> z() {
      return Optional.of(class04909.ud);
   }

   private static boolean u(class05487 var0) {
      return var0.method_75598().N(class00608.I);
   }

   @Override
   public class04651 u() {
      return class04684.u;
   }

   @Override
   public class00500 y(class04688 var1) {
      return class00869.V.W().y(class07117.y, i(var1));
   }

   @Override
   public int y(class05487 var1) {
      return u(var1) ? 4 : 2;
   }

   private boolean y(class05487 var1, class07209 var2) {
      return var1.L(var2.method_10264()) && !var1.E(var2) ? false : var1.method_8320(var2).s();
   }

   @Override
   protected void N(class07284 var1, class07209 var2, class00500 var3, class07211 var4, class04688 var5) {
      if (var4 == class07211.field_11033) {
         class04688 class04688 = var1.method_8316(var2);
         if (this.N(class01231.y) && class04688.N(class01231.N)) {
            if (var3.i() instanceof class07117) {
               var1.method_8652(var2, class00869.y.W(), 3);
            }

            this.N(var1, var2);
            return;
         }
      }

      super.N(var1, var2, var3, var4, var5);
   }

   @Override
   protected boolean N(class04782 var1) {
      return var1.method_64395().N(class07305.v);
   }

   private void N(class07284 var1, class07209 var2) {
      var1.N(1501, var2, 0);
   }

   @Override
   public void N(class07299 var1, class07209 var2, class04688 var3, class06069 var4) {
      class07209 class07209 = var2.method_10084();
      if (var1.method_8320(class07209).P() && !var1.method_8320(class07209).t()) {
         if (var4.y(100) == 0) {
            double d0 = var2.method_10263() + var4.U();
            double d1 = var2.method_10264() + 1.0;
            double d2 = var2.method_10260() + var4.U();
            var1.method_8406(class07107.NL, d0, d1, d2, 0.0, 0.0, 0.0);
            var1.method_8486(d0, d1, d2, class04909.sS, class04911.field_15256, 0.2F + var4.z() * 0.2F, 0.9F + var4.z() * 0.15F, false);
         }

         if (var4.y(200) == 0) {
            var1.method_8486(
               var2.method_10263(),
               var2.method_10264(),
               var2.method_10260(),
               class04909.sf,
               class04911.field_15256,
               0.2F + var4.z() * 0.2F,
               0.9F + var4.z() * 0.15F,
               false
            );
         }
      }
   }

   @Override
   public class06581 N() {
      return class06570.jW;
   }

   @Override
   public int N(class05487 var1) {
      return u(var1) ? 10 : 30;
   }

   @Override
   public void N(class04782 var1, class07209 var2, class04688 var3, class06069 var4) {
      if (var1.method_76058(var2)) {
         int ix = var4.y(3);
         if (ix > 0) {
            class07209 class07209x = var2;

            for (int j = 0; j < ix; j++) {
               class07209x = class07209x.method_10069(var4.y(3) - 1, 1, var4.y(3) - 1);
               if (!var1.method_8477(class07209x)) {
                  return;
               }

               class00500 class00500 = var1.method_8320(class07209x);
               if (class00500.P()) {
                  if (this.N((class05487)var1, class07209x)) {
                     var1.method_8501(class07209x, class05989.y(var1, class07209x));
                     return;
                  }
               } else if (class00500.M()) {
                  return;
               }
            }
         } else {
            for (int k = 0; k < 3; k++) {
               class07209 class07209 = var2.method_10069(var4.y(3) - 1, 0, var4.y(3) - 1);
               if (!var1.method_8477(class07209)) {
                  return;
               }

               if (var1.R(class07209.method_10084()) && this.y(var1, class07209)) {
                  var1.method_8501(class07209.method_10084(), class05989.y(var1, class07209));
               }
            }
         }
      }
   }

   @Override
   public boolean N(class04651 var1) {
      return var1 == class04684.i || var1 == class04684.u;
   }

   @Override
   protected void N(class07299 var1, class07209 var2, class07049 var3, class08400 var4) {
      var4.N(class08397.field_61896);
      var4.N(class08397.field_56644);
      var4.y(class08397.field_56644, class07049::method_5730);
   }

   @Override
   protected void N(class07284 var1, class07209 var2, class00500 var3) {
      this.N(var1, var2);
   }

   @Override
   public boolean N(class04688 var1, class07290 var2, class07209 var3, class04651 var4, class07211 var5) {
      return var1.N(var2, var3) >= 0.44444445F && var4.N(class01231.N);
   }

   private boolean N(class05487 var1, class07209 var2) {
      for (class07211 class07211 : class07211.values()) {
         if (this.y(var1, var2.method_10093(class07211))) {
            return true;
         }
      }

      return false;
   }

   @Override
   public int N(class07299 var1, class07209 var2, class04688 var3, class04688 var4) {
      int ix = this.N(var1);
      if (!var3.W() && !var4.W() && !var3.L(N) && !var4.L(N) && var4.N(var1, var2) > var3.N(var1, var2) && var1.method_8409().y(4) != 0) {
         ix *= 4;
      }

      return ix;
   }
}
