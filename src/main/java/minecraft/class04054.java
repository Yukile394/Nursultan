package minecraft;

import com.mojang.serialization.MapCodec;

public interface class04054<P extends class04025> {
   class04054<class04052> N = N("matching_blocks", class04052.N);
   class04054<class03191> y = N("matching_block_tag", class03191.R);
   class04054<class04041> L = N("matching_fluids", class04041.N);
   class04054<class03162> u = N("has_sturdy_face", class03162.N);
   class04054<class04311> i = N("solid", class04311.N);
   class04054<class04024> R = N("replaceable", class04024.N);
   class04054<class04048> M = N("would_survive", class04048.N);
   class04054<class04304> B = N("inside_world_bounds", class04304.N);
   class04054<class03317> Z = N("any_of", class03317.N);
   class04054<class03312> z = N("all_of", class03312.N);
   class04054<class04029> U = N("not", class04029.N);
   class04054<class04046> E = N("true", class04046.i);
   class04054<class02214> W = N("unobstructed", class02214.N);

   private static <P extends class04025> class04054<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.H, var0, () -> var1);
   }

   MapCodec<P> codec();
}
