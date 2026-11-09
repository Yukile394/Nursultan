package minecraft;

import it.unimi.dsi.fastutil.HashCommon;
import org.jspecify.annotations.Nullable;

public class class08101 implements class03358<class08951, class00990> {
   private static final float N = 0.25F;
   private static final float y = -0.25F;
   private final class08943 L;

   public class08101(class04811 var1) {
      super();
      this.L = var1.L();
   }

   private void N(class00990 var1, class08898 var2, class01421 var3, class01237 var4, int var5, float var6) {
      float f = (var5 - 1) * 0.3125F;
      class06889 class06889 = new class06889(f, var1.y ? -0.25 : 0.0, -0.25);
      var3.N();
      var3.N(0.5F, 0.5F, 0.5F);
      var3.N(class02058.u.N(var6));
      var3.N(class06889);
      var3.y(0.25F, 0.25F, 0.25F);
      class00734 class00734 = var2.M();
      double d0 = -class00734.y;
      if (!var1.y) {
         d0 += -(class00734.i - class00734.y) / 2.0;
      }

      var3.N(0.0, d0, 0.0);
      var2.N(var3, var4, var1.Z, class01384.u, 0);
      var3.y();
   }

   public class00990 i() {
      return new class00990();
   }

   public void N(class00990 var1, class01421 var2, class01237 var3, class06959 var4) {
      class07211 class07211 = var1.M.L(class08968.L);
      float f = class07211.z().L() ? -class07211.U() : 180.0F;

      for (int i = 0; i < var1.N.length; i++) {
         class08898 class08898 = var1.N[i];
         if (class08898 != null) {
            this.N(var1, class08898, var2, var3, i, f);
         }
      }
   }

   public void N(class08951 var1, class00990 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.y = var1.u();
      class00743<class06584> class00743 = var1.N();
      int i = HashCommon.long2int(var1.d().method_10063());

      for (int j = 0; j < class00743.size(); j++) {
         class06584 class06584 = class00743.get(j);
         if (!class06584.R()) {
            class08898 class08898 = new class08898();
            this.L.N(class08898, class06584, class03662.field_61988, var1.method_73183(), var1, i + j);
            var2.N[j] = class08898;
         }
      }
   }
}
