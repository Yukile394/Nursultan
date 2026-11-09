package minecraft;

import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Optional;

public interface class00850<T extends Number & Comparable<T>> {
   SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.range.empty"));
   SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("argument.range.swapped"));

   default Optional<T> L() {
      return this.N().M();
   }

   default boolean u() {
      return this.N().N();
   }

   default Optional<T> y() {
      return this.N().R();
   }

   class00819<T> N();
}
