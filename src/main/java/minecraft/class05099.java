package minecraft;

import org.jspecify.annotations.Nullable;

public class class05099 extends class05362 {
   private static final class01894 R = class01894.y("widget/slot_frame");
   public static final class01894 N = class01894.y("textures/gui/realms/empty_frame.png");
   public static final class01894 y = class01894.y("textures/gui/title/background/panorama_0.png");
   public static final class01894 L = class01894.y("textures/gui/title/background/panorama_2.png");
   public static final class01894 u = class01894.y("textures/gui/title/background/panorama_3.png");
   private static final class00392 M = class00392.L("mco.configure.world.slot.tooltip.minigame");
   private static final class00392 B = class00392.L("mco.configure.world.slot.tooltip");
   static final class00392 i = class00392.L("mco.worldSlot.minigame");
   private static final int Z = 64;
   private static final String z = "...";
   private final int U;
   private class05119 E;

   public class05099(int var1, int var2, int var3, int var4, int var5, class04981 var6, class05361 var7) {
      super(var1, var2, var3, var4, class05220.N, var7, field_40754);
      this.U = var5;
      this.E = this.N(var6);
   }

   public class05119 y() {
      return this.E;
   }

   static class05110 N(boolean var0, boolean var1, boolean var2) {
      return var0 || var1 && var2 ? class05110.field_19678 : class05110.field_19679;
   }

   private void N(class05119 var1, @Nullable String var2) {
      class00392 class00392 = switch (var1.B) {
         case field_19679 -> var1.M ? M : B;
         default -> null;
      };
      if (class00392 != null) {
         this.method_47400(class04141.N(class00392));
      }

      class05216 class05216 = class00392.y(var1.N);
      if (var1.M && var2 != null) {
         class05216 = class05216.y(class05220.l).i(var2);
      }

      this.method_25355(class05216);
   }

   public class05119 N(class04981 var1) {
      this.E = new class05119(var1, this.U);
      this.N(this.E, var1.b);
      return this.E;
   }

   @Override
   public boolean method_37303() {
      return this.E.B != class05110.field_19678 && super.method_37303();
   }

   @Override
   public void method_75752(class01054 var1, int var2, int var3, float var4) {
      int ix = this.method_46426();
      int j = this.method_46427();
      boolean flag = this.method_25367();
      class01894 class01894;
      if (this.E.M) {
         class01894 = class04602.N(String.valueOf(this.E.u), this.E.i);
      } else if (this.E.R) {
         class01894 = N;
      } else if (this.E.i != null && this.E.u != -1L) {
         class01894 = class04602.N(String.valueOf(this.E.u), this.E.i);
      } else if (this.U == 1) {
         class01894 = y;
      } else if (this.U == 2) {
         class01894 = L;
      } else if (this.U == 3) {
         class01894 = u;
      } else {
         class01894 = N;
      }

      int k = -1;
      if (!this.E.z) {
         k = class02566.N(1.0F, 0.56F, 0.56F, 0.56F);
      }

      var1.N(class08394.Na, class01894, ix + 1, j + 1, 0.0F, 0.0F, this.field_22758 - 2, this.field_22759 - 2, 74, 74, 74, 74, k);
      if (flag && this.E.B != class05110.field_19678) {
         var1.N(class08394.Na, R, ix, j, this.field_22758, this.field_22759);
      } else if (this.E.z) {
         var1.N(class08394.Na, R, ix, j, this.field_22758, this.field_22759, class02566.N(1.0F, 0.8F, 0.8F, 0.8F));
      } else {
         var1.N(class08394.Na, R, ix, j, this.field_22758, this.field_22759, class02566.N(1.0F, 0.56F, 0.56F, 0.56F));
      }

      if (this.E.Z) {
         var1.N(class08394.Na, class05685.M, ix + 3, j + 4, 9, 8);
      }

      class01590 class01590 = (class01590)class06202.Nq().i_3;
      String s = this.E.N;
      if (class01590.y(s) > 64) {
         s = class01590.N(s, 64 - class01590.y("...")) + "...";
      }

      var1.N(class01590, s, ix + this.field_22758 / 2, j + this.field_22759 - 14, -1);
      if (this.E.z) {
         var1.N(class01590, class05685.N(this.E.y, this.E.L.N()), ix + this.field_22758 / 2, j + this.field_22759 + 2, -1);
      }
   }
}
