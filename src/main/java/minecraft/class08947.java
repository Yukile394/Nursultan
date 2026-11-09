package minecraft;

import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class class08947 implements class01285 {
   public class08947() {
      super();
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class06202 class06202 = class06202.Nq();
      int i = class06202.NG().N();
      class05630 class05630 = (class05630)class06202.i_7;
      var1.N(String.format(Locale.ROOT, "%d fps T: %s%s", class06202.Nx(), i == 260 ? "inf" : i, class05630.NN().method_41753() ? " vsync" : ""));
   }

   @Override
   public boolean method_72753(boolean var1) {
      return true;
   }
}
