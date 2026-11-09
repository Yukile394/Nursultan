package minecraft;

public class class01529 extends class01463<class07502> {
   private static final class01894 N = class01894.y("textures/gui/container/dispenser.png");

   public class01529(class07502 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = (this.field_22789 - this.B) / 2;
      int j = (this.field_22790 - this.Z) / 2;
      var1.N(class08394.Na, N, i, j, 0.0F, 0.0F, this.B, this.Z, 256, 256);
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.z = (this.B - this.field_22793.N(this.field_22785)) / 2;
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.a_(var1, var2, var3);
   }
}
