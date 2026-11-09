package minecraft;

import java.io.IOException;
import java.io.InputStream;

public class class04662 {
   public class04662() {
      super();
   }

   @Deprecated
   public static int[] N(class01089 var0, class01894 var1) throws IOException {
      int[] aint;
      try (
         InputStream inputstream = var0.u(var1);
         class08280 class08280 = class08280.N(inputstream);
      ) {
         aint = class08280.R();
      }

      return aint;
   }
}
