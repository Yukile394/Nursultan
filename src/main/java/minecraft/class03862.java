package minecraft;

import com.mojang.serialization.MapCodec;

public interface class03862<P extends class03855> {
   class03862<class03850> N = N("constant", class03850.y);
   class03862<class03854> y = N("uniform", class03854.N);
   class03862<class03851> L = N("biased_to_bottom", class03851.N);
   class03862<class01681> u = N("very_biased_to_bottom", class01681.N);
   class03862<class01708> i = N("trapezoid", class01708.N);
   class03862<class04299> R = N("weighted_list", class04299.N);

   private static <P extends class03855> class03862<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.e, var0, () -> var1);
   }

   MapCodec<P> codec();
}
