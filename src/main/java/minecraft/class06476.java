package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public abstract class class06476 extends class04890 {
   protected static final class00500 y = class00869.ZF.W();
   protected static final class00500 L = class00869.ZA.W();
   protected static final class00500 u = class00869.Zf.W();
   protected static final class00500 i = L;
   protected static final class00500 R = class00869.zN.W();
   protected static final boolean M = true;
   protected static final class00500 B = class00869.K.W();
   protected static final Set<class00891> Z = ImmutableSet.builder().add(class00869.iT).add(class00869.zn).add(class00869.mf).add(B.i()).build();
   protected static final int z = 8;
   protected static final int U = 8;
   protected static final int E = 4;
   protected static final int W = 5;
   protected static final int m = 5;
   protected static final int P = 3;
   protected static final int s = 25;
   protected static final int T = 75;
   protected static final int b = y(2, 0, 0);
   protected static final int j = y(2, 2, 0);
   protected static final int v = y(0, 1, 0);
   protected static final int n = y(4, 1, 0);
   protected static final int t = 1001;
   protected static final int G = 1002;
   protected static final int l = 1003;
   protected class06433 d;

   public class06476(class04878 var1, class07001 var2) {
      super(var1, var2);
   }

   public class06476(class04878 var1, class07211 var2, int var3, class05163 var4) {
      super(var1, var3, var4);
      this.N(var2);
   }

   protected class06476(class04878 var1, int var2, class07211 var3, class06433 var4, int var5, int var6, int var7) {
      super(var1, var2, N(var3, var4, var5, var6, var7));
      this.N(var3);
      this.d = var4;
   }

   protected static int y(int var0, int var1, int var2) {
      return var1 * 25 + var2 * 5 + var0;
   }

   protected void N(class05974 var1, class05163 var2, int var3, int var4, int var5, int var6, int var7, int var8, class00500 var9) {
      for (int ix = var4; ix <= var7; ix++) {
         for (int jx = var3; jx <= var6; jx++) {
            for (int k = var5; k <= var8; k++) {
               if (this.N(var1, jx, ix, k, var2) == B) {
                  this.L(var1, var9, jx, ix, k, var2);
               }
            }
         }
      }
   }

   protected boolean N(class05163 var1, int var2, int var3, int var4, int var5) {
      int ix = this.N(var2, var3);
      int jx = this.y(var2, var3);
      int k = this.N(var4, var5);
      int lx = this.y(var4, var5);
      return var1.N(Math.min(ix, k), Math.min(jx, lx), Math.max(ix, k), Math.max(jx, lx));
   }

   protected void N(class05974 var1, class05163 var2, int var3, int var4, int var5) {
      class07218 class07218 = this.L(var3, var4, var5);
      if (var2.y(class07218)) {
         class07520 class07520 = class07078.p.N(var1.method_8410(), class06113.field_16474);
         if (class07520 != null) {
            class07520.method_6025(class07520.method_6063());
            class07520.method_5808(class07218.method_10263() + 0.5, class07218.method_10264(), class07218.method_10260() + 0.5, 0.0F, 0.0F);
            class07520.N(var1, var1.method_8404(class07520.method_24515()), class06113.field_16474, null);
            var1.y(class07520);
         }
      }
   }

   protected void N(class05974 var1, class05163 var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      for (int ix = var4; ix <= var7; ix++) {
         for (int jx = var3; jx <= var6; jx++) {
            for (int k = var5; k <= var8; k++) {
               class00500 class00500 = this.N(var1, jx, ix, k, var2);
               if (!Z.contains(class00500.i())) {
                  if (this.L(ix) >= var1.method_8615() && class00500 != B) {
                     this.L(var1, class00869.N.W(), jx, ix, k, var2);
                  } else {
                     this.L(var1, B, jx, ix, k, var2);
                  }
               }
            }
         }
      }
   }

   protected void N(class05974 var1, class05163 var2, int var3, int var4, boolean var5) {
      if (var5) {
         this.N(var1, var2, var3 + 0, 0, var4 + 0, var3 + 2, 0, var4 + 8 - 1, y, y, false);
         this.N(var1, var2, var3 + 5, 0, var4 + 0, var3 + 8 - 1, 0, var4 + 8 - 1, y, y, false);
         this.N(var1, var2, var3 + 3, 0, var4 + 0, var3 + 4, 0, var4 + 2, y, y, false);
         this.N(var1, var2, var3 + 3, 0, var4 + 5, var3 + 4, 0, var4 + 8 - 1, y, y, false);
         this.N(var1, var2, var3 + 3, 0, var4 + 2, var3 + 4, 0, var4 + 2, L, L, false);
         this.N(var1, var2, var3 + 3, 0, var4 + 5, var3 + 4, 0, var4 + 5, L, L, false);
         this.N(var1, var2, var3 + 2, 0, var4 + 3, var3 + 2, 0, var4 + 4, L, L, false);
         this.N(var1, var2, var3 + 5, 0, var4 + 3, var3 + 5, 0, var4 + 4, L, L, false);
      } else {
         this.N(var1, var2, var3 + 0, 0, var4 + 0, var3 + 8 - 1, 0, var4 + 8 - 1, y, y, false);
      }
   }

   private static class05163 N(class07211 var0, class06433 var1, int var2, int var3, int var4) {
      int ix = var1.N;
      int jx = ix % 5;
      int k = ix / 5 % 5;
      int lx = ix / 25;
      class05163 class05163 = N(0, 0, 0, var0, var2 * 8, var3 * 4, var4 * 8);
      switch (var0) {
         case field_11043:
            class05163.N(jx * 8, lx * 4, -(k + var4) * 8 + 1);
            break;
         case field_11035:
            class05163.N(jx * 8, lx * 4, k * 8);
            break;
         case field_11039:
            class05163.N(-(k + var4) * 8 + 1, lx * 4, jx * 8);
            break;
         case field_11034:
         default:
            class05163.N(k * 8, lx * 4, jx * 8);
      }

      return class05163;
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
   }
}
