package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.Iterator;
import net.caffeinemc.mods.lithium.common.block.entity.SetChangedHandlingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03145 extends class07277 implements class03507, SetChangedHandlingBlockEntity, SleepingBlockEntity {
   public static final int N = 3;
   public static final int y = 3;
   public static final int u = 9;
   public static final int M = 1;
   public static final int B = 0;
   public static final int Z = 9;
   public static final int m = 10;
   private static final int s = 0;
   private static final int T = 0;
   private static final class00392 b = class00392.L("container.crafter");
   private class00743<class06584> j;
   private int v;
   protected final class05845 P;
   private WrappedBlockEntityTickInvokerAccessor n = null;
   private class01099 l = null;

   @Override
   public class00743<class06584> aC_() {
      return this.j;
   }

   private boolean L(int var1) {
      return var1 > -1 && var1 < 9 && this.j.get(var1).R();
   }

   public class03145(class07209 var1, class00500 var2) {
      super(class00404.field_46808, var1, var2);
      this.j = class00743.method_10213(9, class06584.E);
      this.v = 0;
      this.P = new class03108(this);
   }

   private void B(class08329 var1) {
      IntArrayList intarraylist = new IntArrayList();

      for (int i = 0; i < 9; i++) {
         if (this.N(i)) {
            intarraylist.add(i);
         }
      }

      var1.N("disabled_slots", intarraylist.toIntArray());
   }

   private void Z(class08329 var1) {
      var1.N("triggered", this.P.N(9));
   }

   public int U() {
      int i = 0;

      for (int jx = 0; jx < this.method_5439(); jx++) {
         if (!this.method_5438(jx).R() || this.N(jx)) {
            i++;
         }
      }

      return i;
   }

   public boolean z() {
      return this.P.N(9) == 1;
   }

   @Override
   public int y() {
      return 3;
   }

   public void y(int var1) {
      this.v = var1;
      this.N(null);
   }

   private void E() {
      if (this.v == 0) {
         this.lithium$startSleeping();
      }
   }

   @Override
   public int N() {
      return 3;
   }

   @Override
   public void N(class02741 var1) {
      for (class06584 class06584 : this.j) {
         var1.N(class06584);
      }
   }

   @Override
   protected class07482 N(int var1, class08044 var2) {
      return new class01712(var1, var2, this, this.P);
   }

   public void N(int var1, boolean var2) {
      if (this.L(var1)) {
         this.P.N(var1, var2 ? 0 : 1);
         this.method_5431();
      }
   }

   public void N(boolean var1) {
      this.P.N(9, var1 ? 1 : 0);
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class03145 var3) {
      int i = var3.v - 1;
      if (i < 0) {
         N(null, var3, i);
      } else {
         var3.v = i;
         if (i == 0) {
            var0.method_8652(var1, var2.y(class01748.y, false), 3);
         }

         N(null, var3, i);
      }
   }

   private static void N(CallbackInfo var0, class03145 var1, int var2) {
      if (var2 < 0) {
         var1.E();
      }
   }

   private void N(CallbackInfo var1) {
      if (this.isSleeping() && this.z != null && !this.z.method_8608()) {
         this.wakeUpNow();
      }
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.N("crafting_ticks_remaining", this.v);
      if (!this.a_(var1)) {
         class06686.N(var1, this.j);
      }

      this.B(var1);
      this.Z(var1);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.v = var1.N("crafting_ticks_remaining", 0);
      this.j = class00743.method_10213(this.method_5439(), class06584.E);
      if (!this.c_(var1)) {
         class06686.N(var1, this.j);
      }

      for (int i = 0; i < 9; i++) {
         this.P.N(i, 0);
      }

      var1.B("disabled_slots").ifPresent(var1x -> {
         for (int jx : var1x) {
            if (this.L(jx)) {
               this.P.N(jx, 1);
            }
         }
      });
      this.P.N(9, var1.N("triggered", 0));
      this.N(null);
   }

   private boolean N(int var1, class06584 var2, int var3) {
      for (int i = var3 + 1; i < 9; i++) {
         if (!this.N(i)) {
            class06584 class06584 = this.method_5438(i);
            if (class06584.R() || class06584.c() < var1 && class06584.L(class06584, var2)) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected void N(class00743<class06584> var1) {
      this.j = var1;
   }

   public boolean N(int var1) {
      return var1 >= 0 && var1 < 9 ? this.P.N(var1) == 1 : false;
   }

   @Override
   public boolean method_5443(class08036 var1) {
      return class06695.N(this, var1);
   }

   @Override
   public boolean method_5437(int var1, class06584 var2) {
      if (this.P.N(var1) == 1) {
         return false;
      } else {
         class06584 class06584 = this.j.get(var1);
         int i = class06584.c();
         if (i >= class06584.U()) {
            return false;
         } else {
            return class06584.R() ? true : !this.N(i, class06584, var1);
         }
      }
   }

   @Override
   public void method_5447(int var1, class06584 var2) {
      if (this.N(var1)) {
         this.N(var1, true);
      }

      super.method_5447(var1, var2);
   }

   @Override
   public boolean method_5442() {
      Iterator<class06584> iterator = this.j.iterator();

      while (iterator.hasNext()) {
         if (!iterator.next().R()) {
            return false;
         }
      }

      return true;
   }

   public class01099 lithium$getSleepingTicker() {
      return this.l;
   }

   public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor var1) {
      this.n = var1;
      this.lithium$setSleepingTicker(null);
   }

   public void lithium$setSleepingTicker(class01099 var1) {
      this.l = var1;
   }

   public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
      return this.n;
   }

   @Override
   protected class00392 an_() {
      return b;
   }

   @Override
   public class06584 method_5438(int var1) {
      return this.j.get(var1);
   }

   @Override
   public int method_5439() {
      return 9;
   }

   public void lithium$handleSetChanged() {
      if (this.isSleeping() && this.z != null && !this.z.method_8608()) {
         this.wakeUpNow();
      }
   }
}
