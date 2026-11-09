package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class07463 implements class05033 {
   field_6328("add_value", 0),
   field_6330("add_multiplied_base", 1),
   field_6331("add_multiplied_total", 2);

   public static final IntFunction<class07463> field_48325 = class02121.N(class07463::N, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class07463> field_48326 = class02389.N(field_48325, class07463::N);
   public static final Codec<class07463> field_45742 = class05033.N(class07463::values);
   private final String field_45743;
   private final int field_6329;

   private class07463(String var3, int var4) {
      this.field_45743 = var3;
      this.field_6329 = var4;
   }

   public int N() {
      return this.field_6329;
   }

   @Override
   public String method_15434() {
      return this.field_45743;
   }
}
