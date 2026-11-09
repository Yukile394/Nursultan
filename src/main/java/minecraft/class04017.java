package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public interface class04017 extends Function<class04039, class04018> {
   Codec<class04017> L = class04206.Ny.T().dispatch(var0 -> var0.N().N(), Function.identity());

   static MapCodec<? extends class04017> N(class00751<MapCodec<? extends class04017>> var0) {
      class04020.N(var0, "biome", class04034.N);
      class04020.N(var0, "noise_threshold", class03011.u);
      class04020.N(var0, "vertical_gradient", class03005.N);
      class04020.N(var0, "y_above", class03022.i);
      class04020.N(var0, "water", class03033.i);
      class04020.N(var0, "temperature", class03017.field_35261);
      class04020.N(var0, "steep", class03020.field_35255);
      class04020.N(var0, "not", class03034.N);
      class04020.N(var0, "hole", class04040.field_35244);
      class04020.N(var0, "above_preliminary_surface", class03035.field_35601);
      return class04020.N(var0, "stone_depth", class03037.i);
   }

   class03979<? extends class04017> N();
}
