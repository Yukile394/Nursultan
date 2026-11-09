package minecraft;

import org.jspecify.annotations.Nullable;

public class class00509 implements class00381<class07280> {
   public static final class02362<class00667, class00509> N = class00381.N(class00509::N, class00509::new);
   private final int y;
   private final byte L;

   public class00509(class07049 var1, byte var2) {
      super();
      this.y = var1.method_5628();
      this.L = var2;
   }

   private class00509(class00667 var1) {
      super();
      this.y = var1.readInt();
      this.L = var1.readByte();
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Nullable
   public class07049 N(class07299 var1) {
      return var1.method_8469(this.y);
   }

   private void N(class00667 var1) {
      var1.writeInt(this.y);
      var1.writeByte(this.L);
   }

   public byte N() {
      return this.L;
   }

   @Override
   public class02897<class00509> method_65080() {
      return class04248.J;
   }
}
