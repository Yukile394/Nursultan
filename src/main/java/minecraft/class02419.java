package minecraft;

import org.joml.Vector2i;

public class class02419 {
   private double N;
   private double y;

   public class02419() {
      super();
   }

   public Vector2i N(double var1, double var3) {
      if (this.N != 0.0 && Math.signum(var1) != Math.signum(this.N)) {
         this.N = 0.0;
      }

      if (this.y != 0.0 && Math.signum(var3) != Math.signum(this.y)) {
         this.y = 0.0;
      }

      this.N += var1;
      this.y += var3;
      int i = (int)this.N;
      int j = (int)this.y;
      if (i == 0 && j == 0) {
         return new Vector2i(0, 0);
      } else {
         this.N -= i;
         this.y -= j;
         return new Vector2i(i, j);
      }
   }

   public static int N(double var0, int var2, int var3) {
      int i = (int)Math.signum(var0);
      var2 -= i;
      var2 = Math.max(-1, var2);

      while (var2 < 0) {
         var2 += var3;
      }

      while (var2 >= var3) {
         var2 -= var3;
      }

      return var2;
   }
}
