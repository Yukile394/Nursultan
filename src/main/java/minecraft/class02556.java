package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.Function;

public interface class02556 {
   static class02547 N(class02536... var0) {
      return new class02547(List.of(var0));
   }

   static class02539 N(class02548... var0) {
      return new class02539(List.of(var0));
   }

   static class02531 N(class02560... var0) {
      return new class02531(List.of(var0));
   }

   static <T, A extends T> MapCodec<A> N(Codec<T> var0, Function<List<T>, A> var1, Function<A, List<T>> var2) {
      return RecordCodecBuilder.mapCodec(var3 -> var3.group(var0.listOf().fieldOf("effects").forGetter(var2)).apply(var3, var1));
   }
}
