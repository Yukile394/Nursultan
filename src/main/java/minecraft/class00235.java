package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class00235 implements class05033 {
   field_56024(0, "start"),
   field_56025(1, "log"),
   field_56026(2, "fail"),
   field_56027(3, "accept");

   private static final IntFunction<class00235> field_56030 = class02121.N(var0 -> var0.field_56031, values(), class02126.field_41664);
   public static final Codec<class00235> field_56028 = class05033.N(class00235::values);
   public static final class02362<ByteBuf, class00235> field_56029 = class02389.N(field_56030, var0 -> var0.field_56031);
   private final int field_56031;
   private final String field_56032;
   private final class00392 field_56033;
   private final class00392 field_56034;

   private class00235(int var3, String var4) {
      this.field_56031 = var3;
      this.field_56032 = var4;
      this.field_56033 = class00392.L("test_block.mode." + var4);
      this.field_56034 = class00392.L("test_block.mode_info." + var4);
   }

   public class00392 y() {
      return this.field_56034;
   }

   public class00392 N() {
      return this.field_56033;
   }

   @Override
   public String method_15434() {
      return this.field_56032;
   }
}
