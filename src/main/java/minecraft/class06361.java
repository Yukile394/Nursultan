package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06361 extends class07796 implements class06084 {
   public static final MapCodec<class06361> N = y(class06361::new);
   public static final int y = 30;
   public static final int L = 10;
   public static final class08064<class01193> u = class06665.yv;
   public static final class08071 i = class06665.ND;
   public static final class06667 R = class06665.q;
   private static final class00494 M = class00891.y(16.0, 0.0, 8.0);
   private static final float[] B = class07536.N(new float[16], var0 -> {
      int[] aint = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int ix = 0; ix < 16; ix++) {
         var0[ix] = class06867.y(aint[ix]);
      }
   });

   public int L() {
      return 30;
   }

   public static boolean T(class00500 var0) {
      return U(var0) == class01193.field_28121;
   }

   public class06361(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(u, class01193.field_28121).y(i, 0).y(R, false));
   }

   public static class01193 U(class00500 var0) {
      return var0.L(u);
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(R) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   public int y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var4 == class07211.field_11036 ? var1.N(var2, var3, var4) : 0;
   }

   private static void y(class07299 var0, class07209 var1, class00500 var2) {
      class00891 class00891 = var2.i();
      var0.method_8408(var1, class00891);
      var0.method_8408(var1.method_10074(), class00891);
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (U(var1) == class01193.field_28122) {
         class07211 class07211 = class07211.y(var4);
         if (class07211 != class07211.field_11036 && class07211 != class07211.field_11033) {
            double d0 = var3.method_10263() + 0.5 + (class07211.P() == 0 ? 0.5 - var4.U() : class07211.P() * 0.6);
            double d1 = var3.method_10264() + 0.25;
            double d2 = var3.method_10260() + 0.5 + (class07211.T() == 0 ? 0.5 - var4.U() : class07211.T() * 0.6);
            double d3 = var4.z() * 0.04;
            var2.method_8406(class01162.y, d0, d1, d2, 0.0, d3, 0.0);
         }
      }
   }

   public static void N(@Nullable class07049 var0, class07299 var1, class07209 var2, int var3) {
      for (class07211 class07211 : class07211.values()) {
         class07209 class07209 = var2.method_10093(class07211);
         class00500 class00500 = var1.method_8320(class07209);
         if (class00500.N(class01210.LU)) {
            var1.N(class03502.y(var3), class07209, class01164.N(var0, class00500));
            float f = B[var3];
            var1.method_8396(null, class07209, class04909.q, class04911.field_15245, 1.0F, f);
         }
      }
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, class06371 var3, CallbackInfo var4) {
      class03508 class03508 = var3.L();
      if (class03508.y() == null && class03508.N().N(Long.MAX_VALUE).isEmpty()) {
         var3.lithium$startSleeping();
      }
   }

   public void N(@Nullable class07049 var1, class07299 var2, class07209 var3, class00500 var4, int var5, int var6) {
      var2.method_8652(var3, var4.y(u, class01193.field_28122).y(i, var5), 3);
      var2.N(var3, var4.i(), this.L());
      y(var2, var3, var4);
      N(var1, var2, var3, var6);
      var2.N(var1, class01194.e, var3);
      if (!var4.L(R)) {
         var2.method_43128(
            null,
            var3.method_10263() + 0.5,
            var3.method_10264() + 0.5,
            var3.method_10260() + 0.5,
            class04909.wy,
            class04911.field_15245,
            1.0F,
            var2.field_9229.z() * 0.2F + 0.8F
         );
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06584 var4, boolean var5) {
      super.N(var1, var2, var3, var4, var5);
      if (var5) {
         this.N(var2, var3, var4, class02151.N(5));
      }
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      if (var2.method_8321(var3) instanceof class06371 class06371) {
         return U(var1) == class01193.field_28122 ? class06371.R() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   public void N(class00517<class00891, class00500> var1) {
      var1.N(u, i, R);
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var2.method_8608() && !var1.N(var4.i())) {
         if (var1.L(i) > 0 && !var2.method_8397().N(var3, this)) {
            var2.method_8652(var3, var1.y(i, 0), 18);
         }
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      if (U(var1) == class01193.field_28122) {
         y(var2, var3, var1);
      }
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(R)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class06371(var1, var2);
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, class07049 var4) {
      if (!var1.method_8608()
         && T(var3)
         && var4.method_5864() != class07078.yX
         && var1.method_8321(var2) instanceof class06371 class06371
         && var1 instanceof class04782 class04782
         && class06371.u().N(class04782, var2, class01194.a, class01164.N(var3))) {
         class06371.B().y(class04782, class01194.a, class01164.N(var4), var4.method_73189());
      }

      super.N(var1, var2, var3, var4);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (U(var1) != class01193.field_28122) {
         if (U(var1) == class01193.field_44631) {
            var2.method_8652(var3, var1.y(u, class01193.field_28121), 3);
            if (!var1.L(R)) {
               var2.method_8396(null, var3, class04909.wL, class04911.field_15245, 1.0F, var2.field_9229.z() * 0.2F + 0.8F);
            }
         }
      } else {
         N(var2, var3, var1);
      }
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class07209 class07209 = var1.method_8037();
      class04688 class04688 = var1.method_8045().method_8316(class07209);
      return this.W().y(R, class04688.N() == class04684.L);
   }

   @Override
   public MapCodec<? extends class06361> N() {
      return N;
   }

   @Override
   public int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(i);
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2) {
      var0.method_8652(var1, var2.y(u, class01193.field_44631).y(i, 0), 3);
      var0.N(var1, var2.i(), 10);
      y(var0, var1, var2);
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return !var1.method_8608() ? N(var3, class00404.field_28117, (var0, var1x, var2x, var3x) -> {
         class03493.N(var0, var3x.L(), var3x.u());
         N(var0, var1x, var2x, var3x, null);
      }) : null;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return M;
   }

   @Override
   protected boolean a_(class00500 var1) {
      return true;
   }

   @Override
   protected boolean i_(class00500 var1) {
      return true;
   }
}
