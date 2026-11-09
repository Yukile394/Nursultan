package minecraft;

import Nursultan.class09243;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.stream.Stream;

public record class00324(class00299 input, class00299 remainder) implements class00299 {
   public static final MapCodec<class00324> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00299.N.fieldOf("input").forGetter(class00324::y), class00299.N.fieldOf("remainder").forGetter(class00324::L))
         .apply(var0, class00324::new)
   );
   public static final class02362<class04247, class00324> u = class02362.N(class00299.y, class00324::y, class00299.y, class00324::L, class00324::new);
   public static final class00319<class00324> i = new class00319<>(L, u);

   public class00299 L() {
      return this.remainder;
   }

   public class00324(class00299 input, class00299 remainder) {
      super();
      this.input = input;
      this.remainder = remainder;
   }

   public class00299 y() {
      return this.input;
   }

   @Override
   public boolean N(class03767 var1) {
      return this.input.N(var1) && this.remainder.N(var1);
   }

   @Override
   public class00319<class00324> N() {
      return i;
   }

   @Override
   public <T> Stream<T> N(class00311 var1, class00308<T> var2) {
      if (var2 instanceof class09243 class09243) {
         List list = this.remainder.N(var1, var2).toList();
         return this.input.<Object>N(var1, var2).map(var2x -> (T)class09243.N(var2x, list));
      } else {
         return this.input.N(var1, var2);
      }
   }
}
