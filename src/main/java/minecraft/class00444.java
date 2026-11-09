package minecraft;

import io.netty.buffer.ByteBuf;

public record class00444(class07209 absolutePos, class07209 relativePos) implements class00381<class07280> {
   public static final class02362<ByteBuf, class00444> N = class02362.N(
      class07209.field_48404, class00444::N, class07209.field_48404, class00444::y, class00444::new
   );

   public class00444(class07209 absolutePos, class07209 relativePos) {
      super();
      this.absolutePos = absolutePos;
      this.relativePos = relativePos;
   }

   public class07209 y() {
      return this.relativePos;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class07209 N() {
      return this.absolutePos;
   }

   @Override
   public class02897<class00444> method_65080() {
      return class04248.e;
   }
}
