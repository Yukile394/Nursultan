package minecraft;

import java.util.List;
import java.util.function.Supplier;

class class07805 implements class07773 {
   private final String N;

   public class07805(String var1) {
      super();
      this.N = var1;
   }

   @Override
   public class07709 N() {
      return new class07001();
   }

   @Override
   public int N(class07709 var1, Supplier<class07709> var2) {
      if (var1 instanceof class07001 class07001) {
         class07709 class07709x = (class07709)var2.get();
         class07709 class07709x = class07001.N(this.N, class07709x);
         if (!class07709x.equals(class07709x)) {
            return 1;
         }
      }

      return 0;
   }

   @Override
   public int N(class07709 var1) {
      if (var1 instanceof class07001 class07001 && class07001.y(this.N)) {
         class07001.b(this.N);
         return 1;
      } else {
         return 0;
      }
   }

   @Override
   public void N(class07709 var1, Supplier<class07709> var2, List<class07709> var3) {
      if (var1 instanceof class07001 class07001) {
         class07709 class07709;
         if (class07001.y(this.N)) {
            class07709 = class07001.N(this.N);
         } else {
            class07709 = (class07709)var2.get();
            class07001.N(this.N, class07709);
         }

         var3.add(class07709);
      }
   }

   @Override
   public void N(class07709 var1, List<class07709> var2) {
      if (var1 instanceof class07001) {
         class07709 class07709 = ((class07001)var1).N(this.N);
         if (class07709 != null) {
            var2.add(class07709);
         }
      }
   }
}
