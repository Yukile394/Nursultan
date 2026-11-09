package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public interface class06841<R> {
   Codec<class06841<Object>> N = N(var0 -> var0.N(class05919.values()).N(class05887.values()));

   static <R> Codec<class06841<R>> N(UnaryOperator<class06850<R>> var0) {
      return var0.apply(new class06850()).N();
   }

   @Nullable
   R N(class05908 var1);

   static <U> class06841<U> N(class06841<? extends U> var0) {
      return var0;
   }

   class07491<?> N();
}
