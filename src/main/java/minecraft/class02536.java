package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface class02536 {
   Codec<class02536> y = class04206.Nt.T().dispatch(class02536::N, Function.identity());

   static MapCodec<? extends class02536> N(class00751<MapCodec<? extends class02536>> var0) {
      class00751.N(var0, "add", class02527.N);
      class00751.N(var0, "all_of", class02547.N);
      class00751.N(var0, "multiply", class02544.N);
      class00751.N(var0, "remove_binomial", class02521.N);
      class00751.N(var0, "exponential", class08150.N);
      return class00751.N(var0, "set", class02519.N);
   }

   MapCodec<? extends class02536> N();

   float N(int var1, class06069 var2, float var3);
}
