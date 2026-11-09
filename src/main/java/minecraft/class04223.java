package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.client.rendering.SpriteSourcesAccessor;

@Environment(EnvType.CLIENT)
public class class04223 implements SpriteSourcesAccessor {
   private static final class06333<class01894, MapCodec<? extends class04233>> L = new class06333<>();
   public static final Codec<class04233> N = L.N(class01894.N).dispatch(class04233::N, var0 -> var0);
   public static final Codec<List<class04233>> y = N.listOf().fieldOf("sources").codec();

   public class04223() {
      super();
   }

   public static void N() {
      L.N(class01894.y("single"), class04216.y);
      L.N(class01894.y("directory"), class04221.y);
      L.N(class01894.y("filter"), class04219.y);
      L.N(class01894.y("unstitch"), class04234.L);
      L.N(class01894.y("paletted_permutations"), class03266.u);
   }
}
