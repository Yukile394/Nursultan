package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;

enum class00039 {
   field_59613(class00016::L),
   field_59614(class00016::N),
   field_59615(class00016::y);

   final BiConsumer<class00005, class00037> field_59618;
   public static final IntFunction<class00039> field_59616 = class02121.N(Enum::ordinal, values(), class02126.field_41665);
   public static final class02362<ByteBuf, class00039> field_59617 = class02389.N(field_59616, Enum::ordinal);

   private class00039(BiConsumer<class00005, class00037> var3) {
      this.field_59618 = var3;
   }
}
