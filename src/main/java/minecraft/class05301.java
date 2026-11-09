package minecraft;

import com.mojang.serialization.MapCodec;

public interface class05301<P extends class05318> {
   class05301<class05329> N = N("always_true", class05329.N);
   class05301<class05295> y = N("linear_pos", class05295.N);
   class05301<class05333> L = N("axis_aligned_linear_pos", class05333.N);

   static <P extends class05318> class05301<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.s, var0, () -> var1);
   }

   MapCodec<P> codec();
}
