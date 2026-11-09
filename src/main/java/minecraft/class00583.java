package minecraft;

import com.mojang.serialization.Codec;

class class00583 implements class00589<class00614> {
   class00583() {
      super();
   }

   public Integer apply(Integer var1, class00614 var2) {
      int i = class02566.y(class02566.R(var1), var2.N());
      return class02566.N(var2.y(), var1, i);
   }

   @Override
   public Codec<class00614> argumentCodec(class00607<Integer> var1) {
      return class00614.L;
   }

   @Override
   public class00610<class00614> argumentKeyframeLerp(class00607<Integer> var1) {
      return (var0, var1x, var2) -> new class00614(class04995.B(var0, var1x.N(), var2.N()), class04995.B(var0, var1x.y(), var2.y()));
   }
}
