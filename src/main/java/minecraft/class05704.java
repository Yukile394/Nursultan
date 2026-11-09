package minecraft;

import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;

public class class05704 {
   private static final int N = 40;
   private static final int y = 5;
   private static final int L = 20;
   private static final int u = 4;

   public class05704() {
      super();
   }

   public static class04142<class07475> N(float var0) {
      Long2LongOpenHashMap long2longopenhashmap = new Long2LongOpenHashMap();
      return class04137.N_42(
         var3 -> var3.group(var3.L(class05378.m), var3.L(class05378.y))
            .apply(
               var3,
               (var3x, var4) -> (var4x, var5, var6) -> {
                  if (var4x.N() - var0x.longValue() < 20L) {
                     return false;
                  } else {
                     class05368 class05368 = var4x.method_19494();
                     Optional optional = class05368.L(var0xxxx -> var0xxxx.N(class03927.m), var5.method_24515(), 48, class05372.field_18489);
                     if (!optional.isEmpty() && !(((class07209)optional.get()).method_10262(var5.method_24515()) <= 4.0)) {
                        MutableInt mutableint = new MutableInt(0);
                        var0x.setValue(var4x.N() + var4x.method_8409().y(20));
                        Predicate predicate = var3xxx -> {
                           long i = var3xxx.method_10063();
                           if (long2longopenhashmap.containsKey(i)) {
                              return false;
                           } else if (mutableint.incrementAndGet() >= 5) {
                              return false;
                           } else {
                              long2longopenhashmap.put(i, var0x.longValue() + 40L);
                              return true;
                           }
                        };
                        Set set = class05368.y(var0xxxx -> var0xxxx.N(class03927.m), predicate, var5.method_24515(), 48, class05372.field_18489)
                           .collect(Collectors.toSet());
                        class00143 class00143 = class05743.N(var5, set);
                        if (class00143 != null && class00143.z()) {
                           class07209 class07209 = class00143.E();
                           if (class05368.L(class07209).isPresent()) {
                              var3x.N(new class05352(class07209, var0, 1));
                              var4x.method_74535().y(class07209);
                           }
                        } else if (mutableint.intValue() < 5) {
                           long2longopenhashmap.long2LongEntrySet().removeIf(var1xxxx -> var1xxxx.getLongValue() < var0x.longValue());
                        }

                        return true;
                     } else {
                        return false;
                     }
                  }
               }
            )
      );
   }
}
