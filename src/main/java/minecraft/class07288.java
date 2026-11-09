package minecraft;

import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;

public interface class07288 {
   boolean L();

   boolean i();

   default boolean m() {
      return false;
   }

   int u();

   class07316 y();

   boolean y(class08036 var1);

   default void N(class08036 var1, class00392 var2, int var3) {
      OptionalInt optionalint = var1.method_17355(new class03965((var1x, var2x, var3x) -> new class06952(var1x, var2x, this), var2));
      if (optionalint.isPresent()) {
         class07316 class07316 = this.y();
         if (!class07316.isEmpty()) {
            var1.method_17354(optionalint.getAsInt(), class07316, var3, this.u(), this.i(), this.m());
         }
      }
   }

   void N(class07324 var1);

   void N(class07316 var1);

   @Nullable
   class08036 N();

   void N(@Nullable class08036 var1);

   void N(int var1);

   class04891 R();

   void d_(class06584 var1);
}
