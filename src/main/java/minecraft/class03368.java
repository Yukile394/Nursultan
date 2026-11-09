package minecraft;

import com.mojang.serialization.MapCodec;

public interface class03368<P extends class03336> {
   class03368<class03338> N = N("clear", class03338.N);
   class03368<class03372> y = N("passthrough", class03372.y);
   class03368<class03604> L = N("append_static", class03604.N);
   class03368<class03594> u = N("append_loot", class03594.N);

   private static <P extends class03336> class03368<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.P, var0, () -> var1);
   }

   MapCodec<P> codec();
}
