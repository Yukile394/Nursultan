package minecraft;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableBoolean;

class class07762 implements class07773 {
   private final class07001 N;
   private final Predicate<class07709> y;

   public class07762(class07001 var1) {
      super();
      this.N = var1;
      this.y = class07759.N(var1);
   }

   @Override
   public int N(class07709 var1, Supplier<class07709> var2) {
      int i = 0;
      if (var1 instanceof class07741 class07741) {
         int j = class07741.size();
         if (j == 0) {
            class07741.add((class07709)var2.get());
            i++;
         } else {
            for (int k = 0; k < j; k++) {
               class07709 class07709x = class07741.get(k);
               if (this.y.test(class07709x)) {
                  class07709 class07709x = (class07709)var2.get();
                  if (!class07709x.equals(class07709x) && class07741.N(k, class07709x)) {
                     i++;
                  }
               }
            }
         }
      }

      return i;
   }

   @Override
   public int N(class07709 var1) {
      int i = 0;
      if (var1 instanceof class07741 class07741) {
         for (int j = class07741.size() - 1; j >= 0; j--) {
            if (this.y.test(class07741.get(j))) {
               class07741.remove(j);
               i++;
            }
         }
      }

      return i;
   }

   @Override
   public class07709 N() {
      return new class07741();
   }

   @Override
   public void N(class07709 var1, Supplier<class07709> var2, List<class07709> var3) {
      MutableBoolean mutableboolean = new MutableBoolean();
      if (var1 instanceof class07741 class07741) {
         class07741.stream().filter(this.y).forEach(var2x -> {
            var3.add(var2x);
            mutableboolean.setTrue();
         });
         if (mutableboolean.isFalse()) {
            class07001 class07001 = this.N.N();
            class07741.add(class07001);
            var3.add(class07001);
         }
      }
   }

   @Override
   public void N(class07709 var1, List<class07709> var2) {
      if (var1 instanceof class07741) {
         ((class07741)var1).stream().filter(this.y).forEach(var2::add);
      }
   }
}
