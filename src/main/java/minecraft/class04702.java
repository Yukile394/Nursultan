package minecraft;

public class class04702 extends class05407 {
   private static final class00392 N = class00392.L("mco.errorMessage.generic");
   private final class05096 y;
   private final class00392 L;
   private class05482 u = class05482.N;

   private class04702(class04737 var1, class05096 var2) {
      super(var1.N());
      this.y = var2;
      this.L = class00390.N(var1.y(), class00405.N.N(-2142128));
   }

   public class04702(class00392 var1, class00392 var2, class05096 var3) {
      this(new class04737(var1, var2), var3);
   }

   public class04702(class00392 var1, class05096 var2) {
      this(new class04737(N, var1), var2);
   }

   public class04702(class05097 var1, class05096 var2) {
      this(class04737.N(var1), var2);
   }

   @Override
   public void method_25426() {
      this.method_37063(class05362.method_46430(class05220.B, var1 -> this.method_25419()).N(this.field_22789 / 2 - 100, this.field_22790 - 52, 200, 20).N());
      this.u = class05482.N(this.field_22793, this.L, this.field_22789 * 3 / 4);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 80, -1);
      class00580 class00580 = var1.B();
      this.u.N(class00937.field_62010, this.field_22789 / 2, 100, 9, class00580);
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.y);
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(super.method_25435(), this.L);
   }
}
