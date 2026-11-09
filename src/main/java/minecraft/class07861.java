package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class07861 implements class05033 {
   field_52470("small", 0, 0.5F),
   field_52471("medium", 1, 1.0F),
   field_52472("large", 2, 1.5F);

   public static final class07861 field_57618 = field_52471;
   public static final class05031<class07861> field_52473 = class05033.N(class07861::values);
   static final IntFunction<class07861> field_55008 = class02121.N(class07861::N, values(), class02126.field_41666);
   public static final class02362<ByteBuf, class07861> field_55967 = class02389.N(field_55008, class07861::N);
   private final String field_52474;
   final int field_55009;
   final float field_53975;

   private class07861(String var3, int var4, float var5) {
      this.field_52474 = var3;
      this.field_55009 = var4;
      this.field_53975 = var5;
   }

   int N() {
      return this.field_55009;
   }

   @Override
   public String method_15434() {
      return this.field_52474;
   }
}
