package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.ConcurrentModificationException;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class03176 {
   private final Long2ObjectMap<class03150> N = new Long2ObjectOpenHashMap();
   private static final AtomicInteger y = new AtomicInteger();
   private static final Logger L = LoggerFactory.getLogger(class03176.class);

   public class03176() {
      super();
   }

   private void N(class07299 var1, long var2, CallbackInfoReturnable var4, LocalRef var5, int var6, int var7, int var8) {
      while (true) {
         try {
            var5.set(N(var1.method_8497(var6, var8), class01296.N(var2), (Long2ObjectOpenHashMap)var5.get()));
            return;
         } catch (ConcurrentModificationException concurrentmodificationexception) {
            int i = y.incrementAndGet();
            if (i <= 5) {
               L.warn(
                  "[Block Entity Render Data] Encountered CME during render region build. A mod is accessing or changing chunk data outside the main thread. Retrying.",
                  concurrentmodificationexception
               );
               if (i == 5) {
                  L.info("[Block Entity Render Data] Subsequent exceptions will be suppressed.");
               }
            }
         }
      }
   }

   private static Long2ObjectOpenHashMap N(class00570 var0, class01296 var1, Long2ObjectOpenHashMap var2) {
      if (var0.o().isEmpty()) {
         return var2;
      } else {
         int i = class01296.L(var1.N() - 1);
         int j = class01296.L(var1.y() - 1);
         int k = class01296.L(var1.L() - 1);
         int l = class01296.L(var1.N() + 1);
         int i1 = class01296.L(var1.y() + 1);
         int j1 = class01296.L(var1.L() + 1);

         for (Entry entry : var0.o().entrySet()) {
            class07209 class07209 = (class07209)entry.getKey();
            if (class07209.method_10263() >= i
               && class07209.method_10263() <= l
               && class07209.method_10264() >= j
               && class07209.method_10264() <= i1
               && class07209.method_10260() >= k
               && class07209.method_10260() <= j1) {
               Object object = ((class00394)entry.getValue()).getRenderData();
               if (object != null) {
                  if (var2 == null) {
                     var2 = new Long2ObjectOpenHashMap();
                  }

                  var2.put(class07209.method_10063(), object);
               }
            }
         }

         return var2;
      }
   }

   private void N(class07299 var1, long var2, CallbackInfoReturnable var4, LocalRef var5) {
      class03498 class03498 = (class03498)var4.getReturnValue();
      Long2ObjectOpenHashMap long2objectopenhashmap = (Long2ObjectOpenHashMap)var5.get();
      if (long2objectopenhashmap != null) {
         class03498.fabric_acceptRenderDataMap(long2objectopenhashmap);
      }
   }

   public class03498 N(class07299 var1, long var2) {
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(null);
      int i = class01296.y(var2);
      int j = class01296.L(var2);
      int k = class01296.u(var2);
      int l = i - 1;
      int i1 = j - 1;
      int j1 = k - 1;
      int k1 = i + 1;
      int l1 = j + 1;
      int i2 = k + 1;
      class03150[] aclass03150 = new class03150[27];

      for (int j2 = j1; j2 <= i2; j2++) {
         for (int k2 = i1; k2 <= l1; k2++) {
            for (int l2 = l; l2 <= k1; l2++) {
               int i3 = class03498.N(l, i1, j1, l2, k2, j2);
               this.N(var1, var2, null, localrefimpl, l2, k2, j2);
               aclass03150[i3] = this.N(var1, l2, k2, j2);
            }
         }
      }

      class03498 class03498;
      class03498 class03498x = class03498 = new class03498(var1, l, i1, j1, aclass03150);
      this.N(var1, var2, new CallbackInfoReturnable("", false, class03498), localrefimpl);
      return class03498x;
   }

   private class03150 N(class07299 var1, int var2, int var3, int var4) {
      return (class03150)this.N.computeIfAbsent(class01296.y(var2, var3, var4), var4x -> {
         class00570 class00570 = var1.method_8497(var2, var4);
         return new class03150(class00570, class00570.method_31603(var3));
      });
   }
}
