package minecraft;

import com.mojang.serialization.MapCodec;

public interface class02139<P extends class02142> {
   class02139<class02151> N = N("constant", class02151.y);
   class02139<class02135> y = N("uniform", class02135.N);
   class02139<class01697> L = N("biased_to_bottom", class01697.N);
   class02139<class01684> u = N("clamped", class01684.N);
   class02139<class03301> i = N("weighted_list", class03301.N);
   class02139<class03007> R = N("clamped_normal", class03007.N);

   static <P extends class02142> class02139<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.V, var0, () -> var1);
   }

   MapCodec<P> codec();
}
