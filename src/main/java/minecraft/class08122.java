package minecraft;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface class08122 extends class01381, BiFunction<class06584, class05908, class06584> {
   class05959<? extends class08122> N();

   static Consumer<class06584> N(BiFunction<class06584, class05908, class06584> var0, Consumer<class06584> var1, class05908 var2) {
      return var3 -> var1.accept((class06584)var0.apply(var3, var2));
   }
}
