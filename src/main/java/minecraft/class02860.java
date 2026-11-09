package minecraft;

public class class02860 implements class00381<class07280> {
   public static final class02362<class00667, class02860> N = class00381.N(class02860::N, class02860::new);
   private final double y;
   private final double L;
   private final double u;
   private final double i;
   private final long R;
   private final int M;
   private final int B;
   private final int Z;

   public double L() {
      return this.i;
   }

   public long M() {
      return this.R;
   }

   private class02860(class00667 var1) {
      super();
      this.y = var1.readDouble();
      this.L = var1.readDouble();
      this.u = var1.readDouble();
      this.i = var1.readDouble();
      this.R = var1.W();
      this.M = var1.E();
      this.B = var1.E();
      this.Z = var1.E();
   }

   public class02860(class08057 var1) {
      super();
      this.y = var1.M();
      this.L = var1.B();
      this.u = var1.Z();
      this.i = var1.U();
      this.R = var1.z();
      this.M = var1.W();
      this.B = var1.b();
      this.Z = var1.T();
   }

   public int B() {
      return this.M;
   }

   public int Z() {
      return this.Z;
   }

   public int z() {
      return this.B;
   }

   public double u() {
      return this.u;
   }

   public double y() {
      return this.L;
   }

   public double N() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class00667 var1) {
      var1.writeDouble(this.y);
      var1.writeDouble(this.L);
      var1.writeDouble(this.u);
      var1.writeDouble(this.i);
      var1.N(this.R);
      var1.L(this.M);
      var1.L(this.B);
      var1.L(this.Z);
   }

   @Override
   public class02897<class02860> method_65080() {
      return class04248.X;
   }
}
