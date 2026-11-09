package minecraft;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class01713 {
   private final class01740[] N;
   private WeakReference<class06482> y = new WeakReference<>(null);

   public class01713(int var1) {
      super();
      this.N = new class01740[var1];
   }

   private Optional<class03729<class05857>> N(class02903 var1, class04782 var2) {
      Optional<class03729<class05857>> optional = var2.method_64577().N(class05838.N, var1, var2);
      this.N(var1, optional.orElse(null));
      return optional;
   }

   private void N(int var1) {
      if (var1 > 0) {
         class01740 class01740 = this.N[var1];
         System.arraycopy(this.N, 0, this.N, 1, var1);
         this.N[0] = class01740;
      }
   }

   private void N(class02903 var1, @Nullable class03729<class05857> var2) {
      class00743 class00743 = class00743.method_10213(var1.N(), class06584.E);

      for (int i = 0; i < var1.N(); i++) {
         class00743.set(i, var1.N(i).L(1));
      }

      System.arraycopy(this.N, 0, this.N, 1, this.N.length - 1);
      this.N[0] = new class01740(class00743, var1.R(), var1.M(), var2);
   }

   private void N(class04782 var1) {
      class06482 class06482 = var1.method_64577();
      if (class06482 != this.y.get()) {
         this.y = new WeakReference<>(class06482);
         Arrays.fill(this.N, null);
      }
   }

   public Optional<class03729<class05857>> N(class04782 var1, class02903 var2) {
      if (var2.y()) {
         return Optional.empty();
      } else {
         this.N(var1);

         for (int i = 0; i < this.N.length; i++) {
            class01740 class01740 = this.N[i];
            if (class01740 != null && class01740.N(var2)) {
               this.N(i);
               return Optional.ofNullable(class01740.u());
            }
         }

         return this.N(var2, var1);
      }
   }
}
