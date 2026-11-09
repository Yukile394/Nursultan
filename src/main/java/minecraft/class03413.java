package minecraft;

public class class03413 extends class03404 {
   private final class00392 y;

   public class03413(class03383 var1, class00392 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      int i = this.method_73385();
      int j = this.method_73389() - 8;
      int k = class03417.U(this.N.y).N(this.y);
      int l = (this.method_73380() + j - k) / 2;
      int i1 = i - 4;
      var1.y(class03417.W(this.N.y), this.y, l, i1, -6250336);
   }

   @Override
   public class00392 method_37006() {
      return this.y;
   }
}
