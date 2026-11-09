package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class08625 implements class05033 {
   field_56014("cleared", 0),
   field_56015("running", 1),
   field_56016("finished", 2);

   private static final IntFunction<class08625> field_56019 = class02121.N(var0 -> var0.field_56021, values(), class02126.field_41664);
   public static final Codec<class08625> field_56017 = class05033.N(class08625::values);
   public static final class02362<ByteBuf, class08625> field_56018 = class02389.N(class08625::N, var0 -> var0.field_56021);
   private final String field_56020;
   private final int field_56021;

   private class08625(String var3, int var4) {
      this.field_56020 = var3;
      this.field_56021 = var4;
   }

   public static class08625 N(int var0) {
      return field_56019.apply(var0);
   }

   @Override
   public String method_15434() {
      return this.field_56020;
   }
}
