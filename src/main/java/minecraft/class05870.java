package minecraft;

import org.jspecify.annotations.Nullable;

public class class05870 extends class01463<class06231> {
   private static final class01894 N = class01894.y("container/cartography_table/error");
   private static final class01894 y = class01894.y("container/cartography_table/scaled_map");
   private static final class01894 L = class01894.y("container/cartography_table/duplicated_map");
   private static final class01894 u = class01894.y("container/cartography_table/map");
   private static final class01894 n = class01894.y("container/cartography_table/locked");
   private static final class01894 t = class01894.y("textures/gui/container/cartography_table.png");
   private final class08270 G = new class08270();

   public class05870(class06231 var1, class08044 var2, class00392 var3) {
      super(var1, var2, var3);
      this.U -= 2;
   }

   private void N(class01054 var1, @Nullable class02265 var2, @Nullable class07769 var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      int i = this.T;
      int j = this.b;
      if (var5 && !var7) {
         var1.N(class08394.Na, y, i + 67, j + 13, 66, 66);
         this.N(var1, var2, var3, i + 85, j + 31, 0.226F);
      } else if (var4) {
         var1.N(class08394.Na, L, i + 67 + 16, j + 13, 50, 66);
         this.N(var1, var2, var3, i + 86, j + 16, 0.34F);
         var1.L();
         var1.N(class08394.Na, L, i + 67, j + 13 + 16, 50, 66);
         this.N(var1, var2, var3, i + 70, j + 32, 0.34F);
      } else if (var6) {
         var1.N(class08394.Na, u, i + 67, j + 13, 66, 66);
         this.N(var1, var2, var3, i + 71, j + 17, 0.45F);
         var1.N(class08394.Na, n, i + 118, j + 60, 10, 14);
      } else {
         var1.N(class08394.Na, u, i + 67, j + 13, 66, 66);
         this.N(var1, var2, var3, i + 71, j + 17, 0.45F);
      }
   }

   private void N(class01054 var1, @Nullable class02265 var2, @Nullable class07769 var3, int var4, int var5, float var6) {
      if (var2 != null && var3 != null) {
         var1.i().pushMatrix();
         var1.i().translate(var4, var5);
         var1.i().scale(var6, var6);
         this.field_22787.yR().N(var2, var3, this.G);
         var1.N(this.G);
         var1.i().popMatrix();
      }
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = this.T;
      int j = this.b;
      var1.N(class08394.Na, t, i, j, 0.0F, 0.0F, this.B, this.Z, 256, 256);
      class06584 class06584 = this.m.L(1).i();
      boolean flag = class06584.N(class06570.Gt);
      boolean flag1 = class06584.N(class06570.jk);
      boolean flag2 = class06584.N(class06570.Mg);
      class02265 class02265 = this.m.L(0).i().method_58694(class02484.f);
      boolean flag3 = false;
      class07769 class07769;
      if (class02265 != null) {
         class07769 = class06548.N(class02265, (class03448)this.field_22787.T_3);
         if (class07769 != null) {
            if (class07769.Z) {
               flag3 = true;
               if (flag1 || flag2) {
                  var1.N(class08394.Na, N, i + 35, j + 31, 28, 21);
               }
            }

            if (flag1 && class07769.M >= 4) {
               flag3 = true;
               var1.N(class08394.Na, N, i + 35, j + 31, 28, 21);
            }
         }
      } else {
         class07769 = null;
      }

      this.N(var1, class02265, class07769, flag, flag1, flag2, flag3);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.a_(var1, var2, var3);
   }
}
