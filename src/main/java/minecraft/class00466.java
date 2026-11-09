package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class00466 {
   field_62847(0, 1610678016),
   field_62848(1, 1610612991),
   field_62849(2, 1613968179);

   private static final IntFunction<class00466> field_62851 = class02121.N(var0 -> var0.field_62852, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class00466> field_62850 = class02389.N(field_62851, var0 -> var0.field_62852);
   private final int field_62852;
   private final int field_62853;

   private class00466(int var3, int var4) {
      this.field_62852 = var3;
      this.field_62853 = var4;
   }

   public int N() {
      return this.field_62853;
   }
}
