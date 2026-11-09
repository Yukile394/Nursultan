package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class05289 implements class05033 {
   field_23816(0, "white"),
   field_23817(1, "creamy"),
   field_23818(2, "chestnut"),
   field_23819(3, "brown"),
   field_23820(4, "black"),
   field_23821(5, "gray"),
   field_23822(6, "dark_brown");

   public static final Codec<class05289> field_41595 = class05033.N(class05289::values);
   private static final IntFunction<class05289> field_23823 = class02121.N(class05289::N, values(), class02126.field_41665);
   public static final class02362<ByteBuf, class05289> field_55972 = class02389.N(field_23823, class05289::N);
   private final int field_23824;
   private final String field_41596;

   private class05289(int var3, String var4) {
      this.field_23824 = var3;
      this.field_41596 = var4;
   }

   public static class05289 N(int var0) {
      return field_23823.apply(var0);
   }

   public int N() {
      return this.field_23824;
   }

   @Override
   public String method_15434() {
      return this.field_41596;
   }
}
