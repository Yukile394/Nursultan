package minecraft;

class class03632 implements class01187 {
   private final class01190 y;
   private final int L;

   public class03632(class03630 var1, class01190 var2, int var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public int y() {
      return this.L;
   }

   @Override
   public class01190 N() {
      return this.y;
   }

   @Override
   public boolean N(class04782 var1, class03556<class01194> var2, class01164 var3, class06889 var4) {
      if (var2.N(class01194.g)) {
         this.N.N(class07209.method_49638(var4), true);
         return true;
      } else if (var2.N(class01194.I)) {
         this.N.N(class07209.method_49638(var4), false);
         return true;
      } else {
         return false;
      }
   }
}
