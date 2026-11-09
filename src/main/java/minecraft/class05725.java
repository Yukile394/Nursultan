package minecraft;

public class class05725 extends class06308 {
   private static final class01894 N = class01894.y("widget/checkbox_selected_highlighted");
   private static final class01894 y = class01894.y("widget/checkbox_selected");
   private static final class01894 L = class01894.y("widget/checkbox_highlighted");
   private static final class01894 u = class01894.y("widget/checkbox");
   private static final int i = 4;
   private static final int R = 8;
   private boolean M;
   private final class05717 B;
   private final class04230 Z;

   class05725(int var1, int var2, int var3, class00392 var4, class01590 var5, boolean var6, class05717 var7) {
      super(var1, var2, 0, 0, var4);
      this.Z = new class04230(var4, var5);
      this.Z.y(2);
      this.field_22758 = this.N(var3, var5);
      this.field_22759 = this.y(var5);
      this.M = var6;
      this.B = var7;
   }

   public static class05686 y(class00392 var0, class01590 var1) {
      return new class05686(var0, var1);
   }

   private int y(class01590 var1) {
      return Math.max(N(var1), this.Z.method_25364());
   }

   public boolean y() {
      return this.M;
   }

   public int N(int var1, class01590 var2) {
      this.field_22758 = this.N(var1, this.method_25369(), var2);
      this.Z.N(this.field_22758);
      return this.field_22758;
   }

   public static int N(class01590 var0) {
      return 17;
   }

   static int N(class00392 var0, class01590 var1) {
      return N(var1) + 4 + var1.N(var0);
   }

   private int N(int var1, class00392 var2, class01590 var3) {
      return Math.min(N(var2, var3), var1);
   }

   @Override
   public void method_25306(class06611 var1) {
      this.M = !this.M;
      this.B.onValueChange(this, this.M);
   }

   @Override
   public void method_75752(class01054 var1, int var2, int var3, float var4) {
      class01590 class01590 = (class01590)class06202.Nq().i_3;
      class01894 class01894;
      if (this.M) {
         class01894 = this.method_25370() ? N : y;
      } else {
         class01894 = this.method_25370() ? L : u;
      }

      int ix = N(class01590);
      var1.N(class08394.Na, class01894, this.method_46426(), this.method_46427(), ix, ix, class02566.y(this.field_22765));
      int j = this.method_46426() + ix + 4;
      int k = this.method_46427() + ix / 2 - this.Z.method_25364() / 2;
      this.Z.y(j, k);
      this.Z.N(var1.N(this, class01065.N(this.method_49606())));
   }

   @Override
   public void method_47399(class03428 var1) {
      var1.N(class03457.field_33788, this.method_25360());
      if (this.field_22763) {
         if (this.method_25370()) {
            var1.N(class03457.field_33791, class00392.L(this.M ? "narration.checkbox.usage.focused.uncheck" : "narration.checkbox.usage.focused.check"));
         } else {
            var1.N(class03457.field_33791, class00392.L(this.M ? "narration.checkbox.usage.hovered.uncheck" : "narration.checkbox.usage.hovered.check"));
         }
      }
   }
}
