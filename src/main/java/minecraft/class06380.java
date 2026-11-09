package minecraft;

import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class class06380 implements class01285 {
   public class06380() {
      super();
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class07049 class07049 = class06202.Nq().F();
      if (class07049 != null && var4 != null && var2 instanceof class04782 class04782) {
         class07209 class07209 = class07049.method_24515();
         if (class04782.L(class07209.method_10264())) {
            float f = class04782.method_76332(class07209);
            long i = var4.n();
            class07052 class07052 = new class07052(class04782.y(), class04782.method_8532(), i, f);
            var1.y(String.format(Locale.ROOT, "Local Difficulty: %.2f // %.2f (Day %d)", class07052.y(), class07052.u(), class04782.method_75003()));
         }
      }
   }
}
