package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class01579(class01471 fluid, class01471 barrier) implements class06386 {
   public static final Codec<class01579> N = RecordCodecBuilder.create(
      var0 -> var0.group(class01471.N.fieldOf("fluid").forGetter(class01579::N), class01471.N.fieldOf("barrier").forGetter(class01579::y))
         .apply(var0, class01579::new)
   );

   public class01579(class01471 fluid, class01471 barrier) {
      this.fluid = fluid;
      this.barrier = barrier;
   }

   public class01471 y() {
      return this.barrier;
   }

   public class01471 N() {
      return this.fluid;
   }
}
