package minecraft;

import com.mojang.serialization.Codec;

@FunctionalInterface
public interface class00584 extends class00589<Integer> {
   @Override
   default Codec<Integer> argumentCodec(class00607<Integer> var1) {
      return class06338.m;
   }

   @Override
   default class00610<Integer> argumentKeyframeLerp(class00607<Integer> var1) {
      return class00610.L();
   }
}
