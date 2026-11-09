package minecraft;

import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class06542 extends class05765<class07475> {
   public static final int N = 6;
   public static final int y = 7;
   double L;
   double u;
   float i;
   float R;

   private int L(class07475 var1) {
      return Optional.ofNullable(var1.method_6047().method_58694(class02484.X)).map(class08174::N).orElse(0);
   }

   protected void L(class04782 var1, class07475 var2, long var3) {
      class07438 class07438 = this.N(var2);
      double d0 = var2.method_5649(class07438.method_23317(), class07438.method_23318(), class07438.method_23321());
      class07049 class07049 = var2.method_5668();
      float f = 1.0F;
      if (class07049 instanceof class07079 class07079) {
         f = class07079.K_();
      }

      int ix = var2.method_5765() ? 2 : 0;
      var2.method_18868().N(class05378.P, new class05751(class07438, true));
      var2.method_18868().N(class05378.NU, var2.method_18868().L(class05378.NU).orElse(0) - 1);
      class06889 class06889x = var2.method_18868().L(class05378.Nz).orElse(null);
      if (class06889x != null) {
         var2.f().N(class06889x.M, class06889x.B, class06889x.Z, f * this.u);
         if (var2.f().U()) {
            var2.method_18868().y(class05378.Nz);
         }
      } else {
         var2.f().N(class07438, f * this.L);
         if (d0 < this.R || var2.f().U()) {
            double d1 = Math.sqrt(d0);
            class06889 class06889x = class05456.N(var2, 6 + ix - d1, 7 + ix - d1, 7, class07438.method_73189());
            var2.method_18868().N(class05378.Nz, class06889x);
         }
      }
   }

   public class06542(double var1, double var3, float var5, float var6) {
      super(Map.of(class05378.NE, class05367.field_18456));
      this.L = var1;
      this.u = var3;
      this.i = var5 * var5;
      this.R = var6 * var6;
   }

   protected void u(class04782 var1, class07475 var2, long var3) {
      var2.f().W();
      var2.method_6021();
      var2.method_18868().y(class05378.Nz);
      var2.method_18868().y(class05378.NU);
      var2.method_18868().N(class05378.NE, class06537.field_64631);
   }

   private boolean y(class07475 var1) {
      return this.N(var1) != null && var1.method_6047().L(class02484.X);
   }

   protected boolean y(class04782 var1, class07475 var2, long var3) {
      return var2.method_18868().L(class05378.NU).orElse(0) > 0 && this.y(var2);
   }

   @Nullable
   private class07438 N(class07475 var1) {
      return var1.method_18868().L(class05378.s).orElse(null);
   }

   protected boolean N(class04782 var1, class07475 var2) {
      return var2.method_18868().L(class05378.NE).orElse(class06537.field_64629) == class06537.field_64630 && this.y(var2) && !var2.method_6115();
   }

   @Override
   protected boolean N(long var1) {
      return false;
   }

   protected void N(class04782 var1, class07475 var2, long var3) {
      var2.R(true);
      var2.method_18868().N(class05378.NU, this.L(var2));
      var2.method_18868().y(class05378.Nz);
      var2.method_6019(class07050.field_5808);
      super.u(var1, var2, var3);
   }
}
