package minecraft;

import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;

public interface class03393 extends class03382, LongSupplier {
   @Override
   default long get(TimeUnit var1) {
      return var1.convert(this.getAsLong(), TimeUnit.NANOSECONDS);
   }
}
