package minecraft;

class class04217 {
   private final int N;
   private final class01885 y;
   private final class05216 L = class00392.i();

   public class04217(int var1) {
      super();
      this.N = var1;
      this.y = class01885.u();
      this.y.L().N();
      this.y.N(class02057.N(var1));
   }

   public void y(class01590 var1, class00392 var2) {
      this.y.N(new class04230(var2, var1).N(this.N - 64).N(true), var0 -> var0.y().R(32));
      this.L.y(var2).i("\n");
   }

   public class04229 N() {
      this.y.N();
      return new class04229(this.y, this.L);
   }

   public void N(int var1) {
      this.y.N(class02057.y(var1));
   }

   public void N(class01590 var1, class00392 var2, int var3) {
      this.y.N(new class04230(var2, var1).N(this.N), var1x -> var1x.i(var3));
      this.L.y(var2).i("\n");
   }

   public void N(class01590 var1, class00392 var2) {
      this.N(var1, var2, 0);
   }
}
