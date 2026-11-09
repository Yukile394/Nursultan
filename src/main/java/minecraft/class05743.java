package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalLongRefImpl;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalLongRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.common.util.Distances;
import net.caffeinemc.mods.lithium.common.util.tuples.Tuple5Obj1I;
import org.apache.commons.lang3.mutable.MutableLong;
import org.jspecify.annotations.Nullable;

public class class05743 {
   public static final int N = 48;

   public class05743() {
      super();
   }

   private static Stream N(Stream var0, long var1, LocalRef var3, LocalLongRef var4, LocalRef var5) {
      return N(var0, var1, (Long2ObjectMap)var3.get(), var4.get(), var5);
   }

   private static Stream N(Stream var0, long var1, Long2ObjectMap var3, long var4, LocalRef var6) {
      if (var0 == null && var6 != null) {
         Tuple5Obj1I tuple5obj1i = (Tuple5Obj1I)var6.get();
         class05368 class05368 = (class05368)tuple5obj1i.a();
         Predicate predicate = (Predicate)tuple5obj1i.b();
         Predicate predicate1 = (Predicate)tuple5obj1i.c();
         Predicate predicate2 = var3x -> {
            class05777 class05777 = (class05777)var3.get(var3x.method_10063());
            return class05777 == null || class05777.L(var4);
         };
         class07209 class07209 = (class07209)tuple5obj1i.d();
         class05372 class05372 = (class05372)tuple5obj1i.e();
         int i = tuple5obj1i.f();
         Collection<Pair<class03556<class05369>, class07209>> collection = class05368.lithium$getNClosestFirstWithType(
            predicate, predicate2, class07209, i, class05372, var1
         );
         if (!var3.isEmpty()) {
            long j = (long)i * i;
            var3.forEach((var6x, var8x) -> {
               class07209 class07209x = class07209.method_10092(var6x);
               if (Distances.distanceSq(class07209x, class07209) <= j && class05368.N(class07209x, predicate)) {
                  predicate1.test(class07209x);
               }
            });
         }

         return collection.stream();
      } else {
         return var0;
      }
   }

   private static Stream N(class05368 var0, Predicate var1, Predicate var2, class07209 var3, int var4, class05372 var5, LocalRef var6) {
      var6.set(new Tuple5Obj1I(var0, var1, var2, var3, var5, var4));
      return null;
   }

   private static Optional N(class05368 var0, Predicate var1, BiPredicate var2, class07209 var3, int var4) {
      return var0.lithium$takeAt(var1, var2, var3);
   }

   @Nullable
   public static class00143 N(class07079 var0, Set<Pair<class03556<class05369>, class07209>> var1) {
      if (var1.isEmpty()) {
         return null;
      } else {
         HashSet hashset = new HashSet();
         int i = 1;

         for (Pair pair : var1) {
            i = Math.max(i, ((class05369)((class03556)pair.getFirst()).N()).L());
            hashset.add((class07209)pair.getSecond());
         }

         return var0.f().N(hashset, i);
      }
   }

   public static class04142<class07475> N(
      Predicate<class03556<class05369>> var0,
      class05378<class06289> var1,
      class05378<class06289> var2,
      boolean var3,
      Optional<Byte> var4,
      BiPredicate<class04782, class07209> var5
   ) {
      byte b0 = 5;
      byte b1 = 20;
      MutableLong mutablelong = new MutableLong(0L);
      Long2ObjectOpenHashMap long2objectopenhashmap = new Long2ObjectOpenHashMap();
      class04119 class04119 = class04137.N_42(var7x -> var7x.group(var7x.L(var2)).apply(var7x, var6xx -> (var7xx, var8x, var9x) -> {
         LocalRefImpl localrefimpl = new LocalRefImpl();
         localrefimpl.init(null);
         if (var3 && var8x.method_6109()) {
            return false;
         } else if (mutablelong.longValue() == 0L) {
            mutablelong.setValue(var7xx.N() + var7xx.field_9229.y(20));
            return false;
         } else if (var7xx.N() < mutablelong.longValue()) {
            return false;
         } else {
            mutablelong.setValue(var9x + 20L + var7xx.method_8409().y(20));
            class05368 class05368 = var7xx.method_19494();
            long2objectopenhashmap.long2ObjectEntrySet().removeIf(var2xxxx -> !((class05777)var2xxxx.getValue()).y(var9x));
            Predicate predicate = var3xxxx -> {
               class05777 class05777 = (class05777)long2objectopenhashmap.get(var3xxxx.method_10063());
               if (class05777 == null) {
                  return true;
               } else if (!class05777.L(var9x)) {
                  return false;
               } else {
                  class05777.N(var9x);
                  return true;
               }
            };
            class07209 class07209x = var8x.method_24515();
            class05372 class05372 = class05372.field_18487;
            byte b0x = 48;
            class07209 class07209x = class07209x;
            Stream stream1 = N(class05368, var0, predicate, class07209x, b0x, class05372, localrefimpl);
            long i = 5L;
            Stream stream = stream1;
            LocalRefImpl localrefimpl1 = new LocalRefImpl();
            LocalLongRefImpl locallongrefimpl = new LocalLongRefImpl();
            localrefimpl1.init(long2objectopenhashmap);
            locallongrefimpl.init(var9x);
            stream1 = N(stream, i, localrefimpl1, locallongrefimpl, localrefimpl);
            var9x = locallongrefimpl.dispose();
            long2objectopenhashmap = (Long2ObjectMap)localrefimpl1.dispose();
            Set set = stream1.filter(var2xxxx -> var5.test(var7xx, (class07209)var2xxxx.getSecond())).collect(Collectors.toSet());
            class00143 class00143 = N(var8x, set);
            if (class00143 != null && class00143.z()) {
               class07209 class07209xx = class00143.E();
               class05368.L(class07209xx).ifPresent(var8xx -> {
                  N(class05368, var0, (var1xxxxx, var2xxxxx) -> var2xxxxx.equals(class07209), class07209, 1);
                  var6xx.N(class06289.N(var7xx.method_27983(), class07209));
                  var4.ifPresent(var2xxxxx -> var7xx.method_8421(var8x, var2xxxxx));
                  long2objectopenhashmap.clear();
                  var7xx.method_74535().y(class07209);
               });
            } else {
               for (Pair pair : set) {
                  long2objectopenhashmap.computeIfAbsent(((class07209)pair.getSecond()).method_10063(), var3xxxx -> new class05777(var7xx.field_9229, var9x));
               }
            }

            return true;
         }
      }));
      return var2 == var1 ? class04119 : class04137.N_42(var2x -> var2x.group(var2x.L(var1)).apply(var2x, var1xx -> class04119));
   }

   public static class04142<class07475> N(Predicate<class03556<class05369>> var0, class05378<class06289> var1, boolean var2, Optional<Byte> var3) {
      return N(var0, var1, var1, var2, var3, (var0x, var1x) -> true);
   }

   public static class04142<class07475> N(
      Predicate<class03556<class05369>> var0, class05378<class06289> var1, boolean var2, Optional<Byte> var3, BiPredicate<class04782, class07209> var4
   ) {
      return N(var0, var1, var1, var2, var3, var4);
   }
}
