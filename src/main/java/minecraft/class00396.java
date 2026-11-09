package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class00396 extends class00394 {
   private static final int y = 2;
   private static final int L = 13;
   private static final float u = -0.0375F;
   private static final int i = 16;
   private static final int R = 42;
   private static final int M = 8;
   private static final class00891[] B = new class00891[]{class00869.ZF, class00869.ZA, class00869.zN, class00869.Zf};
   public int N;
   private float Z;
   private boolean m;
   private boolean P;
   private final List<class07209> s = Lists.newArrayList();
   @Nullable
   private class08372<class07438> T;
   private long b;

   public boolean L() {
      return this.m;
   }

   public class00396(class07209 var1, class00500 var2) {
      super(class00404.field_11902, var1, var2);
   }

   public boolean u() {
      return this.P;
   }

   private static void y(class07299 var0, class07209 var1, List<class07209> var2) {
      int ix = var2.size() / 7 * 16;
      int j = var1.method_10263();
      int k = var1.method_10264();
      int l = var1.method_10260();
      class00734 class00734 = new class00734(j, k, l, j + 1, k + 1, l + 1).M(ix).y(0.0, var0.method_31605(), 0.0);
      List<class08036> list = var0.N(class08036.class, class00734);
      if (!list.isEmpty()) {
         for (class08036 class08036 : list) {
            if (var1.method_19771(class08036.method_24515(), ix) && class08036.method_5721()) {
               class08036.method_6092(new class07055(class07047.Q, 260, 0, true, true));
            }
         }
      }
   }

   public static void y(class07299 var0, class07209 var1, class00500 var2, class00396 var3) {
      var3.N++;
      long ix = var0.N();
      List<class07209> list = var3.s;
      if (ix % 40L == 0L) {
         boolean flag = N(var0, var1, list);
         if (flag != var3.m) {
            class04891 class04891 = flag ? class04909.RD : class04909.My;
            var0.method_8396(null, var1, class04891, class04911.field_15245, 1.0F, 1.0F);
         }

         var3.m = flag;
         N(var3, list);
         if (flag) {
            y(var0, var1, list);
            N((class04782)var0, var1, var2, var3, list.size() >= 42);
         }
      }

      if (var3.L()) {
         if (ix % 80L == 0L) {
            var0.method_8396(null, var1, class04909.Rh, class04911.field_15245, 1.0F, 1.0F);
         }

         if (ix > var3.b) {
            var3.b = ix + 60L + var0.method_8409().y(40);
            var0.method_8396(null, var1, class04909.Rr, class04911.field_15245, 1.0F, 1.0F);
         }
      }
   }

   private static class00734 N(class07209 var0) {
      return new class00734(var0).M(8.0);
   }

   private static void N(class07299 var0, class07209 var1, List<class07209> var2, @Nullable class07049 var3, int var4) {
      class06069 class06069 = var0.field_9229;
      double d0 = class04995.m((var4 + 35) * 0.1F) / 2.0F + 0.5F;
      d0 = (d0 * d0 + d0) * 0.3F;
      class06889 class06889xx = new class06889(var1.method_10263() + 0.5, var1.method_10264() + 1.5 + d0, var1.method_10260() + 0.5);

      for (class07209 class07209x : var2) {
         if (class06069.y(50) == 0) {
            class07209 class07209x = class07209x.method_10059(var1);
            float f = -0.5F + class06069.z() + class07209x.method_10263();
            float f1 = -2.0F + class06069.z() + class07209x.method_10264();
            float f2 = -0.5F + class06069.z() + class07209x.method_10260();
            var0.method_8406(class07107.Nt, class06889xx.M, class06889xx.B, class06889xx.Z, f, f1, f2);
         }
      }

      if (var3 != null) {
         class06889 class06889x = new class06889(var3.method_23317(), var3.method_23320(), var3.method_23321());
         float f3 = (-0.5F + class06069.z()) * (3.0F + var3.method_17681());
         float f4 = -1.0F + class06069.z() * var3.method_17682();
         float f5 = (-0.5F + class06069.z()) * (3.0F + var3.method_17681());
         class06889 class06889xx = new class06889(f3, f4, f5);
         var0.method_8406(class07107.Nt, class06889x.M, class06889x.B, class06889x.Z, class06889xx.M, class06889xx.B, class06889xx.Z);
      }
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.T = class08372.N(var1, "Target");
   }

   @Nullable
   private static class08372<class07438> N(@Nullable class08372<class07438> var0, class04782 var1, class07209 var2, boolean var3) {
      if (!var3) {
         return null;
      } else if (var0 == null) {
         return N(var1, var2);
      } else {
         class07438 class07438 = class08372.y(var0, var1);
         return class07438 != null && class07438.method_5805() && var2.method_19771(class07438.method_24515(), 8.0) ? var0 : null;
      }
   }

   public float N(float var1) {
      return (this.Z + var1) * -0.0375F;
   }

   private void N(boolean var1) {
      this.P = var1;
   }

   private static void N(class00396 var0, List<class07209> var1) {
      var0.N(var1.size() >= 42);
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class00396 var3) {
      var3.N++;
      long ix = var0.N();
      List<class07209> list = var3.s;
      if (ix % 40L == 0L) {
         var3.m = N(var0, var1, list);
         N(var3, list);
      }

      class07438 class07438 = class08372.y(var3.T, var0);
      N(var0, var1, list, class07438, var3.N);
      if (var3.L()) {
         var3.Z++;
      }
   }

   @Override
   public class07001 N(class01929 var1) {
      return this.u(var1);
   }

   public class07269 i() {
      return class07269.N(this);
   }

   @Nullable
   private static class08372<class07438> N(class04782 var0, class07209 var1) {
      List<class07438> list = var0.N(class07438.class, N(var1), var0x -> var0x instanceof class07542 && var0x.method_5721());
      return list.isEmpty() ? null : class08372.N(class07536.N_77(list, var0.field_9229));
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      class08372.N(this.T, var1, "Target");
   }

   private static void N(class04782 var0, class07209 var1, class00500 var2, class00396 var3, boolean var4) {
      class08372<class07438> class08372 = N(var3.T, var0, var1, var4);
      class07438 class07438 = class08372.y(class08372, var0);
      if (class07438 != null) {
         var0.method_43128(
            null, class07438.method_23317(), class07438.method_23318(), class07438.method_23321(), class04909.MN, class04911.field_15245, 1.0F, 1.0F
         );
         class07438.method_64397(var0, var0.method_48963().T(), 4.0F);
      }

      if (!Objects.equals(class08372, var3.T)) {
         var3.T = class08372;
         var0.method_8413(var1, var2, var2, 2);
      }
   }

   private static boolean N(class07299 var0, class07209 var1, List<class07209> var2) {
      var2.clear();

      for (int ix = -1; ix <= 1; ix++) {
         for (int j = -1; j <= 1; j++) {
            for (int k = -1; k <= 1; k++) {
               class07209 class07209x = var1.method_10069(ix, j, k);
               if (!var0.z(class07209x)) {
                  return false;
               }
            }
         }
      }

      for (int j1 = -2; j1 <= 2; j1++) {
         for (int k1 = -2; k1 <= 2; k1++) {
            for (int l1 = -2; l1 <= 2; l1++) {
               int i2 = Math.abs(j1);
               int l = Math.abs(k1);
               int i1 = Math.abs(l1);
               if ((i2 > 1 || l > 1 || i1 > 1) && (j1 == 0 && (l == 2 || i1 == 2) || k1 == 0 && (i2 == 2 || i1 == 2) || l1 == 0 && (i2 == 2 || l == 2))) {
                  class07209 class07209 = var1.method_10069(j1, k1, l1);
                  class00500 class00500 = var0.method_8320(class07209);

                  for (class00891 class00891 : B) {
                     if (class00500.N(class00891)) {
                        var2.add(class07209);
                     }
                  }
               }
            }
         }
      }

      return var2.size() >= 16;
   }
}
