package minecraft;

import io.netty.buffer.ByteBuf;

public record class06664(int slot) implements class00381<class07280> {
   public static final class02362<ByteBuf, class06664> N = class02362.N(class02389.B, class06664::N, class06664::new);

   public class06664(int slot) {
      this.slot = slot;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.slot;
   }

   @Override
   public class02897<class06664> method_65080() {
      return class04248.Np;
   }
}
