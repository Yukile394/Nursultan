package minecraft;

public class class05969 extends class05096 {
   private class05482 N;
   private final Runnable y;
   private final Runnable L;

   public class05969(Runnable var1, Runnable var2) {
      super(class00392.L("datapackFailure.title"));
      this.N = class05482.N;
      this.y = var1;
      this.L = var2;
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.N = class05482.N(this.field_22793, this.method_25440(), this.field_22789 - 50);
      this.method_37063(
         class05362.method_46430(class00392.L("datapackFailure.safeMode"), var1 -> this.L.run())
            .N(this.field_22789 / 2 - 155, this.field_22790 / 6 + 96, 150, 20)
            .N()
      );
      this.method_37063(class05362.method_46430(class05220.U, var1 -> this.y.run()).N(this.field_22789 / 2 - 155 + 160, this.field_22790 / 6 + 96, 150, 20).N());
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      class00580 class00580 = var1.B();
      this.N.N(class00937.field_62010, this.field_22789 / 2, 70, 9, class00580);
   }
}
