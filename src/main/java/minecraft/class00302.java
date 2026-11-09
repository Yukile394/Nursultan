package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.stream.Stream;

public record class00302(class06584 stack) implements class00299 {
   public static final MapCodec<class00302> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06584.u.fieldOf("item").forGetter(class00302::y)).apply(var0, class00302::new)
   );
   public static final class02362<class04247, class00302> u = class02362.N(class06584.z, class00302::y, class00302::new);
   public static final class00319<class00302> i = new class00319<>(L, u);

   public class00302(class06584 stack) {
      super();
      this.stack = stack;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof class00302 class00302 && class06584.N(this.stack, class00302.stack);
   }

   public class06584 y() {
      return this.stack;
   }

   @Override
   public <T> Stream<T> N(class00311 var1, class00308<T> var2) {
      return var2 instanceof class00287 ? Stream.of((T)((class00287)var2).y(this.stack)) : Stream.empty();
   }

   @Override
   public class00319<class00302> N() {
      return i;
   }

   @Override
   public boolean N(class03767 var1) {
      return this.stack.B().N(var1);
   }
}
