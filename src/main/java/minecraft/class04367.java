package minecraft;

import com.mojang.serialization.MapCodec;

public interface class04367<S extends class04748> {
   class04367<class04338> N = N("buried_treasure", class04338.N);
   class04367<class06382> y = N("desert_pyramid", class06382.N);
   class04367<class06387> L = N("end_city", class06387.N);
   class04367<class06218> u = N("fortress", (MapCodec<class06218>)class06218.N_1);
   class04367<class01574> i = N("igloo", class01574.N);
   class04367<class01017> R = N("jigsaw", class01017.Z);
   class04367<class01541> M = N("jungle_temple", class01541.N);
   class04367<class06196> B = N("mineshaft", class06196.N);
   class04367<class05983> Z = N("nether_fossil", class05983.N);
   class04367<class06198> z = N("ocean_monument", class06198.N);
   class04367<class04906> U = N("ocean_ruin", class04906.N);
   class04367<class05053> E = N("ruined_portal", class05053.N);
   class04367<class05592> W = N("shipwreck", class05592.N);
   class04367<class04776> m = N("stronghold", class04776.N);
   class04367<class04769> P = N("swamp_hut", class04769.N);
   class04367<class04761> s = N("woodland_mansion", class04761.N);

   private static <S extends class04748> class04367<S> N(String var0, MapCodec<S> var1) {
      return class00751.N(class04206.F, var0, () -> var1);
   }

   MapCodec<S> codec();
}
