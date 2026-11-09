package minecraft;

import com.google.common.collect.Iterables;
import java.util.List;
import java.util.function.Supplier;

class class07782 implements class07773 {
   public static final class07782 N = new class07782();

   private class07782() {
      super();
   }

   @Override
   public class07709 N() {
      return new class07741();
   }

   @Override
   public int N(class07709 var1) {
      if (var1 instanceof class07023 class07023) {
         int i = class07023.size();
         if (i > 0) {
            class07023.clear();
            return i;
         }
      }

      return 0;
   }

   @Override
   public int N(class07709 var1, Supplier<class07709> var2) {
      if (!(var1 instanceof class07023 class07023)) {
         return 0;
      } else {
         int i = class07023.size();
         if (i == 0) {
            class07023.y(0, (class07709)var2.get());
            return 1;
         } else {
            class07709 class07709 = (class07709)var2.get();
            int j = i - (int)class07023.stream().filter(class07709::equals).count();
            if (j == 0) {
               return 0;
            } else {
               class07023.clear();
               if (!class07023.y(0, class07709)) {
                  return 0;
               } else {
                  for (int k = 1; k < i; k++) {
                     class07023.y(k, (class07709)var2.get());
                  }

                  return j;
               }
            }
         }
      }
   }

   @Override
   public void N(class07709 var1, List<class07709> var2) {
      if (var1 instanceof class07023 class07023) {
         Iterables.addAll(var2, class07023);
      }
   }

   @Override
   public void N(class07709 var1, Supplier<class07709> var2, List<class07709> var3) {
      if (var1 instanceof class07023 class07023) {
         if (class07023.isEmpty()) {
            class07709 class07709 = (class07709)var2.get();
            if (class07023.y(0, class07709)) {
               var3.add(class07709);
            }
         } else {
            Iterables.addAll(var3, class07023);
         }
      }
   }
}
