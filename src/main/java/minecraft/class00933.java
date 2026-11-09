package minecraft;

import java.util.ArrayList;
import java.util.List;

public class class00933 {
   private static final int N = 512;
   private final List<class00916> y = new ArrayList<>();

   public class00933() {
      super();
   }

   public void N(class06889 var1, float var2, int var3, class04540<class00931> var4) {
      if (!var4.L()) {
         this.y.add(new class00916(var1, var2, var3, var4));
      }
   }

   private void N(class03448 var1, class00916 var2) {
      class06069 class06069 = var1.method_8409();
      class06889 class06889xxxxx = var2.N();
      class06889 class06889x = new class06889(class06069.z() * 2.0F - 1.0F, class06069.z() * 2.0F - 1.0F, class06069.z() * 2.0F - 1.0F).u();
      float f = (float)Math.cbrt(class06069.z()) * var2.y();
      class06889 class06889xx = class06889x.L((double)f);
      class06889 class06889xxx = class06889xxxxx.i(class06889xx);
      if (var1.method_8320(class07209.method_49638(class06889xxx)).P()) {
         float f1 = 0.5F / (f / var2.y() + 0.1F) * class06069.z() * class06069.z() + 0.3F;
         class00931 class00931 = var2.u().y(class06069);
         class06889 class06889xxxx = class06889xxxxx.i(class06889xx.L((double)class00931.y()));
         class06889 class06889xxxxx = class06889x.L((double)(f1 * class00931.L()));
         var1.method_8406(
            class00931.N(), class06889xxxx.N(), class06889xxxx.y(), class06889xxxx.L(), class06889xxxxx.N(), class06889xxxxx.y(), class06889xxxxx.L()
         );
      }
   }

   public void N(class03448 var1) {
      if (((class05630)class06202.Nq().i_7).NK().method_41753() != class01315.field_18197) {
         this.y.clear();
      } else {
         int i = class04531.N(this.y, class00916::L);
         int j = Math.min(i, 512);

         for (int k = 0; k < j; k++) {
            class04531.N(var1.method_8409(), this.y, i, class00916::L).ifPresent(var2x -> this.N(var1, var2x));
         }

         this.y.clear();
      }
   }
}
