package minecraft;

public class class05907 extends class01463<class07489> {
   private static final class01894 N = class01894.y("container/brewing_stand/fuel_length");
   private static final class01894 y = class01894.y("container/brewing_stand/brew_progress");
   private static final class01894 L = class01894.y("container/brewing_stand/bubbles");
   private static final class01894 u = class01894.y("textures/gui/container/brewing_stand.png");
   private static final int[] n = new int[]{29, 24, 20, 16, 11, 6, 0};

   public class05907(class07489 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = (this.field_22789 - this.B) / 2;
      int j = (this.field_22790 - this.Z) / 2;
      var1.N(class08394.Na, u, i, j, 0.0F, 0.0F, this.B, this.Z, 256, 256);
      int k = this.m.E();
      int l = class04995.N((18 * k + 20 - 1) / 20, 0, 18);
      if (l > 0) {
         var1.N(class08394.Na, N, 18, 4, 0, 0, i + 60, j + 44, l, 4);
      }

      int i1 = this.m.W();
      if (i1 > 0) {
         int j1 = (int)(28.0F * (1.0F - i1 / 400.0F));
         if (j1 > 0) {
            var1.N(class08394.Na, y, 9, 28, 0, 0, i + 97, j + 16, 9, j1);
         }

         j1 = n[i1 / 2 % 7];
         if (j1 > 0) {
            var1.N(class08394.Na, L, 12, 29, 0, 29 - j1, i + 63, j + 14 + 29 - j1, 12, j1);
         }
      }
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
