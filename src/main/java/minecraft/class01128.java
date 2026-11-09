package minecraft;

import Nursultan.class09438;
import Nursultan.class09439;
import org.jspecify.annotations.Nullable;

public interface class01128<B, T extends B> {
   Class<? extends B> s();

   static <B, T extends B> class01128<B, T> y(Class<T> var0) {
      return new class09438<>(var0);
   }

   static <B, T extends B> class01128<B, T> N(Class<T> var0) {
      return new class09439<>(var0);
   }

   @Nullable
   T N(B var1);
}
