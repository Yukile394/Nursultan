package minecraft;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

class class07799 implements class07773 {
   private final Predicate<class07709> N;

   public class07799(class07001 var1) {
      super();
      this.N = class07759.N(var1);
   }

   @Override
   public class07709 N() {
      return new class07001();
   }

   @Override
   public int N(class07709 var1, Supplier<class07709> var2) {
      return 0;
   }

   @Override
   public int N(class07709 var1) {
      return 0;
   }

   @Override
   public void N(class07709 var1, Supplier<class07709> var2, List<class07709> var3) {
      this.N(var1, var3);
   }

   @Override
   public void N(class07709 var1, List<class07709> var2) {
      if (var1 instanceof class07001 && this.N.test(var1)) {
         var2.add(var1);
      }
   }
}
