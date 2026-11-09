package minecraft;

import java.util.List;
import java.util.function.Supplier;

class class07777 implements class07773 {
   private final int N;

   public class07777(int var1) {
      super();
      this.N = var1;
   }

   @Override
   public class07709 N() {
      return new class07741();
   }

   @Override
   public int N(class07709 var1, Supplier<class07709> var2) {
      if (var1 instanceof class07023 class07023) {
         int i = class07023.size();
         int j = this.N < 0 ? i + this.N : this.N;
         if (0 <= j && j < i) {
            class07709 class07709x = class07023.get(j);
            class07709 class07709x = (class07709)var2.get();
            if (!class07709x.equals(class07709x) && class07023.N(j, class07709x)) {
               return 1;
            }
         }
      }

      return 0;
   }

   @Override
   public int N(class07709 var1) {
      if (var1 instanceof class07023 class07023) {
         int i = class07023.size();
         int j = this.N < 0 ? i + this.N : this.N;
         if (0 <= j && j < i) {
            class07023.remove(j);
            return 1;
         }
      }

      return 0;
   }

   @Override
   public void N(class07709 var1, Supplier<class07709> var2, List<class07709> var3) {
      this.N(var1, var3);
   }

   @Override
   public void N(class07709 var1, List<class07709> var2) {
      if (var1 instanceof class07023 class07023) {
         int i = class07023.size();
         int j = this.N < 0 ? i + this.N : this.N;
         if (0 <= j && j < i) {
            var2.add(class07023.get(j));
         }
      }
   }
}
