package minecraft;

class class05106 extends class05096 {
   private static final class00392 y = class00392.L("menu.feedback.title");
   public final class05096 N;
   private final class03686 L = new class03686(this);

   protected class05106(class05096 var1) {
      super(y);
      this.N = var1;
   }

   @Override
   public void method_25426() {
      this.L.N(y, this.field_22793);
      class02060 class02060 = this.L.L(new class02060());
      class02060.L().N(4, 4, 4, 0);
      class02080 class02080 = class02060.u(2);
      class05123.N(this, class02080);
      this.L.y(class05362.method_46430(class05220.U, var1x -> this.method_25419()).N(200).N());
      this.L.method_48206(this::method_37063);
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.L.N();
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.N);
   }
}
