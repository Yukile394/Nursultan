package minecraft;

public class class03567 extends class06466 {
   private static final class01883 N = new class01883(
      class01894.y("widget/tab_selected"), class01894.y("widget/tab"), class01894.y("widget/tab_selected_highlighted"), class01894.y("widget/tab_highlighted")
   );
   private static final int y = 3;
   private static final int L = 1;
   private static final int u = 1;
   private static final int i = 4;
   private static final int R = 2;
   private final class03271 M;
   private final class03241 B;

   public boolean L() {
      return this.M.N() == this.B;
   }

   public class03567(class03271 var1, class03241 var2, int var3, int var4) {
      super(0, 0, var3, var4, var2.method_48610());
      this.M = var1;
      this.B = var2;
   }

   public class03241 y() {
      return this.B;
   }

   private void N(class00580 var1) {
      int ix = this.method_46426() + 1;
      int j = this.method_46427() + (this.L() ? 0 : 3);
      int k = this.method_46426() + this.method_25368() - 1;
      int l = this.method_46427() + this.method_25364();
      var1.N(this.method_25369(), ix, k, j, l);
   }

   protected void N(class01054 var1, int var2, int var3, int var4, int var5) {
      class05096.method_57737(var1, class05096.field_49511, var2, var3, 0.0F, 0.0F, var4 - var2, var5 - var3);
   }

   private void N(class01054 var1, class01590 var2, int var3) {
      int ix = Math.min(var2.N(this.method_25369()), this.method_25368() - 4);
      int j = this.method_46426() + (this.method_25368() - ix) / 2;
      int k = this.method_46427() + this.method_25364() - 2;
      var1.N(j, k, j + ix, k + 1, var3);
   }

   @Override
   protected void method_47399(class03428 var1) {
      var1.N(class03457.field_33788, class00392.N("gui.narrate.tab", this.B.method_48610()));
      var1.N(class03457.field_33790, this.B.method_71245());
   }

   @Override
   public void method_25354(class09033 var1) {
   }

   @Override
   public void method_48579(class01054 var1, int var2, int var3, float var4) {
      var1.N(class08394.Na, N.N(this.L(), this.method_25367()), this.method_46426(), this.method_46427(), this.field_22758, this.field_22759);
      class01590 class01590 = (class01590)class06202.Nq().i_3;
      int ix = this.field_22763 ? -1 : -6250336;
      if (this.L()) {
         this.N(var1, this.method_46426() + 2, this.method_46427() + 2, this.method_55442() - 2, this.method_55443());
         this.N(var1, class01590, ix);
      }

      this.N(var1.N(this, class01065.field_63850));
      this.method_76256(var1);
   }
}
