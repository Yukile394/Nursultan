package minecraft;

public class class02309 implements class00381<class07280> {
   public static final class02362<class00667, class02309> N = class00381.N(class02309::N, class02309::new);
   private final double y;
   private final double L;

   public class02309(class08057 var1) {
      super();
      this.y = var1.M();
      this.L = var1.B();
   }

   private class02309(class00667 var1) {
      super();
      this.y = var1.readDouble();
      this.L = var1.readDouble();
   }

   public double y() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public double N() {
      return this.L;
   }

   private void N(class00667 var1) {
      var1.writeDouble(this.y);
      var1.writeDouble(this.L);
   }

   @Override
   public class02897<class02309> method_65080() {
      return class04248.Nk;
   }
}
