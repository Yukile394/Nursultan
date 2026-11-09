package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum class08027 {
   field_7538(0, "options.chat.visibility.full"),
   field_7539(1, "options.chat.visibility.system"),
   field_7536(2, "options.chat.visibility.hidden");

   private static final IntFunction<class08027> field_7534 = class02121.N(var0 -> var0.field_7535, values(), class02126.field_41665);
   public static final Codec<class08027> field_64374 = Codec.INT.xmap(field_7534::apply, var0 -> var0.field_7535);
   private final int field_7535;
   private final class00392 field_64375;

   private class08027(int var3, String var4) {
      this.field_7535 = var3;
      this.field_64375 = class00392.L(var4);
   }

   public class00392 N() {
      return this.field_64375;
   }
}
