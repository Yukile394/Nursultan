package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public interface class01751 extends class04439 {
   MapCodec<class01751> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.STRING.fieldOf("text").forGetter(class01751::comp_737)).apply(var0, class01751::y)
   );
   class01751 L = new class01741();

   static class01751 y(String var0) {
      return (class01751)(var0.isEmpty() ? L : new class01725(var0));
   }

   @Override
   default MapCodec<class01751> N() {
      return y;
   }

   String comp_737();
}
