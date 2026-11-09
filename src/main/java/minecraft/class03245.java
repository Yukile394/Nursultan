package minecraft;

import java.util.List;

public class class03245 {
   private static final int N = 30;
   private static final int y = 16;
   private static final int L = 4;
   private final int u;
   private List<class01894> i = List.of();
   private int R;
   private int M;

   public class03245(int var1) {
      super();
      this.u = var1;
   }

   private float N(float var1) {
      return Math.min(this.R % 30 + var1, 4.0F) / 4.0F;
   }

   private void N(class06937 var1, class01894 var2, float var3, class01054 var4, int var5, int var6) {
      var4.N(class08394.Na, var2, var5 + var1.i, var6 + var1.R, 16, 16, class02566.y(var3));
   }

   public void N(class07482 var1, class01054 var2, float var3, int var4, int var5) {
      class06937 class06937 = var1.L(this.u);
      if (!this.i.isEmpty() && !class06937.R()) {
         float f = this.i.size() > 1 && this.R >= 30 ? this.N(var3) : 1.0F;
         if (f < 1.0F) {
            int ix = Math.floorMod(this.M - 1, this.i.size());
            this.N(class06937, this.i.get(ix), 1.0F - f, var2, var4, var5);
         }

         this.N(class06937, this.i.get(this.M), f, var2, var4, var5);
      }
   }

   public void N(List<class01894> var1) {
      if (!this.i.equals(var1)) {
         this.i = var1;
         this.M = 0;
      }

      if (!this.i.isEmpty() && ++this.R % 30 == 0) {
         this.M = (this.M + 1) % this.i.size();
      }
   }
}
