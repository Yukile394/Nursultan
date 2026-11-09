package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.Function;

abstract class class04023 implements class04025 {
   protected final List<class04025> i;

   protected class04023(List<class04025> var1) {
      super();
      this.i = var1;
   }

   public static <T extends class04023> MapCodec<T> N(Function<List<class04025>, T> var0) {
      return RecordCodecBuilder.mapCodec(var1 -> var1.group(class04025.y.listOf().fieldOf("predicates").forGetter(var0xx -> var0xx.i)).apply(var1, var0));
   }
}
