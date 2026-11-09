package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class04509 extends class05765<class04508> {
   private static final int N = 4;
   private static final int y = 10;
   private static final int L = 2;
   private static final int u = Math.round(10.0F);
   private static final float i = 24.0F;
   private static final float R = 1.4F;
   private static final float Z = 0.058333334F;
   private static final ObjectArrayList<Integer> z = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   protected void L(class04782 var1, class04508 var2, long var3) {
      boolean flag = var2.method_5799();
      if (!flag && var2.method_18868().N_22(class05378.yW, class05367.field_18456)) {
         var2.method_18868().y(class05378.yW);
      }

      if (N(var2)) {
         class06889 class06889 = var2.method_18868().L(class05378.yE).flatMap(var1x -> N(var2, var2.method_59922(), class06889.L(var1x))).orElse(null);
         if (class06889 == null) {
            var2.method_18380(class01312.field_18076);
            return;
         }

         if (flag) {
            var2.method_18868().N(class05378.yW, class06244.field_17274);
         }

         var2.method_5783(class04909.Lx, 1.0F, 1.0F);
         var2.method_18380(class01312.field_30095);
         var2.method_36456(var2.fields_4212a028292fd3c078969e3ee4c71d9e8_0);
         var2.method_35054(true);
         var2.method_18799(class06889);
      } else if (y(var2)) {
         var2.method_5783(class04909.LD, 1.0F, 1.0F);
         var2.method_18380(class01312.field_18076);
         var2.method_35054(false);
         boolean flag1 = var2.method_18868().N(class05378.d);
         var2.method_18868().N(class05378.yR, class06244.field_17274, flag1 ? 2L : 10L);
         var2.method_18868().N(class05378.yM, class06244.field_17274, 100L);
      }
   }

   private static boolean L(class04782 var0, class04508 var1) {
      class07209 class07209x = var1.method_24515();
      if (var0.method_8320(class07209x).N(class00869.TM)) {
         return false;
      } else {
         for (int ix = 1; ix <= 4; ix++) {
            class07209 class07209x = class07209x.method_10079(class07211.field_11036, ix);
            if (!var0.method_8320(class07209x).P() && !var0.method_8316(class07209x).N(class01231.N)) {
               return false;
            }
         }

         return true;
      }
   }

   public class04509() {
      super(
         Map.of(
            class05378.s,
            class05367.field_18456,
            class05378.yR,
            class05367.field_18457,
            class05378.yU,
            class05367.field_18458,
            class05378.yE,
            class05367.field_18458,
            class05378.yM,
            class05367.field_18457,
            class05378.m,
            class05367.field_18457,
            class05378.yW,
            class05367.field_18458
         ),
         200
      );
   }

   protected void u(class04782 var1, class04508 var2, long var3) {
      if (var2.method_18376() == class01312.field_30095 || var2.method_18376() == class01312.field_47248) {
         var2.method_18380(class01312.field_18076);
      }

      var2.method_18868().y(class05378.yE);
      var2.method_18868().y(class05378.yU);
      var2.method_18868().y(class05378.yW);
   }

   private static boolean y(class04508 var0, class07438 var1) {
      return var1.method_5739(var0) - 4.0F <= 0.0F;
   }

   protected boolean y(class04782 var1, class04508 var2) {
      return N(var1, var2);
   }

   private static boolean y(class04508 var0) {
      boolean flag = var0.method_18376() == class01312.field_30095;
      boolean flag1 = var0.method_24828();
      boolean flag2 = var0.method_5799() && var0.method_18868().N_22(class05378.yW, class05367.field_18457);
      return flag && (flag1 || flag2);
   }

   protected void y(class04782 var1, class04508 var2, long var3) {
      if (var2.method_18868().N_22(class05378.yU, class05367.field_18457)) {
         var2.method_18868().N(class05378.yU, class06244.field_17274, u);
      }

      var2.method_18380(class01312.field_47248);
      var1.method_43129(null, var2, class04909.Lp, class04911.field_15251, 1.0F, 1.0F);
      var2.method_18868().L(class05378.yE).ifPresent(var1x -> var2.method_5702(class07664.field_9851, var1x.method_46558()));
   }

   private static boolean N(class04508 var0) {
      return var0.method_18868().L(class05378.yU).isEmpty() && var0.method_18376() == class01312.field_47248;
   }

   public static boolean N(class04782 var0, class04508 var1) {
      if (!var1.method_24828() && !var1.method_5799()) {
         return false;
      } else if (class05739.N(var1)) {
         return false;
      } else if (var1.method_18868().N_22(class05378.yE, class05367.field_18456)) {
         return true;
      } else {
         class07438 class07438 = var1.method_18868().L(class05378.s).orElse(null);
         if (class07438 == null) {
            return false;
         } else if (N(var1, class07438)) {
            var1.method_18868().y(class05378.s);
            return false;
         } else if (y(var1, class07438)) {
            return false;
         } else if (!L(var0, var1)) {
            return false;
         } else {
            class07209 class07209 = N(var1, class03847.N(class07438, var1.method_59922()));
            if (class07209 == null) {
               return false;
            } else {
               class00500 class00500 = var0.method_8320(class07209.method_10074());
               if (var1.method_5864().N(class00500)) {
                  return false;
               } else if (!class03847.N(var1, class07209.method_46558()) && !class03847.N(var1, class07209.method_10086(4).method_46558())) {
                  return false;
               } else {
                  var1.method_18868().N(class05378.yE, class07209);
                  return true;
               }
            }
         }
      }
   }

   protected boolean N(class04782 var1, class04508 var2, long var3) {
      return var2.method_18376() != class01312.field_18076 && !var2.method_18868().N(class05378.yR);
   }

   private static boolean N(class04508 var0, class07438 var1) {
      return !var1.method_24516(var0, var0.method_45325(class05298.P));
   }

   private static Optional<class06889> N(class04508 var0, class06069 var1, class06889 var2) {
      for (int ix : class07536.N(z, var1)) {
         float f = 0.058333334F * (float)var0.method_45325(class05298.P);
         Optional<class06889> optional = class04494.N(var0, var2, f, ix, false);
         if (optional.isPresent()) {
            if (var0.method_6059(class07047.B)) {
               double d0 = optional.get().u().B * var0.method_37416();
               return optional.map(var2x -> var2x.y(0.0, d0, 0.0));
            }

            return optional;
         }
      }

      return Optional.empty();
   }

   @Nullable
   private static class07209 N(class07438 var0, class06889 var1) {
      class05862 class05862x = new class05862(var1, var1.N(class07211.field_11033, 10.0), class05849.field_17558, class05835.field_1348, var0);
      class06183 class06183x = var0.method_73183().N(class05862x);
      if (class06183x.N() == class07113.field_1332) {
         return class07209.method_49638(class06183x.y()).method_10084();
      } else {
         class05862 class05862x = new class05862(var1, var1.N(class07211.field_11036, 10.0), class05849.field_17558, class05835.field_1348, var0);
         class06183 class06183x = var0.method_73183().N(class05862x);
         return class06183x.N() == class07113.field_1332 ? class07209.method_49638(class06183x.y()).method_10084() : null;
      }
   }
}
