package minecraft;

public record class03897(class03909 type, class03877 wrapped) implements class03894 {
   public class03897(class03909 type, class03877 wrapped) {
      this.type = type;
      this.wrapped = wrapped;
   }

   @Override
   public class03909 i() {
      return this.type;
   }

   @Override
   public class03877 u() {
      return this.wrapped;
   }

   @Override
   public double y() {
      return this.wrapped.y();
   }

   @Override
   public double N() {
      return this.wrapped.N();
   }

   @Override
   public void N(double[] var1, class03912 var2) {
      this.wrapped.N(var1, var2);
   }

   @Override
   public double N(class03875 var1) {
      return this.wrapped.N(var1);
   }
}
