package minecraft;

import java.time.Duration;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

public class class03473 implements class01857 {
   private static final Duration N = Duration.ofMillis(500L);
   private static final int y = 10;
   private static final int L = class02566.N(0.25F, 1.0F, 1.0F, 0.0F);
   private static final int u = class02566.N(0.125F, 0.25F, 0.125F, 0.0F);
   private final class06202 i;
   private final class00772 R;
   private Instant M = Instant.now();
   @Nullable
   private class03501 B;

   public class03473(class06202 var1, class00772 var2) {
      super();
      this.i = var1;
      this.R = var2;
   }

   private static void y(class07739 var0, class01296 var1, int var2) {
      var0.method_1064((var2x, var3, var4, var5, var6, var7) -> {
         int ix = var2x + var1.method_10263();
         int j = var3 + var1.method_10264();
         int k = var4 + var1.method_10260();
         int l = var5 + var1.method_10263();
         int i1 = var6 + var1.method_10264();
         int j1 = var7 + var1.method_10260();
         N(ix, j, k, l, i1, j1, var2);
      }, true);
   }

   private static void N(class07211 var0, int var1, int var2, int var3, int var4) {
      class06889 class06889x = new class06889(class01296.L(var1), class01296.L(var2), class01296.L(var3));
      class06889 class06889x = class06889x.y(16.0, 16.0, 16.0);
      class06724.N(class06889x, class06889x, var0, class06747.y(var4));
   }

   private static void N(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      double d0 = class01296.L(var0);
      double d1 = class01296.L(var1);
      double d2 = class01296.L(var2);
      double d3 = class01296.L(var3);
      double d4 = class01296.L(var4);
      double d5 = class01296.L(var5);
      int ix = class02566.M(var6);
      class06724.N(new class06889(d0, d1, d2), new class06889(d3, d4, d5), ix);
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      Instant instant = Instant.now();
      if (this.B == null || Duration.between(this.M, instant).compareTo(N) > 0) {
         this.M = instant;
         this.B = new class03501(((class03448)this.i.T_3).method_22336(), class01296.N(((class04453)this.i.T_4).method_24515()), 10, this.R);
      }

      y(this.B.N, this.B.L, L);
      y(this.B.y, this.B.L, u);
      N(this.B.N, this.B.L, L);
      N(this.B.y, this.B.L, u);
   }

   private static void N(class07739 var0, class01296 var1, int var2) {
      var0.method_1046((var2x, var3, var4, var5) -> {
         int ix = var3 + var1.method_10263();
         int j = var4 + var1.method_10264();
         int k = var5 + var1.method_10260();
         N(var2x, ix, j, k, var2);
      });
   }
}
