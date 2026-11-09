package minecraft;

public class class01304 extends class05096 {
   private static final int N = 90;
   private final class00392 y;
   private class05482 L = class05482.N;
   private final Runnable u;
   private final class00392 i;
   private final boolean R;

   public class01304(Runnable var1, class00392 var2, class00392 var3) {
      this(var1, var2, var3, class05220.U, true);
   }

   public class01304(Runnable var1, class00392 var2, class00392 var3, class00392 var4, boolean var5) {
      super(var2);
      this.u = var1;
      this.y = var3;
      this.i = var4;
      this.R = var5;
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.L = class05482.N(this.field_22793, this.y, this.field_22789 - 50);
      int ix = this.L.N() * 9;
      int j = class04995.N(90 + ix + 12, this.field_22790 / 6 + 96, this.field_22790 - 24);
      short short1 = 150;
      this.method_37063(class05362.method_46430(this.i, var1x -> this.u.run()).N((this.field_22789 - 150) / 2, j, 150, 20).N());
   }

   @Override
   public boolean method_25422() {
      return this.R;
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      class00580 class00580 = var1.B();
      var1.N(this.field_22793, this.field_22785, this.field_22789 / 2, 70, -1);
      this.L.N(class00937.field_62010, this.field_22789 / 2, 90, 9, class00580);
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(super.method_25435(), this.y);
   }
}
