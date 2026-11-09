package minecraft;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

class class07779 implements class07773 {
   private final String N;
   private final class07001 y;
   private final Predicate<class07709> L;

   public class07779(String var1, class07001 var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = class07759.N(var2);
   }

   @Override
   public class07709 N() {
      return new class07001();
   }

   @Override
   public int N(class07709 var1, Supplier<class07709> var2) {
      if (var1 instanceof class07001 class07001) {
         class07709 class07709x = class07001.N(this.N);
         if (this.L.test(class07709x)) {
            class07709 class07709x = (class07709)var2.get();
            if (!class07709x.equals(class07709x)) {
               class07001.N(this.N, class07709x);
               return 1;
            }
         }
      }

      return 0;
   }

   @Override
   public int N(class07709 var1) {
      if (var1 instanceof class07001 class07001) {
         class07709 class07709 = class07001.N(this.N);
         if (this.L.test(class07709)) {
            class07001.b(this.N);
            return 1;
         }
      }

      return 0;
   }

   @Override
   public void N(class07709 var1, Supplier<class07709> var2, List<class07709> var3) {
      if (var1 instanceof class07001 class07001x) {
         class07709 class07709 = class07001x.N(this.N);
         if (class07709 == null) {
            class07001 class07001x = this.y.N();
            class07001x.N(this.N, class07001x);
            var3.add(class07001x);
         } else if (this.L.test(class07709)) {
            var3.add(class07709);
         }
      }
   }

   @Override
   public void N(class07709 var1, List<class07709> var2) {
      if (var1 instanceof class07001) {
         class07709 class07709 = ((class07001)var1).N(this.N);
         if (this.L.test(class07709)) {
            var2.add(class07709);
         }
      }
   }
}
