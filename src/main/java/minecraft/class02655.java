package minecraft;

public class class02655 implements class00381<class07280> {
   public static final class02362<class00667, class02655> N = class00381.N(class02655::N, class02655::new);
   private final int y;
   private final double L;

   public class02655(int var1, double var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   private class02655(class00667 var1) {
      super();
      this.y = var1.E();
      this.L = var1.readDouble();
   }

   public double y() {
      return this.L;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.y;
   }

   private void N(class00667 var1) {
      var1.L(this.y);
      var1.writeDouble(this.L);
   }

   @Override
   public class02897<class02655> method_65080() {
      return class04248.yP;
   }
}
