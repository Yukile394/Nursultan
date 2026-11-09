package minecraft;

import java.util.ArrayList;
import org.jspecify.annotations.Nullable;

public class class08975 implements class01285 {
   private static final class01894 N = class01894.y("chunk_generation");

   public class08975() {
      super();
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      class07049 class07049 = class06202.Nq().F();
      class04782 class04782 = var2 instanceof class04782 ? (class04782)var2 : null;
      if (class07049 != null && class04782 != null) {
         class07209 class07209 = class07049.method_24515();
         class04751 class04751 = class04782.method_14178();
         ArrayList arraylist = new ArrayList();
         class08088 class08088 = class04751.U();
         class04084 class04084 = class04751.W();
         class08088.N(arraylist, class04084, class07209);
         class03222 class03222 = class04084.y();
         class08088.u().N(arraylist, class07209, class03222);
         if (var4 != null && var4.j()) {
            arraylist.add("Blending: Old");
         }

         var1.N(N, arraylist);
      }
   }
}
