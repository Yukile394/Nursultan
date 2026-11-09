package minecraft;

import java.util.Comparator;
import java.util.List;

class class07157 extends class07473 {
   private final class01328 y;
   private int L;

   class07157(class07155 var1) {
      super();
      this.N = var1;
      this.y = class01328.N().N(64.0);
      this.L = y(20);
   }

   @Override
   public boolean y() {
      class07438 class07438 = this.N.T();
      return class07438 != null ? this.N.N(N_18(this.N.method_73183()), class07438, class01328.N) : false;
   }

   @Override
   public boolean N() {
      if (this.L > 0) {
         this.L--;
         return false;
      } else {
         this.L = y(60);
         class04782 class04782 = N_18(this.N.method_73183());
         List<class08036> list = class04782.N(this.y, this.N, this.N.method_5829().L(16.0, 64.0, 16.0));
         if (!list.isEmpty()) {
            list.sort(Comparator.comparing(class07049::method_23318).reversed());

            for (class08036 class08036 : list) {
               if (this.N.N(class04782, class08036, class01328.N)) {
                  this.N.y(class08036);
                  return true;
               }
            }
         }

         return false;
      }
   }
}
