package minecraft;

import io.netty.buffer.ByteBuf;

public record class02872(class01894 key, byte[] payload) implements class00381<class01662> {
   public static final class02362<class00667, class02872> N = class00381.N(class02872::N, class02872::new);
   private static final int i = 5120;
   public static final class02362<ByteBuf, byte[]> y = class02389.N(5120);

   private class02872(class00667 var1) {
      this(var1.T(), y.decode(var1));
   }

   public class02872(class01894 key, byte[] payload) {
      this.key = key;
      this.payload = payload;
   }

   public byte[] y() {
      return this.payload;
   }

   private void N(class00667 var1) {
      var1.N(this.key);
      y.encode(var1, this.payload);
   }

   public class01894 N() {
      return this.key;
   }

   public void method_65081(class01662 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class02872> method_65080() {
      return class02885.U;
   }
}
