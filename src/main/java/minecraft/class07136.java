package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07136 extends class00891 implements class02234 {
   private static final Logger L = LogUtils.getLogger();
   public static final MapCodec<class07136> N = y(class07136::new);
   public static final class08064<class07185> y = class06665.K;
   private static final Map<class07185, class00494> u = class00389.N(class00891.N(4.0, 16.0, 0.0, 16.0));

   public class07136(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07185.field_11048));
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var2.method_74962() && var2.method_75728().N(class00608.g, var3) && var4.y(2000) < var2.y().N() && var2.method_67506(var3)) {
         while (var2.method_8320(var3).N(this)) {
            var3 = var3.method_10074();
         }

         if (var2.method_8320(var3).N(var2, var3, class07078.LN)) {
            class07049 class07049x = class07078.LN.N(var2, var3.method_10084(), class06113.field_16474);
            if (class07049x != null) {
               class07049x.method_30229();
               class07049 class07049x = class07049x.method_5854();
               if (class07049x != null) {
                  class07049x.method_30229();
               }
            }
         }
      }
   }

   @Override
   public class02244 y() {
      return class02244.field_52061;
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      switch (var2) {
         case field_11465:
         case field_11463:
            switch ((class07185)var1.L(y)) {
               case field_11048:
                  return var1.y(y, class07185.field_11051);
               case field_11051:
                  return var1.y(y, class07185.field_11048);
               default:
                  return var1;
            }
         default:
            return var1;
      }
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return class06584.E;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var4.y(100) == 0) {
         var2.method_8486(
            var3.method_10263() + 0.5,
            var3.method_10264() + 0.5,
            var3.method_10260() + 0.5,
            class04909.lv,
            class04911.field_15245,
            0.5F,
            var4.z() * 0.4F + 0.8F,
            false
         );
      }

      for (int i = 0; i < 4; i++) {
         double d0 = var3.method_10263() + var4.U();
         double d1 = var3.method_10264() + var4.U();
         double d2 = var3.method_10260() + var4.U();
         double d3 = (var4.z() - 0.5) * 0.5;
         double d4 = (var4.z() - 0.5) * 0.5;
         double d5 = (var4.z() - 0.5) * 0.5;
         int j = var4.y(2) * 2 - 1;
         if (!var2.method_8320(var3.method_10067()).N(this) && !var2.method_8320(var3.method_10078()).N(this)) {
            d0 = var3.method_10263() + 0.5 + 0.25 * j;
            d3 = var4.z() * 2.0F * j;
         } else {
            d2 = var3.method_10260() + 0.5 + 0.25 * j;
            d5 = var4.z() * 2.0F * j;
         }

         var2.method_8406(class07107.NM, d0, d1, d2, d3, d4, d5);
      }
   }

   @Override
   public MapCodec<class07136> N() {
      return N;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   public int N(class04782 var1, class07049 var2) {
      return var2 instanceof class08036 class08036 ? Math.max(0, var1.method_64395().N(class08036.method_31549().N ? class07305.q : class07305.K)) : 0;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (var4.method_5822(false)) {
         var4.method_60697(this, var3);
      }
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      class07185 class07185x = var5.z();
      class07185 class07185x = var1.L(y);
      return (class07185x == class07185x || !class07185x.L()) && !var7.N(this) && !class07121.N(var2, var4, class07185x).y()
         ? class00869.N.W()
         : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return u.get(var1.L(y));
   }

   private static class01032 N(class04782 var0, class01009 var1, class07185 var2, class06889 var3, class07049 var4, class01026 var5) {
      class07209 class07209 = var1.N;
      class07185 class07185 = var0.method_8320(class07209).u(class06665.K).orElse(class07185.field_11048);
      double d0 = var1.y;
      double d1 = var1.L;
      class01325 class01325 = var4.method_18377(var4.method_18376());
      int i = var2 == class07185 ? 0 : 90;
      double d2 = class01325.N() / 2.0 + (d0 - class01325.N()) * var3.N();
      double d3 = (d1 - class01325.y()) * var3.y();
      double d4 = 0.5 + var3.L();
      boolean flag = class07185 == class07185.field_11048;
      class06889 class06889 = class07121.N(
         new class06889(class07209.method_10263() + (flag ? d2 : d4), class07209.method_10264() + d3, class07209.method_10260() + (flag ? d4 : d2)),
         var0,
         var4,
         class01325
      );
      return new class01032(var0, class06889, class06889.L, i, 0.0F, class06681.N(class06681.field_54094, class06681.field_40711), var5);
   }

   private static class01032 N(class07049 var0, class07209 var1, class01009 var2, class04782 var3, class01026 var4) {
      class00500 class00500 = var0.method_73183().method_8320(var1);
      class07185 class07185;
      class06889 class06889;
      if (class00500.y(class06665.K)) {
         class07185 = class00500.L(class06665.K);
         class01009 class01009 = class01008.N(var1, class07185, 21, class07185.field_11052, 21, var2x -> var0.method_73183().method_8320(var2x) == class00500);
         class06889 = var0.method_30633(class07185, class01009);
      } else {
         class07185 = class07185.field_11048;
         class06889 = new class06889(0.5, 0.0, 0.0);
      }

      return N(var3, var2, class07185, class06889, var0, var4);
   }

   @Nullable
   private class01032 N(class04782 var1, class07049 var2, class07209 var3, class07209 var4, boolean var5, class08057 var6) {
      Optional optional = var1.method_14173().N(var4, var5, var6);
      class01009 class01009;
      class01026 class01026;
      if (optional.isPresent()) {
         class07209 class07209 = (class07209)optional.get();
         class00500 var11 = var1.method_8320(class07209);
         class01009 = class01008.N(class07209, var11.L(class06665.K), 21, class07185.field_11052, 21, var2x -> var1.method_8320(var2x) == var11);
         class01026 = class01032.y.N(var1x -> var1x.method_60950(class07209));
      } else {
         class07185 class07185 = var2.method_73183().method_8320(var3).u(y).orElse(class07185.field_11048);
         Optional<class01009> optional1 = var1.method_14173().N(var4, class07185);
         if (optional1.isEmpty()) {
            L.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         class01009 = optional1.get();
         class01026 = class01032.y.N(class01032.L);
      }

      return N(var2, var3, class01009, var1, class01026);
   }

   @Nullable
   @Override
   public class01032 N(class04782 var1, class07049 var2, class07209 var3) {
      class05946<class07299> class05946 = var1.method_27983() == class07299.field_25180 ? class07299.field_25179 : class07299.field_25180;
      class04782 class04782 = var1.method_8503().N(class05946);
      if (class04782 == null) {
         return null;
      } else {
         boolean flag = class04782.method_27983() == class07299.field_25180;
         class08057 class08057 = class04782.method_8621();
         double d0 = class07376.N(var1.method_8597(), class04782.method_8597());
         class07209 class07209 = class08057.y(var2.method_23317() * d0, var2.method_23318(), var2.method_23321() * d0);
         return this.N(class04782, var2, var3, class07209, flag, class08057);
      }
   }
}
