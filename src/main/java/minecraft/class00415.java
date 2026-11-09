package minecraft;

import java.util.Arrays;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.SetChangedHandlingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00415 extends class07236 implements class07054, LithiumInventory, SetChangedHandlingBlockEntity, SleepingBlockEntity, InventoryChangeTracker {
   private static final int Z = 3;
   private static final int m = 4;
   private static final int[] P = new int[]{3};
   private static final int[] s = new int[]{0, 1, 2, 3};
   private static final int[] T = new int[]{0, 1, 2, 4};
   public static final int N = 20;
   public static final int y = 0;
   public static final int u = 1;
   public static final int i = 2;
   private static final short b = 0;
   private static final byte j = 0;
   private static final class00392 v = class00392.L("container.brewing");
   private class00743<class06584> n;
   int R;
   private boolean[] l;
   private class06581 d;
   int M;
   protected final class05845 B;
   private static final ThreadLocal w = new ThreadLocal();
   private WrappedBlockEntityTickInvokerAccessor k = null;
   private class01099 Y = null;

   @Override
   protected class00743<class06584> aC_() {
      return this.n;
   }

   public class00415(class07209 var1, class00500 var2) {
      super(class00404.field_11894, var1, var2);
      this.n = class00743.method_10213(5, class06584.E);
      this.B = new class00416(this);
   }

   private boolean[] u() {
      boolean[] aboolean = new boolean[3];

      for (int ix = 0; ix < 3; ix++) {
         if (!this.n.get(ix).R()) {
            aboolean[ix] = true;
         }
      }

      return aboolean;
   }

   private static class06584 y(class06581 var0) {
      class06584 class06584 = (class06584)w.get();
      w.remove();
      return class06584;
   }

   @Override
   public boolean y(int var1, class06584 var2, class07211 var3) {
      return var1 == 3 ? var2.N(class06570.nP) : true;
   }

   private static void y(class07299 var0, class07209 var1, class00500 var2, class00415 var3, CallbackInfo var4) {
      var3.wakeUpNow();
   }

   private void N(CallbackInfo var1) {
      if (this.isSleeping() && this.z != null && !this.z.method_8608()) {
         this.wakeUpNow();
      }
   }

   @Override
   protected class07482 N(int var1, class08044 var2) {
      return new class07489(var1, var2, this, this.B);
   }

   @Override
   public boolean N(int var1, class06584 var2, @Nullable class07211 var3) {
      return this.method_5437(var1, var2);
   }

   private static void N(class07299 var0, class07209 var1, class00743 var2, CallbackInfo var3, class06584 var4) {
      w.set(var4.getRecipeRemainder());
   }

   private void N(class00500 var1) {
      if (this.R == 0 && var1.N(class00869.MB) && this.z != null) {
         this.lithium$startSleeping();
      }
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, class00415 var3, CallbackInfo var4) {
      var3.N(var2);
   }

   private static void N(class07299 var0, class07209 var1, class00743<class06584> var2) {
      class06584 class06584x = (class06584)var2.get(3);
      class06511 class06511 = var0.method_59547();

      for (int ix = 0; ix < 3; ix++) {
         var2.set(ix, class06511.u(class06584x, (class06584)var2.get(ix)));
      }

      class06584x.B(1);
      N(var0, var1, var2, null, class06584x);
      class06584 class06584x = y(class06584x.B());
      if (!class06584x.R()) {
         if (class06584x.R()) {
            class06584x = class06584x;
         } else {
            class06704.N(var0, var1.method_10263(), var1.method_10264(), var1.method_10260(), class06584x);
         }
      }

      var2.set(3, class06584x);
      var0.N(1035, var1, 0);
   }

   private static boolean N(class06511 var0, class00743<class06584> var1) {
      class06584 class06584x = (class06584)var1.get(3);
      if (class06584x.R()) {
         return false;
      } else if (!var0.N(class06584x)) {
         return false;
      } else {
         for (int ix = 0; ix < 3; ix++) {
            class06584 class06584x = (class06584)var1.get(ix);
            if (!class06584x.R() && var0.N(class06584x, class06584x)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void N(class00743<class06584> var1) {
      this.n = var1;
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class00415 var3) {
      N(var0, var1, var2, var3, null);
      class06584 class06584x = var3.n.get(4);
      if (var3.M <= 0 && class06584x.N(class01226.Nd)) {
         var3.M = 20;
         class06584x.B(1);
         y(var0, var1, var2, var3, null);
         N(var0, var1, var2);
      }

      boolean flag = N(var0.method_59547(), var3.n);
      boolean flag1 = var3.R > 0;
      class06584 class06584x = var3.n.get(3);
      if (flag1) {
         var3.R--;
         boolean flag2 = var3.R == 0;
         if (flag2 && flag) {
            N(var0, var1, var3.n);
         } else if (!flag || !class06584x.N(var3.d)) {
            var3.R = 0;
         }

         y(var0, var1, var2, var3, null);
         N(var0, var1, var2);
      } else if (flag && var3.M > 0) {
         var3.M--;
         var3.R = 400;
         var3.d = class06584x.B();
         y(var0, var1, var2, var3, null);
         N(var0, var1, var2);
      }

      boolean[] aboolean = var3.u();
      if (!Arrays.equals(aboolean, var3.l)) {
         var3.l = aboolean;
         class00500 class00500 = var2;
         if (!(var2.i() instanceof class00902)) {
            return;
         }

         for (int ix = 0; ix < class00902.y.length; ix++) {
            class00500 = class00500.y(class00902.y[ix], aboolean[ix]);
         }

         var0.method_8652(var1, class00500, 2);
      }
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.n = class00743.method_10213(this.method_5439(), class06584.E);
      class06686.N(var1, this.n);
      this.R = var1.N("BrewTime", (short)0);
      if (this.R > 0) {
         this.d = this.n.get(3).B();
      }

      this.M = var1.N("Fuel", (byte)0);
      this.N(null);
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.N("BrewTime", (short)this.R);
      class06686.N(var1, this.n);
      var1.N("Fuel", (byte)this.M);
   }

   @Override
   public int[] N(class07211 var1) {
      if (var1 == class07211.field_11036) {
         return P;
      } else {
         return var1 == class07211.field_11033 ? s : T;
      }
   }

   @Override
   public boolean method_5437(int var1, class06584 var2) {
      if (var1 == 3) {
         return (this.z != null ? this.z.method_59547() : class06511.y).N(var2);
      } else {
         return var1 == 4
            ? var2.N(class01226.Nd)
            : (var2.N(class06570.ns) || var2.N(class06570.lO) || var2.N(class06570.lJ) || var2.N(class06570.nP)) && this.method_5438(var1).R();
      }
   }

   public class01099 lithium$getSleepingTicker() {
      return this.Y;
   }

   public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor var1) {
      this.k = var1;
      this.lithium$setSleepingTicker(null);
   }

   public void lithium$setSleepingTicker(class01099 var1) {
      this.Y = var1;
   }

   public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
      return this.k;
   }

   @Override
   protected class00392 an_() {
      return v;
   }

   @Override
   public int method_5439() {
      return this.n.size();
   }

   public void lithium$handleSetChanged() {
      if (this.isSleeping() && this.z != null && !this.z.method_8608()) {
         this.wakeUpNow();
      }
   }
}
