package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00316(class00299 input, class00299 result, class00299 craftingStation) implements class00265 {
   public static final MapCodec<class00316> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00299.N.fieldOf("input").forGetter(class00316::y),
            class00299.N.fieldOf("result").forGetter(class00316::u),
            class00299.N.fieldOf("crafting_station").forGetter(class00316::i)
         )
         .apply(var0, class00316::new)
   );
   public static final class02362<class04247, class00316> y = class02362.N(
      class00299.y, class00316::y, class00299.y, class00316::u, class00299.y, class00316::i, class00316::new
   );
   public static final class00273<class00316> L = new class00273<>(N, y);

   public class00316(class00299 input, class00299 result, class00299 craftingStation) {
      super();
      this.input = input;
      this.result = result;
      this.craftingStation = craftingStation;
   }

   @Override
   public class00299 i() {
      return this.craftingStation;
   }

   @Override
   public class00299 u() {
      return this.result;
   }

   public class00299 y() {
      return this.input;
   }

   @Override
   public class00273<class00316> N() {
      return L;
   }
}
