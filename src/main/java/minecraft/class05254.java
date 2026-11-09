package minecraft;

public class class05254 extends class01463<class05262> {
   private static final class01894 N = class01894.y("container/grindstone/error");
   private static final class01894 y = class01894.y("textures/gui/container/grindstone.png");

   public class05254(class05262 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = (this.field_22789 - this.B) / 2;
      int j = (this.field_22790 - this.Z) / 2;
      var1.N(class08394.Na, y, i, j, 0.0F, 0.0F, this.B, this.Z, 256, 256);
      if ((this.m.L(0).R() || this.m.L(1).R()) && !this.m.L(2).R()) {
         var1.N(class08394.Na, N, i + 92, j + 31, 28, 21);
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.a_(var1, var2, var3);
   }
}
