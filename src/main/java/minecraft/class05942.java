package minecraft;

public class class05942 extends class05978 {
   private static final class00392 N = class00392.L("selectWorld.loading_list");
   private final class06202 y;

   public class05942(class06202 var1) {
      super();
      this.y = var1;
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      int i = (((class05096)this.y.v_3).field_22789 - ((class01590)this.y.i_3).N(N)) / 2;
      int j = this.method_73382() + (this.method_73384() - 9) / 2;
      var1.y((class01590)this.y.i_3, N, i, j, -1);
      String s = class04452.N(class07536.L());
      int k = (((class05096)this.y.v_3).field_22789 - ((class01590)this.y.i_3).y(s)) / 2;
      int l = j + 9;
      var1.y((class01590)this.y.i_3, s, k, l, -8355712);
   }

   @Override
   public class00392 method_37006() {
      return N;
   }
}
