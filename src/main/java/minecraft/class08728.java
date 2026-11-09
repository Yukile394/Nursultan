package minecraft;

public final class class08728 {
   private int N;
   private int y;
   private int L;

   public class08728() {
      super();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof class08728 class08728) ? false : this.N == class08728.N && this.y == class08728.y && this.L == class08728.L;
      }
   }

   public class08728 y(class06889 var1, long var2) {
      this.N = N(var1.N(), class01296.y(var2));
      this.y = N(var1.y(), class01296.L(var2));
      this.L = N(var1.L(), class01296.u(var2));
      return this;
   }

   private static int N(double var0, int var2) {
      return class04995.N(class01296.y(var0) - var2, -1, 1);
   }

   public boolean N() {
      return this.N == 0 || this.y == 0 || this.L == 0;
   }

   public static class08728 N(class06889 var0, long var1) {
      return new class08728().y(var0, var1);
   }
}
