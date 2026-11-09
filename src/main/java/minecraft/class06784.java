package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;
import net.fabricmc.fabric.api.object.builder.v1.entity.MinecartComparatorLogicRegistry;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06784 extends class07760 {
   public static final MapCodec<class06784> y = y(class06784::new);
   public static final class08064<class08080> L = class06665.NE;
   public static final class06667 u = class06665.k;
   private static final int i = 20;

   @Override
   public class08092<class08080> L() {
      return L;
   }

   public class06784(class01362 var1) {
      super(true, var1);
      this.P(this.Q.y().y(u, false).y(L, class08080.field_12665).y(N, false));
   }

   protected void y(class07299 var1, class07209 var2, class00500 var3, boolean var4) {
      for (class07209 class07209 : new class06897(var1, var2, var3).N()) {
         class00500 class00500 = var1.method_8320(class07209);
         var1.method_41410(class00500, class07209, class00500.i(), null, false);
      }
   }

   @Override
   protected int y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      if (!var1.L(u)) {
         return 0;
      } else {
         return var4 == class07211.field_11036 ? 15 : 0;
      }
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      class08080 class08080x = var1.L(L);
      class08080 class08080x = this.N(class08080x, var2);
      return var1.y(L, class08080x);
   }

   private class00734 N(class07209 var1) {
      double d0 = 0.2;
      return new class00734(
         var1.method_10263() + 0.2,
         var1.method_10264(),
         var1.method_10260() + 0.2,
         var1.method_10263() + 1 - 0.2,
         var1.method_10264() + 1 - 0.2,
         var1.method_10260() + 1 - 0.2
      );
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      class08080 class08080x = var1.L(L);
      class08080 class08080x = this.N(class08080x, var2);
      return var1.y(L, class08080x);
   }

   @Override
   public MapCodec<class06784> N() {
      return y;
   }

   private void N(class00500 var1, class07299 var2, class07209 var3, class07211 var4, CallbackInfoReturnable var5) {
      if (var1.L(u)) {
         for (class07504 class07504 : this.N(
            var2, var3, class07504.class, var0 -> MinecartComparatorLogicRegistry.getCustomComparatorLogic(var0.method_5864()) != null
         )) {
            int ix = MinecartComparatorLogicRegistry.getCustomComparatorLogic(class07504.method_5864()).getComparatorValue(class07504, var1, var3);
            if (ix >= 0) {
               var5.setReturnValue(ix);
               break;
            }
         }
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, u, N);
   }

   private void N(class07299 var1, class07209 var2, class00500 var3) {
      if (this.a_(var3, var1, var2)) {
         boolean flag = var3.L(u);
         boolean flag1 = false;
         if (!this.N(var1, var2, class07504.class, var0 -> true).isEmpty()) {
            flag1 = true;
         }

         if (flag1 && !flag) {
            class00500 class00500x = var3.y(u, true);
            var1.method_8652(var2, class00500x, 3);
            this.y(var1, var2, class00500x, true);
            var1.method_8408(var2, this);
            var1.method_8408(var2.method_10074(), this);
            var1.method_16109(var2, var3, class00500x);
         }

         if (!flag1 && flag) {
            class00500 class00500 = var3.y(u, false);
            var1.method_8652(var2, class00500, 3);
            this.y(var1, var2, class00500, false);
            var1.method_8408(var2, this);
            var1.method_8408(var2.method_10074(), this);
            var1.method_16109(var2, var3, class00500);
         }

         if (flag1) {
            var1.N(var2, this, 20);
         }

         var1.method_8455(var2, this);
      }
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(u) ? 15 : 0;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var1.L(u)) {
         this.N(var2, var3, var1);
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (!var2.method_8608()) {
         if (!var1.L(u)) {
            this.N(var2, var3, var1);
         }
      }
   }

   private <T extends class07504> List<T> N(class07299 var1, class07209 var2, Class<T> var3, Predicate<class07049> var4) {
      return var1.N(var3, this.N(var2), var4);
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueI();
      } else {
         if (var1.L(u)) {
            List<class07480> list = this.N(var2, var3, class07480.class, var0 -> true);
            if (!list.isEmpty()) {
               return list.get(0).U().y();
            }

            List<class07504> list1 = this.N(var2, var3, class07504.class, class07042.u);
            if (!list1.isEmpty()) {
               return class07482.L((class06695)list1.get(0));
            }
         }

         return 0;
      }
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var4.N(var1.i())) {
         class00500 class00500 = this.N(var1, var2, var3, var5);
         this.N(var2, var3, class00500);
      }
   }

   @Override
   protected boolean i_(class00500 var1) {
      return true;
   }
}
