package minecraft;

import Nursultan.class11284;
import Nursultan.class11305;

public class class06026 extends class01463<class07490> {
   private static final class01894 N = class01894.y("textures/gui/container/generic_54.png");
   private final int y;
   private class11284 L;
   private class11284 u;
   private class11284 n;

   public class06026(class07490 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3);
      short short1 = 222;
      byte b0 = 114;
      this.y = var1.W();
      this.Z = 114 + this.y * 18;
      this.W = this.Z - 94;
   }

   @Override
   protected void u() {
      super.u();
      this.N();
   }

   private void N() {
      this.u.field_22763 = this.L.field_22763 = !class11305.N(this.m);
      this.n.field_22763 = !class11305.y(this.m);
      this.L.N();
      this.u.N();
      this.n.N();
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = (this.field_22789 - this.B) / 2;
      int j = (this.field_22790 - this.Z) / 2;
      var1.N(class08394.Na, N, i, j, 0.0F, 0.0F, this.B, this.y * 18 + 17, 256, 256);
      var1.N(class08394.Na, N, i, j + this.y * 18 + 17, 0.0F, 126.0F, this.B, 96, 256, 256);
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.method_37063(this.L = class11305.L(this.m, this.field_22789, this.field_22790, this.B, this.Z));
      this.method_37063(this.u = class11305.N(this.m, this.field_22789, this.field_22790, this.B, this.Z));
      this.method_37063(this.n = class11305.y(this.m, this.field_22789, this.field_22790, this.B, this.Z));
      this.N();
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.a_(var1, var2, var3);
   }
}
