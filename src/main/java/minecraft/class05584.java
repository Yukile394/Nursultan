package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class05584 extends class07101 implements class00873, class06084 {
   public static final MapCodec<class05584> N = y(class05584::new);
   private static final class06667 y = class06665.q;
   private static final class08064<class06082> L = class06665.yT;
   private static final int u = -1;
   private static final Object2IntMap<class06082> i = class07536.N(new Object2IntArrayMap(), var0 -> {
      var0.defaultReturnValue(-1);
      var0.put(class06082.field_28719, 10);
      var0.put(class06082.field_28720, 10);
      var0.put(class06082.field_28721, 100);
   });
   private static final int M = 5;
   private static final int B = 11;
   private static final int Z = 13;
   private static final Map<class06082, class00494> O = Maps.newEnumMap(
      Map.of(
         class06082.field_28718,
         class00891.y(16.0, 11.0, 15.0),
         class06082.field_28719,
         class00891.y(16.0, 11.0, 15.0),
         class06082.field_28720,
         class00891.y(16.0, 11.0, 13.0),
         class06082.field_28721,
         class00389.N()
      )
   );
   private final Function<class00500, class00494> F;

   private Function<class00500, class00494> L() {
      Map map = class00389.L(class00891.y(6.0, 0.0, 13.0).method_1096(0.0, 0.0, 0.25).method_1097());
      return this.N(var1x -> class00389.N(O.get(var1x.L(L)), (class00494)map.get(var1x.L(R))), new class08092[]{y});
   }

   private static void L(class00500 var0, class07299 var1, class07209 var2) {
      N(var0, var1, var2, class06082.field_28718);
      if (var0.L(L) != class06082.field_28718) {
         N(var1, var2, class04909.zU);
      }
   }

   public class05584(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, false).y(R, class07211.field_11043).y(L, class06082.field_28718));
      this.F = this.L();
   }

   private static boolean U(class00500 var0) {
      return var0.P() || var0.N(class00869.K) || var0.N(class00869.ni);
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(y) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return O.get(var1.L(L));
   }

   private void N(class00500 var1, class07299 var2, class07209 var3, class06082 var4, @Nullable class04891 var5) {
      N(var1, var2, var3, var4);
      if (var5 != null) {
         N(var2, var3, var5);
      }

      int ix = i.getInt(var4);
      if (ix != -1) {
         var2.N(var3, this, ix);
      }
   }

   @Override
   public MapCodec<class05584> N() {
      return N;
   }

   private static void N(class00500 var0, class07299 var1, class07209 var2, class06082 var3) {
      class06082 class06082 = var0.L(L);
      var1.method_8652(var2, var0.y(L, var3), 2);
      if (var3.N() && var3 != class06082) {
         var1.N(null, class01194.L, var2);
      }
   }

   private static boolean N(class07209 var0, class07049 var1) {
      return var1.method_24828() && var1.method_73189().B > var0.method_10264() + 0.6875F;
   }

   private static void N(class07299 var0, class07209 var1, class04891 var2) {
      float f = class04995.y(var0.field_9229, 0.8F, 1.2F);
      var0.method_8396(null, var1, var2, class04911.field_15245, 1.0F, f);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, R, L);
   }

   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = var1.method_8045().method_8320(var1.method_8037().method_10074());
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      boolean flag = class00500.N(class00869.nL) || class00500.N(class00869.nu);
      return this.W().y(y, class04688.N(class04684.L)).y(R, flag ? class00500.L(R) : var1.method_8042().b());
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.F.apply(var1);
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return U(var1.method_8320(var2.method_10084()));
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5 == class07211.field_11033 && !var1.N(var2, var4)) {
         return class00869.N.W();
      } else {
         if (var1.L(y)) {
            var3.N(var4, class04684.L, class04684.L.N(var2));
         }

         return var5 == class07211.field_11036 && var7.N(this) ? class00869.nu.s(var1) : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   @Override
   protected void N(class07299 var1, class00500 var2, class06183 var3, class08005 var4) {
      this.N(var2, var1, var3.u(), class06082.field_28721, class04909.zz);
   }

   protected static boolean N(class07284 var0, class07209 var1, class04688 var2, class07211 var3) {
      class00500 class00500 = class00869.nL.W().y(y, var2.N(class04684.L)).y(R, var3);
      return var0.method_8652(var1, class00500, 3);
   }

   protected static boolean N(class05474 var0, class07209 var1, class00500 var2) {
      return !var0.method_31606(var1) && U(var2);
   }

   public static void N(class07284 var0, class06069 var1, class07209 var2, class07211 var3) {
      int ix = class04995.N(var1, 2, 5);
      class07218 class07218 = var2.method_25503();
      int j = 0;

      while (j < ix && N((class05474)var0, class07218, var0.method_8320(class07218))) {
         j++;
         class07218.N(class07211.field_11036);
      }

      int k = var2.method_10264() + j - 1;
      class07218.method_10099(var2.method_10264());

      while (class07218.method_10264() < k) {
         class05540.N(var0, class07218, var0.method_8316(class07218), var3);
         class07218.N(class07211.field_11036);
      }

      N(var0, class07218, var0.method_8316(class07218), var3);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (var2.W(var3)) {
         L(var1, var2, var3);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var2.W(var3)) {
         L(var1, var2, var3);
      } else {
         class06082 class06082 = var1.L(L);
         if (class06082 == class06082.field_28719) {
            this.N(var1, var2, var3, class06082.field_28720, class04909.zz);
         } else if (class06082 == class06082.field_28720) {
            this.N(var1, var2, var3, class06082.field_28721, class04909.zz);
         } else if (class06082 == class06082.field_28721) {
            L(var1, var2, var3);
         }
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (!var2.method_8608()) {
         if (var1.L(L) == class06082.field_28718 && N(var3, var4) && !var2.W(var3)) {
            this.N(var1, var2, var3, class06082.field_28719, null);
         }
      }
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      class07209 class07209 = var3.method_10084();
      class00500 class00500 = var1.method_8320(class07209);
      if (N((class05474)var1, class07209, class00500)) {
         class07211 class07211 = var4.L(R);
         class05540.N(var1, var3, var4.Y(), class07211);
         N(var1, class07209, class00500.Y(), class07211);
      }
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07209 class07209 = var3.method_10074();
      class00500 class00500 = var2.method_8320(class07209);
      return class00500.N(this) || class00500.N(class00869.nu) || class00500.N(class01210.ye);
   }
}
