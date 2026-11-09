package minecraft;

import Nursultan.class10734;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import net.fabricmc.fabric.api.blockview.v2.FabricBlockView;
import net.fabricmc.fabric.mixin.blockview.BlockGetterMixin;
import org.jspecify.annotations.Nullable;

public interface class07290 extends class05474, FabricBlockView, BlockGetterMixin {
   default double L(class07209 var1) {
      return this.N(this.method_8320(var1).M(this, var1), () -> {
         class07209 class07209 = var1.method_10074();
         return this.method_8320(class07209).M(this, class07209);
      });
   }

   class00500 method_8320(class07209 var1);

   class04688 method_8316(class07209 var1);

   private BiFunction u(class05862 var1) {
      return new class10734(this, var1);
   }

   default int y(class07209 var1) {
      return this.method_8320(var1).m();
   }

   default class06183 N(class05862 var1) {
      return N(
         var1.y(), var1.N(), var1, !(this instanceof class04782) && (!(this instanceof class07299) || !((class07299)this).method_8608()) ? (var1x, var2) -> {
            class00500 class00500 = this.method_8320(var2);
            class04688 class04688 = this.method_8316(var2);
            class06889 class06889x = var1x.y();
            class06889 class06889x = var1x.N();
            class00494 class00494 = var1x.N(class00500, this, var2);
            class06183 class06183x = this.N(class06889x, class06889x, var2, class00494, class00500);
            class06183 class06183x = var1x.N(class04688, this, var2).method_1092(class06889x, class06889x, var2);
            double d0 = class06183x == null ? Double.MAX_VALUE : var1x.y().M(class06183x.y());
            double d1 = class06183x == null ? Double.MAX_VALUE : var1x.y().M(class06183x.y());
            return d0 <= d1 ? class06183x : class06183x;
         } : this.u(var1), var0 -> {
            class06889 class06889 = var0.y().u(var0.N());
            return class06183.N(var0.N(), class07211.N(class06889.M, class06889.B, class06889.Z), class07209.method_49638(var0.N()));
         }
      );
   }

   private static int N(LongSet var0, class06889 var1, class00734 var2, class07319 var3) {
      double d0 = var2.y();
      double d1 = var2.L();
      double d2 = var2.u();
      class00753 class00753 = N(var1);
      class06889 class06889x = var2.R();
      class06889 class06889x = new class06889(
         class06889x.N() + d0 * 0.5 * class00753.method_10263(),
         class06889x.y() + d1 * 0.5 * class00753.method_10264(),
         class06889x.L() + d2 * 0.5 * class00753.method_10260()
      );
      class06889 class06889xx = class06889x.u(var1);
      int i = class04995.N(class06889xx.M);
      int j = class04995.N(class06889xx.B);
      int k = class04995.N(class06889xx.Z);
      int l = class04995.U(var1.M);
      int i1 = class04995.U(var1.B);
      int j1 = class04995.U(var1.Z);
      double d3 = l == 0 ? Double.MAX_VALUE : l / var1.M;
      double d4 = i1 == 0 ? Double.MAX_VALUE : i1 / var1.B;
      double d5 = j1 == 0 ? Double.MAX_VALUE : j1 / var1.Z;
      double d6 = d3 * (l > 0 ? 1.0 - class04995.R(class06889xx.M) : class04995.R(class06889xx.M));
      double d7 = d4 * (i1 > 0 ? 1.0 - class04995.R(class06889xx.B) : class04995.R(class06889xx.B));
      double d8 = d5 * (j1 > 0 ? 1.0 - class04995.R(class06889xx.Z) : class04995.R(class06889xx.Z));
      int k1 = 0;

      while (d6 <= 1.0 || d7 <= 1.0 || d8 <= 1.0) {
         if (d6 < d7) {
            if (d6 < d8) {
               i += l;
               d6 += d3;
            } else {
               k += j1;
               d8 += d5;
            }
         } else if (d7 < d8) {
            j += i1;
            d7 += d4;
         } else {
            k += j1;
            d8 += d5;
         }

         Optional<class06889> optional = class00734.N(i, j, k, i + 1, j + 1, k + 1, class06889xx, class06889x);
         if (!optional.isEmpty()) {
            k1++;
            class06889 class06889xxx = optional.get();
            double d9 = class04995.N(class06889xxx.M, i + 1.0E-5F, i + 1.0 - 1.0E-5F);
            double d10 = class04995.N(class06889xxx.B, j + 1.0E-5F, j + 1.0 - 1.0E-5F);
            double d11 = class04995.N(class06889xxx.Z, k + 1.0E-5F, k + 1.0 - 1.0E-5F);
            int l1 = class04995.N(d9 - d0 * class00753.method_10263());
            int i2 = class04995.N(d10 - d1 * class00753.method_10264());
            int j2 = class04995.N(d11 - d2 * class00753.method_10260());
            int k2 = k1;

            for (class07209 class07209 : class07209.method_73158(i, j, k, l1, i2, j2, var1)) {
               if (var0.add(class07209.method_10063()) && !var3.visit(class07209, k2)) {
                  return -1;
               }
            }
         }
      }

      return k1;
   }

   private static class00753 N(class06889 var0) {
      double d0 = Math.abs(class06889.u.y(var0));
      double d1 = Math.abs(class06889.i.y(var0));
      double d2 = Math.abs(class06889.R.y(var0));
      int i = var0.M >= 0.0 ? 1 : -1;
      int j = var0.B >= 0.0 ? 1 : -1;
      int k = var0.Z >= 0.0 ? 1 : -1;
      if (d0 <= d1 && d0 <= d2) {
         return new class00753(-i, -k, j);
      } else {
         return d1 <= d2 ? new class00753(k, -j, -i) : new class00753(-j, i, -k);
      }
   }

