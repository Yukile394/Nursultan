package minecraft;

import com.mojang.serialization.Codec;

@FunctionalInterface
public interface class00603 extends class00585<Float> {
   @Override
   default Codec<Float> argumentCodec(class00607<Float> var1) {
      return Codec.FLOAT;
   }

   @Override
   default class00610<Float> argumentKeyframeLerp(class00607<Float> var1) {
      return class00610.N();
   }
}
