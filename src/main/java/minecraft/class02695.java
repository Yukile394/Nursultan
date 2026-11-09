package minecraft;

import Nursultan.class09822;
import Nursultan.class09826;
import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMaps;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterators;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface class02695 extends class02666, Iterable<class02480<?>> {
   class02695 N = new class02698();
   Codec<class02695> y = y(class02477.u);

   default Stream<class02480<?>> L() {
      return StreamSupport.stream(Spliterators.spliterator(this.iterator(), (long)this.u(), 1345), false);
   }

   @Override
   default Iterator<class02480<?>> iterator() {
      return Iterators.transform(this.y().iterator(), var1 -> Objects.requireNonNull(this.u(var1)));
   }

   default boolean i() {
      return this.u() == 0;
   }

   default int u() {
      return this.y().size();
   }

   static Codec<class02695> y(Codec<Map<class02477<?>, Object>> var0) {
      return var0.flatComapMap(class02676::N, var0x -> {
         int i = var0x.u();
         if (i == 0) {
            return DataResult.success(Reference2ObjectMaps.emptyMap());
         } else {
            Reference2ObjectArrayMap reference2objectarraymap = new Reference2ObjectArrayMap(i);

            for (class02480 class02480 : var0x) {
               if (!class02480.N().u()) {
                  reference2objectarraymap.put(class02480.N(), class02480.y());
               }
            }

            return DataResult.success(reference2objectarraymap);
         }
      });
   }

   Set<class02477<?>> y();

   default class02695 N(Predicate<class02477<?>> var1) {
      return new class09822(this, var1);
   }

   static Codec<class02695> N(Codec<class02477<?>> var0) {
      return y(Codec.dispatchedMap(var0, class02477::L));
   }

   static class02695 N(class02695 var0, class02695 var1) {
      return new class09826(var1, var0);
   }

   default boolean N(class02477<?> var1) {
      return this.method_58694(var1) != null;
   }

   static class02676 N() {
      return new class02676();
   }
}
