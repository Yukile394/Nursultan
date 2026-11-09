package minecraft;

import com.mojang.serialization.MapCodec;

public interface class06061<P extends class06052> {
   class06061<class06042> N = N("constant", class06042.y);
   class06061<class06059> y = N("uniform", class06059.N);
   class06061<class06073> L = N("clamped_normal", class06073.N);
   class06061<class06039> u = N("trapezoid", class06039.N);

   static <P extends class06052> class06061<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.K, var0, () -> var1);
   }

   MapCodec<P> codec();
}
