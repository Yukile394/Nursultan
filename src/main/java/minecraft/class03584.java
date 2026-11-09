package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03584 extends class06361 {
   public static final MapCodec<class03584> M = y(class03584::new);
   public static final class08064<class07211> B = class06665.f;

   @Override
   public int L() {
      return 10;
   }

   public class03584(class01362 var1) {
      super(var1);
      this.P(this.W().y(B, class07211.field_11043));
   }

   @Override
   public class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(B)));
   }

   @Override
   public class00500 N(class00500 var1, class06993 var2) {
      return var1.y(B, var2.N(var1.L(B)));
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, class03592 var3, CallbackInfo var4) {
      class03508 class03508 = var3.L();
      if (class03508.y() == null && class03508.N().N(Long.MAX_VALUE).isEmpty()) {
         var3.lithium$startSleeping();
      }
   }

   @Override
   public MapCodec<class03584> N() {
      return M;
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class03592(var1, var2);
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return !var1.method_8608() ? N(var3, class00404.field_43258, (var0, var1x, var2x, var3x) -> {
         class03493.N(var0, var3x.L(), var3x.u());
         N(var0, var1x, var2x, var3x, null);
      }) : null;
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      return super.N(var1).y(B, var1.method_8042());
   }

   @Override
   public int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var4 != var1.L(B) ? super.N_8(var1, var2, var3, var4) : 0;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      super.N(var1);
      var1.N(B);
   }
}
