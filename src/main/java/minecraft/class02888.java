package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Function;

class class02888<T, B> implements class00165<T, B> {
   class02888(class02896 var1, List var2, Object var3, class03276 var4, class04262 var5) {
      super();
      this.i = var1;
      this.N = var2;
      this.y = var3;
      this.L = var4;
      this.u = var5;
   }

   @Override
   public class04275<T> N(Function<ByteBuf, B> var1) {
      return new class02887(this.i.N, this.i.y, this.i.N(var1, this.N, this.y), this.L);
   }

   @Override
   public class04262 N() {
      return this.u;
   }
}
