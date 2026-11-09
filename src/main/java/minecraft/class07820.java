package minecraft;

import java.security.PublicKey;

public class class07820 implements class00381<class07844> {
   public static final class02362<class00667, class07820> N = class00381.N(class07820::N, class07820::new);
   private final String y;
   private final byte[] L;
   private final byte[] u;
   private final boolean i;

   public byte[] L() {
      return this.u;
   }

   public class07820(String var1, byte[] var2, byte[] var3, boolean var4) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
   }

   private class07820(class00667 var1) {
      super();
      this.y = var1.u(20);
      this.L = var1.y();
      this.u = var1.y();
      this.i = var1.readBoolean();
   }

   public boolean u() {
      return this.i;
   }

   public PublicKey y() throws class05449 {
      return class01222.N(this.L);
   }

   private void N(class00667 var1) {
      var1.N(this.y);
      var1.N(this.L);
      var1.N(this.u);
      var1.writeBoolean(this.i);
   }

   public String N() {
      return this.y;
   }

   public void method_65081(class07844 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class07820> method_65080() {
      return class04271.L;
   }
}
