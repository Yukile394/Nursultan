package minecraft;

import Nursultan.class10415;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;

public class class06871 implements class07135 {
   private static final Logger N = LogUtils.getLogger();
   private final class01997 i;
   private final Set<class05946<class05074>> R;
   private final List<class06875> M;
   private final CompletableFuture<class01929> B;

   public class06871(class01996 var1, Set<class05946<class05074>> var2, List<class06875> var3, CompletableFuture<class01929> var4) {
      super();
      this.i = var1.method_60917(class04227.yJ);
      this.M = var3;
      this.R = var2;
      this.B = var4;
   }

   private CompletableFuture<?> y(class04476 var1, class01929 var2) {
      class00731 class00731 = new class00731<>(class04227.yJ, Lifecycle.experimental());
      Object2ObjectOpenHashMap object2objectopenhashmap = new Object2ObjectOpenHashMap();
      this.M.forEach(var3x -> var3x.N().apply(var2).method_10399((var3xx, var4x) -> {
         class01894 class01894x = N(var3xx);
         class01894 class01894x = object2objectopenhashmap.put(class03512.N(class01894x), class01894x);
         if (class01894x != null) {
            class07536.y("Loot table random sequence seed collision on " + class01894x + " and " + var3xx.N());
         }

         var4x.N(class01894x);
         class05074 class05074 = var4x.N(var3x.y()).L();
         class00731.N(var3xx, class05074, class02819.N);
      }));
      class00731.W();
      class04482 class04482 = new class04482();
      class01022 class01022 = new class01014(List.of(class00731)).method_40316();
      class05561 class05561 = new class05561(class04482, class06925.b, class01022);

      for (class05946<class05074> class05946 : Sets.difference(this.R, class00731.B())) {
         class04482.N_47(new class06899(class05946));
      }

      class00731.z().forEach(var1x -> ((class05074)var1x.N()).N(class05561.N(((class05074)var1x.N()).N()).N(new class10415(var1x.B()), var1x.B())));
      if (!class04482.N()) {
         class04482.N((var0, var1x) -> N.warn("Found validation problem in {}: {}", var0, var1x.N()));
         throw new IllegalStateException("Failed to validate loot tables, see logs");
      } else {
         return CompletableFuture.allOf(class00731.Z().stream().map(var3x -> {
            class05946 class05946 = (class05946)var3x.getKey();
            class05074 class05074 = (class05074)var3x.getValue();
            Path path = this.i.N(class05946.N());
            return class07135.N(var1, var2, class05074.u, class05074, path);
         }).toArray(CompletableFuture[]::new));
      }
   }

   private static class01894 N(class05946<class05074> var0) {
      return var0.N();
   }

   @Override
   public String method_10321() {
      return "Loot Tables";
   }

   @Override
   public CompletableFuture<?> method_10319(class04476 var1) {
      return this.B.thenCompose(var2 -> this.y(var1, var2));
   }
}
