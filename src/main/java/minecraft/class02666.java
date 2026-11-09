package minecraft;

import org.jspecify.annotations.Nullable;

public interface class02666 {
   @Nullable
   <T> T method_58694(class02477<? extends T> var1);

   @Nullable
   default <T> class02480<T> u(class02477<T> var1) {
      Object object = this.method_58694(var1);
      return object != null ? new class02480<>(var1, (T)object) : null;
   }

   default <T> T a_(class02477<? extends T> var1, T var2) {
      Object object = this.method_58694(var1);
      return (T)(object != null ? object : var2);
   }
}
