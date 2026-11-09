package minecraft;

public class class06005 extends class05362 {
   private static final class01894 N = class01894.y("widget/page_forward_highlighted");
   private static final class01894 y = class01894.y("widget/page_forward");
   private static final class01894 L = class01894.y("widget/page_backward_highlighted");
   private static final class01894 u = class01894.y("widget/page_backward");
   private static final class00392 i = class00392.L("book.page_button.next");
   private static final class00392 R = class00392.L("book.page_button.previous");
   private final boolean M;
   private final boolean B;

   @Override
   public boolean M() {
      return false;
   }

   public class06005(int var1, int var2, boolean var3, class05361 var4, boolean var5) {
      super(var1, var2, 23, 13, var3 ? i : R, var4, field_40754);
      this.M = var3;
      this.B = var5;
   }

   @Override
   public void method_75752(class01054 var1, int var2, int var3, float var4) {
      class01894 class01894;
      if (this.M) {
         class01894 = this.method_25367() ? N : y;
      } else {
         class01894 = this.method_25367() ? L : u;
      }

      var1.N(class08394.Na, class01894, this.method_46426(), this.method_46427(), 23, 13);
   }

   @Override
   public void method_25354(class09033 var1) {
      if (this.B) {
         var1.N(class00040.N(class04909.LV, 1.0F));
      }
   }
}
