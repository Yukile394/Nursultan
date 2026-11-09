package minecraft;

import com.mojang.serialization.Codec;

class class00605 implements class00589<Integer> {
   class00605() {
      super();
   }

   public Integer apply(Integer var1, Integer var2) {
      return class02566.i(var1, var2);
   }

   @Override
   public Codec<Integer> argumentCodec(class00607<Integer> var1) {
      return class06338.P;
   }

   @Override
   public class00610<Integer> argumentKeyframeLerp(class00607<Integer> var1) {
      return class00610.L();
   }
}
