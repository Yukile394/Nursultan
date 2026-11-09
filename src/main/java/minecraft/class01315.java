package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum class01315 {
   field_18197(0, "options.particles.all"),
   field_18198(1, "options.particles.decreased"),
   field_18199(2, "options.particles.minimal");

   private static final IntFunction<class01315> field_18200 = class02121.N(var0 -> var0.field_18201, values(), class02126.field_41665);
   public static final Codec<class01315> field_64259 = Codec.INT.xmap(field_18200::apply, var0 -> var0.field_18201);
   private final int field_18201;
   private final class00392 field_64260;

   private class01315(int var3, String var4) {
      this.field_18201 = var3;
      this.field_64260 = class00392.L(var4);
   }

   public class00392 N() {
      return this.field_64260;
   }
}
