package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

class class03618 implements class03481 {
   private static final int y = 16;
   private final class01190 L;

   class03618(class03630 var1) {
      super();
      this.N = var1;
      this.L = new class01177(this.N, this.N.method_5751());
   }

   @Override
   public class01190 y() {
      return this.L;
   }

   @Override
   public void N(class04782 var1, class07209 var2, class03556<class01194> var3, @Nullable class07049 var4, @Nullable class07049 var5, float var6) {
      if (var3.N(class01194.o)) {
         class03645.N(this.N, new class07209(var2));
      }
   }

   @Override
   public boolean N(class04782 var1, class07209 var2, class03556<class01194> var3, class01164 var4) {
      if (this.N.Nt()) {
         return false;
      } else {
         Optional<class06289> optional = this.N.method_18868().L(class05378.Nh);
         if (optional.isEmpty()) {
            return true;
         } else {
            class06289 class06289 = optional.get();
            return class06289.N(var1.method_27983(), this.N.method_24515(), 1024) && class06289.y().equals(var2);
         }
      }
   }

   @Override
   public int N() {
      return 16;
   }

   @Override
   public class03530<class01194> R() {
      return class06370.i;
   }
}
