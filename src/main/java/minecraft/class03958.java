package minecraft;

import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class03958 {
   private final class03407 N;
   private final class03791 y;
   private final Predicate<class03412> L;
   @Nullable
   private class02083 u = null;
   private int i;
   private int R;
   @Nullable
   private class03926 M;

   public class03958(class03409 var1, Predicate<class03412> var2) {
      super();
      this.N = var1.y();
      this.y = new class03791(var1.N().y().leadingContextMessageCount());
      this.L = var2;
      this.i = this.N.y();
   }

   public void N(int var1, class03385 var2) {
      int ix = 0;

      while (ix < var1) {
         class03047 class03047 = this.N.y(this.i);
         if (class03047 == null) {
            break;
         }

         int j = this.i--;
         if (class03047 instanceof class03412 class03412 && !class03412.M().equals(this.M)) {
            if (this.N(var2, class03412)) {
               if (this.R > 0) {
                  var2.N(class00392.N("gui.chatSelection.fold", this.R));
                  this.R = 0;
               }

               var2.N(j, class03412);
               ix++;
            } else {
               this.R++;
            }

            this.M = class03412.M();
         }
      }
   }

   private boolean N(class03385 var1, class03412 var2) {
      class03926 class03926 = var2.M();
      boolean flag = this.y.y(class03926);
      if (this.L.test(var2)) {
         this.y.N(class03926);
         if (this.u != null && !this.u.N(class03926.U())) {
            var1.N(class00392.N("gui.chatSelection.join", var2.R().name()).N(class06541.field_1054));
         }

         this.u = class03926.U();
         return true;
      } else {
         return flag;
      }
   }
}
