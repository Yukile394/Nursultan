package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

class class02390<T> implements class02362<ByteBuf, T> {
   class02390(IntFunction var1, ToIntFunction var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public T decode(ByteBuf var1) {
      int i = class01657.N(var1);
      return (T)this.N.apply(i);
   }

   public void encode(ByteBuf var1, T var2) {
      int i = this.y.applyAsInt(var2);
      class01657.N(var1, i);
   }
}
