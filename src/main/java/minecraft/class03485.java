package minecraft;

import java.util.Optional;
import net.caffeinemc.mods.lithium.common.block.entity.sleeping_sculk.GameEventListenerWithCallback;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03485 implements class01187, GameEventListenerWithCallback {
   private final class03502 N;
   private Runnable y;

   public class03485(class03502 var1) {
      super();
      this.N = var1;
   }

   public void y(class04782 var1, class03556<class01194> var2, class01164 var3, class06889 var4) {
      this.N.u().y().N(var1).ifPresent(var5 -> this.N(var1, this.N.L(), var2, var3, var4, var5));
   }

   @Override
   public int y() {
      return this.N.u().N();
   }

   private static boolean N(class07299 var0, class06889 var1, class06889 var2) {
      class06889 class06889xx = new class06889(class04995.N(var1.M) + 0.5, class04995.N(var1.B) + 0.5, class04995.N(var1.Z) + 0.5);
      class06889 class06889x = new class06889(class04995.N(var2.M) + 0.5, class04995.N(var2.B) + 0.5, class04995.N(var2.Z) + 0.5);

      for (class07211 class07211 : class07211.values()) {
         class06889 class06889xx = class06889xx.N(class07211, 1.0E-5F);
         if (var0.N(new class06331(class06889xx, class06889x, var0x -> var0x.N(class01210.yg))).N() != class07113.field_1332) {
            return false;
         }
      }

      return true;
   }

   private void N(class04782 var1, class03556 var2, class01164 var3, class06889 var4, CallbackInfoReturnable var5) {
      if (this.y != null) {
         this.y.run();
      }
   }

   @Override
   public class01190 N() {
      return this.N.u().y();
   }

   @Override
   public boolean N(class04782 var1, class03556<class01194> var2, class01164 var3, class06889 var4) {
      class03508 class03508 = this.N.L();
      class03481 class03481 = this.N.u();
      if (class03508.y() != null) {
         return false;
      } else if (!class03481.N(var2, var3)) {
         return false;
      } else {
         Optional<class06889> optional = class03481.y().N(var1);
         if (optional.isEmpty()) {
            return false;
         } else {
            class06889 class06889 = optional.get();
            if (!class03481.N(var1, class07209.method_49638(var4), var2, var3)) {
               return false;
            } else if (N(var1, var4, class06889)) {
               return false;
            } else {
               this.N(var1, var2, var3, var4, null);
               this.N(var1, class03508, var2, var3, var4, class06889);
               return true;
            }
         }
      }
   }

   private void N(class04782 var1, class03508 var2, class03556<class01194> var3, class01164 var4, class06889 var5, class06889 var6) {
      var2.u.N(new class03978(var3, (float)var5.R(var6), var5, var4.N()), var1.N());
   }

   public static float N(class07209 var0, class07209 var1) {
      return (float)Math.sqrt(var0.method_10262(var1));
   }

   public void lithium$setGameEventCallback(Runnable var1) {
      this.y = var1;
   }
}
