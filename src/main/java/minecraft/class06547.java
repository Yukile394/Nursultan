package minecraft;

import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class06547 extends class05765<class07475> {
   public static final int N = 9;
   public static final int y = 11;
   public static final int L = 100;
   double u;

   protected void L(class04782 var1, class07475 var2, long var3) {
      class07438 class07438 = this.N(var2);
      class07049 class07049 = var2.method_5668();
      float f = class07049 instanceof class07079 ? ((class07079)class07049).K_() : 1.0F;
      var2.method_18868().N(class05378.P, new class05751(class07438, true));
      var2.method_18868().N(class05378.NB, var2.method_18868().L(class05378.NB).orElse(0) + 1);
      var2.method_18868().L(class05378.NZ).ifPresent(var3x -> var2.f().N(var3x.M, var3x.B, var3x.Z, f * this.u));
   }

   public class06547(double var1) {
      super(Map.of(class05378.NE, class05367.field_18456), 100);
      this.u = var1;
   }

   protected void u(class04782 var1, class07475 var2, long var3) {
      var2.f().W();
      var2.R(false);
      var2.method_6021();
      var2.method_18868().y(class05378.NB);
      var2.method_18868().y(class05378.NZ);
      var2.method_18868().y(class05378.NE);
   }

   private boolean y(class07475 var1) {
      return this.N(var1) != null && var1.method_6047().L(class02484.X);
   }

   protected boolean y(class04782 var1, class07475 var2, long var3) {
      return var2.method_18868().L(class05378.NB).orElse(100) < 100 && var2.method_18868().L(class05378.NZ).isPresent() && !var2.f().U() && this.y(var2);
   }

   @Nullable
   private class07438 N(class07475 var1) {
      return var1.method_18868().L(class05378.s).orElse(null);
   }

   protected void N(class04782 var1, class07475 var2, long var3) {
      var2.R(true);
      var2.method_18868().N(class05378.NB, 0);
      super.u(var1, var2, var3);
   }

   protected boolean N(class04782 var1, class07475 var2) {
      if (this.y(var2) && !var2.method_6115()) {
         if (var2.method_18868().L(class05378.NE).orElse(class06537.field_64629) != class06537.field_64631) {
            return false;
         } else {
            class07438 class07438 = this.N(var2);
            double d0 = var2.method_5649(class07438.method_23317(), class07438.method_23318(), class07438.method_23321());
            int i = var2.method_5765() ? 2 : 0;
            double d1 = Math.sqrt(d0);
            class06889 class06889 = class05456.N(var2, Math.max(0.0, 9 + i - d1), Math.max(1.0, 11 + i - d1), 7, class07438.method_73189());
            if (class06889 == null) {
               return false;
            } else {
               var2.method_18868().N(class05378.NZ, class06889);
               return true;
            }
         }
      } else {
         return false;
      }
   }
}
