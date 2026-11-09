package minecraft;

import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.function.Function;

public interface class04573<C> {
   class04573<Float> y = N(var0 -> var0);

   float L();

   float y();

   float N(C var1);

   default <C2> class04573<C2> N(Function<C2, C> var1) {
      return new class03208<>(this, this, var1);
   }

   static class04573<Float> N(Float2FloatFunction var0) {
      return new class04582(var0);
   }
}
