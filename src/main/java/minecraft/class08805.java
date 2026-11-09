package minecraft;

import org.jspecify.annotations.Nullable;

public class class08805 extends class08800 {
   public float N;
   public float y;
   public boolean L;
   @Nullable
   public class06889 u;
   public boolean i;
   public boolean R;
   public double M;
   public float B;
   public final class02765 Z = new class02765();

   public class08805() {
      super();
   }

   public class02753 N(int var1) {
      return this.Z.N(var1, this.B);
   }

   public float N(int var1, class02753 var2, class02753 var3) {
      double d0;
      if (this.i) {
         d0 = var1 / Math.max(this.M / 4.0, 1.0);
      } else if (this.R) {
         d0 = var1;
      } else if (var1 == 6) {
         d0 = 0.0;
      } else {
         d0 = var3.N() - var2.N();
      }

      return (float)d0;
   }
}
