package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum class01825 {
   field_34788(0, "options.prioritizeChunkUpdates.none"),
   field_34789(1, "options.prioritizeChunkUpdates.byPlayer"),
   field_34790(2, "options.prioritizeChunkUpdates.nearby");

   private static final IntFunction<class01825> field_64425 = class02121.N(var0 -> var0.field_34792, values(), class02126.field_41665);
   public static final Codec<class01825> field_64424 = Codec.INT.xmap(field_64425::apply, var0 -> var0.field_34792);
   private final int field_34792;
   private final class00392 field_64426;

   private class01825(int var3, String var4) {
      this.field_34792 = var3;
      this.field_64426 = class00392.L(var4);
   }

   public class00392 N() {
      return this.field_64426;
   }
}
