package minecraft;

class class03790 extends class05096 {
   private static final class00392 L = class00392.L("selectWorld.experimental.details.title");
   final class03686 N;
   private class03763 u;

   class03790(class03779 var1) {
      super(L);
      this.y = var1;
      this.N = new class03686(this);
   }

   @Override
   public void method_25426() {
      this.N.N(L, this.field_22793);
      this.u = this.N.L(new class03763(this, this.field_22787, this.y.N));
      this.N.y(class05362.method_46430(class05220.U, var1 -> this.method_25419()).N());
      this.N.method_48206(var1 -> {
         class06478 class06478 = this.method_37063(var1);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      if (this.u != null) {
         this.u.method_57712(this.field_22789, this.N);
      }

      this.N.N();
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.y);
   }
}
