package minecraft;

import Nursultan.class10416;
import com.mojang.serialization.DynamicOps;

class class08328 implements class08289 {
   private final String N;
   private final class04490 y;
   private final DynamicOps<class07709> L;
   private final class07741 u;

   @Override
   public boolean L() {
      return this.u.isEmpty();
   }

   class08328(String var1, class04490 var2, DynamicOps<class07709> var3, class07741 var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   @Override
   public void y() {
      this.u.removeLast();
   }

   @Override
   public class08329 N() {
      int i = this.u.size();
      class07001 class07001 = new class07001();
      this.u.add(class07001);
      return new class08303(this.y.N_46(new class10416(this.N, i)), this.L, class07001);
   }
}
