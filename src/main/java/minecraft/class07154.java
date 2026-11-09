package minecraft;

class class07154 extends class07999 {
   public class07154(class07141 var1) {
      super(var1, 1.0, true);
   }

   @Override
   public boolean y() {
      if (this.N.method_5718() >= 0.5F && this.N.method_59922().y(100) == 0) {
         this.N.y(null);
         return false;
      } else {
         return super.y();
      }
   }

   @Override
   public boolean N() {
      return super.N() && !this.N.method_5782();
   }
}
