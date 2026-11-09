package minecraft;

import com.mojang.serialization.MapCodec;

public interface class03549<SP extends class03532> {
   class03549<class03528> N = N("random_spread", class03528.N);
   class03549<class03548> y = N("concentric_rings", class03548.N);

   private static <SP extends class03532> class03549<SP> N(String var0, MapCodec<SP> var1) {
      return class00751.N(class04206.a, var0, () -> var1);
   }

   MapCodec<SP> codec();
}
