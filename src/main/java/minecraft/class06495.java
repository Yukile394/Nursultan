package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class06495 implements class05033 {
   field_8906(0, "common", class06541.field_1068),
   field_8907(1, "uncommon", class06541.field_1054),
   field_8903(2, "rare", class06541.field_1075),
   field_8904(3, "epic", class06541.field_1076);

   public static final Codec<class06495> field_50001 = class05033.y(class06495::values);
   public static final IntFunction<class06495> field_50002 = class02121.N(var0 -> var0.field_50004, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class06495> field_50003 = class02389.N(field_50002, var0 -> var0.field_50004);
   private final int field_50004;
   private final String field_50005;
   private final class06541 field_8908;

   private class06495(int var3, String var4, class06541 var5) {
      this.field_50004 = var3;
      this.field_50005 = var4;
      this.field_8908 = var5;
   }

   public class06541 N() {
      return this.field_8908;
   }

   @Override
   public String method_15434() {
      return this.field_50005;
   }
}
