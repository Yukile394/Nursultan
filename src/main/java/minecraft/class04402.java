package minecraft;

public class class04402 extends class05362 {
   private final class01590 N;
   private final class00392 y;
   private final class00392 L;

   public class04402(int var1, int var2, int var3, int var4, class00392 var5, class05361 var6, class01590 var7) {
      super(var1, var2, var3, var4, var5, var6, field_40754);
      this.N = var7;
      this.y = var5;
      this.L = class00390.N(var5, class00405.N.L(true));
   }

   @Override
   public void method_75752(class01054 var1, int var2, int var3, float var4) {
      class00392 class00392 = this.method_25367() ? this.L : this.y;
      var1.y(this.N, class00392, this.method_46426(), this.method_46427(), 16777215 | class04995.u(this.field_22765 * 255.0F) << 24);
   }
}
