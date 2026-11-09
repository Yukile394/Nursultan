package minecraft;

import com.mojang.serialization.MapCodec;

public interface class04323<P extends class04297> {
   class04323<class04033> N = N("block_predicate_filter", class04033.N);
   class04323<class04331> y = N("rarity_filter", class04331.N);
   class04323<class01811> L = N("surface_relative_threshold_filter", class01811.N);
   class04323<class02564> u = N("surface_water_depth_filter", class02564.N);
   class04323<class04294> i = N("biome", class04294.N);
   class04323<class04321> R = N("count", class04321.N);
   class04323<class01600> M = N("noise_based_count", class01600.N);
   class04323<class06413> B = N("noise_threshold_count", class06413.N);
   class04323<class01006> Z = N("count_on_every_layer", class01006.N);
   class04323<class04296> z = N("environment_scan", class04296.N);
   class04323<class02405> U = N("heightmap", class02405.N);
   class04323<class04308> E = N("height_range", class04308.N);
   class04323<class01039> W = N("in_square", class01039.N);
   class04323<class03016> m = N("random_offset", class03016.N);
   class04323<class02589> P = N("fixed_placement", class02589.N);

   private static <P extends class04297> class04323<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.A, var0, () -> var1);
   }

   MapCodec<P> codec();
}
