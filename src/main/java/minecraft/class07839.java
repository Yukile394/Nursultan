package minecraft;

import io.netty.buffer.ByteBuf;

public class class07839 implements class00381<class01646> {
   public static final class02362<ByteBuf, class07839> N = class00381.N(class07839::N, class07839::new);
   private final long y;

   public class07839(long var1) {
      super();
      this.y = var1;
   }

   private class07839(ByteBuf var1) {
      super();
      this.y = var1.readLong();
   }

   public void method_65081(class01646 var1) {
      var1.method_12697(this);
   }

   private void N(ByteBuf var1) {
      var1.writeLong(this.y);
   }

   public long N() {
      return this.y;
   }

   @Override
   public class02897<class07839> method_65080() {
      return class04250.y;
   }
}
