package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Function;

class class02882<T, B, C> implements class00160<T, B, C> {
   class02882(class02896 var1, List var2, class03276 var3, class04262 var4) {
      super();
      this.u = var1;
      this.N = var2;
      this.y = var3;
      this.L = var4;
   }

   @Override
   public class04275<T> N(Function<ByteBuf, B> var1, C var2) {
      return new class02887(this.u.N, this.u.y, this.u.N(var1, this.N, var2), this.y);
   }

   @Override
   public class04262 N() {
      return this.L;
   }
}
