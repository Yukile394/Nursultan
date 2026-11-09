package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class08155 implements class05033 {
   field_63398(0, "none"),
   field_63399(1, "whack"),
   field_63400(2, "stab");

   private static final IntFunction<class08155> field_63403 = class02121.N(class08155::N, values(), class02126.field_41664);
   public static final Codec<class08155> field_63401 = class05033.N(class08155::values);
   public static final class02362<ByteBuf, class08155> field_63402 = class02389.N(field_63403, class08155::N);
   private final int field_63404;
   private final String field_63405;

   private class08155(int var3, String var4) {
      this.field_63404 = var3;
      this.field_63405 = var4;
   }

   public int N() {
      return this.field_63404;
   }

   @Override
   public String method_15434() {
      return this.field_63405;
   }
}
