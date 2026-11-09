package minecraft;

import io.netty.buffer.ByteBuf;

public record class00927(String codeOfConduct) implements class00381<class01656> {
   public static final class02362<ByteBuf, class00927> N = class02362.N(class02389.s, class00927::N, class00927::new);

   public class00927(String codeOfConduct) {
      this.codeOfConduct = codeOfConduct;
   }

   public void method_65081(class01656 var1) {
      var1.N(this);
   }

   public String N() {
      return this.codeOfConduct;
   }

   @Override
   public class02897<class00927> method_65080() {
      return class02867.N;
   }
}
