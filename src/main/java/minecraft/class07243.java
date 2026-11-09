package minecraft;

import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07243 extends class07277 implements LithiumInventory, InventoryChangeTracker {
   public static final int N = 9;
   private static final class00392 y = class00392.L("container.dispenser");
   private class00743<class06584> u = class00743.method_10213(9, class06584.E);

   @Override
   protected class00743<class06584> aC_() {
      return this.u;
   }

   protected class07243(class00404<?> var1, class07209 var2, class00500 var3) {
      super(var1, var2, var3);
   }

   public class07243(class07209 var1, class00500 var2) {
      this(class00404.field_11887, var1, var2);
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      if (!this.a_(var1)) {
         class06686.N(var1, this.u);
      }
   }

   @Override
   protected void N(class00743<class06584> var1) {
      this.u = var1;
      this.N(var1, null);
   }

   @Override
   protected class07482 N(int var1, class08044 var2) {
      return new class07502(var1, var2, this);
   }

   public void N(class00743 var1, CallbackInfo var2) {
      this.lithium$emitStackListReplaced();
   }

   public int N(class06069 var1) {
      this.y(null);
      int i = -1;
      int j = 1;

      for (int k = 0; k < this.u.size(); k++) {
         if (!this.u.get(k).R() && var1.y(j++) == 0) {
            i = k;
         }
      }

      return i;
   }

   public class06584 N(class06584 var1) {
      int i = this.a_(var1);

      for (int j = 0; j < this.u.size(); j++) {
         class06584 class06584 = this.u.get(j);
         if (class06584.R() || class06584.L(var1, class06584)) {
            int k = Math.min(var1.c(), i - class06584.c());
            if (k > 0) {
               if (class06584.R()) {
                  this.method_5447(j, var1.N(k));
               } else {
                  var1.B(k);
                  class06584.M(k);
               }
            }

            if (var1.R()) {
               break;
            }
         }
      }

      return var1;
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.u = class00743.method_10213(this.method_5439(), class06584.E);
      if (!this.c_(var1)) {
         class06686.N(var1, this.u);
      }
   }

   @Override
   protected class00392 an_() {
      return y;
   }

   @Override
   public int method_5439() {
      return 9;
   }
}
