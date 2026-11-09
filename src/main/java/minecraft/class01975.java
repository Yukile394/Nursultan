package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

@FunctionalInterface
public interface class01975 {
   Codec<class01975> N = Codec.recursive(
      "condition",
      var0 -> Codec.either(Codec.simpleMap(class08509.field_56941, var0.listOf(), class05033.y(class08509.values())).codec().comapFlatMap(var0x -> {
         if (var0x.size() != 1) {
            return DataResult.error(() -> "Invalid map size for combiner condition, expected exactly one element");
         } else {
            Entry entry = (Entry)var0x.entrySet().iterator().next();
            return DataResult.success(new class08525((class08509)entry.getKey(), (List<class01975>)entry.getValue()));
         }
      }, var0x -> Map.of(var0x.N(), var0x.y())), class01942.L).flatComapMap(var0x -> (class01975)var0x.map(var0xx -> var0xx, var0xx -> var0xx), var0x -> {
         return switch (var0x) {
            case class08525 class08525 -> DataResult.success(Either.left((class08525)var0x));
            case class01942 class01942 -> DataResult.success(Either.right((class01942)var0x));
            default -> DataResult.error(() -> "Unrecognized condition");
         };
      })
   );

   <O, S extends class00522<O, S>> Predicate<S> N(class00507<O, S> var1);
}
