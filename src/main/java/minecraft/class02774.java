package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class02774 implements class05033 {
   field_28704("unaffected"),
   field_28705("exposed"),
   field_28706("weathered"),
   field_28707("oxidized");

   public static final IntFunction<class02774> field_61431 = class02121.N(Enum::ordinal, values(), class02126.field_41666);
   public static final Codec<class02774> field_46493 = class05033.N(class02774::values);
   public static final class02362<ByteBuf, class02774> field_61432 = class02389.N(field_61431, Enum::ordinal);
   private final String field_46494;

   private class02774(String var3) {
      this.field_46494 = var3;
   }

   public class02774 y() {
      return field_61431.apply(this.ordinal() - 1);
   }

   public class02774 N() {
      return field_61431.apply(this.ordinal() + 1);
   }

   @Override
   public String method_15434() {
      return this.field_46494;
   }
}
