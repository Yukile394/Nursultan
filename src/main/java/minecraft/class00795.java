package minecraft;

import net.irisshaders.iris.uniforms.BiomeUniforms;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class00795 {
   public static final class05946<class00780> N = N("the_void");
   public static final class05946<class00780> y = N("plains");
   public static final class05946<class00780> L = N("sunflower_plains");
   public static final class05946<class00780> u = N("snowy_plains");
   public static final class05946<class00780> i = N("ice_spikes");
   public static final class05946<class00780> R = N("desert");
   public static final class05946<class00780> M = N("swamp");
   public static final class05946<class00780> B = N("mangrove_swamp");
   public static final class05946<class00780> Z = N("forest");
   public static final class05946<class00780> z = N("flower_forest");
   public static final class05946<class00780> U = N("birch_forest");
   public static final class05946<class00780> E = N("dark_forest");
   public static final class05946<class00780> W = N("pale_garden");
   public static final class05946<class00780> m = N("old_growth_birch_forest");
   public static final class05946<class00780> P = N("old_growth_pine_taiga");
   public static final class05946<class00780> s = N("old_growth_spruce_taiga");
   public static final class05946<class00780> T = N("taiga");
   public static final class05946<class00780> b = N("snowy_taiga");
   public static final class05946<class00780> j = N("savanna");
   public static final class05946<class00780> v = N("savanna_plateau");
   public static final class05946<class00780> n = N("windswept_hills");
   public static final class05946<class00780> t = N("windswept_gravelly_hills");
   public static final class05946<class00780> G = N("windswept_forest");
   public static final class05946<class00780> l = N("windswept_savanna");
   public static final class05946<class00780> d = N("jungle");
   public static final class05946<class00780> w = N("sparse_jungle");
   public static final class05946<class00780> k = N("bamboo_jungle");
   public static final class05946<class00780> Y = N("badlands");
   public static final class05946<class00780> Q = N("eroded_badlands");
   public static final class05946<class00780> O = N("wooded_badlands");
   public static final class05946<class00780> g = N("meadow");
   public static final class05946<class00780> I = N("cherry_grove");
   public static final class05946<class00780> J = N("grove");
   public static final class05946<class00780> o = N("snowy_slopes");
   public static final class05946<class00780> q = N("frozen_peaks");
   public static final class05946<class00780> K = N("jagged_peaks");
   public static final class05946<class00780> V = N("stony_peaks");
   public static final class05946<class00780> e = N("river");
   public static final class05946<class00780> H = N("frozen_river");
   public static final class05946<class00780> c = N("beach");
   public static final class05946<class00780> X = N("snowy_beach");
   public static final class05946<class00780> a = N("stony_shore");
   public static final class05946<class00780> p = N("warm_ocean");
   public static final class05946<class00780> F = N("lukewarm_ocean");
   public static final class05946<class00780> A = N("deep_lukewarm_ocean");
   public static final class05946<class00780> f = N("ocean");
   public static final class05946<class00780> C = N("deep_ocean");
   public static final class05946<class00780> S = N("cold_ocean");
   public static final class05946<class00780> x = N("deep_cold_ocean");
   public static final class05946<class00780> D = N("frozen_ocean");
   public static final class05946<class00780> h = N("deep_frozen_ocean");
   public static final class05946<class00780> r = N("mushroom_fields");
   public static final class05946<class00780> NN = N("dripstone_caves");
   public static final class05946<class00780> Ny = N("lush_caves");
   public static final class05946<class00780> NL = N("deep_dark");
   public static final class05946<class00780> Nu = N("nether_wastes");
   public static final class05946<class00780> Ni = N("warped_forest");
   public static final class05946<class00780> NR = N("crimson_forest");
   public static final class05946<class00780> NM = N("soul_sand_valley");
   public static final class05946<class00780> NB = N("basalt_deltas");
   public static final class05946<class00780> NZ = N("the_end");
   public static final class05946<class00780> Nz = N("end_highlands");
   public static final class05946<class00780> NU = N("end_midlands");
   public static final class05946<class00780> NE = N("small_end_islands");
   public static final class05946<class00780> NW = N("end_barrens");
   private static int Nm = 0;

   public class00795() {
      super();
   }

   private static class05946<class00780> N(String var0) {
      class05946 class05946x;
      class05946 class05946x = class05946x = class05946.N(class04227.NA, class01894.y(var0));
      N(var0, new CallbackInfoReturnable("", false, class05946x));
      return class05946x;
   }

   private static void N(String var0, CallbackInfoReturnable var1) {
      BiomeUniforms.getBiomeMap().put((class05946)var1.getReturnValue(), Nm++);
   }
}
