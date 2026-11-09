package minecraft;

import Nursultan.class11031;
import Nursultan.class11284;
import Nursultan.class11305;

public class class01341 extends class01463<class06922> {
   private static final class01894 N = class01894.y("textures/gui/container/shulker_box.png");
   private class11284 y;
   private class11284 L;
   private class11284 u;

   public class01341(class06922 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3);
      this.Z++;
   }

   @Override
   protected void u() {
      super.u();
      this.N();
   }

   private void N() {
      this.L.field_22763 = this.y.field_22763 = !class11305.y(this.m);
      this.u.field_22763 = !class11305.N(this.m);
      this.y.N();
      this.L.N();
      this.u.N();
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
      this.y = class11305.y(this.m, this.field_22789, this.field_22790, this.B, this.Z);
      this.L = class11305.L(this.m, this.field_22789, this.field_22790, this.B, this.Z);
      this.u = class11305.N(this.m, this.field_22789, this.field_22790, this.B, this.Z);
      if (!(this instanceof class11031)) {
         this.method_37063(this.y);
         this.method_37063(this.L);
         this.method_37063(this.u);
         this.N();
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.a_(var1, var2, var3);
   }
}
