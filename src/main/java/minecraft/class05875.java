package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Arrays;
import java.util.Optional;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05875 extends class00394 implements class05266, SleepingBlockEntity {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 2;
   private static final int L = 4;
   private final class00743<class06584> u;
   private final int[] i;
   private final int[] R;
   private WrappedBlockEntityTickInvokerAccessor M = null;
   private class01099 B = null;

   public class07269 i() {
      return class07269.N(this);
   }

   public class05875(class07209 var1, class00500 var2) {
      super(class00404.field_17380, var1, var2);
      this.u = class00743.method_10213(4, class06584.E);
      this.i = new int[4];
      this.R = new int[4];
   }

   private void u() {
      this.method_5431();
      this.G().method_8413(this.d(), this.w(), this.w(), 3);
   }

   @Override
   public void y(class08329 var1) {
      var1.L("Items");
   }

   public static void y(class07299 var0, class07209 var1, class00500 var2, class05875 var3) {
      class06069 class06069 = var0.field_9229;
      if (class06069.z() < 0.11F) {
         for (int ix = 0; ix < class06069.y(2) + 2; ix++) {
            class05847.N(var0, var1, var2.L(class05847.L), false);
         }
      }

      int l = var2.L(class05847.i).u();

      for (int j = 0; j < var3.u.size(); j++) {
         if (!var3.u.get(j).R() && class06069.z() < 0.2F) {
            class07211 class07211 = class07211.y(Math.floorMod(j + l, 4));
            float f = 0.3125F;
            double d0 = var1.method_10263() + 0.5 - class07211.P() * 0.3125F + class07211.R().P() * 0.3125F;
            double d1 = var1.method_10264() + 0.5;
            double d2 = var1.method_10260() + 0.5 - class07211.T() * 0.3125F + class07211.R().T() * 0.3125F;

            for (int k = 0; k < 4; k++) {
               var0.method_8406(class07107.NZ, d0, d1, d2, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class05875 var3) {
      boolean flag = false;

      for (int ix = 0; ix < var3.u.size(); ix++) {
         if (var3.i[ix] > 0) {
            flag = true;
            var3.i[ix] = class04995.N(var3.i[ix] - 2, 0, var3.R[ix]);
         }
      }

      if (flag) {
         N(var0, var1, var2);
      }

      N(var0, var1, var2, var3, null, flag);
   }

   public static void N(class04782 var0, class07209 var1, class00500 var2, class05875 var3, class06485<class02904, class05869> var4) {
      boolean flag = false;

      for (int ix = 0; ix < var3.u.size(); ix++) {
         class06584 class06584x = var3.u.get(ix);
         if (!class06584x.R()) {
            flag = true;
            var3.i[ix]++;
            if (var3.i[ix] >= var3.R[ix]) {
               class02904 class02904 = new class02904(class06584x);
               class06584 class06584x = var4.N(class02904, var0)
                  .map(var2x -> ((class05869)var2x.y()).method_8116(class02904, var0.method_30349()))
                  .orElse(class06584x);
               if (class06584x.N(var0.method_45162())) {
                  class06704.N(var0, var1.method_10263(), var1.method_10264(), var1.method_10260(), class06584x);
                  var3.u.set(ix, class06584.E);
                  var0.method_8413(var1, var2, var2, 3);
                  var0.N(class01194.L, var1, class01164.N(var2));
               }
            }
         }
      }

      if (flag) {
         N(var0, var1, var2);
      }

      N(null, var3, flag);
   }

   @Override
   public class07001 N(class01929 var1) {
      class07001 class07001;
      try (class04495 class04495 = new class04495(this.J(), N)) {
         class08303 class08303 = class08303.N(class04495, var1);
         class06686.N(class08303, this.u, true);
         class07001 = class08303.y();
      }

      return class07001;
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, class05875 var3, CallbackInfo var4, boolean var5) {
      if (!var5) {
         var3.lithium$startSleeping();
      }
   }

   private static void N(CallbackInfo var0, class05875 var1, boolean var2) {
      if (!var2) {
         var1.lithium$startSleeping();
      }
   }

   private void N(class08299 var1, CallbackInfo var2) {
      this.wakeUpNow();
   }

   private void N(class04782 var1, class07438 var2, class06584 var3, CallbackInfoReturnable var4) {
      this.wakeUpNow();
   }

   @Override
   protected void N(class02676 var1) {
      super.N(var1);
      var1.N(class02484.NG, class02854.N(this.N()));
   }

   @Override
   protected void N_9(class02666 var1) {
      super.N_9(var1);
      var1.a_(class02484.NG, class02854.N).N(this.N());
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      class06686.N(var1, this.u, true);
      var1.N("CookingTimes", this.i);
      var1.N("CookingTotalTimes", this.R);
   }

   @Override
   public void N(class07209 var1, class00500 var2) {
      if (this.z != null) {
         class06704.N(this.z, var1, this.N());
      }
   }

   public boolean N(class04782 var1, @Nullable class07438 var2, class06584 var3) {
      for (int ix = 0; ix < this.u.size(); ix++) {
         if (this.u.get(ix).R()) {
            Optional<class03729<class05869>> optional = var1.method_64577().N(class05838.i, new class02904(var3), var1);
            if (optional.isEmpty()) {
               return false;
            }

            this.R[ix] = optional.get().y().M();
            this.i[ix] = 0;
            class00743 class00743 = this.u;
            class06584 class06584 = var3.y(1, var2);
            this.N(var1, var2, var3, null);
            class00743.set(ix, class06584);
            var1.N(class01194.L, this.d(), class01164.N(var2, this.w()));
            this.u();
            return true;
         }
      }

      return false;
   }

   public class00743<class06584> N() {
      return this.u;
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.u.clear();
      class06686.N(var1, this.u);
      var1.B("CookingTimes")
         .ifPresentOrElse(var1x -> System.arraycopy(var1x, 0, this.i, 0, Math.min(this.R.length, var1x.length)), () -> Arrays.fill(this.i, 0));
      var1.B("CookingTotalTimes")
         .ifPresentOrElse(var1x -> System.arraycopy(var1x, 0, this.R, 0, Math.min(this.R.length, var1x.length)), () -> Arrays.fill(this.R, 0));
      this.N(var1, null);
   }

   @Override
   public void method_5448() {
      this.u.clear();
   }

   public class01099 lithium$getSleepingTicker() {
      return this.B;
   }

   public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor var1) {
      this.M = var1;
      this.lithium$setSleepingTicker(null);
   }

   public void lithium$setSleepingTicker(class01099 var1) {
      this.B = var1;
   }

   public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
      return this.M;
   }
}
