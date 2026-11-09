package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2IntMap.Entry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.SetChangedHandlingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class07242
   extends class07236
   implements class06941,
   class06946,
   class07054,
   LithiumInventory,
   SetChangedHandlingBlockEntity,
   SleepingBlockEntity,
   InventoryChangeTracker,
   SpecialLogicInventory {
   protected static final int N = 0;
   protected static final int y = 1;
   protected static final int u = 2;
   public static final int i = 0;
   private static final int[] l = new int[]{0};
   private static final int[] d = new int[]{2, 1};
   private static final int[] w = new int[]{1};
   public static final int R = 1;
   public static final int M = 2;
   public static final int B = 3;
   public static final int Z = 4;
   public static final int m = 200;
   public static final int P = 2;
   private static final Codec<Map<class05946<class06521<?>>, Integer>> k = Codec.unboundedMap(class06521.M, Codec.INT);
   private static final short Y = 0;
   private static final short Q = 0;
   private static final short O = 0;
   private static final short g = 0;
   protected class00743<class06584> s;
   int T;
   int b;
   int j;
   int v;
   protected final class05845 n;
   private final Reference2IntOpenHashMap<class05946<class06521<?>>> I;
   private final class06485<class02904, ? extends class07313> J;
   private static final ThreadLocal o = new ThreadLocal();
   private boolean q;
   private WrappedBlockEntityTickInvokerAccessor K = null;
   private class01099 V = null;

   @Override
   protected class00743<class06584> aC_() {
      return this.s;
   }

   protected class07242(class00404<?> var1, class07209 var2, class00500 var3, class05838<? extends class07313> var4) {
      super(var1, var2, var3);
      this.s = class00743.method_10213(3, class06584.E);
      this.n = new class07231(this);
      this.I = new Reference2IntOpenHashMap();
      this.J = class06482.N(var4);
   }

   private boolean u() {
      return this.T > 0;
   }

   private static boolean y(class01042 var0, @Nullable class03729<? extends class07313> var1, class02904 var2, class00743<class06584> var3, int var4) {
      if (var1 != null && N(var0, var1, var2, var3, var4)) {
         class06584 class06584xx = (class06584)var3.get(0);
         class06584 class06584x = ((class07313)var1.y()).method_8116(var2, var0);
         class06584 class06584xx = (class06584)var3.get(2);
         if (class06584xx.R()) {
            var3.set(2, class06584x.t());
         } else if (class06584.L(class06584xx, class06584x)) {
            class06584xx.M(1);
         }

         if (class06584xx.N(class00869.Nx.B()) && !((class06584)var3.get(1)).R() && ((class06584)var3.get(1)).N(class06570.jU)) {
            var3.set(1, new class06584(class06570.jE));
         }

         class06584xx.B(1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean y(int var1, class06584 var2, class07211 var3) {
      return var3 == class07211.field_11033 && var1 == 1 ? var2.N(class06570.jE) || var2.N(class06570.jU) : true;
   }

   private static void N(class04782 var0, class06889 var1, int var2, float var3) {
      int ix = class04995.y(var2 * var3);
      float f = class04995.M(var2 * var3);
      if (f != 0.0F && var0.field_9229.z() < f) {
         ix++;
      }

      class07057.N(var0, var1, ix);
   }

   @Override
   public void N(class02741 var1) {
      for (class06584 class06584 : this.s) {
         var1.y(class06584);
      }
   }

   @Override
   public void N(class07209 var1, class00500 var2) {
      super.N(var1, var2);
      if (this.z instanceof class04782 class04782) {
         this.N(class04782, class06889.y(var1));
      }
   }

   private void N(CallbackInfo var1) {
      if (this.isSleeping() && this.z != null && !this.z.method_8608()) {
         this.wakeUpNow();
      }
   }

   public List<class03729<?>> N(class04782 var1, class06889 var2) {
      ArrayList arraylist = Lists.newArrayList();
      ObjectIterator<Entry<class05946<class06521<?>>>> objectiterator = this.I.reference2IntEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         var1.method_64577().y((class05946<class06521<?>>)entry.getKey()).ifPresent(var4x -> {
            arraylist.add(var4x);
            N(var1, var2, entry.getIntValue(), ((class07313)var4x.y()).R());
         });
      }

      return arraylist;
   }

   public void N(class04770 var1) {
      List<class03729<?>> list = this.N(var1.method_51469(), var1.method_73189());
      var1.method_7254(list);

      for (class03729<?> class03729 : list) {
         var1.method_51283(class03729, this.s);
      }

      this.I.clear();
   }

   @Override
   public void N(class08036 var1, List<class06584> var2) {
   }

   private static Object N(Object var0) {
      Object object = o.get();
      o.remove();
      return object;
   }

   private static void N(class04782 var0, class07209 var1, class00500 var2, class07242 var3, CallbackInfo var4, class06584 var5) {
      o.set(var5.getRecipeRemainder());
   }

   public void N(int var1, class06584 var2, CallbackInfo var3) {
      if (this.q) {
         this.s.set(var1, var2);
         var3.cancel();
      }
   }

   private static void N(class04782 var0, class07209 var1, class00500 var2, class07242 var3, CallbackInfo var4) {
      var3.N(var2);
   }

   private void N(class00500 var1) {
      if (!this.u() && this.j == 0 && (var1.N(class00869.uN) || var1.N(class00869.Pf) || var1.N(class00869.PA)) && this.z != null) {
         this.lithium$startSleeping();
      }
   }

   protected int N(class02755 var1, class06584 var2) {
      return var1.y(var2);
   }

   private static int N(class04782 var0, class07242 var1) {
      class02904 class02904 = new class02904(var1.method_5438(0));
      return var1.J.N(class02904, var0).map(var0x -> var0x.y().M()).orElse(200);
   }

   @Override
   public int[] N(class07211 var1) {
      if (var1 == class07211.field_11033) {
         return d;
      } else {
         return var1 == class07211.field_11036 ? l : w;
      }
   }

   @Override
   public boolean N(int var1, class06584 var2, @Nullable class07211 var3) {
      return this.method_5437(var1, var2);
   }

   private static boolean N(class01042 var0, @Nullable class03729<? extends class07313> var1, class02904 var2, class00743<class06584> var3, int var4) {
      if (!((class06584)var3.get(0)).R() && var1 != null) {
         class06584 class06584x = ((class07313)var1.y()).method_8116(var2, var0);
         if (class06584x.R()) {
            return false;
         } else {
            class06584 class06584x = (class06584)var3.get(2);
            if (class06584x.R()) {
               return true;
            } else if (!class06584.L(class06584x, class06584x)) {
               return false;
            } else {
               return class06584x.c() < var4 && class06584x.c() < class06584x.U() ? true : class06584x.c() < class06584x.U();
            }
         }
      } else {
         return false;
      }
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.N("cooking_time_spent", (short)this.j);
      var1.N("cooking_total_time", (short)this.v);
      var1.N("lit_time_remaining", (short)this.T);
      var1.N("lit_total_time", (short)this.b);
      class06686.N(var1, this.s);
      var1.N("RecipesUsed", k, this.I);
   }

   public static void N(class04782 var0, class07209 var1, class00500 var2, class07242 var3) {
      boolean flag = var3.u();
      boolean flag1 = false;
      if (var3.u()) {
         var3.T--;
      }

      class06584 class06584x = var3.s.get(1);
      class06584 class06584x = var3.s.get(0);
      boolean flag2 = !class06584x.R();
      boolean flag3 = !class06584x.R();
      if (var3.u() || flag3 && flag2) {
         class02904 class02904 = new class02904(class06584x);
         class03729<? extends class07313> class03729;
         if (flag2) {
            class03729 = var3.J.N(class02904, var0).orElse(null);
         } else {
            class03729 = null;
         }

         int ix = var3.method_5444();
         if (!var3.u() && N(var0.method_30349(), class03729, class02904, var3.s, ix)) {
            var3.T = var3.N(var0.method_61269(), class06584x);
            var3.b = var3.T;
            if (var3.u()) {
               flag1 = true;
               if (flag3) {
                  N(var0, var1, var2, var3, null, class06584x);
                  class06581 class06581 = class06584x.B();
                  class06584x.B(1);
                  if (class06584x.R()) {
                     var3.s.set(1, (class06584)N(class06581.Z()));
                  }
               }
            }
         }

         if (var3.u() && N(var0.method_30349(), class03729, class02904, var3.s, ix)) {
            var3.j++;
            if (var3.j == var3.v) {
               var3.j = 0;
               var3.v = N(var0, var3);
               if (y(var0.method_30349(), class03729, class02904, var3.s, ix)) {
                  var3.N(class03729);
               }

               flag1 = true;
            }
         } else {
            var3.j = 0;
         }
      } else if (!var3.u() && var3.j > 0) {
         var3.j = class04995.N(var3.j - 2, 0, var3.v);
      }

      if (flag != var3.u()) {
         flag1 = true;
         var2 = var2.y(class00748.y, var3.u());
         var0.method_8652(var1, var2, 3);
      }

      if (flag1) {
         N(var0, var1, var2);
      }

      N(var0, var1, var2, var3, null);
   }

   @Nullable
   @Override
   public class03729<?> N() {
      return null;
   }

   @Override
   public void N(@Nullable class03729<?> var1) {
      if (var1 != null) {
         class05946<class06521<?>> class05946 = var1.N();
         this.I.addTo(class05946, 1);
      }
   }

   @Override
   protected void N(class00743<class06584> var1) {
      this.s = var1;
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.s = class00743.method_10213(this.method_5439(), class06584.E);
      class06686.N(var1, this.s);
      this.j = var1.N("cooking_time_spent", (short)0);
      this.v = var1.N("cooking_total_time", (short)0);
      this.T = var1.N("lit_time_remaining", (short)0);
      this.b = var1.N("lit_total_time", (short)0);
      this.I.clear();
      this.I.putAll(var1.<Map>N("RecipesUsed", k).orElse(Map.of()));
      this.N(null);
   }

   @Override
   public boolean method_5437(int var1, class06584 var2) {
      if (var1 == 2) {
         return false;
      } else if (var1 != 1) {
         return true;
      } else {
         class06584 class06584 = this.s.get(1);
         return this.z.method_61269().N(var2) || var2.N(class06570.jU) && !class06584.N(class06570.jU);
      }
   }

   @Override
   public void method_5447(int var1, class06584 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class06584 class06584 = this.s.get(var1);
         boolean flag = !var2.R() && class06584.L(class06584, var2);
         this.s.set(var1, var2);
         var2.R(this.a_(var2));
         if (var1 == 0 && !flag && this.z instanceof class04782 class04782) {
            this.v = N(class04782, this);
            this.j = 0;
            this.method_5431();
         }
      }
   }

   public class01099 lithium$getSleepingTicker() {
      return this.V;
   }

   public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor var1) {
      this.K = var1;
      this.lithium$setSleepingTicker(null);
   }

   public void lithium$setSleepingTicker(class01099 var1) {
      this.V = var1;
   }

   public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
      return this.K;
   }

   @Override
   public void fabric_onFinalCommit(int var1, class06584 var2, class06584 var3) {
      if (var1 == 0 && (var3.R() || !class06584.L(var3, var2)) && this.z instanceof class04782 class04782) {
         this.v = N(class04782, this);
         this.j = 0;
      }
   }

   @Override
   public void fabric_setSuppress(boolean var1) {
      this.q = var1;
   }

   @Override
   public int method_5439() {
      return this.s.size();
   }

   public void lithium$handleSetChanged() {
      if (this.isSleeping() && this.z != null && !this.z.method_8608()) {
         this.wakeUpNow();
      }
   }
}
