package minecraft;

import java.util.Objects;
import org.jspecify.annotations.Nullable;

public interface class01788 {
   boolean L();

   @Nullable
   class01762 i();

   default class05216 y(class01762 var1) {
      return Objects.requireNonNullElse(this.i(), var1).N(this.y());
   }

   int y();

   static class05216 N(@Nullable class01788 var0, class01762 var1) {
      return var0 != null ? var0.y(var1) : var1.N(0);
   }
}
