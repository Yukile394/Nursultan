package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import net.fabricmc.fabric.impl.item.RecipeRemainderHandler;

public interface class05857 extends class06521<class02903> {
   @Override
   default class00305 i() {
      return switch (this.method_45441()) {
         case field_40248 -> class06222.N;
         case field_40250 -> class06222.L;
         case field_40249 -> class06222.y;
         case field_40251 -> class06222.u;
      };
   }

   @Override
   default class05838<class05857> u() {
      return class05838.N;
   }

   static class00743<class06584> y(class02903 var0) {
      class00743 class00743 = class00743.method_10213(var0.N(), class06584.E);

      for (int i = 0; i < class00743.size(); i++) {
         class06584 class06584 = var0.N(i);
         class06581 class06581 = N(class06584, var0x -> {
            WrapOperationRuntime.checkArgumentCount(var0x, 1, "[net.minecraft.class_1799]");
            return ((class06584)var0x[0]).B();
         });
         class00743.set(i, N(class06581));
      }

      return class00743;
   }

   private static class06584 N(class06581 var0) {
      class06584 class06584 = (class06584)RecipeRemainderHandler.REMAINDER_STACK.get();
      RecipeRemainderHandler.REMAINDER_STACK.remove();
      return class06584;
   }

   private static class06581 N(class06584 var0, Operation var1) {
      RecipeRemainderHandler.REMAINDER_STACK.set(var0.getRecipeRemainder());
      return (class06581)var1.call(new Object[]{var0});
   }

   default class00743<class06584> N(class02903 var1) {
      return y(var1);
   }

   @Override
   class06514<? extends class05857> method_8119();

   class03762 method_45441();
}
