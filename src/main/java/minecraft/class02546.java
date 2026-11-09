package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public interface class02546 {
   Codec<class02546> N = class04206.Nj.T().dispatch(class02546::N, var0 -> var0);
   Codec<class02546> y = Codec.either(class02514.L, N)
      .xmap(
         var0 -> (class02546)var0.map(var0x -> var0x, var0x -> var0x), var0 -> var0 instanceof class02514 ? Either.left((class02514)var0) : Either.right(var0)
      );

   static class02532 y(float var0) {
      return N(var0, var0);
   }

   static MapCodec<? extends class02546> N(class00751<MapCodec<? extends class02546>> var0) {
      class00751.N(var0, "clamped", class02524.L);
      class00751.N(var0, "fraction", class02537.L);
      class00751.N(var0, "levels_squared", class02563.L);
      class00751.N(var0, "linear", class02532.L);
      class00751.N(var0, "exponent", class02529.L);
      return class00751.N(var0, "lookup", class02516.L);
   }

   static class02514 N(float var0) {
      return new class02514(var0);
   }

   static class02532 N(float var0, float var1) {
      return new class02532(var0, var1);
   }

   static class02516 N(List<Float> var0, class02546 var1) {
      return new class02516(var0, var1);
   }

   float N(int var1);

   MapCodec<? extends class02546> N();
}
