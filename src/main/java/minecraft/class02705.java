package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class02705 {
   field_49353(0),
   field_49354(1);

   public static final IntFunction<class02705> field_49355 = class02121.N(class02705::N, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class02705> field_49356 = class02389.N(field_49355, class02705::N);
   private final int field_49357;

   private class02705(int var3) {
      this.field_49357 = var3;
   }

   public int N() {
      return this.field_49357;
   }
}
