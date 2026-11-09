package minecraft;

public class class07358 implements class00381<class08051> {
   public static final class02362<class00667, class07358> N = class00381.N(class07358::N, class07358::new);
   private static final int y = 1;
   private static final int L = 2;
   private static final int u = 4;
   private final class07209 i;
   private final String R;
   private final boolean M;
   private final boolean B;
   private final boolean Z;
   private final class00384 z;

   public boolean L() {
      return this.M;
   }

   public boolean M() {
      return this.Z;
   }

   public class07358(class07209 var1, String var2, class00384 var3, boolean var4, boolean var5, boolean var6) {
      super();
      this.i = var1;
      this.R = var2;
      this.M = var4;
      this.B = var5;
      this.Z = var6;
      this.z = var3;
   }

   private class07358(class00667 var1) {
      super();
      this.i = var1.i();
      this.R = var1.s();
      this.z = var1.y(class00384.class);
      byte b0 = var1.readByte();
      this.M = (b0 & 1) != 0;
      this.B = (b0 & 2) != 0;
      this.Z = (b0 & 4) != 0;
   }

   public class00384 B() {
      return this.z;
   }

   public boolean u() {
      return this.B;
   }

   public String y() {
      return this.R;
   }

   public class07209 N() {
      return this.i;
   }

   private void N(class00667 var1) {
      var1.N(this.i);
      var1.N(this.R);
      var1.N((Enum<?>)this.z);
      byte b0 = 0;
      if (this.M) {
         b0 |= 1;
      }

      if (this.B) {
         b0 |= 2;
      }

      if (this.Z) {
         b0 |= 4;
      }

      var1.writeByte(b0);
   }

   public void method_65081(class08051 var1) {
      var1.method_12077(this);
   }

   @Override
   public class02897<class07358> method_65080() {
      return class04248.LU;
   }
}
