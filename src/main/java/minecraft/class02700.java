package minecraft;

import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public interface class02700 extends class02666 {
   default boolean L(class02477<?> var1) {
      return this.y().N(var1);
   }

   @Nullable
   @Override
   default <T> T method_58694(class02477<? extends T> var1) {
      return this.y().method_58694(var1);
   }

   class02695 y();

   default <T> Stream<T> N(Class<? extends T> var1) {
      return this.y().L().map(class02480::y).filter(var1x -> var1.isAssignableFrom(var1x.getClass())).map(var0 -> (T)var0);
   }

   @Override
   default <T> T a_(class02477<? extends T> var1, T var2) {
      return this.y().a_(var1, (T)var2);
   }
}
