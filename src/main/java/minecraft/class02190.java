package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import org.jspecify.annotations.Nullable;

public class class02190<T> implements class02324<StringReader, Dynamic<?>> {
   private final class07755<T> N;

   public class02190(DynamicOps<T> var1) {
      super();
      this.N = class07755.N(var1);
   }

   @Nullable
   public Dynamic<T> y(class02325<StringReader> var1) {
      ((StringReader)var1.R()).skipWhitespace();
      int i = var1.M();

      try {
         return new Dynamic(this.N.N(), this.N.y((StringReader)var1.R()));
      } catch (Exception exception) {
         var1.y().N(i, exception);
         return null;
      }
   }
}
