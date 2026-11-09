package minecraft;

public class class02160 implements class00381<class07280> {
   public static final class02362<class00667, class02160> N = class00381.N(class02160::N, class02160::new);
   private final double y;
   private final double L;
   private final long u;

   public long L() {
      return this.u;
   }

   public class02160(class08057 var1) {
      super();
      this.y = var1.Z();
      this.L = var1.U();
      this.u = var1.z();
   }

   private class02160(class00667 var1) {
      super();
      this.y = var1.readDouble();
      this.L = var1.readDouble();
      this.u = var1.W();
   }

   public double y() {
      return this.L;
   }

   private void N(class00667 var1) {
      var1.writeDouble(this.y);
      var1.writeDouble(this.L);
      var1.N(this.u);
   }

   public double N() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class02160> method_65080() {
      return class04248.NY;
   }
}
