package minecraft;

public class class05984 extends class00277<class07485> {
   private static final class01894 N = class01894.y("textures/gui/container/crafting_table.png");

   public class05984(class07485 var1, class08044 var2, class00392 var3) {
      super(var1, new class02411(var1), var2, var3);
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = this.T;
      int j = (this.field_22790 - this.Z) / 2;
      var1.N(class08394.Na, N, i, j, 0.0F, 0.0F, this.B, this.Z, 256, 256);
   }

   @Override
   protected class03283 N() {
      return new class03283(this.T + 5, this.field_22790 / 2 - 49);
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.z = 29;
   }
}
