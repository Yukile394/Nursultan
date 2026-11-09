package minecraft;

public class class08810 extends class08800 {
   public final class08898 y = new class08898();
   public int L;
   public int u;

   public class08810() {
      super();
   }

   public static int N(int var0) {
      if (var0 <= 1) {
         return 1;
      } else if (var0 <= 16) {
         return 2;
      } else if (var0 <= 32) {
         return 3;
      } else {
         return var0 <= 48 ? 4 : 5;
      }
   }

   public static int N(class06584 var0) {
      return var0.R() ? 187 : class06581.N(var0.B()) + var0.P();
   }

   public void N(class07049 var1, class06584 var2, class08943 var3) {
      var3.N(this.y, var2, class03662.field_4318, var1);
      this.L = N(var2.c());
      this.u = N(var2);
   }
}
