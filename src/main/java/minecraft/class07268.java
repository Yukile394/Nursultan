package minecraft;

public class class07268 implements class00381<class07280> {
   public static final class02362<class00667, class07268> N = class00381.N(class07268::N, class07268::new);
   public static final int y = 0;
   public static final int L = 2;
   public static final int u = 3;
   public static final int i = 4;
   public static final int R = 5;
   private final int M;
   private final int B;

   public class07268(class07049 var1, int var2) {
      super();
      this.M = var1.method_5628();
      this.B = var2;
   }

   private class07268(class00667 var1) {
      super();
      this.M = var1.E();
      this.B = var1.readUnsignedByte();
   }

   public int y() {
      return this.B;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.M;
   }

   private void N(class00667 var1) {
      var1.L(this.M);
      var1.writeByte(this.B);
   }

   @Override
   public class02897<class07268> method_65080() {
      return class04248.u;
   }
}
