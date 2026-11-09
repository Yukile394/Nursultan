package minecraft;

import org.jspecify.annotations.Nullable;

class class05139 extends class01854 {
   private static final class01894[] u = new class01894[]{
      class01894.y("notification/1"),
      class01894.y("notification/2"),
      class01894.y("notification/3"),
      class01894.y("notification/4"),
      class01894.y("notification/5"),
      class01894.y("notification/more")
   };
   private static final int i = Integer.MAX_VALUE;
   private static final int R = 20;
   private static final int M = 14;
   private int B;

   public class05139(class00392 var1, class01894 var2, class05361 var3, @Nullable class00392 var4) {
      super(20, 20, var1, 14, 14, new class01883(var2), var3, var4, null);
   }

   int y() {
      return this.B;
   }

   private void N(class01054 var1) {
      var1.N(class08394.Na, u[Math.min(this.B, 6) - 1], this.method_46426() + this.method_25368() - 5, this.method_46427() - 3, 8, 8);
   }

   public void N(int var1) {
      this.B = var1;
   }

   @Override
   public void method_75752(class01054 var1, int var2, int var3, float var4) {
      super.method_75752(var1, var2, var3, var4);
      if (this.field_22763 && this.B != 0) {
         this.N(var1);
      }
   }
}
