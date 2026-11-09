package minecraft;

public class class07265 implements class00381<class07280> {
   public static final class02362<class00667, class07265> N = class00381.N(class07265::N, class07265::new);
   private final int y;
   private final class07209 L;
   private final int u;

   public int L() {
      return this.u;
   }

   public class07265(int var1, class07209 var2, int var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   private class07265(class00667 var1) {
      super();
      this.y = var1.E();
      this.L = var1.i();
      this.u = var1.readUnsignedByte();
   }

   public class07209 y() {
      return this.L;
   }

   private void N(class00667 var1) {
      var1.L(this.y);
      var1.N(this.L);
      var1.writeByte(this.u);
   }

   public int N() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class07265> method_65080() {
      return class04248.M;
   }
}
