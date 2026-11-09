package minecraft;

class class07887 extends class07989 {
   @Override
   public void L() {
      super.L();
      if (this.N.method_6109()) {
         this.M();
         this.u();
      }
   }

   public class07887(class07869 var1) {
      super(var1);
      this.N = var1;
   }

   @Override
   protected void N(class07079 var1, class07438 var2) {
      if (var1 instanceof class07869 && !var1.method_6109()) {
         super.N(var1, var2);
      }
   }
}
