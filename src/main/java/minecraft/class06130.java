package minecraft;

import java.util.List;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06130 extends class07277 implements LithiumInventory, InventoryChangeTracker {
   private static final class00392 N = class00392.L("container.barrel");
   private class00743<class06584> y = class00743.method_10213(27, class06584.E);
   private final class01114 u = new class06122(this);

   @Override
   protected class00743<class06584> aC_() {
      return this.y;
   }

   public class06130(class07209 var1, class00500 var2) {
      super(class00404.field_16411, var1, var2);
   }

   public void u() {
      if (!this.E) {
         this.u.L(this.G(), this.d(), this.w());
      }
   }

   @Override
   protected class07482 N(int var1, class08044 var2) {
      return class07490.N(var1, var2, this);
   }

   void N(class00500 var1, class04891 var2) {
      class00753 class00753 = var1.L(class06109.y).E();
      double d0 = this.U.method_10263() + 0.5 + class00753.method_10263() / 2.0;
      double d1 = this.U.method_10264() + 0.5 + class00753.method_10264() / 2.0;
      double d2 = this.U.method_10260() + 0.5 + class00753.method_10260() / 2.0;
      this.z.method_43128(null, d0, d1, d2, var2, class04911.field_15245, 0.5F, this.z.field_9229.z() * 0.1F + 0.9F);
   }

   void N(class00500 var1, boolean var2) {
      this.z.method_8652(this.d(), var1.y(class06109.L, var2), 3);
   }

   @Override
   protected void N(class00743<class06584> var1) {
      this.y = var1;
      this.N(var1, null);
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      if (!this.a_(var1)) {
         class06686.N(var1, this.y);
      }
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.y = class00743.method_10213(this.method_5439(), class06584.E);
      if (!this.c_(var1)) {
         class06686.N(var1, this.y);
      }
   }

   public void N(class00743 var1, CallbackInfo var2) {
      this.lithium$emitStackListReplaced();
   }

   @Override
   public void method_5432(class08978 var1) {
      if (!this.E && !var1.aB_().method_7325()) {
         this.u.N(var1.aB_(), this.G(), this.d(), this.w());
      }
   }

   @Override
   public void method_5435(class08978 var1) {
      if (!this.E && !var1.aB_().method_7325()) {
         this.u.N(var1.aB_(), this.G(), this.d(), this.w(), var1.method_72381());
      }
   }

   @Override
   protected class00392 an_() {
      return N;
   }

   @Override
   public List<class08978> j_() {
      return this.u.N(this.G(), this.d());
   }

   @Override
   public int method_5439() {
      return 27;
   }
}
