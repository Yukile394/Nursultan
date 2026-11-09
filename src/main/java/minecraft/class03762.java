package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class03762 implements class05033 {
   field_40248("building", 0),
   field_40249("redstone", 1),
   field_40250("equipment", 2),
   field_40251("misc", 3);

   public static final Codec<class03762> field_40252 = class05033.N(class03762::values);
   public static final IntFunction<class03762> field_48352 = class02121.N(class03762::N, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class03762> field_48353 = class02389.N(field_48352, class03762::N);
   private final String field_40253;
   private final int field_48354;

   private class03762(String var3, int var4) {
      this.field_40253 = var3;
      this.field_48354 = var4;
   }

   private int N() {
      return this.field_48354;
   }

   @Override
   public String method_15434() {
      return this.field_40253;
   }
}
