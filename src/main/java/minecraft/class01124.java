package minecraft;

import java.util.UUID;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public interface class01124<T extends class01135> {
   <U extends T> void N(class01128<T, U> var1, class00734 var2, class04197<U> var3);

   void N(class00734 var1, Consumer<T> var2);

   <U extends T> void N(class01128<T, U> var1, class04197<U> var2);

   Iterable<T> N();

   @Nullable
   T N(UUID var1);

   @Nullable
   T N(int var1);
}
