package minecraft;

class class04616 extends class05699<class04616> {
   private final class04907<class01894> y;
   private final class00392 L;

   class04616(class04907<class01894> var1, class04907 var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = class00392.L(class04610.N(var2));
   }

   private String N() {
      return this.y.N(this.N.N.B.N(this.y));
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      int i = this.method_73385() - 4;
      int j = this.N.method_25396().indexOf(this) % 2 == 0 ? -1 : -4539718;
      var1.y(class04610.y(this.N.N), this.L, this.method_73380() + 2, i, j);
      String s = this.N();
      var1.y(class04610.L(this.N.N), s, this.method_73389() - class04610.u(this.N.N).y(s) - 4, i, j);
   }

   @Override
   public class00392 method_37006() {
      return class00392.N("narrator.select", class00392.i().y(this.L).y(class05220.l).i(this.N()));
   }
}
