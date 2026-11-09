package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import net.caffeinemc.mods.lithium.common.block.entity.sleeping_sculk.GameEventListenerWithCallback;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04076 implements GameEventListenerWithCallback {
   public static final int N = 24;
   public static final int y = 1000;
   public static final float L = 0.5F;
   private static final int M = 32;
   public static final int u = 11;
   public static final int i = 1024;
   final boolean R;
   private final class03530<class00891> B;
   private final int Z;
   private final int z;
   private final int U;
   private final int E;
   private List<class04083> W = new ArrayList<>();
   private Runnable m;

   public class03530<class00891> L() {
      return this.B;
   }

   public int M() {
      return this.E;
   }

   public class04076(boolean var1, class03530<class00891> var2, int var3, int var4, int var5, int var6) {
      super();
      this.R = var1;
      this.B = var2;
      this.Z = var3;
      this.z = var4;
      this.U = var5;
      this.E = var6;
   }

   public boolean B() {
      return this.R;
   }

   public List<class04083> Z() {
      return this.W;
   }

   public int i() {
      return this.z;
   }

   public void z() {
      this.W.clear();
   }

   public int u() {
      return this.Z;
   }

   public static class04076 y() {
      return new class04076(true, class01210.LZ, 50, 1, 5, 10);
   }

   private void N(class04083 var1) {
      if (this.W.size() < 32) {
         this.W.add(var1);
      }
   }

   public void N(class07284 var1, class07209 var2, class06069 var3, boolean var4) {
      if (!this.W.isEmpty()) {
         ArrayList arraylist = new ArrayList();
         HashMap hashmap = new HashMap();
         Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();

         for (class04083 class04083xx : this.W) {
            if (!class04083xx.N(var2)) {
               class04083xx.N(var1, var2, var3, this, var4);
               if (class04083xx.y <= 0) {
                  var1.N(3006, class04083xx.N(), 0);
               } else {
                  class07209 class07209x = class04083xx.N();
                  object2intopenhashmap.computeInt(class07209x, (var1x, var2x) -> (var2x == null ? 0 : var2x) + class04083xx.y);
                  class04083 class04083x = (class04083)hashmap.get(class07209x);
                  if (class04083x == null) {
                     hashmap.put(class07209x, class04083xx);
                     arraylist.add(class04083xx);
                  } else if (!this.B() && class04083xx.y + class04083x.y <= 1000) {
                     class04083x.N(class04083xx);
                  } else {
                     arraylist.add(class04083xx);
                     if (class04083xx.y < class04083x.y) {
                        hashmap.put(class07209x, class04083xx);
                     }
                  }
               }
            }
         }

         ObjectIterator objectiterator = object2intopenhashmap.object2IntEntrySet().iterator();

         while (objectiterator.hasNext()) {
            Entry entry = (Entry)objectiterator.next();
            class07209 class07209 = (class07209)entry.getKey();
            int j = entry.getIntValue();
            class04083 class04083x = (class04083)hashmap.get(class07209);
            Set<class07211> set = class04083x == null ? null : class04083x.u();
            if (j > 0 && set != null) {
               int ix = ((int)(Math.log1p(j) / 2.3F) + 1 << 6) + class05543.N(set);
               var1.N(3006, class07209, ix);
            }
         }

         this.W = arraylist;
      }
   }

   public void N(class07209 var1, int var2) {
      while (var2 > 0) {
         int ix = Math.min(var2, 1000);
         this.N(new class04083(var1, ix));
         var2 -= ix;
      }

      this.N(var1, var2, null);
   }

   public static class04076 N() {
      return new class04076(false, class01210.LB, 10, 4, 10, 5);
   }

   public void N(class08299 var1) {
      this.W.clear();
      var1.<List>N("cursors", class04083.L.sizeLimitedListOf(32)).orElse(List.of()).forEach(this::N);
   }

   public void N(class08329 var1) {
      var1.N("cursors", class04083.L.listOf(), this.W);
      if (class07529.Ny) {
         int ix = this.Z().stream().map(class04083::y).reduce(0, Integer::sum);
         int j = this.Z().stream().map(var0 -> 1).reduce(0, Integer::sum);
         int k = this.Z().stream().map(class04083::y).reduce(0, Math::max);
         var1.N("stats.total", ix);
         var1.N("stats.count", j);
         var1.N("stats.max", k);
         var1.N("stats.avg", ix / (j + 1));
      }
   }

   public void N(class07209 var1, int var2, CallbackInfo var3) {
      if (this.m != null) {
         this.m.run();
      }
   }

   public void lithium$setGameEventCallback(Runnable var1) {
      this.m = var1;
   }

   public int R() {
      return this.U;
   }
}
