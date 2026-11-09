package minecraft;

class class01313 extends class04762 {
   private static final int N = class03469.y + 1;
   private final class04778 y;
   private final class08593 L;

   @Override
   protected int L(long var1) {
      if (!this.y.N(var1)) {
         class04745 class04745 = this.y.y(var1);
         if (class04745 != null) {
            return class04745.z();
         }
      }

      return N;
   }

   public class01313(class04778 var1, class08593 var2) {
      super(N + 1, 16, 256);
      this.y = var1;
      this.L = var2;
      var2.N(this::y);
   }

   @Override
   protected int y(long var1) {
      return this.L.N(var1, false);
   }

   public int N(int var1) {
      return this.y(var1);
   }

   @Override
   protected void N(long var1, int var3) {
      class04745 class04745 = this.y.y(var1);
      int i = class04745 == null ? N : class04745.z();
      if (i != var3) {
         class04745 = this.y.N(var1, var3, class04745, i);
         if (class04745 != null) {
            this.y.u.add(class04745);
         }
      }
   }
}
