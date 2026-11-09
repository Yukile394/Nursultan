package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class01972 {
   field_42665(0),
   field_42666(1),
   field_42667(2),
   field_42668(3),
   field_42669(4),
   field_42670(5),
   field_42671(6);

   public static final IntFunction<class01972> field_48340 = class02121.N(class01972::N, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class01972> field_48341 = class02389.N(field_48340, class01972::N);
   private final int field_48342;

   private class01972(int var3) {
      this.field_48342 = var3;
   }

   public int N() {
      return this.field_48342;
   }
}
