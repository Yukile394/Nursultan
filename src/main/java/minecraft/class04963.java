package minecraft;

public class class04963 extends class01463<class07478> {
   private static final class01894 N = class01894.y("textures/gui/container/hopper.png");

   public class04963(class07478 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3);
      this.Z = 133;
      this.W = this.Z - 94;
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = (this.field_22789 - this.B) / 2;
      int j = (this.field_22790 - this.Z) / 2;
      var1.N(class08394.Na, N, i, j, 0.0F, 0.0F, this.B, this.Z, 256, 256);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.a_(var1, var2, var3);
   }
}
