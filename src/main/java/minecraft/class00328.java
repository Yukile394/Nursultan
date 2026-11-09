package minecraft;

import io.netty.buffer.ByteBuf;

public record class00328(class07209 pos, boolean includeData) implements class00381<class08051> {
   public static final class02362<ByteBuf, class00328> N = class02362.N(class07209.field_48404, class00328::N, class02389.y, class00328::y, class00328::new);

   public class00328(class07209 pos, boolean includeData) {
      super();
      this.pos = pos;
      this.includeData = includeData;
   }

   public boolean y() {
      return this.includeData;
   }

   public void method_65081(class08051 var1) {
      var1.method_65085(this);
   }

   public class07209 N() {
      return this.pos;
   }

   @Override
   public class02897<class00328> method_65080() {
      return class04248.yS;
   }
}
