package minecraft;

public class class03133 extends class01463<class01712> {
   private static final class01894 N = class01894.y("container/crafter/disabled_slot");
   private static final class01894 y = class01894.y("container/crafter/powered_redstone");
   private static final class01894 L = class01894.y("container/crafter/unpowered_redstone");
   private static final class01894 u = class01894.y("textures/gui/container/crafter.png");
   private static final class00392 n = class00392.L("gui.togglable_slot");
   private final class08036 t;

   public class03133(class01712 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3);
      this.t = var2.z;
   }

   private void y(int var1) {
      this.N(var1, false);
   }

   private void y(class01054 var1) {
      int i = this.field_22789 / 2 + 9;
      int j = this.field_22790 / 2 - 48;
      class01894 class01894;
      if (this.m.E()) {
         class01894 = y;
      } else {
         class01894 = L;
      }

      var1.N(class08394.Na, class01894, i, j, 16, 16);
   }

   private void N(class01054 var1, class01726 var2) {
      var1.N(class08394.Na, N, var2.i - 1, var2.R - 1, 18, 18);
   }

   @Override
   public void N(class01054 var1, class06937 var2, int var3, int var4) {
      if (var2 instanceof class01726 class01726) {
         if (this.m.N(var2.u)) {
            this.N(var1, class01726);
         } else {
            super.N(var1, var2, var3, var4);
         }

         int i = this.T + class01726.i - 2;
         int j = this.b + class01726.R - 2;
         if (var3 > i && var4 > j && var3 < i + 19 && var4 < j + 19) {
            var1.N(class06608.u);
         }
      } else {
         super.N(var1, var2, var3, var4);
      }
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = (this.field_22789 - this.B) / 2;
      int j = (this.field_22790 - this.Z) / 2;
      var1.N(class08394.Na, u, i, j, 0.0F, 0.0F, this.B, this.Z, 256, 256);
   }

   private void N(int var1) {
      this.N(var1, true);
   }

   @Override
   protected void N(class06937 var1, int var2, int var3, class07510 var4) {
      if (var1 instanceof class01726 && !var1.R() && !this.t.method_7325()) {
         switch (var4) {
            case field_7790:
               if (this.m.N(var2)) {
                  this.N(var2);
               } else if (this.m.M().R()) {
                  this.y(var2);
               }
               break;
            case field_7791:
               class06584 class06584 = this.t.method_31548().method_5438(var3);
               if (this.m.N(var2) && !class06584.R()) {
                  this.N(var2);
               }
         }
      }

      super.N(var1, var2, var3, var4);
   }

   private void N(int var1, boolean var2) {
      this.m.N(var1, var2);
      super.N(var1, this.m.b, var2);
      float f = var2 ? 1.0F : 0.75F;
      this.t.method_5783(class04909.OK.N(), 0.4F, f);
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.z = (this.B - this.field_22793.N(this.field_22785)) / 2;
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.y(var1);
      this.a_(var1, var2, var3);
      if (this.s instanceof class01726 && !this.m.N(this.s.u) && this.m.M().R() && !this.s.R() && !this.t.method_7325()) {
         var1.N(this.field_22793, n, var2, var3);
      }
   }
}
