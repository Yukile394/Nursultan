package minecraft;

class class04728 extends class05362 {
   private static final class01894 y = class01894.y("widget/slot_frame");
   private static final int L = 60;
   private static final int u = 2;
   private static final int i = 56;
   private final class01894 R;

   class04728(class04736 var1, class01590 var2, class00392 var3, class01894 var4, class05361 var5) {
      super(0, 0, 60, 60 + 9, var3, var5, field_40754);
      this.N = var1;
      this.R = var4;
   }

   @Override
   public void method_75752(class01054 var1, int var2, int var3, float var4) {
      boolean flag = this.method_25367();
      int ix = -1;
      if (flag) {
         ix = class02566.N(1.0F, 0.56F, 0.56F, 0.56F);
      }

      int j = this.method_46426();
      int k = this.method_46427();
      var1.N(class08394.Na, this.R, j + 2, k + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, ix);
      var1.N(class08394.Na, y, j, k, 60, 60, ix);
      int l = flag ? -6250336 : -1;
      var1.N(class04736.y(this.N), this.method_25369(), j + 28, k - 14, l);
   }
}
