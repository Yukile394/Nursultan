package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum class01307 {
   field_18151(0, "options.off"),
   field_18152(1, "options.attack.crosshair"),
   field_18153(2, "options.attack.hotbar");

   private static final IntFunction<class01307> field_64419 = class02121.N(var0 -> var0.field_18155, values(), class02126.field_41665);
   public static final Codec<class01307> field_64418 = Codec.INT.xmap(field_64419::apply, var0 -> var0.field_18155);
   private final int field_18155;
   private final class00392 field_64420;

   private class01307(int var3, String var4) {
      this.field_18155 = var3;
      this.field_64420 = class00392.L(var4);
   }

   public class00392 N() {
      return this.field_64420;
   }
}
