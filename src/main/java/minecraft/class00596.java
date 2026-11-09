package minecraft;

import com.mojang.serialization.Codec;

class class00596 implements class00585<class00601> {
   class00596() {
      super();
   }

   public Float apply(Float var1, class00601 var2) {
      return class04995.B(var2.y(), var1, var2.N());
   }

   @Override
   public Codec<class00601> argumentCodec(class00607<Float> var1) {
      return class00601.N;
   }

   @Override
   public class00610<class00601> argumentKeyframeLerp(class00607<Float> var1) {
      return (var0, var1x, var2) -> new class00601(class04995.B(var0, var1x.N(), var2.N()), class04995.B(var0, var1x.y(), var2.y()));
   }
}
