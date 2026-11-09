package minecraft;

import com.mojang.serialization.Codec;

public interface class00265 {
   Codec<class00265> u = class04206.Nd.T().dispatch(class00265::N, class00273::N);
   class02362<class04247, class00265> i = class02389.N(class04227.NP).y(class00265::N, class00273::y);

   class00299 i();

   class00299 u();

   default boolean N(class03767 var1) {
      return this.u().N(var1) && this.i().N(var1);
   }

   class00273<? extends class00265> N();
}
