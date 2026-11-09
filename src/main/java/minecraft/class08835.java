package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class class08835 {
   public static final class06333<class01894, MapCodec<? extends class08843>> N = new class06333<>();
   public static final Codec<class08843> y = N.N(class01894.N).dispatch(class08843::N, var0 -> var0);

   public class08835() {
      super();
   }

   public static void N() {
      N.N(class01894.y("custom_model_data"), class08818.N);
      N.N(class01894.y("constant"), class08834.N);
      N.N(class01894.y("dye"), class08840.N);
      N.N(class01894.y("grass"), class08832.N);
      N.N(class01894.y("firework"), class08821.N);
      N.N(class01894.y("potion"), class08811.N);
      N.N(class01894.y("map_color"), class08841.N);
      N.N(class01894.y("team"), class08358.N);
   }
}
