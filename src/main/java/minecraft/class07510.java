package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class07510 {
   field_7790(0),
   field_7794(1),
   field_7791(2),
   field_7796(3),
   field_7795(4),
   field_7789(5),
   field_7793(6);

   private static final IntFunction<class07510> field_58135 = class02121.N(class07510::N, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class07510> field_58134 = class02389.N(field_58135, class07510::N);
   private final int field_58136;

   private class07510(int var3) {
      this.field_58136 = var3;
   }

   public int N() {
      return this.field_58136;
   }
}
