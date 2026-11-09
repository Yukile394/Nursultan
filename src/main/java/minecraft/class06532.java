package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum class06532 {
   field_64663(0, "options.textureFiltering.none"),
   field_64664(1, "options.textureFiltering.rgss"),
   field_64665(2, "options.textureFiltering.anisotropic");

   private static final IntFunction<class06532> field_64667 = class02121.N(var0 -> var0.field_64668, values(), class02126.field_41665);
   public static final Codec<class06532> field_64666 = Codec.INT.xmap(field_64667::apply, var0 -> var0.field_64668);
   private final int field_64668;
   private final class00392 field_64669;

   private class06532(int var3, String var4) {
      this.field_64668 = var3;
      this.field_64669 = class00392.L(var4);
   }

   public class00392 N() {
      return this.field_64669;
   }
}
