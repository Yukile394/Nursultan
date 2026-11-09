package minecraft;

import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class class04990 implements class01285 {
   public class04990() {
      super();
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class06202 class06202 = class06202.Nq();
      if (class06202.F() != null) {
         class07209 class07209 = class06202.F().method_24515();
         var1.N(
            class06431.N,
            String.format(
               Locale.ROOT, "Section-relative: %02d %02d %02d", class07209.method_10263() & 15, class07209.method_10264() & 15, class07209.method_10260() & 15
            )
         );
      }
   }

   @Override
   public boolean method_72753(boolean var1) {
      return true;
   }
}
