package minecraft;

public class class03722 {
   private static final int N = 49;
   private static final int y = 3;
   private double L = 2000000.0;
   private int u = 1;
   private volatile long i = class07536.u();

   public class03722() {
      super();
   }

   public float y() {
      return (float)(7000000.0 / this.L);
   }

   public void N() {
      this.i = class07536.u();
   }

   public void N(int var1) {
      if (var1 > 0) {
         double d0 = class04995.N((double)(class07536.u() - this.i) / var1, this.L / 3.0, this.L * 3.0);
         this.L = (this.L * this.u + d0) / (this.u + 1);
         this.u = Math.min(49, this.u + 1);
      }
   }
}
