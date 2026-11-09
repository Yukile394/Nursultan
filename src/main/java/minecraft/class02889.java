package minecraft;

import java.util.Arrays;

public class class02889 extends class06105<class07149, class08487> {
   private static final class01894 N = class01894.y("textures/entity/illager/illusioner.png");

   public class02889(class04832 var1) {
      super(var1, new class01176<>(var1.N(class04802.yo)), 0.5F);
      this.N(new class02871(this, this));
      this.y.y().U = true;
   }

   public class08487 method_55269() {
      return new class08487();
   }

   protected boolean R(class08487 var1) {
      return true;
   }

   public class01894 N(class08487 var1) {
      return N;
   }

   public void method_62354(class07149 var1, class08487 var2, float var3) {
      super.method_62354((class07149)var1, (class08487)var2, var3);
      class06889[] aclass06889 = var1.u(var3);
      var2.N = Arrays.copyOf(aclass06889, aclass06889.length);
      var2.S = var1.n();
   }

   public void method_3936(class08487 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.v) {
         class06889[] aclass06889 = var1.N;

         for (int i = 0; i < aclass06889.length; i++) {
            var2.N();
            var2.N(
               aclass06889[i].M + class04995.P(i + var1.P * 0.5F) * 0.025,
               aclass06889[i].B + class04995.P(i + var1.P * 0.75F) * 0.0125,
               aclass06889[i].Z + class04995.P(i + var1.P * 0.7F) * 0.025
            );
            super.method_3936(var1, var2, var3, var4);
            var2.y();
         }
      } else {
         super.method_3936(var1, var2, var3, var4);
      }
   }

   protected class00734 y(class07149 var1) {
      return super.method_62358(var1).L(3.0, 0.0, 3.0);
   }
}
