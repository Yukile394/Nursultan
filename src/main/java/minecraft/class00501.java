package minecraft;

import io.netty.buffer.ByteBuf;

public record class00501(class00392 reason) implements class00381<class01662> {
   public static final class02362<ByteBuf, class00501> N = class03748.R.N_10(class00501::new, class00501::N);

   public class00501(class00392 reason) {
      this.reason = reason;
   }

   public void method_65081(class01662 var1) {
      var1.N(this);
   }

   public class00392 N() {
      return this.reason;
   }

   @Override
   public class02897<class00501> method_65080() {
      return class02885.u;
   }
}
