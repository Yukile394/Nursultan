package minecraft;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

public class class07827 implements class00381<class07845> {
   public static final class02362<class00667, class07827> N = class00381.N(class07827::N, class07827::new);
   private final byte[] y;
   private final byte[] L;

   public class07827(SecretKey var1, PublicKey var2, byte[] var3) throws class05449 {
      super();
      this.y = class01222.N(var2, var1.getEncoded());
      this.L = class01222.N(var2, var3);
   }

   private class07827(class00667 var1) {
      super();
      this.y = var1.y();
      this.L = var1.y();
   }

   public void method_65081(class07845 var1) {
      var1.N(this);
   }

   public SecretKey N(PrivateKey var1) throws class05449 {
      return class01222.N(var1, this.y);
   }

   private void N(class00667 var1) {
      var1.N(this.y);
      var1.N(this.L);
   }

   public boolean N(byte[] var1, PrivateKey var2) {
      try {
         return Arrays.equals(var1, class01222.y(var2, this.L));
      } catch (class05449 class05449) {
         return false;
      }
   }

   @Override
   public class02897<class07827> method_65080() {
      return class04271.B;
   }
}
