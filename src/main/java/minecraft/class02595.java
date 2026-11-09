package minecraft;

public class class02595 {
   private final int N;
   private final class07586 y;
   private int L;
   private int u;

   public class02595(int var1, class07586 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class02595(int var1) {
      this(var1, class07586.u);
   }

   public float N(float var1) {
      float f = class04995.B(var1, this.u, this.L) / this.N;
      return this.y.apply(f);
   }

   public void N(boolean var1) {
      this.u = this.L;
      if (var1) {
         if (this.L < this.N) {
            this.L++;
         }
      } else if (this.L > 0) {
         this.L--;
      }
   }
}
