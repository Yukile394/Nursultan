package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04007 extends class07796 implements class06084 {
   public static final MapCodec<class04007> N = y(class04007::new);
   public static final class06667 y = class06665.Q;
   public static final class06667 L = class06665.q;
   public static final class06667 u = class06665.i;
   private static final class00494 R = class00891.y(16.0, 0.0, 8.0);
   public static final double i = R.method_1105(class07185.field_11052);

   public class04007(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, false).y(L, false).y(u, false));
   }

   @Override
   protected class00494 z(class00500 var1) {
      return R;
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(L) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return R;
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, class04093 var3, CallbackInfo var4) {
      class03508 class03508 = var3.L();
      if (class03508.y() == null && class03508.N().N(Long.MAX_VALUE).isEmpty()) {
         var3.lithium$startSleeping();
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06584 var4, boolean var5) {
      super.N(var1, var2, var3, var4, var5);
      if (var5) {
         this.N(var2, var3, var4, class02151.N(5));
      }
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return !var1.method_8608() ? class07796.N(var3, class00404.field_37648, (var0, var1x, var2x, var3x) -> {
         class03493.N(var0, var3x.L(), var3x.u());
         N(var0, var1x, var2x, var3x, null);
      }) : null;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var1.L(y)) {
         var2.method_8652(var3, var1.y(y, false), 3);
         var2.N(var3, class00404.field_37648).ifPresent(var1x -> var1x.N(var2));
      }
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, class07049 var4) {
      if (var1 instanceof class04782 class04782) {
         class04770 class04770 = class04093.N(var4);
         if (class04770 != null) {
            class04782.N(var2, class00404.field_37648).ifPresent(var2x -> var2x.N(class04782, class04770));
         }
      }

      super.N(var1, var2, var3, var4);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
      var1.N(L);
      var1.N(u);
   }

   @Override
   public MapCodec<class04007> N() {
      return N;
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(L, var1.method_8045().method_8316(var1.method_8037()).N() == class04684.L);
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class04093(var1, var2);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(L)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected boolean a_(class00500 var1) {
      return true;
   }
}
