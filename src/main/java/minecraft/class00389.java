package minecraft;

import com.google.common.collect.Maps;
import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeAlignedCuboid;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeEmpty;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeMatchesAnywhere;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeSimpleCube;
import net.caffeinemc.mods.lithium.common.shapes.pairs.LithiumDoublePairList;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public final class class00389 {
   public static final double N = 1.0E-7;
   public static final double y = 1.0E-6;
   private static class00494 u = class07536.N(() -> {
      class06890 class06890 = new class06890(1, 1, 1);
      class06890.method_1049(0, 0, 0);
      return new class07017(class06890);
   });
   private static final class06889 i = new class06889(0.5, 0.5, 0.5);
   public static class00494 L = N(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static class00494 R = new class06864(
      new class06890(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );
   private static final class07739 M = new class06890(1, 1, 1);

   public static Map<class07211, class00494> L(class00494 var0, class06889 var1) {
      return L(var0, class01372.field_23292, var1);
   }

   public static Map<class07211, class00494> L(class00494 var0) {
      return y(var0, class01372.field_23292, i);
   }

   public static boolean L(class00494 var0, class00494 var1) {
      return !L(var0, var1, class07003.M);
   }

   public static boolean L(class00494 var0, class00494 var1, class07003 var2) {
      if (var2.apply(false, false)) {
         throw (IllegalArgumentException)class07536.y(new IllegalArgumentException());
      } else {
         boolean flag = var0.method_1110();
         boolean flag1 = var1.method_1110();
         if (!flag && !flag1) {
            if (var0 == var1) {
               return var2.apply(true, true);
            } else {
               boolean flag2 = var2.apply(true, false);
               boolean flag3 = var2.apply(false, true);
               int ix = class07214.field_10961.length;

               for (int j = 0; j < ix; j++) {
                  class07185 class07185 = class07214.field_10961[j];
                  if (var0.method_1105(class07185) < var1.method_1091(class07185) - 1.0E-7) {
                     return flag2 || flag3;
                  }

                  if (var1.method_1105(class07185) < var0.method_1091(class07185) - 1.0E-7) {
                     return flag2 || flag3;
                  }
               }

               CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
               N(var0, var1, var2, callbackinforeturnable);
               if (callbackinforeturnable.isCancelled()) {
                  return callbackinforeturnable.getReturnValueZ();
               } else {
                  class00630 class00630xx = N(1, var0.method_1109(class07185.field_11048), var1.method_1109(class07185.field_11048), flag2, flag3);
                  class00630 class00630x = N(
                     class00630xx.size() - 1, var0.method_1109(class07185.field_11052), var1.method_1109(class07185.field_11052), flag2, flag3
                  );
                  class00630 class00630xx = N(
                     (class00630xx.size() - 1) * (class00630x.size() - 1),
                     var0.method_1109(class07185.field_11051),
                     var1.method_1109(class07185.field_11051),
                     flag2,
                     flag3
                  );
                  return N(class00630xx, class00630x, class00630xx, var0.field_1401, var1.field_1401, var2);
               }
            }
         } else {
            return var2.apply(!flag, !flag1);
         }
      }
   }

   private static double L(class00734 var0, class00734 var1, double var2) {
      if (!(var0.u <= var1.N) && !(var0.N >= var1.u) && !(var0.i <= var1.y) && !(var0.y >= var1.i)) {
         if (var2 > 0.0 && var0.R <= var1.L) {
            double d1 = var1.L - var0.R;
            if (d1 < var2) {
               var2 = d1;
            }
         } else {
            double d0;
            if (var2 < 0.0 && var0.L >= var1.R && (d0 = var1.R - var0.L) > var2) {
               var2 = d0;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public static Map<class06657, Map<class07211, class00494>> L(class00494 var0, class01372 var1) {
      return Map.of(
         class06657.field_12471,
         y(var0, var1),
         class06657.field_12475,
         y(var0, class01372.field_64506.N(var1)),
         class06657.field_12473,
         y(var0, class01372.field_64510.N(class01372.field_64508).N(var1))
      );
   }

   public static Map<class07211, class00494> L(class00494 var0, class01372 var1, class06889 var2) {
      return Maps.newEnumMap(
         Map.of(
            class07211.field_11043,
            N(var0, var1),
            class07211.field_11034,
            N(var0, class01372.field_64511.N(var1), var2),
            class07211.field_11035,
            N(var0, class01372.field_64510.N(var1), var2),
            class07211.field_11039,
            N(var0, class01372.field_64509.N(var1), var2),
            class07211.field_11036,
            N(var0, class01372.field_64506.N(var1), var2),
            class07211.field_11033,
            N(var0, class01372.field_64508.N(var1), var2)
         )
      );
   }

   public class00389() {
      super();
   }

   public static Map<class06657, Map<class07211, class00494>> i(class00494 var0) {
      return L(var0, class01372.field_23292);
   }

   public static Map<class07211, class00494> u(class00494 var0) {
      return L(var0, class01372.field_23292, i);
   }

   public static Map<class07185, class00494> y(class00494 var0) {
      return y(var0, i);
   }

   public static Map<class07211, class00494> y(class00494 var0, class01372 var1) {
      return y(var0, var1, i);
   }

   public static class00494 y(double var0, double var2, double var4, double var6, double var8, double var10) {
      if (var6 - var0 < 1.0E-7 || var8 - var2 < 1.0E-7 || var10 - var4 < 1.0E-7) {
         return R;
      } else {
         int ix;
         int j;
         int k;
         if ((ix = N(var0, var6)) < 0 || (j = N(var2, var8)) < 0 || (k = N(var4, var10)) < 0) {
            return new VoxelShapeSimpleCube(M, var0, var2, var4, var6, var8, var10);
         } else {
            return (class00494)(ix == 0 && j == 0 && k == 0
               ? u
               : new VoxelShapeAlignedCuboid(
                  Math.round(var0 * 8.0) / 8.0,
                  Math.round(var2 * 8.0) / 8.0,
                  Math.round(var4 * 8.0) / 8.0,
                  Math.round(var6 * 8.0) / 8.0,
                  Math.round(var8 * 8.0) / 8.0,
                  Math.round(var10 * 8.0) / 8.0,
                  ix,
                  j,
                  k
               ));
         }
      }
   }

   public static Map<class07185, class00494> y(class00494 var0, class06889 var1) {
      return Maps.newEnumMap(
         Map.of(
            class07185.field_11051,
            var0,
            class07185.field_11048,
            N(var0, class01372.field_64511, var1),
            class07185.field_11052,
            N(var0, class01372.field_64508, var1)
         )
      );
   }

   public static class00494 y() {
      return u;
   }

   public static Map<class07211, class00494> y(class00494 var0, class01372 var1, class06889 var2) {
      return Maps.newEnumMap(
         Map.of(
            class07211.field_11043,
            N(var0, var1),
            class07211.field_11034,
            N(var0, class01372.field_64511.N(var1), var2),
            class07211.field_11035,
            N(var0, class01372.field_64510.N(var1), var2),
            class07211.field_11039,
            N(var0, class01372.field_64509.N(var1), var2)
         )
      );
   }

   public static boolean y(class00494 var0, class00494 var1, class07211 var2) {
      if (var0 != y() && var1 != y()) {
         class07185 class07185 = var2.z();
         class07212 class07212 = var2.i();
         class00494 class00494x = class07212 == class07212.field_11056 ? var0 : var1;
         class00494 class00494x = class07212 == class07212.field_11056 ? var1 : var0;
         if (!DoubleMath.fuzzyEquals(class00494x.method_1105(class07185), 1.0, 1.0E-7)) {
            class00494x = N();
         }

         if (!DoubleMath.fuzzyEquals(class00494x.method_1091(class07185), 0.0, 1.0E-7)) {
            class00494x = N();
         }

         return !L(
            y(),
            y(
               new class07260(class00494x, class07185, class00494x.field_1401.method_1051(class07185) - 1),
               new class07260(class00494x, class07185, 0),
               class07003.P
            ),
            class07003.i
         );
      } else {
         return true;
      }
   }

   public static boolean y(class00494 var0, class00494 var1) {
      if (var0 == y() || var1 == y()) {
         return true;
      } else {
         return var0.method_1110() && var1.method_1110() ? false : !L(y(), y(var0, var1, class07003.P), class07003.i);
      }
   }

   public static class00494 y(class00494 var0, class00494 var1, class07003 var2) {
      if (var2.apply(false, false)) {
         throw (IllegalArgumentException)class07536.y(new IllegalArgumentException());
      } else if (var0 == var1) {
         return var2.apply(true, true) ? var0 : N();
      } else {
         boolean flag = var2.apply(true, false);
         boolean flag1 = var2.apply(false, true);
         if (var0.method_1110()) {
            return flag1 ? var1 : N();
         } else if (var1.method_1110()) {
            return flag ? var0 : N();
         } else {
            class00630 class00630xx = N(1, var0.method_1109(class07185.field_11048), var1.method_1109(class07185.field_11048), flag, flag1);
            class00630 class00630x = N(class00630xx.size() - 1, var0.method_1109(class07185.field_11052), var1.method_1109(class07185.field_11052), flag, flag1);
            class00630 class00630xx = N(
               (class00630xx.size() - 1) * (class00630x.size() - 1),
               var0.method_1109(class07185.field_11051),
               var1.method_1109(class07185.field_11051),
               flag,
               flag1
            );
            class06890 class06890 = class06890.N(var0.field_1401, var1.field_1401, class00630xx, class00630x, class00630xx, var2);
            return (class00494)(class00630xx instanceof class06998 && class00630x instanceof class06998 && class00630xx instanceof class06998
               ? new class07017(class06890)
               : new class06864(class06890, class00630xx.method_1066(), class00630x.method_1066(), class00630xx.method_1066()));
         }
      }
   }

   private static double y(class00734 var0, class00734 var1, double var2) {
      if (!(var0.u <= var1.N) && !(var0.N >= var1.u) && !(var0.R <= var1.L) && !(var0.L >= var1.R)) {
         if (var2 > 0.0 && var0.i <= var1.y) {
            double d1 = var1.y - var0.i;
            if (d1 < var2) {
               var2 = d1;
            }
         } else {
            double d0;
            if (var2 < 0.0 && var0.y >= var1.i && (d0 = var1.i - var0.y) > var2) {
               var2 = d0;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   private static double N(class00734 var0, class00734 var1, double var2) {
      if (!(var0.i <= var1.y) && !(var0.y >= var1.i) && !(var0.R <= var1.L) && !(var0.L >= var1.R)) {
         if (var2 > 0.0 && var0.u <= var1.N) {
            double d1 = var1.N - var0.u;
            if (d1 < var2) {
               var2 = d1;
            }
         } else {
            double d0;
            if (var2 < 0.0 && var0.N >= var1.u && (d0 = var1.u - var0.N) > var2) {
               var2 = d0;
            }
         }

         return var2;
      } else {
         return var2;
      }
   }

   public static class00494 N(double var0, double var2, double var4, double var6, double var8, double var10) {
      if (!(var0 > var6) && !(var2 > var8) && !(var4 > var10)) {
         return y(var0, var2, var4, var6, var8, var10);
      } else {
         throw new IllegalArgumentException("The min values need to be smaller or equals to the max values");
      }
   }

   public static Map<class07185, class00494> N(class00494 var0, class06889 var1) {
      return Maps.newEnumMap(Map.of(class07185.field_11051, var0, class07185.field_11048, N(var0, class01372.field_64511, var1)));
   }

   private static void N(int var0, DoubleList var1, DoubleList var2, boolean var3, boolean var4, CallbackInfoReturnable var5) {
      var5.setReturnValue(new LithiumDoublePairList(var1, var2, var3, var4));
   }

   private static void N(class00494 var0, class00494 var1, class07003 var2, CallbackInfoReturnable var3) {
      VoxelShapeMatchesAnywhere.cuboidMatchesAnywhere(var0, var1, var2, var3);
   }

   public static class00494 N() {
      return R;
   }

   private static void N(class07185 var0, class00734 var1, Iterable var2, double var3, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         Iterator iterator = var2.iterator();

         while (iterator.hasNext()) {
            for (class00734 class00734 : ((class00494)iterator.next()).method_1090()) {
               var3 = switch (var0) {
                  case field_11048 -> N(var1, class00734, var3);
                  case field_11052 -> y(var1, class00734, var3);
                  case field_11051 -> L(var1, class00734, var3);
               };
            }
         }

         var5.setReturnValue(var3);
      }
   }

   public static boolean N(class00494 var0, class00494 var1, class07211 var2) {
      if (var0 == y() && var1 == y()) {
         return true;
      } else if (var1.method_1110()) {
         return false;
      } else {
         class07185 class07185 = var2.z();
         class07212 class07212 = var2.i();
         class00494 class00494x = class07212 == class07212.field_11056 ? var0 : var1;
         class00494 class00494x = class07212 == class07212.field_11056 ? var1 : var0;
         class07003 class07003 = class07212 == class07212.field_11056 ? class07003.i : class07003.L;
         return DoubleMath.fuzzyEquals(class00494x.method_1105(class07185), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals(class00494x.method_1091(class07185), 0.0, 1.0E-7)
            && !L(
               new class07260(class00494x, class07185, class00494x.field_1401.method_1051(class07185) - 1),
               new class07260(class00494x, class07185, 0),
               class07003
            );
      }
   }

   protected static class00630 N(int var0, DoubleList var1, DoubleList var2, boolean var3, boolean var4) {
      int ix = var1.size() - 1;
      int j = var2.size() - 1;
      if (var1 instanceof class06857 && var2 instanceof class06857) {
         long k = N(ix, j);
         if (var0 * k <= 256L) {
            return new class06998(ix, j);
         }
      }

      if (var1.getDouble(ix) < var2.getDouble(0) - 1.0E-7) {
         return new class00383(var1, var2, false);
      } else if (var2.getDouble(j) < var1.getDouble(0) - 1.0E-7) {
         return new class00383(var2, var1, true);
      } else if (ix == j && Objects.equals(var1, var2)) {
         return new class07708(var1);
      } else {
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         N(var0, var1, var2, var3, var4, callbackinforeturnable);
         return (class00630)(callbackinforeturnable.isCancelled()
            ? (class00630)callbackinforeturnable.getReturnValue()
            : new class00656(var1, var2, var3, var4));
      }
   }

   public static class00494 N(class00494 var0, class01372 var1) {
      return N(var0, var1, i);
   }

   public static class00494 N(class00494 var0, class01372 var1, class06889 var2) {
      if (var1 == class01372.field_23292) {
         return var0;
      } else {
         class07739 class07739 = var0.field_1401.method_66493(var1);
         if (var0 instanceof class07017 && i.equals(var2)) {
            return new class07017(class07739);
         } else {
            class07185 class07185xx = var1.L().N(class07185.field_11048);
            class07185 class07185x = var1.L().N(class07185.field_11052);
            class07185 class07185xx = var1.L().N(class07185.field_11051);
            DoubleList doublelist = var0.method_1109(class07185xx);
            DoubleList doublelist1 = var0.method_1109(class07185x);
            DoubleList doublelist2 = var0.method_1109(class07185xx);
            boolean flag = var1.N(class07185.field_11048);
            boolean flag1 = var1.N(class07185.field_11052);
            boolean flag2 = var1.N(class07185.field_11051);
            return new class06864(
               class07739,
               N(doublelist, flag, var2.N(class07185xx), var2.M),
               N(doublelist1, flag1, var2.N(class07185x), var2.B),
               N(doublelist2, flag2, var2.N(class07185xx), var2.Z)
            );
         }
      }
   }

   public static double N(class07185 var0, class00734 var1, Iterable<class00494> var2, double var3) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, var1, var2, var3, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueD();
      } else {
         for (class00494 class00494 : var2) {
            if (Math.abs(var3) < 1.0E-7) {
               return 0.0;
            }

            var3 = class00494.method_1108(var0, var1, var3);
         }

         return var3;
      }
   }

   private static boolean N(class00630 var0, class00630 var1, class00630 var2, class07739 var3, class07739 var4, class07003 var5) {
      return !var0.method_1065(
         (var5x, var6, var7) -> var1.method_1065(
            (var6x, var7x, var8) -> var2.method_1065(
               (var7xx, var8x, var9) -> !var5.apply(var3.method_1044(var5x, var6x, var7xx), var4.method_1044(var6, var7x, var8x))
            )
         )
      );
   }

   public static class00494 N(class00494 var0, class00494... var1) {
      return Arrays.stream(var1).reduce(var0, class00389::N);
   }

   protected static long N(int var0, int var1) {
      return (long)var0 * (var1 / IntMath.gcd(var0, var1));
   }

   public static int N(double var0, double var2) {
      if (!(var0 < -1.0E-7) && !(var2 > 1.0000001)) {
         for (int ix = 0; ix <= 3; ix++) {
            int j = 1 << ix;
            double d0 = var0 * j;
            double d1 = var2 * j;
            boolean flag = Math.abs(d0 - Math.round(d0)) < 1.0E-7 * j;
            boolean flag1 = Math.abs(d1 - Math.round(d1)) < 1.0E-7 * j;
            if (flag && flag1) {
               return ix;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static class00494 N(class00494 var0, class00494 var1, class07003 var2) {
      return y(var0, var1, var2).method_1097();
   }

   public static class00494 N(class00734 var0) {
      return y(var0.N, var0.y, var0.L, var0.u, var0.i, var0.R);
   }

   public static Map<class07185, class00494> N(class00494 var0) {
      return N(var0, i);
   }

   public static class00494 N(class00494 var0, class00494 var1) {
      return N(var0, var1, class07003.P);
   }

   static DoubleList N(DoubleList var0, boolean var1, double var2, double var4) {
      if (!var1 && var2 == var4) {
         return var0;
      } else {
         int ix = var0.size();
         DoubleArrayList doublearraylist = new DoubleArrayList(ix);
         if (var1) {
            for (int j = ix - 1; j >= 0; j--) {
               doublearraylist.add(-(var0.getDouble(j) - var2) + var4);
            }
         } else {
            for (int k = 0; k >= 0 && k < ix; k++) {
               doublearraylist.add(var0.getDouble(k) - var2 + var4);
            }
         }

         return doublearraylist;
      }
   }

   static {
      M.method_1049(0, 0, 0);
      L = new VoxelShapeSimpleCube(
         class00389.M,
         Double.NEGATIVE_INFINITY,
         Double.NEGATIVE_INFINITY,
         Double.NEGATIVE_INFINITY,
         Double.POSITIVE_INFINITY,
         Double.POSITIVE_INFINITY,
         Double.POSITIVE_INFINITY
      );
      u = new VoxelShapeSimpleCube(class00389.M, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
      R = new VoxelShapeEmpty(new class06890(0, 0, 0));
   }
}
