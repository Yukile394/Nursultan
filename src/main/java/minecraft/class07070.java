package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class07070 implements class05033 {
   field_6182(0, "left", "options.mainHand.left"),
   field_6183(1, "right", "options.mainHand.right");

   public static final Codec<class07070> field_45121 = class05033.N(class07070::values);
   private static final IntFunction<class07070> field_46166 = class02121.N(var0 -> var0.field_38385, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class07070> field_64359 = class02389.N(field_46166, var0 -> var0.field_38385);
   private final int field_38385;
   private final String field_6181;
   private final class00392 field_64360;

   private class07070(int var3, String var4, String var5) {
      this.field_38385 = var3;
      this.field_6181 = var4;
      this.field_64360 = class00392.L(var5);
   }

   public class00392 y() {
      return this.field_64360;
   }

   public class07070 N() {
      return switch (this) {
         case field_6182 -> field_6183;
         case field_6183 -> field_6182;
      };
   }

   @Override
   public String method_15434() {
      return this.field_6181;
   }
}
