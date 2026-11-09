package minecraft;

import java.util.function.Consumer;
import java.util.function.Function;

interface class04361<T> extends class04344<T> {
   @Override
   default Function<class04370<T>, class06478> N(class04355<T> var1, class05630 var2, int var3, int var4, int var5, Consumer<T> var6) {
      return var7 -> class06366.N_58(var7.field_37864, var7::method_41753).N(this.N()).N(var1).N(var3, var4, var5, 20, var7.field_38280, (var4xx, var5xx) -> {
         this.R().set(var7, var5xx);
         var2.Np();
         var6.accept(var5xx);
      });
   }

   class06363<T> N();

   default class04356<T> R() {
      return class04370::method_41748;
   }
}
