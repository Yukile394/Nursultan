package minecraft;

import Nursultan.class10285;
import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;

public abstract class class02158<C extends class06034> {
   public static final class02158<class04389> N = N("cave", new class07811(class04389.L));
   public static final class02158<class04389> y = N("nether_cave", new class07809(class04389.L));
   public static final class02158<class06072> L = N("canyon", new class06062(class06072.L));
   protected static final class00500 u = class00869.N.W();
   protected static final class00500 i = class00869.mr.W();
   protected static final class04688 R = class04684.L.M();
   protected static final class04688 M = class04684.i.M();
   protected Set<class04651> B = ImmutableSet.of(class04684.L);
   private final MapCodec<class07829<C>> Z;

   public MapCodec<class07829<C>> L() {
      return this.Z;
   }

   public class02158(Codec<C> var1) {
      super();
      this.Z = var1.fieldOf("config").xmap(this::N, class07829::y);
   }

   public int u() {
      return 4;
   }

   private static boolean y(class06034 var0) {
      return class07529.r || var0.U.N();
   }

   private static class00500 y(class06034 var0, class00500 var1) {
      if (var1.N(class00869.N)) {
         return var0.U.y();
      } else if (var1.N(class00869.K)) {
         class00500 class00500 = var0.U.L();
         return class00500.y(class06665.q) ? class00500.y(class06665.q, true) : class00500;
      } else {
         return var1.N(class00869.V) ? var0.U.u() : var1;
      }
   }

   protected boolean N(C var1, class00500 var2) {
      return var2.N(var1.E);
   }

   protected static boolean N(class07321 var0, double var1, double var3, int var5, int var6, float var7) {
      double d0 = var0.L();
      double d1 = var0.u();
      double d2 = var1 - d0;
      double d3 = var3 - d1;
      double d4 = var6 - var5;
      double d5 = var7 + 2.0F + 16.0F;
      return d2 * d2 + d3 * d3 - d4 * d4 <= d5 * d5;
   }

   public class07829<C> N(C var1) {
      return new class07829<>(this, var1);
   }

   private static <C extends class06034, F extends class02158<C>> F N(String var0, F var1) {
      return class00751.N(class04206.c, var0, (F)var1);
   }

   protected boolean N(
      class06080 var1,
      C var2,
      class08050 var3,
      Function<class07209, class03556<class00780>> var4,
      class03322 var5,
      class07218 var6,
      class07218 var7,
      class03460 var8,
      MutableBoolean var9
   ) {
      class00500 class00500x = var3.method_8320(var6);
      if (class00500x.N(class00869.Z) || class00500x.N(class00869.RC)) {
         var9.setTrue();
      }

      if (!this.N((C)var2, class00500x) && !y(var2)) {
         return false;
      } else {
         class00500 class00500x = this.N(var1, (C)var2, var6, var8);
         if (class00500x == null) {
            return false;
         } else {
            var3.N(var6, class00500x);
            if (var8.N() && !class00500x.Y().W()) {
               var3.u(var6);
            }

            if (var9.isTrue()) {
               var7.N(var6, class07211.field_11033);
               if (var3.method_8320(var7).N(class00869.z)) {
                  var1.N(var4, var3, var7, !class00500x.Y().W()).ifPresent(var2x -> {
                     var3.N(var7, var2x);
                     if (!var2x.Y().W()) {
                        var3.u(var7);
                     }
                  });
               }
            }

            return true;
         }
      }
   }

   @Nullable
   private class00500 N(class06080 var1, C var2, class07209 var3, class03460 var4) {
      if (var3.method_10264() <= var2.z.N(var1)) {
         return M.B();
      } else {
         class00500 class00500 = var4.N(new class10285(var3.method_10263(), var3.method_10264(), var3.method_10260()), 0.0);
         if (class00500 == null) {
            return y(var2) ? var2.U.i() : null;
         } else {
            return y(var2) ? y(var2, class00500) : class00500;
         }
      }
   }

   protected boolean N(
      class06080 var1,
      C var2,
      class08050 var3,
      Function<class07209, class03556<class00780>> var4,
      class03460 var5,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      class03322 var16,
      class04521 var17
   ) {
      class07321 class07321 = var3.R();
      double d0 = class07321.L();
      double d1 = class07321.u();
      double d2 = 16.0 + var12 * 2.0;
      if (!(Math.abs(var6 - d0) > d2) && !(Math.abs(var10 - d1) > d2)) {
         int ix = class07321.i();
         int j = class07321.R();
         int k = Math.max(class04995.N(var6 - var12) - ix - 1, 0);
         int l = Math.min(class04995.N(var6 + var12) - ix, 15);
         int i1 = Math.max(class04995.N(var8 - var14) - 1, var1.i() + 1);
         int j1 = var3.d() ? 0 : 7;
         int k1 = Math.min(class04995.N(var8 + var14) + 1, var1.i() + var1.R() - 1 - j1);
         int l1 = Math.max(class04995.N(var10 - var12) - j - 1, 0);
         int i2 = Math.min(class04995.N(var10 + var12) - j, 15);
         boolean flag = false;
         class07218 class07218x = new class07218();
         class07218 class07218x = new class07218();

         for (int j2 = k; j2 <= l; j2++) {
            int k2 = class07321.N(j2);
            double d3 = (k2 + 0.5 - var6) / var12;

            for (int l2 = l1; l2 <= i2; l2++) {
               int i3 = class07321.y(l2);
               double d4 = (i3 + 0.5 - var10) / var12;
               if (!(d3 * d3 + d4 * d4 >= 1.0)) {
                  MutableBoolean mutableboolean = new MutableBoolean(false);

                  for (int j3 = k1; j3 > i1; j3--) {
                     double d5 = (j3 - 0.5 - var8) / var14;
                     if (!var17.shouldSkip(var1, d3, d5, d4, j3) && (!var16.y(j2, j3, l2) || y(var2))) {
                        var16.N(j2, j3, l2);
                        class07218x.N(k2, j3, i3);
                        flag |= this.N(var1, (C)var2, var3, var4, var16, class07218x, class07218x, var5, mutableboolean);
                     }
                  }
               }
            }
         }

         return flag;
      } else {
         return false;
      }
   }

   public abstract boolean N(
      class06080 var1,
      C var2,
      class08050 var3,
      Function<class07209, class03556<class00780>> var4,
      class06069 var5,
      class03460 var6,
      class07321 var7,
      class03322 var8
   );

   public abstract boolean N(C var1, class06069 var2);
}
