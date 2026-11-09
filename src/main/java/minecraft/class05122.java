package minecraft;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class class05122 extends class05407 {
   protected BooleanConsumer N;
   private final class00392 y;
   private final class00392 L;

   public class05122(BooleanConsumer var1, class00392 var2, class00392 var3) {
      super(class05153.N);
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public void method_25426() {
      this.method_37063(class05362.method_46430(class05220.R, var1 -> this.N.accept(true)).N(this.field_22789 / 2 - 105, N(9), 100, 20).N());
      this.method_37063(class05362.method_46430(class05220.M, var1 -> this.N.accept(false)).N(this.field_22789 / 2 + 5, N(9), 100, 20).N());
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.field_22793, this.y, this.field_22789 / 2, N(3), -1);
      var1.N(this.field_22793, this.L, this.field_22789 / 2, N(5), -1);
   }
}
