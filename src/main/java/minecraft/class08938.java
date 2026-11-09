package minecraft;

import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;

public record class08938<P extends class00372<T>, T>(P property, List<class08940<T>> cases) {
   public static final MapCodec<class08938<?, ?>> N = class00366.y.dispatchMap("property", var0 -> var0.N().N(), class00336::N);

   public class08938(P property, List<class08940<T>> cases) {
      this.property = (P)property;
      this.cases = cases;
   }

   public List<class08940<T>> y() {
      return this.cases;
   }

   private class08900<T> N(Object2ObjectMap<T, class08910> var1, @Nullable class00203 var2) {
      if (var2 == null) {
         return (var1x, var2x) -> (class08910)var1.get(var1x);
      } else {
         class08910 class08910 = (class08910)var1.defaultReturnValue();
         class08546 class08546 = new class08546<>(
            var4x -> {
               Object2ObjectOpenHashMap object2objectopenhashmap = new Object2ObjectOpenHashMap(var1.size());
               object2objectopenhashmap.defaultReturnValue(class08910);
               var1.forEach(
                  (var4xx, var5x) -> var2.N(this.property.y(), var4xx, var4x.method_30349()).ifSuccess(var2xxx -> object2objectopenhashmap.put(var2xxx, var5x))
               );
               return object2objectopenhashmap;
            }
         );
         return (var3x, var4x) -> {
            if (var4x == null) {
               return (class08910)var1.get(var3x);
            } else {
               return var3x == null ? class08910 : (class08910)((Object2ObjectMap)class08546.N(var4x)).get(var3x);
            }
         };
      }
   }

   public void N(class08350 var1) {
      Iterator iterator = this.cases.iterator();

      while (iterator.hasNext()) {
         ((class08940)iterator.next()).y().method_62326(var1);
      }
   }

   public P N() {
      return this.property;
   }

   public class08910 N(class08905 var1, class08910 var2) {
      Object2ObjectOpenHashMap object2objectopenhashmap = new Object2ObjectOpenHashMap();

      for (class08940 class08940 : this.cases) {
         class08910 class08910 = class08940.y().method_65587(var1);

         for (Object object : class08940.N()) {
            object2objectopenhashmap.put(object, class08910);
         }
      }

      object2objectopenhashmap.defaultReturnValue(var2);
      return new class08928<>(this.property, this.N(object2objectopenhashmap, var1.R()));
   }
}
