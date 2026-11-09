package minecraft;

import java.util.Arrays;

public class class02765 {
   public static final int N = 64;
   private static final int y = 63;
   private final class02753[] L = new class02753[64];
   private int u = -1;

   public class02765() {
      super();
      Arrays.fill(this.L, new class02753(0.0, 0.0F));
   }

   public class02753 N(int var1, float var2) {
      class02753 class02753x = this.N(var1);
      class02753 class02753x = this.N(var1 + 1);
      return new class02753(class04995.u((double)var2, class02753x.N(), class02753x.N()), class04995.Z(var2, class02753x.y(), class02753x.y()));
   }

   public class02753 N(int var1) {
      return this.L[this.u - var1 & 63];
   }

   public void N(double var1, float var3) {
      class02753 class02753 = new class02753(var1, var3);
      if (this.u < 0) {
         Arrays.fill(this.L, class02753);
      }

      if (++this.u == 64) {
         this.u = 0;
      }

      this.L[this.u] = class02753;
   }

   public void N(class02765 var1) {
      System.arraycopy(var1.L, 0, this.L, 0, 64);
      this.u = var1.u;
   }
}