   default class06183 N(class06331 var1) {
      return N(
         var1.y(),
         var1.N(),
         var1,
         (var1x, var2) -> {
            class00500 class00500 = this.method_8320(var2);
            class06889 class06889 = var1x.y().u(var1x.N());
            return var1x.L().test(class00500)
               ? new class06183(var1x.N(), class07211.N(class06889.M, class06889.B, class06889.Z), class07209.method_49638(var1x.N()), false)
               : null;
         },
         var0 -> {
            class06889 class06889 = var0.y().u(var0.N());
            return class06183.N(var0.N(), class07211.N(class06889.M, class06889.B, class06889.Z), class07209.method_49638(var0.N()));
         }
      );
   }

   default Stream<class00500> N(class00734 var1) {
      return class07209.method_29715(var1).map(this::method_8320);
   }

   default <T extends class00394> Optional<T> N(class07209 var1, class00404<T> var2) {
      class00394 class00394 = this.method_8321(var1);
      return class00394 != null && class00394.O() == var2 ? Optional.of((T)class00394) : Optional.empty();
   }

   static boolean N(class06889 var0, class06889 var1, class00734 var2, class07319 var3) {
      class06889 class06889 = var1.u(var0);
      if (class06889.B() < class04995.z(N(1.0E-5F))) {
         for (class07209 class07209 : class07209.method_62671(var2)) {
            if (!var3.visit(class07209, 0)) {
               return false;
            }
         }

         return true;
      } else {
         LongOpenHashSet var5 = new LongOpenHashSet();

         for (class07209 class07209x : class07209.method_73159(var2.L(class06889.L(-1.0)), class06889)) {
            if (!var3.visit(class07209x, 0)) {
               return false;
            }

            var5.add(class07209x.method_10063());
         }

         int i = N(var5, class06889, var2, var3);
         if (i < 0) {
            return false;
         } else {
            for (class07209 class07209x : class07209.method_73159(var2, class06889)) {
               if (var5.add(class07209x.method_10063()) && !var3.visit(class07209x, i + 1)) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private static float N(float var0) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_7) ? 0.99999F : var0;
   }

   static <T, C> T N(class06889 var0, class06889 var1, C var2, BiFunction<C, class07209, T> var3, Function<C, T> var4) {
      if (var0.equals(var1)) {
         return (T)var4.apply(var2);
      } else {
         double d0 = class04995.u(-1.0E-7, var1.M, var0.M);
         double d1 = class04995.u(-1.0E-7, var1.B, var0.B);
         double d2 = class04995.u(-1.0E-7, var1.Z, var0.Z);
         double d3 = class04995.u(-1.0E-7, var0.M, var1.M);
         double d4 = class04995.u(-1.0E-7, var0.B, var1.B);
         double d5 = class04995.u(-1.0E-7, var0.Z, var1.Z);
         int i = class04995.N(d3);
         int j = class04995.N(d4);
         int k = class04995.N(d5);
         class07218 class07218 = new class07218(i, j, k);
         Object object = var3.apply(var2, class07218);
         if (object != null) {
            return (T)object;
         } else {
            double d6 = d0 - d3;
            double d7 = d1 - d4;
            double d8 = d2 - d5;
            int l = class04995.U(d6);
            int i1 = class04995.U(d7);
            int j1 = class04995.U(d8);
            double d9 = l == 0 ? Double.MAX_VALUE : l / d6;
            double d10 = i1 == 0 ? Double.MAX_VALUE : i1 / d7;
            double d11 = j1 == 0 ? Double.MAX_VALUE : j1 / d8;
            double d12 = d9 * (l > 0 ? 1.0 - class04995.R(d3) : class04995.R(d3));
            double d13 = d10 * (i1 > 0 ? 1.0 - class04995.R(d4) : class04995.R(d4));
            double d14 = d11 * (j1 > 0 ? 1.0 - class04995.R(d5) : class04995.R(d5));

            while (d12 <= 1.0 || d13 <= 1.0 || d14 <= 1.0) {
               if (d12 < d13) {
                  if (d12 < d14) {
                     i += l;
                     d12 += d9;
                  } else {
                     k += j1;
                     d14 += d11;
                  }
               } else if (d13 < d14) {
                  j += i1;
                  d13 += d10;
               } else {
                  k += j1;
                  d14 += d11;
               }

               Object object1 = var3.apply(var2, class07218.N(i, j, k));
               if (object1 != null) {
                  return (T)object1;
               }
            }

            return (T)var4.apply(var2);
         }
      }
   }

   default double N(class00494 var1, Supplier<class00494> var2) {
      if (!var1.method_1110()) {
         return var1.method_1105(class07185.field_11052);
      } else {
         double d0 = ((class00494)var2.get()).method_1105(class07185.field_11052);
         return d0 >= 1.0 ? d0 - 1.0 : Double.NEGATIVE_INFINITY;
      }
   }

   @Nullable
   default class06183 N(class06889 var1, class06889 var2, class07209 var3, class00494 var4, class00500 var5) {
      class06183 class06183x = var4.method_1092(var1, var2, var3);
      if (class06183x != null) {
         class06183 class06183x = var5.Z(this, var3).method_1092(var1, var2, var3);
         if (class06183x != null && class06183x.y().u(var1).B() < class06183x.y().u(var1).B()) {
            return class06183x.N(class06183x.i());
         }
      }

      return class06183x;
   }

   @Nullable
   class00394 method_8321(class07209 var1);
}
