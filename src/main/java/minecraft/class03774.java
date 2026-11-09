package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class03774 implements class05033 {
   field_40242(0, "food"),
   field_40243(1, "blocks"),
   field_40244(2, "misc");

   private static final IntFunction<class03774> field_54632 = class02121.N(var0 -> var0.field_54633, values(), class02126.field_41664);
   public static final Codec<class03774> field_40245 = class05033.N(class03774::values);
   public static final class02362<ByteBuf, class03774> field_54631 = class02389.N(field_54632, var0 -> var0.field_54633);
   private final int field_54633;
   private final String field_40246;

   private class03774(int var3, String var4) {
      this.field_54633 = var3;
      this.field_40246 = var4;
   }

   @Override
   public String method_15434() {
      return this.field_40246;
   }
}
