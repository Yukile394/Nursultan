package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class class08913 {
   public static final class06333<class01894, MapCodec<? extends class08895>> N = new class06333<>();
   public static final Codec<class08895> y = N.N(class01894.N).dispatch(class08895::method_65585, var0 -> var0);

   public class08913() {
      super();
   }

   public static void N() {
      N.N(class01894.y("empty"), class08374.N);
      N.N(class01894.y("model"), class08845.N);
      N.N(class01894.y("range_dispatch"), class08920.N);
      N.N(class01894.y("special"), class08922.N);
      N.N(class01894.y("composite"), class08904.N);
      N.N(class01894.y("bundle/selected_item"), class08830.N);
      N.N(class01894.y("select"), class08932.N);
      N.N(class01894.y("condition"), class08927.N);
   }
}
