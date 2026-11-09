package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class08979 implements class05033 {
   field_61292("idle", 0),
   field_61293("getting_item", 1),
   field_61294("getting_no_item", 2),
   field_61295("dropping_item", 3),
   field_61296("dropping_no_item", 4);

   public static final Codec<class08979> field_61297 = class05033.N(class08979::values);
   private static final IntFunction<class08979> field_61299 = class02121.N(class08979::N, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class08979> field_61298 = class02389.N(field_61299, class08979::N);
   private final String field_61300;
   private final int field_61301;

   private class08979(String var3, int var4) {
      this.field_61300 = var3;
      this.field_61301 = var4;
   }

   private int N() {
      return this.field_61301;
   }

   @Override
   public String method_15434() {
      return this.field_61300;
   }
}
