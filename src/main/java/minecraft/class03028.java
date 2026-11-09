package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface class03028 extends Function<class04039, class03003> {
   Codec<class03028> y = class04206.NL.T().dispatch(var0 -> var0.N().N(), Function.identity());

   static MapCodec<? extends class03028> N(class00751<MapCodec<? extends class03028>> var0) {
      class04020.N(var0, "bandlands", class04036.field_35226);
      class04020.N(var0, "block", class04047.N);
      class04020.N(var0, "sequence", class03010.N);
      return class04020.N(var0, "condition", class03013.N);
   }

   class03979<? extends class03028> N();
}
