package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class00704 implements class05033 {
   field_41586(0, "creamy"),
   field_41587(1, "white"),
   field_41588(2, "brown"),
   field_41589(3, "gray");

   public static final class00704 field_57635 = field_41586;
   private static final IntFunction<class00704> field_41591 = class02121.N(class00704::N, values(), class02126.field_41666);
   public static final Codec<class00704> field_41590 = class05033.N(class00704::values);
   @Deprecated
   public static final Codec<class00704> field_56660 = Codec.INT.xmap(field_41591::apply, class00704::N);
   public static final class02362<ByteBuf, class00704> field_55971 = class02389.N(field_41591, class00704::N);
   final int field_41592;
   private final String field_41593;

   private class00704(int var3, String var4) {
      this.field_41592 = var3;
      this.field_41593 = var4;
   }

   public static class00704 N(int var0) {
      return field_41591.apply(var0);
   }

   public int N() {
      return this.field_41592;
   }

   @Override
   public String method_15434() {
      return this.field_41593;
   }
}
