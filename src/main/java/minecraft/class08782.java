package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class08782 implements class05033 {
   field_60962(0, "close"),
   field_60963(1, "none"),
   field_60964(2, "wait_for_response");

   public static final IntFunction<class08782> field_60965 = class02121.N(var0 -> var0.field_60968, values(), class02126.field_41664);
   public static final class05031<class08782> field_60966 = class05033.N(class08782::values);
   public static final class02362<ByteBuf, class08782> field_60967 = class02389.N(field_60965, var0 -> var0.field_60968);
   private final int field_60968;
   private final String field_60969;

   private class08782(int var3, String var4) {
      this.field_60968 = var3;
      this.field_60969 = var4;
   }

   public boolean N() {
      return this == field_60962 || this == field_60964;
   }

   @Override
   public String method_15434() {
      return this.field_60969;
   }
}
