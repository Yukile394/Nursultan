package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class class06847 extends class06822 {
   public static final MapCodec<class06847> y = N(class06847::new);
   public static final Codec<class06847> L = y(class06847::new);

   private class06847(List<class06834> var1) {
      super(var1);
   }

   @Override
   public MapCodec<class06847> N() {
      return y;
   }
}
