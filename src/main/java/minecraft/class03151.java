package minecraft;

import java.util.List;

public class class03151 {
   public static final class05946<class04336> N = class03170.N("seagrass_warm");
   public static final class05946<class04336> y = class03170.N("seagrass_normal");
   public static final class05946<class04336> L = class03170.N("seagrass_cold");
   public static final class05946<class04336> u = class03170.N("seagrass_river");
   public static final class05946<class04336> i = class03170.N("seagrass_swamp");
   public static final class05946<class04336> R = class03170.N("seagrass_deep_warm");
   public static final class05946<class04336> M = class03170.N("seagrass_deep");
   public static final class05946<class04336> B = class03170.N("seagrass_deep_cold");
   public static final class05946<class04336> Z = class03170.N("sea_pickle");
   public static final class05946<class04336> z = class03170.N("kelp_cold");
   public static final class05946<class04336> U = class03170.N("kelp_warm");
   public static final class05946<class04336> E = class03170.N("warm_ocean_vegetation");

   public class03151() {
      super();
   }

   private static List<class04297> N(int var0) {
      return List.of(class01039.y(), class03170.L, class04321.N(var0), class04294.y());
   }

   public static void N(class04116<class04336> var0) {
      class02055 class02055 = var0.N(class04227.Nh);
      class03529 class03529xxxxxx = class02055.y(class03157.N);
      class03529 class03529x = class02055.y(class03157.y);
      class03529 class03529xx = class02055.y(class03157.L);
      class03529 class03529xxx = class02055.y(class03157.u);
      class03529 class03529xxxx = class02055.y(class03157.i);
      class03529 class03529xxxxx = class02055.y(class03157.R);
      class03529 class03529xxxxxx = class02055.y(class03157.M);
      class03170.N(var0, N, class03529xxxxxx, N(80));
      class03170.N(var0, y, class03529xxxxxx, N(48));
      class03170.N(var0, L, class03529xxxxxx, N(32));
      class03170.N(var0, u, class03529x, N(48));
      class03170.N(var0, i, class03529xx, N(64));
      class03170.N(var0, R, class03529xxx, N(80));
      class03170.N(var0, M, class03529xxx, N(48));
      class03170.N(var0, B, class03529xxx, N(40));
      class03170.N(var0, Z, class03529xxxx, class04331.N(16), class01039.y(), class03170.L, class04294.y());
      class03170.N(var0, z, class03529xxxxx, class01600.N(120, 80.0, 0.0), class01039.y(), class03170.L, class04294.y());
      class03170.N(var0, U, class03529xxxxx, class01600.N(80, 80.0, 0.0), class01039.y(), class03170.L, class04294.y());
      class03170.N(var0, E, class03529xxxxxx, class01600.N(20, 400.0, 0.0), class01039.y(), class03170.L, class04294.y());
   }
}
