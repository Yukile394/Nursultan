package minecraft;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.TooltipComponentCallback;
import net.fabricmc.fabric.impl.resource.client.PackTooltipComponent;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import squeek.appleskin.client.TooltipOverlayHandler.FoodOverlay;
import squeek.appleskin.client.TooltipOverlayHandler.FoodOverlayTextComponent;

@Environment(EnvType.CLIENT)
public interface class06357 {
   private static void L(class04830 var0, CallbackInfoReturnable var1) {
      if (var0 instanceof PackTooltipComponent packtooltipcomponent) {
         var1.setReturnValue(packtooltipcomponent);
      }
   }

   private static void y(class04830 var0, CallbackInfoReturnable var1) {
      class06357 class06357 = ((TooltipComponentCallback)TooltipComponentCallback.EVENT.invoker()).getComponent(var0);
      if (class06357 != null) {
         var1.setReturnValue(class06357);
      }
   }

   private static void N(class01028 var0, CallbackInfoReturnable var1) {
      if (var0 instanceof FoodOverlayTextComponent) {
         var1.setReturnValue(((FoodOverlayTextComponent)var0).foodOverlay);
      }
   }

   static class06357 N(class01028 var0) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, callbackinforeturnable);
      return (class06357)(callbackinforeturnable.isCancelled() ? (class06357)callbackinforeturnable.getReturnValue() : new class06365(var0));
   }

   private static void N(class04830 var0, CallbackInfoReturnable var1) {
      if (var0 instanceof FoodOverlay) {
         var1.setReturnValue((FoodOverlay)var0);
      }
   }

   default boolean N() {
      return false;
   }

   static class06357 N(class04830 var0) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N((class04830)var0, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class06357)callbackinforeturnable.getReturnValue();
      } else {
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
         y((class04830)var0, callbackinforeturnable1);
         if (callbackinforeturnable1.isCancelled()) {
            return (class06357)callbackinforeturnable1.getReturnValue();
         } else {
            CallbackInfoReturnable callbackinforeturnable2 = new CallbackInfoReturnable("", true);
            L((class04830)var0, callbackinforeturnable2);
            if (callbackinforeturnable2.isCancelled()) {
               return (class06357)callbackinforeturnable2.getReturnValue();
            } else {
               return (class06357)(switch (var0) {
                  case class04828 class04828 -> new class06334(class04828.N());
                  case class02590 class02590 -> new class02567(class02590);
                  default -> throw new IllegalArgumentException("Unknown TooltipComponent");
               });
            }
         }
      }
   }

   default void method_32665(class01054 var1, class01590 var2, int var3, int var4) {
   }

   default void method_32666(class01590 var1, int var2, int var3, int var4, int var5, class01054 var6) {
   }

   int method_32664(class01590 var1);

   int method_32661(class01590 var1);
}
