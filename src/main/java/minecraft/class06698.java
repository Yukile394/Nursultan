package minecraft;

import java.nio.file.Path;

public abstract class class06698 extends class06691 {
   public class06698(class06711 var1, class05715 var2, String var3, class00392 var4, class00392 var5) {
      super(var1, var2, var3, var3, var4, var5);
      this.u = var1;
   }

   protected abstract class07001 N(class06172 var1, class07001 var2);

   @Override
   protected boolean N(class06172 var1, class07321 var2, class05946<class07299> var3) {
      class07001 class07001x = var1.u(var2).join().orElse(null);
      if (class07001x != null) {
         int i = class07717.R(class07001x);
         class07001 class07001x = this.N(var1, class07001x);
         if (i < class07529.y().comp_4026().y() || this.u.U) {
            if (this.N != null) {
               this.N.join();
            }

            this.N = var1.N(var2, class07001x);
            return true;
         }
      }

      return false;
   }

   @Override
   protected class06172 N(class02277 var1, Path var2) {
      return (class06172)(this.u.U
         ? new class02877(var1.N("source"), var2, var1.N("target"), class06711.N(var2), this.u.W, true, this.y, class06820.N)
         : new class06172(var1, var2, this.u.W, true, this.y));
   }
}
