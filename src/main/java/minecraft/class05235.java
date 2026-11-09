package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface class05235<P extends class01219> {
   Codec<class01219> N = class04206.NR.T().dispatch("processor_type", class01219::N, class05235::codec);
   Codec<class05483> y = N.listOf().xmap(class05483::new, class05483::N);
   Codec<class05483> L = Codec.withAlternative(y.fieldOf("processors").codec(), y);
   Codec<class03556<class05483>> u = class01281.N(class04227.yT, L);
   class05235<class05282> i = N("block_ignore", class05282.N);
   class05235<class01201> R = N("block_rot", class01201.N);
   class05235<class05239> M = N("gravity", class05239.N);
   class05235<class05255> B = N("jigsaw_replacement", class05255.N);
   class05235<class05273> Z = N("rule", class05273.N);
   class05235<class05242> z = N("nop", class05242.N);
   class05235<class05083> U = N("block_age", class05083.N);
   class05235<class05077> E = N("blackstone_replace", class05077.N);
   class05235<class01249> W = N("lava_submerged_block", class01249.N);
   class05235<class03442> m = N("protected_blocks", class03442.y);
   class05235<class03564> P = N("capped", class03564.N);

   static <P extends class01219> class05235<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.NR, var0, () -> var1);
   }

   MapCodec<P> codec();
}
