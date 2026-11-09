package minecraft;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset.Entry;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.stream.Collectors;

public record class00336<P extends class00372<T>, T>(MapCodec<class08938<P, T>> switchCodec) {
   public class00336(MapCodec<class08938<P, T>> switchCodec) {
      this.switchCodec = switchCodec;
   }

   public static <T> MapCodec<List<class08940<T>>> N(Codec<T> var0) {
      return class08940.N(var0).listOf().validate(class00336::N).fieldOf("cases");
   }

   private static <T> DataResult<List<class08940<T>>> N(List<class08940<T>> var0) {
      if (var0.isEmpty()) {
         return DataResult.error(() -> "Empty case list");
      } else {
         HashMultiset hashmultiset = HashMultiset.create();

         for (class08940 class08940 : var0) {
            hashmultiset.addAll(class08940.N());
         }

         return hashmultiset.size() != hashmultiset.entrySet().size()
            ? DataResult.error(
               () -> "Duplicate case conditions: "
                  + hashmultiset.entrySet()
                     .stream()
                     .filter(var0xx -> var0xx.getCount() > 1)
                     .map(var0xx -> var0xx.getElement().toString())
                     .collect(Collectors.joining(", "))
            )
            : DataResult.success(var0);
      }
   }

   public static <P extends class00372<T>, T> class00336<P, T> N(MapCodec<P> var0, Codec<T> var1) {
      MapCodec mapcodec = RecordCodecBuilder.mapCodec(
         var2x -> var2x.group(var0.forGetter(class08938::N), N(var1).forGetter(class08938::y)).apply(var2x, class08938::new)
      );
      return new class00336<>(mapcodec);
   }

   public MapCodec<class08938<P, T>> N() {
      return this.switchCodec;
   }
}
