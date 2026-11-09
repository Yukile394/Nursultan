package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class07127 extends class07193 {
   public static final MapCodec<class07127> N = y(class07127::new);
   public static final class06667 y = class06665.k;
   private final Function<class00500, class00494> u;

   private void L(class00500 var1, class07299 var2, class07209 var3) {
      class07211 class07211 = U(var1).b();
      class02733 class02733 = class02752.N(var2, class07211, class07211.z().L() ? class07211.field_11036 : var1.L(R));
      var2.method_8452(var3, this, class02733);
      var2.method_8452(var3.method_10093(class07211), this, class02733);
   }

   public class07127(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(R, class07211.field_11043).y(y, false).y(L, class06657.field_12471));
      this.u = this.y();
   }

   public void y_8(class00500 var1, class07299 var2, class07209 var3, @Nullable class08036 var4) {
      var1 = var1.N(y);
      var2.method_8652(var3, var1, 3);
      this.L(var1, var2, var3);
      N(var4, var2, var3, var1);
      var2.N(var4, var1.L(y) ? class01194.N : class01194.i, var3);
   }

   private Function<class00500, class00494> y() {
      Map map = class00389.i(class00891.y(6.0, 8.0, 10.0, 16.0));
      return this.N(var1x -> (class00494)((Map)map.get(var1x.L(L))).get(var1x.L(R)), new class08092[]{y});
   }

   @Override
   protected int y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(y) && U(var1) == var4 ? 15 : 0;
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(y) ? 15 : 0;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      if (!var4 && var1.L(y)) {
         this.L(var1, var2, var3);
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, R, y);
   }

   @Override
   public MapCodec<class07127> N() {
      return N;
   }

   protected static void N(@Nullable class08036 var0, class07284 var1, class07209 var2, class00500 var3) {
      float f = var3.L(y) ? 0.6F : 0.5F;
      var1.method_8396(var0, var2, class04909.Ti, class04911.field_15245, 0.3F, f);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class07307 var4, BiConsumer<class06584, class07209> var5) {
      if (var4.M()) {
         this.y_8(var1, var2, var3, null);
      }

      super.N(var1, var2, var3, var4, var5);
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var2.method_8608()) {
         class00500 class00500 = var1.N(y);
         if (class00500.L(y)) {
            N(class00500, var2, var3, 1.0F);
         }
      } else {
         this.y_8(var1, var2, var3, null);
      }

      return class07082.N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return this.u.apply(var1);
   }

   private static void N(class00500 var0, class07284 var1, class07209 var2, float var3) {
      class07211 class07211x = var0.L(R).b();
      class07211 class07211x = U(var0).b();
      double d0 = var2.method_10263() + 0.5 + 0.1 * class07211x.P() + 0.2 * class07211x.P();
      double d1 = var2.method_10264() + 0.5 + 0.1 * class07211x.s() + 0.2 * class07211x.s();
      double d2 = var2.method_10260() + 0.5 + 0.1 * class07211x.T() + 0.2 * class07211x.T();
      var1.method_8406(new class07138(16711680, var3), d0, d1, d2, 0.0, 0.0, 0.0);
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var1.L(y) && var4.z() < 0.25F) {
         N(var1, var2, var3, 0.5F);
      }
   }

   @Override
   protected boolean i_(class00500 var1) {
      return true;
   }
}
