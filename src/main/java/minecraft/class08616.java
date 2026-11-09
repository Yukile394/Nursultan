package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class08616 {
   field_55920(0),
   field_55921(1),
   field_55922(2),
   field_55923(3),
   field_55924(4),
   field_55925(5),
   field_55926(6);

   private static final IntFunction<class08616> field_55928 = class02121.N(var0 -> var0.field_55929, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class08616> field_55927 = class02389.N(field_55928, var0 -> var0.field_55929);
   private final int field_55929;

   private class08616(int var3) {
      this.field_55929 = var3;
   }
}
