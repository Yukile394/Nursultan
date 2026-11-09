package minecraft;

class class04738 extends class06318<class04718> {
   private static final int y = 36;

   public class04738(class04710 var1, int var2, int var3) {
      super(class06202.Nq(), var2, var3, var1.u.y(), 36);
      this.N = var1;
   }

   private void y(class04981 var1) {
      class04726 class04726 = new class04726(this.N);
      this.method_73370(class04726, class04726.N(9));

      for (class04730 class04730 : var1.Z.stream().map(var1x -> new class04730(this.N, var1x)).toList()) {
         this.method_25321(class04730);
      }
   }

   void N(class04981 var1) {
      this.method_25339();
      this.y(var1);
   }

   @Override
   public int method_25322() {
      return 300;
   }

   @Override
   protected void method_57715(class01054 var1) {
   }

   @Override
   protected void method_57713(class01054 var1) {
   }
}
