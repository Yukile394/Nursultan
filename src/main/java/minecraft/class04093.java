package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04093 extends class00394 implements class01171<class03485>, class03502, SleepingBlockEntity {
   private static final int N = 10;
   private static final int y = 20;
   private static final int L = 5;
   private static final int u = 6;
   private static final int i = 40;
   private static final int R = 90;
   private static final Int2ObjectMap<class04891> M = class07536.N(new Int2ObjectOpenHashMap(), var0 -> {
      var0.put(1, class04909.IU);
      var0.put(2, class04909.IE);
      var0.put(3, class04909.IW);
      var0.put(4, class04909.Iz);
   });
   private static final int m = 0;
   private int P;
   private final class03481 s;
   private class03508 T;
   private final class03485 b;
   private WrappedBlockEntityTickInvokerAccessor j = null;
   private class01099 v = null;

   private boolean L(class04782 var1) {
      return this.P < 4 ? false : class04011.N(class07078.yX, class06113.field_16461, var1, this.d(), 20, 5, 6, class04000.y, false).isPresent();
   }

   @Override
   public class03508 L() {
      return this.T;
   }

   public class04093(class07209 var1, class00500 var2) {
      super(class00404.field_37648, var1, var2);
      this.P = 0;
      this.s = new class04061(this);
      this.T = new class03508();
      this.b = new class03485(this);
      this.N(var1, var2, null);
   }

   @Override
   public class03481 u() {
      return this.s;
   }

   private void y(class07299 var1) {
      class04891 class04891 = (class04891)M.get(this.P);
      if (class04891 != null) {
         class07209 class07209 = this.d();
         int ix = class07209.method_10263() + class04995.y(var1.field_9229, -10, 10);
         int jx = class07209.method_10264() + class04995.y(var1.field_9229, -10, 10);
         int k = class07209.method_10260() + class04995.y(var1.field_9229, -10, 10);
         var1.method_43128(null, ix, jx, k, class04891, class04911.field_15251, 5.0F, 1.0F);
      }
   }

   private boolean y(class04782 var1) {
      return this.w().L(class04007.u) && var1.y() != class07086.field_5801 && var1.method_64395().N(class07305.NN);
   }

   private boolean y(class04782 var1, class04770 var2) {
      OptionalInt optionalint = class03982.N(var1, this.d(), var2);
      optionalint.ifPresent(var1x -> this.P = var1x);
      return optionalint.isPresent();
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.N("warning_level", this.P);
      var1.N("listener", class03508.N, this.T);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.P = var1.N("warning_level", 0);
      this.T = var1.<class03508>N("listener", class03508.N).orElseGet(class03508::new);
      this.N(var1, null);
   }

   private void N(class07209 var1, class00500 var2, CallbackInfo var3) {
      this.b.lithium$setGameEventCallback(this::wakeUpNow);
   }

   private void N(class08299 var1, CallbackInfo var2) {
      if (this.T.N().N(Long.MAX_VALUE).isPresent()) {
         this.wakeUpNow();
      }
   }

   @Override
   public void N(class07209 var1, class00500 var2) {
      if (var2.L(class04007.y) && this.z instanceof class04782 class04782) {
         this.N(class04782);
      }
   }

   private void N(class04782 var1, @Nullable class07049 var2) {
      class07209 class07209 = this.d();
      class00500 class00500 = this.w();
      var1.method_8652(class07209, class00500.y(class04007.y, true), 2);
      var1.N(class07209, class00500.i(), 90);
      var1.N(3007, class07209, 0);
      var1.N(class01194.c, class07209, class01164.N(var2));
   }

   public void N(class04782 var1) {
      if (this.y(var1) && this.P > 0) {
         if (!this.L(var1)) {
            this.y((class07299)var1);
         }

         class04003.N(var1, class06889.y(this.d()), null, 40);
      }
   }

   @Nullable
   public static class04770 N(@Nullable class07049 var0) {
      if (var0 instanceof class04770 class04770xx) {
         return class04770xx;
      } else if (var0 != null && var0.method_5642() instanceof class04770 class04770xxx) {
         return class04770xxx;
      } else if (var0 instanceof class08005 class08005 && class08005.z() instanceof class04770 class04770) {
         return class04770;
      } else {
         return var0 instanceof class00717 class00717 && class00717.z() instanceof class04770 class04770x ? class04770x : null;
      }
   }

   public class03485 B() {
      return this.b;
   }

   public void N(class04782 var1, @Nullable class04770 var2) {
      if (var2 != null) {
         if (!this.w().L(class04007.y)) {
            this.P = 0;
            if (!this.y(var1) || this.y(var1, var2)) {
               this.N(var1, (class07049)var2);
            }
         }
      }
   }

   public class01099 lithium$getSleepingTicker() {
      return this.v;
   }

   public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor var1) {
      this.j = var1;
      this.lithium$setSleepingTicker(null);
   }

   public void lithium$setSleepingTicker(class01099 var1) {
      this.v = var1;
   }

   public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
      return this.j;
   }
}
