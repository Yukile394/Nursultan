package minecraft;

import java.util.List;
import java.util.stream.IntStream;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07278 extends class07277 implements class07054, LithiumInventory, SleepingBlockEntity, InventoryChangeTracker {
   public static final int N = 9;
   public static final int y = 3;
   public static final int u = 27;
   public static final int M = 1;
   public static final int B = 10;
   public static final float Z = 0.5F;
   public static final float m = 270.0F;
   private static final int[] P = IntStream.range(0, 27).toArray();
   private static final class00392 s = class00392.L("container.shulkerBox");
   private class00743<class06584> T;
   private int b;
   private class07266 j;
   private float v;
   private float n;
   @Nullable
   private final class06563 l;
   private WrappedBlockEntityTickInvokerAccessor d = null;
   private class01099 w = null;

   @Override
   protected class00743<class06584> aC_() {
      return this.T;
   }

   private void L(class07299 var1, class07209 var2, class00500 var3) {
      if (var3.i() instanceof class07027) {
         class07211 class07211 = var3.L(class07027.L);
         class00734 class00734 = class07144.N(1.0F, class07211, this.n, this.v, var2.method_61082());
         List<class07049> list = var1.N_70(null, class00734);
         if (!list.isEmpty()) {
            for (class07049 class07049 : list) {
               if (class07049.method_5657() != class04641.field_15975) {
                  class07049.method_5784(
                     class07451.field_6306,
                     new class06889(
                        (class00734.y() + 0.01) * class07211.P(), (class00734.L() + 0.01) * class07211.s(), (class00734.u() + 0.01) * class07211.T()
                     )
                  );
               }
            }
         }
      }
   }

   public class07278(@Nullable class06563 var1, class07209 var2, class00500 var3) {
      super(class00404.field_11896, var2, var3);
      this.T = class00743.method_10213(27, class06584.E);
      this.j = class07266.field_12065;
      this.l = var1;
   }

   public class07278(class07209 var1, class00500 var2) {
      super(class00404.field_11896, var1, var2);
      this.T = class00743.method_10213(27, class06584.E);
      this.j = class07266.field_12065;
      class00891 class00891 = var2.i();
      this.l = class00891 instanceof class07027 ? ((class07027)class00891).y() : null;
   }

   public boolean U() {
      return this.j == class07266.field_12065;
   }

   @Nullable
   public class06563 z() {
      return this.l;
   }

   public void u(class08299 var1) {
      this.T = class00743.method_10213(this.method_5439(), class06584.E);
      if (!this.c_(var1)) {
         class06686.N(var1, this.T);
      }
   }

   private static void u(class07299 var0, class07209 var1, class00500 var2) {
      var2.N(var0, var1, 3);
      var0.method_8408(var1, var2.i());
   }

   public class07266 u() {
      return this.j;
   }

   private void y(class07299 var1, class07209 var2, class00500 var3) {
      this.n = this.v;
      switch (this.j) {
         case field_12065:
            this.v = 0.0F;
            break;
         case field_12066:
            this.v += 0.1F;
            if (this.n == 0.0F) {
               u(var1, var2, var3);
            }

            if (this.v >= 1.0F) {
               this.j = class07266.field_12063;
               this.v = 1.0F;
               u(var1, var2, var3);
            }

            this.L(var1, var2, var3);
            break;
         case field_12063:
            this.v = 1.0F;
            break;
         case field_12064:
            this.v -= 0.1F;
            if (this.n == 1.0F) {
               u(var1, var2, var3);
            }

            if (this.v <= 0.0F) {
               this.j = class07266.field_12065;
               this.v = 0.0F;
               u(var1, var2, var3);
            }
      }

      this.N(var1, var2, var3, null);
   }

   @Override
   public boolean y(int var1, class06584 var2, class07211 var3) {
      return true;
   }

   private void N(class07299 var1, class07209 var2, class00500 var3, CallbackInfo var4) {
      if (this.j == class07266.field_12065 && this.n == 0.0F && this.v == 0.0F) {
         this.lithium$startSleeping();
      }
   }

   @Override
   public int[] N(class07211 var1) {
      return P;
   }

   @Override
   public boolean N(int var1, class06584 var2, @Nullable class07211 var3) {
      return !(class00891.N(var2.B()) instanceof class07027);
   }

   private void N(int var1, int var2, CallbackInfoReturnable var3) {
      if (this.w != null) {
         this.wakeUpNow();
      }
   }

   @Override
   protected class07482 N(int var1, class08044 var2) {
      return new class06922(var1, var2, this);
   }

   public float N(float var1) {
      return class04995.B(var1, this.n, this.v);
   }

   public void N(class00743 var1, CallbackInfo var2) {
      this.lithium$emitStackListReplaced();
   }

   @Override
   public void N(class07209 var1, class00500 var2) {
   }

   @Override
   public boolean N(int var1, int var2) {
      this.N(var1, var2, null);
      if (var1 == 1) {
         this.b = var2;
         if (var2 == 0) {
            this.j = class07266.field_12064;
         }

         if (var2 == 1) {
            this.j = class07266.field_12066;
         }

         return true;
      } else {
         return super.N(var1, var2);
      }
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class07278 var3) {
      var3.y(var0, var1, var2);
   }

   public class00734 N(class00500 var1) {
      class06889 class06889 = new class06889(0.5, 0.0, 0.5);
      return class07144.N(1.0F, var1.L(class07027.L), 0.5F * this.N(1.0F), class06889);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.u(var1);
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      if (!this.a_(var1)) {
         class06686.N(var1, this.T, false);
      }
   }

   @Override
   protected void N(class00743<class06584> var1) {
      this.T = var1;
      this.N(var1, null);
   }

   @Override
   public void method_5432(class08978 var1) {
      if (!this.E && !var1.aB_().method_7325()) {
         this.b--;
         this.z.method_8427(this.U, this.w().i(), 1, this.b);
         if (this.b <= 0) {
            this.z.N(var1.aB_(), class01194.z, this.U);
            this.z.method_8396(null, this.U, class04909.wf, class04911.field_15245, 0.5F, this.z.field_9229.z() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void method_5435(class08978 var1) {
      if (!this.E && !var1.aB_().method_7325()) {
         if (this.b < 0) {
            this.b = 0;
         }

         this.b++;
         this.z.method_8427(this.U, this.w().i(), 1, this.b);
         if (this.b == 1) {
            this.z.N(var1.aB_(), class01194.U, this.U);
            this.z.method_8396(null, this.U, class04909.wC, class04911.field_15245, 0.5F, this.z.field_9229.z() * 0.1F + 0.9F);
         }
      }
   }

   public class01099 lithium$getSleepingTicker() {
      return this.w;
   }

   public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor var1) {
      this.d = var1;
   }

   public void lithium$setSleepingTicker(class01099 var1) {
      this.w = var1;
   }

   public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
      return this.d;
   }

   @Override
   protected class00392 an_() {
      return s;
   }

   @Override
   public int method_5439() {
      return this.T.size();
   }
}
