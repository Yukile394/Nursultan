package minecraft;

public class class06433 {
   final int N;
   public final class06433[] y = new class06433[6];
   public final boolean[] L = new boolean[6];
   public boolean u;
   boolean i;
   private int R;

   public int L() {
      int ix = 0;

      for (int j = 0; j < 6; j++) {
         if (this.L[j]) {
            ix++;
         }
      }

      return ix;
   }

   public class06433(int var1) {
      super();
      this.N = var1;
   }

   public boolean y() {
      return this.N >= 75;
   }

   public boolean N(int var1) {
      if (this.i) {
         return true;
      } else {
         this.R = var1;

         for (int ix = 0; ix < 6; ix++) {
            if (this.y[ix] != null && this.L[ix] && this.y[ix].R != var1 && this.y[ix].N(var1)) {
               return true;
            }
         }

         return false;
      }
   }

   public void N() {
      for (int ix = 0; ix < 6; ix++) {
         this.L[ix] = this.y[ix] != null;
      }
   }

   public void N(class07211 var1, class06433 var2) {
      this.y[var1.L()] = var2;
      var2.y[var1.b().L()] = this;
   }
}
