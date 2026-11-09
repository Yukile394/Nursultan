package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;

public enum class03679 implements class05033 {
   field_42406((byte)0, "fixed"),
   field_42407((byte)1, "vertical"),
   field_42408((byte)2, "horizontal"),
   field_42409((byte)3, "center");

   public static final Codec<class03679> field_42410 = class05033.N(class03679::values);
   public static final IntFunction<class03679> field_42411 = class02121.N(class03679::N, values(), class02126.field_41664);
   private final byte field_42412;
   private final String field_42413;

   private class03679(byte var3, String var4) {
      this.field_42413 = var4;
      this.field_42412 = var3;
   }

   byte N() {
      return this.field_42412;
   }

   @Override
   public String method_15434() {
      return this.field_42413;
   }
}
