package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.OptionalInt;

class class04543 implements class02362<ByteBuf, OptionalInt> {
   class04543() {
      super();
   }

   public OptionalInt decode(ByteBuf var1) {
      int i = class01657.N(var1);
      return i == 0 ? OptionalInt.empty() : OptionalInt.of(i - 1);
   }

   public void encode(ByteBuf var1, OptionalInt var2) {
      class01657.N(var1, var2.orElse(-1) + 1);
   }
}
